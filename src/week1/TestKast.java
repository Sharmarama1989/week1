package week1;

public class TestKast {
    public static void main(String[] args) {
        Kast kast1 = new Kast();
        Kast kast2 = new Kast(177,32,29);
        Kast kast3 = new Kast(187,69);
        System.out.println("De kast is: " + kast1);
        System.out.println("De kast is: " + kast2);
        System.out.println("De kast is: " + kast3);
        kast1.druk();
    }
}
