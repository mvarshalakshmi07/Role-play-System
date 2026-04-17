import java.util.Scanner;
class User {
    String name;

    void displayRole() {
        System.out.println("User");
    }
}
class Employee extends User {
    void displayRole() {
        System.out.println("Role: Employee");
    }
    void employeeDetails(Scanner s) {
        System.out.print("Enter Salary: ");
        double salary = s.nextDouble();
        s.nextLine();

        System.out.print("Project Assigned (yes/no): ");
        String projectStatus = s.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);

        if(projectStatus.equalsIgnoreCase("yes"))
            System.out.println("Assigned to project");
        else
            System.out.println("Not assigned");
    }
}
class Course extends User {
    void displayRole() {
        System.out.println("Role: Course");
    }
    void courseDetails(Scanner s) {
        System.out.print("Enter Course Name: ");
        String cname = s.nextLine();

        System.out.print("Duration: ");
        int d = s.nextInt();

        System.out.print("Fee: ");
        double f = s.nextDouble();
        s.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Course: " + cname);
        System.out.println("Duration: " + d);
        System.out.println("Fee: " + f);
    }
}

class Account extends User {
    void displayRole() {
        System.out.println("Role: Account");
    }
    void accountDetails(Scanner s) {
        System.out.print("Account Number: ");
        long a = s.nextLong();

        System.out.println("Name: " + name);
        System.out.println("Account No: " + a);
        System.out.println("Balance: 50000");
    }
}

public class RolePlay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1 Employee");
        System.out.println("2 Course");
        System.out.println("3 Account");

        int ch = s.nextInt();
        s.nextLine();

        System.out.print("Enter Name: ");
        String n = s.nextLine();

        if(ch==1){
            Employee e=new Employee();
            e.name=n;
            e.displayRole();
            e.employeeDetails(s);
        }
        else if(ch==2){
            Course c=new Course();
            c.name=n;
            c.displayRole();
            c.courseDetails(s);
        }
        else if(ch==3){
            Account a=new Account();
            a.name=n;
            a.displayRole();
            a.accountDetails(s);
        }
        else
            System.out.println("Invalid");
        s.close();
    }
}