package base;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcOPeration {

    @Test
    //单行单列
    public void testQuerySingleRowCol() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbcDb";
        String user = "root";
        String pwd = "123456";
        Connection conn = DriverManager.getConnection(url, user, pwd);
        var prepar = conn.prepareStatement("select count(*)  from t_emp");
        ResultSet resultSet = prepar.executeQuery();
        //这个while是必须要加的，因为此时的resultSet结果集游标在列名上，还不知道下一行有没有数据呢
        while (resultSet.next()) {
            int id = resultSet.getInt(1);//执行单行单列的时候,可以写下标
            System.out.println(id);
        }
        //5.释放对象
        resultSet.close();
        prepar.close();
        conn.close();
    }

    @Test
    //单行多列
    public void test2() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbcDb";
        String user = "root";
        String pwd = "123456";
        Connection conn = DriverManager.getConnection(url, user, pwd);
        var prepar = conn.prepareStatement("select *  from t_emp where emp_id=?");
        prepar.setInt(1, 2);
        ResultSet resultSet = prepar.executeQuery();
        //这个while是必须要加的，因为此时的resultSet结果集游标在列名上，还不知道下一行有没有数据呢
        while (resultSet.next()) {
            int id = resultSet.getInt("emp_id");
            String name = resultSet.getString("emp_name");
            System.out.println("id是" + id + ",姓名是" + name);
        }
        //5.释放对象
        resultSet.close();
        prepar.close();
        conn.close();
    }

    @Test
    //多行多列
    public void test3() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbcDb";
        String user = "root";
        String pwd = "123456";
        Connection conn = DriverManager.getConnection(url, user, pwd);
        var prepar = conn.prepareStatement("select * from t_emp where emp_name=? and emp_age=?");
        prepar.setString(1, "ww");
        prepar.setInt(2, 1);

        ResultSet resultSet = prepar.executeQuery();
        //这个while是必须要加的，因为此时的resultSet结果集游标在列名上，还不知道下一行有没有数据呢
        while (resultSet.next()) {
            int id = resultSet.getInt("emp_id");
            String name = resultSet.getString("emp_name");
            System.out.println("id是" + id + ",姓名是" + name);
        }
        //5.释放对象
        resultSet.close();
        prepar.close();
        conn.close();
    }

    @Test
    public void Add() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbcDb";
        String user = "root";
        String pwd = "123456";
        Connection conn = DriverManager.getConnection(url, user, pwd);
        var prepar = conn.prepareStatement("INSERT into t_emp(emp_name,emp_age) VALUES(?,?)");
        prepar.setString(1, "ww");
        prepar.setInt(2, 1);

        //新增、修改、删除都是这个
        int resultSet = prepar.executeUpdate();
        //这个while是必须要加的，因为此时的resultSet结果集游标在列名上，还不知道下一行有没有数据呢
        if (resultSet > 0) {
            System.out.println("ok");
        } else {
            System.out.println("false");
        }
        //5.释放对象

        prepar.close();
        conn.close();
    }


}
