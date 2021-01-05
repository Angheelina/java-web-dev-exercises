package exercises;

import java.io.InputStream;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, what is your name?");
        InputStream in = System.in;
        Scanner input = new Scanner(in);
        String name = input.nextLine();
        System.out.println("Hello " + name);

        input.close();

    }

}
