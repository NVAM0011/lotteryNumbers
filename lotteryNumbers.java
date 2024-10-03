import java.util.Random;
import java.util.Scanner;
public class lotteryNumbers {
    public static int getUserInput(){
        Scanner scanner = new Scanner(System.in); //Create a scanner object
        System.out.println("How many non-repeating, non-zero lottery number would you like to generate?");
        int userRequestedDigits = scanner.nextInt(); // Reading the user input for how many digits they want to generate.
        return userRequestedDigits;
    }
    static void generator(int userRequestedDigits) {
        if (userRequestedDigits > 9){
            System.out.println("That is too many digits."); // If the user requests more than 9 digits we print an error.
        }
            else {
            String[] Digits = {"1", "2", "3", "4", "5", "6", "7", "8", "9"}; // Create an array with the digits 1 thorough 9
            Random rand = new Random(); // Create an instance of the Random class

            String output = "Your lottery numbers are: "; // Create a string object called output

            for (int i = 0; i < userRequestedDigits; i++) { // loop through the generation and removal of digits until enough have been generated
                int LottoDigit = rand.nextInt(Digits.length); // selecting a random index in digits to concatenate and then remove.
                output = output.concat(Digits[LottoDigit]); // Concatenating the random digit

                String[] newDigits = new String[Digits.length - 1]; // Creating another array that is shorter than digits by 1
                for (int j = 0, k = 0; j < Digits.length; j++) { // using loop to copy each element in digits to a new array except for the selected digit
                    if (j != LottoDigit) {
                        newDigits[k] = Digits[j];
                        k++;
                    }
                }
                Digits = newDigits;
            }
            System.out.println(output);
        }
    }
}
