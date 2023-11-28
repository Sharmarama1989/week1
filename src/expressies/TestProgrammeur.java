package expressies;

public class TestProgrammeur {
    public static void main(String[] args) {


    Programmeur programmeur2=new Programmeur("Peeters","Java",3000);
        System.out.println(programmeur2);
        programmeur2.verhoogSalProcent();

        System.out.println(programmeur2);

    programmeur2.verhoogSalBedrag(100);
        System.out.println(programmeur2);

}
}