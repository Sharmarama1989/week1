package expressies;

public class TestMIijlNaarKilometer {
    public static void main(String[] args) {
        MijlNaarKilometer mijl1= new MijlNaarKilometer(30.0);
        MijlNaarKilometer mijl2= new MijlNaarKilometer(50.0);
        MijlNaarKilometer mijl3= new MijlNaarKilometer(100.0);

        System.out.println(mijl1);
        System.out.println(mijl2);
        System.out.println(mijl3);
        mijl1.zetOm();
        mijl2.zetOm();
        mijl3.zetOm();
      //  System.out.println(mijl1);
    }
}
