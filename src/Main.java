import java.util.*;
import java.lang.*;


interface utility{
    public void get_details();
    public void set_details();
}

public class Main {
    static void main_menu() {
        System.out.println("************************    Welcome to Showroom Management System    **********************");
        System.out.println("===========>  Enter your choice  <===========");
        System.out.println("1). Add Showrooms     2). Add Employees    3). Add Cars");
        System.out.println("4). Get Showrooms     5). Get Employees    6). Get Cars");
        Scanner sc = new Scanner(System.in);
        System.out.println("***********************************    Enter 0 to exit    *********************************");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employee[] = new Employees[5];
        Cars cars[] = new Cars[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int employee_counter = 0;
        int cars_counter = 0;
        int choice = 100;
        while(choice != 0){
            main_menu();
            choice = sc.nextInt();
            while(choice != 9 && choice != 0){
                switch (choice){
                    case 1 :
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println("1). Add New Showroom");
                        System.out.println("9). Go Back to Main Menu");
                        choice = sc.nextInt();
                        break;
                    case 2 :
                        employee[employee_counter] = new Employees();
                        employee[employee_counter].set_details();
                        employee_counter++;
                        System.out.println("1). Add New Employee");
                        System.out.println("9). Go Back to Main Menu");
                        choice = sc.nextInt();
                        break;
                    case 3 :
                        cars[cars_counter] = new Cars();
                        cars[cars_counter].set_details();
                        cars_counter++;
                        System.out.println("1). Add New Car");
                        System.out.println("9). Go Back to Main Menu");
                        choice = sc.nextInt();
                        break;
                    case 4 :
                        for (int i = 0; i < showroom_counter; i++){
                            showroom[i].get_details();
                            System.out.println();
                        }
                        System.out.println("9). Go Back to Main Menu");
                        System.out.println("0). Exit");
                        choice = sc.nextInt();
                        break;
                    case 5 :
                        for(int i = 0; i < employee_counter; i++){
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9). Go Back to Main Menu");
                        System.out.println("0). Exit");
                        choice =sc.nextInt();
                        break;
                    case 6 :
                        for(int i = 0; i < cars_counter; i++){
                            cars[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9). Go Back to Main Menu");
                        System.out.println("0). Exit");
                        choice =sc.nextInt();
                        break;
                    default :
                        System.out.println("Enter Valid Choice");
                        break;
                    }
                }
            }
        }
    }
