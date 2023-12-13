package StudentChallengeStatic;

import java.util.Date;

class Student {
    private String rollNo;
    private static int counter = 1;

    private String assignRollNo() {
        Date d = new Date();
        String rno = "Univ_" + (d.getYear() + 1900) + "_" + counter;
        counter++;
        return rno;
    }

    Student() {
        rollNo = assignRollNo();
    }

    public String getRollNo() {
        return rollNo;
    }
}

public class StudentChallengeStatic {

    public static void main(String[] args) {
    Student faizan = new Student();
    System.out.println("Faizan Get RollNo= "+ faizan.getRollNo());
    Student Mithoo = new Student();
    System.out.println("Mithoo Get RollNo= "+ Mithoo.getRollNo());
    }

}
