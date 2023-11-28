package week1;

public class Datum {
    private int dag;
    private int maand;
    private int jaar;

    public Datum(int dag, int maand, int jaar) {
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }

    public void drukAf() {
       // System.out.println("Dag=" + this.dag + " maand=" + this.maand + " jaar=" + this.jaar);
        System.out.println(this.dag+"/"+this.maand+"/"+this.jaar);
    }

    @Override
    public String toString() {
        return "Datum{" +
                "dag=" + dag +
                ", maand=" + maand +
                ", jaar=" + jaar +
                '}';
    }

    }

