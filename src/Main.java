import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean valid = false;
        double tempC = 0;
        double tempF;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Please enter a temperature in degrees C to be converted to degrees F: ");
            if(scan.hasNextDouble()){
                tempC = scan.nextDouble();
                scan.nextLine();
                valid = true;
            } else{
                scan.nextLine();
                System.out.println("You have entered an invalid temperature value. Please try again. ");
            }
        }while (!valid);
        tempF = tempC * 9/5 + 32;
        System.out.printf("Degrees C: \t%.2f\n", tempC);
        System.out.printf("Degrees F: \t%.2f", tempF);
    }
}