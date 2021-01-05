package exercises;

import java.util.Scanner;

public class AreaOfARectangle {
    public static void main(String[] args) {

        System.out.println("What is the length?");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println("The length is "+length);

        System.out.println("What is the width?");
        int width = scanner.nextInt();
        System.out.println("The width is " + width);
        scanner.close();

        int area = length * width;
        System.out.println("The Area is " + area);

    }
}
