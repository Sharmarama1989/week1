package week1;

public class Bloem {
    private String naam;
    private double prijs;
    private String kleur;

    public Bloem(String naam, double prijs, String kleur) {
        this.naam = naam;
        this.prijs = prijs;
        this.kleur = kleur;
    }

    public void druck(){
        System.out.println(this.naam+" heeft als kleur "+ this.kleur+ " en kost "  +this.prijs
        );
    }

    @Override
    public String toString() {
        return "Bloem{" +
                "naam='" + naam + '\'' +
                ", prijs=" + prijs +
                ", kleur='" + kleur + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Bloem bloem1=new Bloem("Rose",12.54, "Wit");
        Bloem bloem2=new Bloem("Lily",20.5, "Rood");
        Bloem bloem3=new Bloem("Tulip",18.65, "Oranje");
        System.out.println(bloem1);
        System.out.println(bloem2);
        System.out.println(bloem3);
        bloem1.druck();

    }
}
