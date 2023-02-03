package Triangle;

import java.text.DecimalFormat;

public class Output {

    public static void calc(double sides[]){
        DecimalFormat form = new DecimalFormat("0.###");
        System.out.println("\n--------------------------------------------");
        System.out.println("Classification by Side:           " + Calculate.classificationBySides(sides));
        System.out.println("Classification by Angle:          " + Calculate.classificationByAngle(sides));
        System.out.println("Area:                             " + form.format(Calculate.area(sides)));
        System.out.println("Radius of Inscribed Circle:       " + form.format(Calculate.inscribedRadius(sides)));
        System.out.println("Radius of Circumscribed Circle:   " + form.format(Calculate.circumscribeRadius(sides)));
    }
    public static void trig(double sin[],double cos[], double tan[],double csc[],double sec[],double cot[], double rad[], double degree[], double median[]){
        char side[] = {'A','B','C'};
        DecimalFormat form = new DecimalFormat("0.000");
        System.out.println("--------------------------------------------");
        for(int k = 0; k < 3; k++){
            System.out.println("\n------------------------");
            System.out.println("Angle oppose " + side[k]);
            System.out.println("radian:        " + form.format(rad[k]));
            System.out.println("degree:        " + form.format(degree[k]));
            System.out.println("sin:           " + form.format(sin[k]));
            System.out.println("cos:           " + form.format(cos[k]));
            System.out.println("tan:           " + form.format(tan[k]));
            System.out.println("csc:           " + form.format(csc[k]));
            System.out.println("sec:           " + form.format(sec[k]));
            System.out.println("cot:           " + form.format(cot[k]));
            System.out.println("median:        " + form.format(median[k]));
            System.out.println("------------------------");
        }

    }
}
