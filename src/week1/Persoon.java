package week1;

public class Persoon {
    private String naam;
    private String voorNaam;
    private String woon;

    public Persoon(String naam, String voorNaam, String woon) {
        this.naam = naam;
        this.voorNaam = voorNaam;
        this.woon = woon;
    }
    public  void schrijf(){
        System.out.println(this.naam+" "+ this.voorNaam+" "+"woont" +  " in " +this.woon);
    }
}
