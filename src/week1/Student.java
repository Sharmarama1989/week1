package week1;

public class Student {
        private String naam;
        private String voorNaam;
        private int geboorteJaar;
        private String postcode;

// dit is een constructor
   /* dit is een functie waarmee je een concreet oobject maakt van de class student*/

    // de naam van de van een constructor= de naam van de class
    public Student(String naam, String voorNaam, int geboorteJaar, String postcode) {
        this.naam = naam;
        this.voorNaam = voorNaam;
        this.geboorteJaar = geboorteJaar;
        this.postcode = postcode;
    }
    //toont het object in de vorm van een leesbare string

    @Override
    public String toString() {
        return "Student{" +
                "naam='" + naam + '\'' +
                ", voorNaam='" + voorNaam + '\'' +
                ", geboorteJaar=" + geboorteJaar +
                ", postcode='" + postcode + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student1=new Student("Janssens", "Peter", 2001,"2800");
        Student student2 = new Student("Peeters", "Chris", 2010,"2801");
        Student student3 = new Student("Peeters", "Renske", 2005,"2801");
        //print het object uit.
      //dit werkt allen als je een tostring functie genereret
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
