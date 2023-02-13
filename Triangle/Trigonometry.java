package Triangle;

public class Trigonometry {
    public static double[] cosine(double[] sides){
        double[] cosine = new double[3];
        cosine[0] = (sides[1]*sides[1] + sides[2]*sides[2] - sides[0]*sides[0]) / (2 * sides[1] * sides[2]);
        cosine[1] = (sides[0]*sides[0] + sides[2]*sides[2] - sides[1]*sides[1]) / (2 * sides[0] * sides[2]);
        cosine[2] = (sides[0]*sides[0] + sides[1]*sides[1] - sides[2]*sides[2]) / (2 * sides[0] * sides[1]);
        return cosine;
    }
    public static double[] rad(double[] cosine){
        double[] rad = new double[3];
        rad[0] = Math.acos(cosine[0]);
        rad[1] = Math.acos(cosine[1]);
        rad[2] = Math.acos(cosine[2]);
        return rad;
    }
    public static double[] degree(double[] cosine){
        double[] degree = new double[3];
        degree[0] = (180 / Math.PI)  * Math.acos(cosine[0]);
        degree[1] = (180 / Math.PI)  * Math.acos(cosine[1]);
        degree[2] = (180 / Math.PI)  * Math.acos(cosine[2]);
        return degree;
    }
    public static double[] sine(double[] cosine){
        double[] sine = new double[3];
        for(int k = 0; k < 3; k++) {
            sine[k] = Math.sqrt(1 - cosine[k] * cosine[k]);
        }
        return sine;
    }
    public static double[] tan(double[] cosine, double[] sine){
        double[] tan = new double[3];
        for(int k = 0; k < 3; k++) {
            tan[k] = sine[k] / cosine[k];
        }
        return tan;
    }
    public static double[] inverse(double[] list){
        double[] inverse = new double[3];
        for(int k = 0; k < list.length; k++) {
            inverse[k] = 1 / list[k];
        }
        return inverse;
    }
}
