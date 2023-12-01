package Constructor;

public class Constructor {
    String name;
    int rollno;

    Constructor(){
        name = "ABC";
        rollno = 123;
    }

    public static void main(String args[]){
        Constructor con = new Constructor();
        System.out.println(con.name);
        System.out.println(con.rollno);
    }

}
