import java.util.Random;
import java.util.Scanner;

public class Generator {

    String ranString = "?A0@a[B\1b]2C^3c_D4`d{E|5e}F~6fG7gH8hI9iJ!jK\"kL#lM$mN%nO&oP'pQ(qR)rS*sT+tU'uV-vW.wX/x:Y;y<Z=z>";

    public String userInput(){

        //initializing variable to keep track of user password length
        int userPasswordLength = 0;

        //initializing variable to keep track of user random password
        String randomPassword = "";

        //initializing scanner
        Scanner scanner = new Scanner(System.in);

        //read user password length
        System.out.print("Enter password length");

        //reading length
        userPasswordLength = scanner.nextInt();

        //check to see that length is not less than 10
        if (userPasswordLength < 10) {

            System.out.print("Length must be greater than or equal to 10.");
            System.out.print("Enter password length");
            userPasswordLength = scanner.nextInt();

         //check to see that length is greater than 25
        } else if (userPasswordLength > 25){

            System.out.print("Length must be less than or equal to 25.");
            System.out.print("Enter password length");
            userPasswordLength = scanner.nextInt();

        } else {

            //initiating random method
            Random rand = new Random();

            //looping until the length the user requested is met
            for (int i = 0; i < userPasswordLength; i++ ){

                //generating the random password and storing it in the randomPassword variable
               randomPassword += ranString.charAt(rand.nextInt(ranString.length() - 1));
            }
        }
        //returning the generated password
        return randomPassword;
    }
}












