package expressies;

public class Programmeur {
    private String naam;
    private String specialiteit;
    private double  salaris;

    public Programmeur(String naam, String specialiteit, double salaris) {
        this.naam = naam;
        this.specialiteit = specialiteit;
        this.salaris = salaris;
    }
    public void verhoogSalProcent(){
        //sqlqry verhoging met 1%
      // this.salaris=this.salaris*1.01;
        //sqlqry verhoging met 1%
      //  this.salaris=this.salaris+this.salaris*0.01;
        this.salaris=this.salaris*1.01;

    }

    public void verhoogSalBedrag(double bedraag){
        this.salaris=this.salaris+bedraag;
        //System.out.println("Verhoging salary is= "+this.salaris);

    }
    @Override
    public String toString() {
        return "Programmeur2{" +
                "naam='" + naam + '\'' +
                ", specialiteit='" + specialiteit + '\'' +
                ", salaris=" + salaris +
                '}';
    }
}
