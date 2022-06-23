import java.util.Random;
import java.util.Scanner;

public class Generator {

    String randomString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@$%&#^!*abcdefghijklmnopqrstuvwxyz";

    public String userInput(){

        //initializing variable to keep track of user password length
        int userPasswordLength = 0;

        //initializing variable to keep track of user random password
        String randomPassword = "";

        //initializing scanner
        Scanner scanner = new Scanner(System.in);

        //get the length of the password from user
        System.out.println("Enter password length");

        //reading length
        userPasswordLength = scanner.nextInt();

        //length should not be less than 10 so check for that
        if (userPasswordLength < 10) {

            System.out.println("Length must be greater than or equal to 10.");
            System.out.println("Enter password length");
            userPasswordLength = scanner.nextInt();

         //length should not be greater than 25 so check for that
        } else if (userPasswordLength > 25){

            System.out.println("Length must be less than or equal to 25.");
            System.out.println("Enter password length");
            userPasswordLength = scanner.nextInt();

        } else {

            //initiating random method
            Random random = new Random();

            while(!meetsCharacterConstraints(randomPassword)){

                //this resets password
                randomPassword = "";

                //loop until the length the user requested is met
                for (int i = 0; i < userPasswordLength; i++ ){

                     //generating the random password and storing it in the randomPassword variable
                    randomPassword += randomString.charAt(random.nextInt(randomString.length() - 1));
                }
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












