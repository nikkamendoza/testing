// Your First Program
import java.util.Scanner;

class print {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = Scan.nextLine();
        System.out.println("Hi, " + name + "!");
    }
}


