package week1;

public class Puntje {
    private double x;
    private double y;

//private var van type double staan automatische op 0.0
    public Puntje() {
    }

    public Puntje(double y) {
        this.x=2;
        this.y = y;
    }

    public Puntje(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void drukAf(){
        System.out.println("coördinaten= "+"(" +this.x+","+this.y+")");
    }

    @Override
    public String toString() {
        return "Punt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
