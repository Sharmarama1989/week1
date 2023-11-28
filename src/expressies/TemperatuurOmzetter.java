package expressies;

public class TemperatuurOmzetter {

    public TemperatuurOmzetter() {
    }
    public void naarFahrenheit(int cels){
        double res=cels;
        res=1.8*cels+32;
        System.out.println(cels+ " Celcius = "+ res+ " fahrenheit");

    }
    public void naarCelsius(int fahr){
        double res=fahr;
        res=(fahr-32)/1.8;
        System.out.println( fahr+ " Fahrenheit = "+res+ " Celcius ");
    }
}
