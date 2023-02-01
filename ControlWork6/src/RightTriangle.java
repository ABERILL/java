public class RightTriangle implements Area {

    public   double h;
    public  double c;
    public  double S;

    public RightTriangle(double h, double c) {
        this.h = h;
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double calculateArea(){
        S = 0.5*h*c;
        return S;
    }
}
