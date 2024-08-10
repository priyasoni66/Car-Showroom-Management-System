import java.util.Scanner;

public class Cars extends Showroom implements utility{
    String carName;
    String carColor;
    String carFuelType;
    double carPrice;
    String carType;
    String carTransmission;

    @Override
    public void get_details(){
    System.out.println("Car Name : " + carName);
    System.out.println("Car Color : " + carColor);
    System.out.println("Fuel Type : " + carFuelType);
    System.out.println("Car Price : " + carPrice);
    System.out.println("Car Type : " + carType);
    System.out.println("carTransmission : " + carTransmission);
    }

    @Override
    public void set_details(){
        System.out.println("Enter Car Details");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Car Name: ");
        carName = sc.next();
        System.out.print("Enter Car Color: ");
        carColor = sc.nextLine();
        System.out.print("Enter Fuel Type: ");
        carFuelType = sc.nextLine();
        System.out.print("Enter Car Price:  ");
        carPrice = sc.nextDouble();
        System.out.print("Enter Car Type : ");
        carType = sc.nextLine();
        System.out.print("Enter Car Transmission : ");
        carTransmission = sc.nextLine();
        totalCars++;
    }
}
