package JDBC;

import java.sql.*;

public class Database {
    
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");

            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\univ.db");

            Statement stm = con.createStatement();

            ResultSet rs = stm.executeQuery("select * from dept");

            int dno;
            String dname;

            while (rs.next()) {
                dno = rs.getInt("deptno");
                dname = rs.getString("dname");

                System.out.println(dno + " " + dname);
            }

            // Close ResultSet, Statement, and Connection in reverse order of creation
            rs.close();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
