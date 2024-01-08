import java.sql.*;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from students");
//            ResultSet rs = stm.executeUpdate("insert into dept values(70,'Chem')");
//            ResultSet rs = stm.executeUpdate("delete from dept where deptno>=60");
//            ResultSet rs = stm.executeUpdate("update dept set dname='Chem' where deptno=50");
//            ResultSet rs = stm.executeUpdate("create table Temp(a integer, b float)");
//            ResultSet rs = stm.executeUpdate("drop table Temp");

//            int dno;
//            String dname;

            while (rs.next()) {
//                dno = rs.getInt("roll");
//                dname = rs.getString("name");
//
//                System.out.println(dno + " " + dname);

                System.out.println(rs.getInt("roll"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("city"));
                System.out.println(rs.getString("deptno"));
                System.out.println(rs.getInt(4));
            }

            // Close ResultSet, Statement, and Connection in reverse order of creation
            rs.close();
            stm.close();
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}