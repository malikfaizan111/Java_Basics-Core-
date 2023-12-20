package JavaLangPackage;

enum Department {
    CS, IT, CIVIL, ECE; // all const are CAPTIAL Case

    // constructor in Enum always be private or Default

    private Department() {
        System.out.println(this.name()); // load each identifier when constructor load (when enum load)
    }

    public void displayInfo() {
        System.out.println(this.name() + " " + this.ordinal());
    }

    public static void display() {
        for (Department Department : Department.values()) {
            System.out.println(Department.name() + " " + Department.ordinal());
        }
    }
}

public class EnumBasic {
    public static void main(String[] args) {

        // Department d = Department.CIVIL;
        // System.out.println(d.ordinal());

        // Department list[] = Department.values();

        // for (Department x : list) {
        // System.out.println(x);
        // }

        // switch (d) {
        // case CS:
        // System.out.println("Head: John \n Block: A");
        // break;
        // case IT:
        // System.out.println("Head: Smith \n Block: B");
        // break;
        // case CIVIL:
        // System.out.println("Head: Zen \n Block: C");
        // break;
        // case ECE:
        // System.out.println("Head: Dave \n Block: D");
        // break;

        // default:
        // break;
        // }

        Department d = Department.ECE;
        d.displayInfo();
        // Department.display();
    }
}
