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
    public void eat(String ration) {
        if(super.getRation() == ration)
            System.out.println("eat... meov!");
        else
            System.out.println("I don't eat this!");
<<<<<<< HEAD
    }

    @Override
    public void getVoice() {
        System.out.println("meov... meov!!!");
    }

    @Override
=======
    }
    
    @Override
    public void getVoice() {
        System.out.println("meov... meov!!!");
    }

    @Override
>>>>>>> 9559dc60e05ab5203ec3dba5c751e3befc1a8d04
    public void sleep() {
        System.out.println("Good night little kitty)");
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + ", ration='" + super.getRation() + '\'' + ", color='" + super.getColor() + '\'' + ", weight=" + super.getWeight() + '}';
    }
}
