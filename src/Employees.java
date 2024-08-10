import java.util.*;

public class Employees extends Showroom implements utility{
    String employeeId;
    String employeeName;
    int employeeAge;
    String employeeDepartment;

    @Override
    public void set_details(){
        UUID uuid = UUID.randomUUID();
        employeeId = String.valueOf(uuid);
        System.out.println("Enter Employee Details");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name:  ");
        employeeName = sc.nextLine();
        System.out.print("Enter Employee Age : ");
        employeeAge = sc.nextInt();
        System.out.print("Enter Employee Department : ");
        employeeDepartment = sc.nextLine();
        System.out.print("Enter Showroom Name : ");
        showroomName = sc.nextLine();
    }

    @Override
    public void get_details(){
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee Age : " + employeeAge);
        System.out.println("Employee Department : " + employeeDepartment);
        System.out.println("Showroom Name : " + showroomName);
    }
}

