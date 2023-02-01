public  class circle implements Area{
    public static final double P = 3.14;
    public  double radius;
    public  double S;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        S = P*(radius*radius);
        return S;

    }
}
