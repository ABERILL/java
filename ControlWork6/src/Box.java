public class Box implements Area {
    public  double a;
    public  double S;

    public Box(double a) {
        this.a = a;
    }

//    public double getA() {
//        return a;
//    }
//
//    public void setA(double a) {
//        this.a = a;
//    }

    public double calculateArea(){
        S = a*a;
        return S;

    }
}
