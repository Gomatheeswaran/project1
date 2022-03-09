// kilometer calculator for your car

import java.util.*;
public class runCar{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // my own code, this car gives 18 kmpl and 45 litres tank capacity 
        System.out.println("Enter your car-fuel level in litres");
        int fuelTank = input.nextInt();

        System.out.println("Enter your car milage");
        int km = input.nextInt();

        if (fuelTank > 0){
            while (fuelTank > 0) {
                km = km+18;
                fuelTank = fuelTank-1;
                // System.out.println("Car running " +km+ "km");
            }
            System.out.println("Car will run upto " + km + " kms");
        } else {
            System.out.println("Fuel Empty! Fill the fuel tank.");
        }
        
    }
}
