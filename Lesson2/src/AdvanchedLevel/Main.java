package AdvanchedLevel;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        TextTransformer textTransformer = new TextTransformer();
        InverseTransformer inverseTransformer = new InverseTransformer();
        UpDownTransform upDownTransform = new UpDownTransform();
        TextSaver textSaver1 = new TextSaver(upDownTransform, new File("transformText1.txt"));
        TextSaver textSaver2 = new TextSaver();

        System.out.println(textTransformer.transform("Hello World!"));
        System.out.println(inverseTransformer.transform("Hello World!"));
        System.out.println(upDownTransform.transform("Hello World!"));

        textSaver1.saveTextToFile("This is first transform saved text!!!");

        textSaver2.setTextTransformer(inverseTransformer);
        textSaver2.setFile(new File("transformText2.txt"));
        textSaver2.saveTextToFile("This is second transform saved text!!!");
    }
}
