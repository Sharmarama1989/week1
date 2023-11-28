package week1;

public class Product {
    private String naam;
    private double prijs;

    public Product(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    //functie => altijd ronde haakjes voor de parameter lijst
    public void drukAf() {
        System.out.println(this.naam + " kost " + this.prijs + " euro.");
    }

    // functie altijd camelcase=> kleine letter en nieuwe word start met hoofd letter
    public void verhoogPrijs() {
        //sqlqry verhoging met 10%
        //dit is een toekenning
        //rechterkant wordt toegekend aan de linkerkant
       // System.out.println(this.prijs = this.prijs * 1.1);
        //this.prijs = this.prijs * 1.1;
       // sqlqry verhoging met 20%
       // this.prijs=this.prijs*1.20;
        //same
       this.prijs = this.prijs+ (this.prijs*0.10);

    }
    public  void telOp(){
        this.prijs=this.prijs+1;
    }

    public  void telOpBedrag(double bedrag){
        this.prijs=this.prijs+bedrag;
    }

    @Override
    public String toString() {
        return "Product{" +
                "naam='" + naam + '\'' +
                ", prijs=" + prijs +
                '}';
    }

    public static void main(String[] args) {
        //maak
        //ctrl+spatie//
        Product product1 = new Product("Nutela", 3.5);//ctrl+p or ctrl+d
        Product product2 = new Product("Cote d'or", 3);

        // ctrl+d koppier de vorige lijnes


        System.out.println(product2);
        System.out.println(product1);
        // object.doeIets
        product1.drukAf();
        product2.drukAf();
        product1.verhoogPrijs();
        product1.drukAf();
        product1.telOp();
        System.out.println(product1);
        product1.telOpBedrag(0.2);
        System.out.println(product1);
    }
}
