
public enum Model  {
    АУДИ(250,9000000),
    ФОРД(190,1000000),
    ХОНДА(230,1500000),
    ЯГУАР(240,7000000),
    НИСАН(210,4600000);

    public int speed;
    public int price;

    Model(int speed, int price) {
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Комплектация(" + "цена=" + price +" рублей" + ", скорость=" + speed + " км/ч)";
    }



}
