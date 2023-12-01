package Variables;

public class Variables {

    int employeeId = 0; // instance variable
    static String name; // static variable

    public Variables() {

    }

    public Variables(int id) {
        this.employeeId = id;
    }

    protected int getEmployeeId() {
        return this.employeeId;
    }

    public static void setName(String name) {
        Variables.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void main(String[] args) {
        int id = 91199; // local Variables 
        Variables var = new Variables(id);
        System.out.println(var.getEmployeeId());
        Variables.setName("Faizan Atif Masood");
        System.out.println(Variables.getName());
    }

}
