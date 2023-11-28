package week1;

public class TestPunt {
    public static void main(String[] args) {
        Puntje start=new Puntje(10,10);
        Puntje eind= new Puntje(20,30);
        Puntje p= new Puntje();

        start.drukAf();
        eind.drukAf();
        p.drukAf();


        Puntje punt3= new Puntje(5);
        System.out.println(punt3);

    }
}
