public class PotentialEnergy {

    private static final double g = 9.81;
    private static double h;
    private static double m;
    private static double e;



    public PotentialEnergy(double h, double m) {
        this.h = h;
        this.m = m;
    }

    public static double getH() {
        return h;
    }

    public static void setH(double h) {
        PotentialEnergy.h = h;
    }

    public static double getM() {
        return m;
    }

    public static void setM(double m) {
        PotentialEnergy.m = m;
    }

    public static double getE() {
        return e;
    }

    public static void setE(double e) {
        PotentialEnergy.e = e;
    }

    public static void find(){
        e = m*g*h;
        System.out.println(e);
    }

    public PotentialEnergy() {
    }
}