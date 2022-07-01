import java.util.Random;
import java.util.Scanner;

public class Generator {

    String randomString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@$%&#^!*abcdefghijklmnopqrstuvwxyz";

    public String userInput() {

        //initializing variable to keep track of user password length
        int userPasswordLength = 0;

        //initializing variable to keep track of user random password
        String randomPassword = "";

        //initializing scanner
        Scanner scanner = new Scanner(System.in);

        //error handling
        //that takes characters entered by user into consideration
        while (userPasswordLength < 10 || userPasswordLength > 25) {

            //get the length of the password from user
            System.out.println("Enter password length");

            //checking if what the user entered is an integer
            if(!scanner.hasNextInt()){
                //TODO: Runs twice if error is thrown. Fix

                //clearing out the scanner
                scanner.nextLine();

                System.out.println("Please enter a valid length. \n(Must be a number between 10 and 25.)");

                //starting over the loop
                continue;
            }

            //reading length
            userPasswordLength = scanner.nextInt();

            //length should not be less than 10 so check for that
            if (userPasswordLength < 10) {

                System.out.println("Length must be greater than or equal to 10.");

            //length should not be greater than 25 so check for that
            } else if (userPasswordLength > 25) {

                System.out.println("Length must be less than or equal to 25.");
            }
        }

        //initiating random method
        Random random = new Random();

        while (!meetsCharacterConstraints(randomPassword)) {

            //this resets password
            randomPassword = "";

            //loop until the length the user requested is met
            for (int i = 0; i < userPasswordLength; i++) {

                //generating the random password and storing it in the randomPassword variable - index
                randomPassword += randomString.charAt(random.nextInt(randomString.length() - 1));
            }
        }

        //returning the generated password
        return randomPassword;
    }

    //This method ensures that the string contains mixed characters
    public boolean meetsCharacterConstraints(String userString){

        if (userString.matches(".*[0-9].*")){

            if (userString.matches(".*[A-Za-z].*")){

                if (userString.matches(".*[_/*@/.!].*")){

                    return true;
                }
            }
        }
        return false;
    }
}












