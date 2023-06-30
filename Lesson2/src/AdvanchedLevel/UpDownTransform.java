package AdvanchedLevel;

public class UpDownTransform extends TextTransformer{
    public UpDownTransform() {
    }

    @Override
    public String transform(String text) {
        String resultText = "";
        for(int i = 0; i < text.length(); i++) {
            if(i % 2 == 0)
                resultText += Character.toString(text.charAt(i)).toLowerCase();
            else
                resultText += Character.toString(text.charAt(i)).toUpperCase();
        }
        return resultText;
    }

    @Override
    public String toString() {
        return "UpDownTransform{}";
    }
}
