package Triangle;

import java.text.DecimalFormat;

public class Main {
    static double sides[] = new double[3];

    public static void main(String args[]){

        sides[0] = Input.inputSides(0);
        sides[1] = Input.inputSides(1);
        sides[2] = Input.inputSides(2);

        if(Calculate.condition(sides)) {
            DecimalFormat form = new DecimalFormat("#####0.000");

            System.out.println("\n--------------------------------------------");
            System.out.println("Classification by Side:         " + Calculate.classificationBySides(sides));
            System.out.println("Classification by Angle:        " + Calculate.classificationByAngle(sides));
            System.out.println("Area:                           " + form.format(Calculate.area(sides)));
            System.out.println("Radius of Inscribed Circle:     " + form.format(Calculate.inscribedRadius(sides)));
            System.out.println("Radius of Circumscribed Circle: " + form.format(Calculate.circumscribeRadius(sides)));

            double cos[] = Trigonometry.cosine(sides);
            double sin[] = Trigonometry.sine(cos);
            double tan[] = Trigonometry.tan(cos, sin);
            double sec[] = Trigonometry.inverse(cos);
            double csc[] = Trigonometry.inverse(sin);
            double cot[] = Trigonometry.inverse(tan);
            double degree[] = Trigonometry.degree(cos);
            double rad[] = Trigonometry.rad(cos);

            Output.trig(sin, cos, tan, sec, csc, cot, rad, degree);
        }
        else{
            System.out.println("Not a triangle");
        }



    }
}