package week1;

public class Kast {
    private int hoogte;
    private int breedte;
    private int diepte;

    public Kast() {
        this.hoogte=117;
        this.breedte=69;
        this.diepte=43;
    }

    public Kast(int hoogte, int breedte, int diepte) {
        this.hoogte = hoogte;
        this.breedte = breedte;
        this.diepte = diepte;
    }

    public Kast(int hoogte, int breedte) {
        this.diepte=30;
        this.hoogte = hoogte;
        this.breedte = breedte;
    }

    public void druk(){
        System.out.println("De kast is:\n"+this.hoogte+ " hoog\n "+this.breedte +" breed\n "+this.diepte+ " hoog\n");
    }
    @Override
    public String toString() {
        return "Kast{" +
                "hoogte=" + hoogte +
                ", breedte=" + breedte +
                ", diepte=" + diepte +
                '}';
    }
}
