package Variables;

public class Variables {
    int employeeId = 0;
    static String name;

    
    public static void setName(String name) {
        Variables.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void main(String[] args) {
        int id = 91199;
        Variables var = new Variables();
        var.employeeId = id;
        Variables.setName("Faizan Atif Masood");
        System.out.println(Variables.getName());
    }

    
}
