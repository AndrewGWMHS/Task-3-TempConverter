import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temp;
        double TEMP_CONVERSION = 1.8;
        int TEMP_CONSTANT = 32;
        String yesNo;
        boolean yesNoValid = false;
        boolean finish = true;
        boolean valid = false;

        do {
            while (!valid) {
                System.out.println("Enter a temperature in Celsius to be converted into Fahrenheit");
                if(scan.hasNextDouble()) {
                    temp = scan.nextDouble();
                    if (temp >= -273.15) {
                        System.out.println("Your temperature in Fahrenheit: " + (temp * TEMP_CONVERSION) + TEMP_CONSTANT);
                        valid = true;
                        scan.nextLine();
                    }
                    else {
                        System.out.println("Invalid Range");
                        scan.nextLine();
                    }
                }
                else {
                    System.out.println("Invalid data type entered, try again.");
                    scan.nextLine();
                }
            }
            System.out.println();
            do {
                System.out.println("Do you want to continue? Y/N");
                yesNo = scan.nextLine();
                if (yesNo.equalsIgnoreCase("n")) {
                    finish = false;
                    yesNoValid = true;
                    System.out.println("Program Ended");

                } else if (yesNo.equalsIgnoreCase("y")) {
                    valid = false;
                    yesNoValid = true;
                    finish = true;
                } else {
                    yesNoValid = false;
                    finish = false;
                    valid = false;
                }
            } while (!yesNoValid);

        } while(finish);

    }
}