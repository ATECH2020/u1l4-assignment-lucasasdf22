import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        /*
         *  your code goes here
         */
        hours2 -= hours1;
        minutes2 -= minutes1;
        seconds2 -= seconds1;

        hours2 = hours2 * 3600;
        minutes2 = minutes2 * 60;

        System.out.print(hours2 + minutes2 + seconds2); 

        // closing the scanner object
        scanner.close();
    }
}