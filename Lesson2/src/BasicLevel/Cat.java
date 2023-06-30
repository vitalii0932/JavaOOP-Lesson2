package BasicLevel;

public class Cat extends Animal{
    private String name;

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getVoice() {
        System.out.println("meov... meov!!!");
    }

    @Override
    public void eat(String ration) {
        super.eat(ration);
    }

    @Override
    public void sleep() {
        System.out.println("Good night little kitty)");
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + '}';
    }
}