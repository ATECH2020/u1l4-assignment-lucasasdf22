import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int degrees = scanner.nextInt();

        /*
         *  your code goes here
         */
        int hours = degrees % 30;
        int minutes = hours * 12;
        
        System.out.print(minutes);
        // closing the scanner object
        scanner.close();
    }
}
