public class RightTriangle {
    private double cathet1;
    private double cathet2;
    private double hypotenuse;


    public double getCathet1(){
        return cathet1;
    }
    public void setCathet1(double cathet1){
        this.cathet1 = cathet1;
    }
    public double getCathet2(){
        return cathet2;
    }
    public void setCathet2(double cathet2){
        this.cathet2 = cathet2;
    }
    public double getHypotenuse(){
        return hypotenuse;
    }
    public void setHypotenuse(double hypotenuse){
        this.hypotenuse = hypotenuse;
    }

    public RightTriangle(double cathet1,double cathet2){
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;

    }
    public double  find(){
        hypotenuse = Math.sqrt(cathet1*cathet1+cathet2*cathet2);
        return hypotenuse;

    }

    public RightTriangle() {
    }
}


     