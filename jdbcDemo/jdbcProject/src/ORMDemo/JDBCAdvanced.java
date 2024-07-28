package ORMDemo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import  pojo.Employee;


public class JDBCAdvanced {

    @Test
    public  void  Method1() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbcDb";
        String user = "root";
        String pwd = "123456";
        Connection conn = DriverManager.getConnection(url, user, pwd);

        var prepar= conn.prepareStatement("select * from t_emp where emp_id=? and emp_name=?");
        //为?号赋值，并执行占位符操作
        prepar.setInt(1, 2); // 第一个占位符（emp_id）赋值为整数2
        String name1 = "lisi";
        prepar.setString(2, name1); // 第二个占位符（emp_name）赋值为字符串 "lisi"
        ResultSet resultSet = prepar.executeQuery();

        while (resultSet.next()) {

            var emply=new pojo.Employee();



            int id = resultSet.getInt("emp_id");
            String name = resultSet.getString("emp_name");

            emply.setEmpId(id);
            emply.setName(name);

            System.out.println(emply);
        }

        //5.释放对象
        resultSet.close();
        prepar.close();
        conn.close();

    }

    @Test
    public  void  Method2() throws SQLException
    {
        String url = "jdbc:mysql://localhost:3306/jdbcDb";
        String user = "root";
        String pwd = "123456";
        Connection conn = DriverManager.getConnection(url, user, pwd);

        var prepar= conn.prepareStatement("select * from t_emp ");

        ResultSet resultSet = prepar.executeQuery();

        List<Employee> list=new ArrayList<>();
        while (resultSet.next()) {
            var emply=new pojo.Employee();
            int id = resultSet.getInt("emp_id");
            String name = resultSet.getString("emp_name");
            emply.setEmpId(id);
            emply.setName(name);
            list.add(emply);
        }
         //使用lamdba表达式进行输出
        list.forEach(x-> System.out.println(x.getName()));
        //5.释放对象
        resultSet.close();
        prepar.close();
        conn.close();

    }

}
