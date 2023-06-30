package BasicLevel;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cat Rizik = new Cat("meat", "orange", 5, "Rizik");
        Dog Luna = new Dog("meat", "white", 30, "Luna");
        Veterenarian Vitia = new Veterenarian("Vitia");

        Rizik.getVoice();
        Rizik.eat("brokoli");
        Rizik.eat("meat");
        Rizik.sleep();

        System.out.println("---------------------------------");

        Luna.getVoice();
        Luna.eat("brokoli");
        Luna.eat("meat");
        Luna.sleep();

        System.out.println("---------------------------------");

        Vitia.treatment(Rizik);
        Vitia.treatment(Luna);
    }
}