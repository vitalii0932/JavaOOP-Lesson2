package BasicLevel;

public class Dog extends Animal {
    private String name;

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getVoice() {
        System.out.println("GAV... GAV!!!");
    }

    @Override
    public void eat(String ration) {
        super.eat(ration);
    }

    @Override
    public void sleep() {
        System.out.println("Good night nice boy!");
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + '}';
    }
}