import java.sql.SQLOutput;
import java.util.*;
public class Showroom implements utility{
    String showroomName;
    String showroomAddress;
    String managerName;
    int totalEmployees;
    int totalCars;

    @Override
    public void set_details(){
        System.out.println("Enter Showroom Details");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Showroom Name: ");
        showroomName = sc.nextLine();
        System.out.print("Enter Showroom Address:  ");
        showroomAddress = sc.nextLine();
        System.out.print("Enter Manager Name : ");
        managerName = sc.nextLine();
        System.out.print("Total no. of Employess : ");
        totalEmployees = sc.nextInt();
        System.out.print("Total no. of Cars : ");
        totalCars = sc.nextInt();
    }

    @Override
    public void get_details(){
        System.out.println("Showroom Name : " + showroomName);
        System.out.println("Showroom Address : " + showroomAddress);
        System.out.println("Manager Name : " + managerName);
        System.out.println("Total Employees : " + totalEmployees);
        System.out.println("Total Cars in Stock : " + totalCars);
    }
}

