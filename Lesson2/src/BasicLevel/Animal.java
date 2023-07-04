package BasicLevel;

public class Animal {
    private String ration;
    private String color;
    private int weight;

    public Animal(String ration, String color, int weight) {
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public Animal() {
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void getVoice() {
        System.out.println("some voice");
    }

    public void eat(String ration) {
        if(this.ration == ration) {
            System.out.println("eat...");
        } else {
            System.out.println("I don't eat this!");
        }
    }

    public void sleep() {
        System.out.println("Good night)");
    }

    @Override
    public String toString() {
        return "Animal{" + "ration='" + ration + '\'' + ", color='" + color + '\'' + ", weight=" + weight + '}';
    }
}
