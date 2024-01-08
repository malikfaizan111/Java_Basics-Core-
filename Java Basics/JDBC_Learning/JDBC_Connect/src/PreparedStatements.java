import java.sql.*;
import java.util.Scanner;

public class PreparedStatements {
    public static void main(String[] args) throws  Exception {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        PreparedStatement ptm = con.prepareStatement("select * from students where deptno=?");
//        PreparedStatement ptm = con.prepareStatement("insert into students values(?,?,?,?)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dept Number");
        int dno = sc.nextInt();

        ptm.setInt(1,dno);
//      ptm.setInt(1, r);
//        ptm.setInt(2, name);
//        ptm.setInt(3, city);
//        ptm.setInt(4, dno);

        ResultSet rs = ptm.executeQuery();

//        ResultSet rs = ptm.executeUpdate();
        while (rs.next()) {
            System.out.println(rs.getInt("roll"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("city"));
            System.out.println(rs.getString("deptno"));
            System.out.println(rs.getInt(4));
        }

        // Close ResultSet, Statement, and Connection in reverse order of creation
        rs.close();
        ptm.close();
        con.close();
    }
}

// callable statement for storeprocedures