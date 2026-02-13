import java.util.Scanner;

public class ParOuImpar {

    static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an integer to see if it is even or odd: ");
    int number = scanner.nextInt();

    if(number % 2 == 0 ){
        System.out.println("The number" + number + "is even.");
    }
    else {
        System.out.println("The number" + number + "is odd");
    }

    scanner.close();

    }

}
