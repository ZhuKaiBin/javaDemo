package base;

import java.sql.*;

public class JDBCPrepared {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
            int id = resultSet.getInt("emp_id");

            String name = resultSet.getString("emp_name");

            System.out.println("id是"+id+",姓名是"+name);
        }

        //5.释放对象
        resultSet.close();
        prepar.close();
        conn.close();
    }
}
