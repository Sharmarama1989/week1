package expressies;

public class MijlNaarKilometer {
    private double mijl;

    public MijlNaarKilometer(double mijl) {
        this.mijl = mijl;
    }

    public void zetOm(){
        //wanneer je een werkvariable nodig hebt in een functie moet je die lokaal aanmaken
        //deze variable is lokaal en niet buiten de functie gekend.
        double kilometer = this.mijl*1.609244;
        System.out.println(this.mijl+" mijl= "+ kilometer+" kilometers");
    }

    @Override
    public String toString() {
        return "MijlNaarKilometer{" +
                "mijl=" + mijl +
                '}';
    }
}
