package base;

import java.sql.*;

public class JDBCQuick {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.获取链接对象
        String url = "jdbc:mysql://localhost:3306/jdbcDb";
        String user = "root";
        String pwd = "123456";
        Connection conn = DriverManager.getConnection(url, user, pwd);

        //3.执行sql语句
        String sqlStr = "select * from t_emp";

        //4.创建执行语句的对象
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlStr);

        while (resultSet.next()) {
            int id = resultSet.getInt("emp_id");

            int name = resultSet.getInt("emp_name");

            System.out.println("id是"+id+",姓名是"+name);
        }

        //5.释放对象
        resultSet.close();
        statement.close();
        conn.close();
    }
}
