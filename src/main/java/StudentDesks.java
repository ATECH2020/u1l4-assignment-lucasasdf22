import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();
        /*
         *  your code goes here
         */
        int desksNeeded = ((class1 / 2) + (class2 / 2) + (class3 / 2));
        desksNeeded += ((class1 % 2) + (class2 % 2) + (class3 % 2));

        System.out.print(desksNeeded);
        

        // closing the scanner object
        scanner.close();
    }
}