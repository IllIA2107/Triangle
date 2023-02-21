package Triangle;

public class Calculate {
    public static String classificationBySides(double[] sides){
        String[] sideClass = {"Equilateral", "Isosceles","Scalene"};
        int k = 2;
        if((sides[0] == sides[1]) & (sides[0] == sides[2]) & (sides[1] == sides[2])){
            k = 0;
        }
        else if((sides[0] == sides[1]) || (sides[0] == sides[2]) || (sides[1] == sides[2])){
            k = 1;
        }
        return sideClass[k];
    }

    public static String classificationByAngle(double[] sides){
        String[] angleClass = {"Obtuse", "Acute","Right"};
        sort(sides);
        int k = 0;
        if((sides[0]*sides[0] + sides[1]*sides[1]) > sides[2]*sides[2]){
            k = 1;
        }
        if((sides[0]*sides[0] + sides[1]*sides[1]) == sides[2]*sides[2]){
            k = 2;
        }
        return angleClass[k];
    }
    public static double area(double[] sides){
        double s = (sides[0] + sides[1] + sides[2]) / 2;
        return Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
    }
    public static void sort(double[] list){
        for(int p = 1; p < list.length; p++){
            for(int q = 0; q < list.length-p; q++){
                if(list[q] > list[q + 1]){
                    double temp = list[q];
                    list[q] = list[q + 1];
                    list[q + 1] = temp;
                }
            }
        }
    }
    public static double circumscribeRadius(double[] sides){
        return (sides[0] * sides[1] * sides[2]) / (4 * area(sides));
    }
    public static double inscribedRadius(double[] sides){
        double s = (sides[0] + sides[1] + sides[2]) / 2;
        return area(sides) / s;
    }
    public static double[] median(double[] sides){

        double[] median = new double[3];
        median[0] = Math.sqrt((2*sides[1]*sides[1] + 2*sides[2]*sides[2] - sides[0]*sides[0]) / 4);
        median[1] = Math.sqrt((2*sides[0]*sides[0] + 2*sides[1]*sides[1] - sides[1]*sides[1]) / 4);
        median[2] = Math.sqrt((2*sides[0]*sides[0] + 2*sides[1]*sides[1] - sides[2]*sides[2]) / 4);

        return median;
    }

    public static boolean condition(double[] sides){
        sort(sides);
        System.out.println();
        return sides[0] + sides[1] > sides[2];
    }
}
