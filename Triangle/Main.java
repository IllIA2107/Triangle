package Triangle;

import java.text.DecimalFormat;

public class Main {
    static double sides[] = new double[3];

    public static void main(String args[]){

        while(1 == 1) {

            for(int k = 0; k < 3; k++){
                sides[k] = Input.inputSides(k);
            }
            if (Calculate.condition(sides)) {

                Output.calc(sides);

                double median[] = Calculate.median(sides);
                double cos[] = Trigonometry.cosine(sides);
                double sin[] = Trigonometry.sine(cos);
                double tan[] = Trigonometry.tan(cos, sin);
                double sec[] = Trigonometry.inverse(cos);
                double csc[] = Trigonometry.inverse(sin);
                double cot[] = Trigonometry.inverse(tan);
                double degree[] = Trigonometry.degree(cos);
                double rad[] = Trigonometry.rad(cos);

                Output.trig(sin, cos, tan, sec, csc, cot, rad, degree, median);
            }
            else {
                System.out.println("Not a triangle");
            }

            System.out.println("\nProgram completed.\n");
        }
    }
}