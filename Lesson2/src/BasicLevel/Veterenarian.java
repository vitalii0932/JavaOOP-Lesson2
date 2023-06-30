package BasicLevel;

public class Veterenarian {
    private String name;

    public Veterenarian(String name) {
        this.name = name;
    }

    public Veterenarian() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void treatment(Animal animal) {
        System.out.printf("Hi, I'm Vitia. Lets see your animal!\n....\nHe weight %d kg. He is OK!\n", animal.getWeight());
    }

    @Override
    public String toString() {
        return "Veterenarian{" + "name='" + name + '\'' + '}';
    }
}
