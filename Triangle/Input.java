package Triangle;

import java.util.Scanner;

public class Input {

    public static double inputSides(int k) {
        char letter[] = {'A','B','C'};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side length " + letter[k] + ": ");
        double side = input.nextDouble();
        return side;
    }
}
