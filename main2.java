class Student {
    String name;
    double percentage;
    public Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Percentage: " + percentage);
    }
}
class UGAdmission extends Student {
    public UGAdmission(String name, double percentage) {
        super(name, percentage);
    }
    public void checkEligibility() {
        if (percentage >= 60) {
            System.out.println(name + " is eligible for UG admission.");
        } else {
            System.out.println(name + " is not eligible for UG admission.");
        }
    }
}
class PGAdmission extends Student {
    public PGAdmission(String name, double percentage) {
        super(name, percentage);
    }
    public void checkEligibility() {
        if (percentage >= 70) {
            System.out.println(name + " is eligible for PG admission.");
        } else {
            System.out.println(name + " is not eligible for PG admission.");
        }
    }
}

public class main2 {
    public static void main(String[] args) {
        UGAdmission ugStudent = new UGAdmission("Vijay", 65);
        PGAdmission pgStudent = new PGAdmission("Abhinav", 72);
        
        ugStudent.displayInfo();
        ugStudent.checkEligibility();
        
        System.out.println();
        pgStudent.displayInfo();
        pgStudent.checkEligibility();
    }
}
