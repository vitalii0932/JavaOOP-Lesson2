package AdvanchedLevel;

public class InverseTransformer extends TextTransformer{
    public InverseTransformer() {
    }

    @Override
    public String transform(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }

    @Override
    public String toString() {
        return "InverseTransformer{}";
    }
}
