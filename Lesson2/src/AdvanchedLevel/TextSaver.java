package AdvanchedLevel;

import java.io.File;
import java.io.FileWriter;

public class TextSaver {
    private TextTransformer textTransformer;
    private File file;

    public TextSaver(TextTransformer textTransformer, File file) {
        this.textTransformer = textTransformer;
        this.file = file;
    }

    public TextSaver() {
    }

    public TextTransformer getTextTransformer() {
        return textTransformer;
    }

    public void setTextTransformer(TextTransformer textTransformer) {
        this.textTransformer = textTransformer;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void saveTextToFile(String text) {
        try {
            text = textTransformer.transform(text);
            FileWriter fw = new FileWriter(file);
            fw.write(text);
            fw.close();

            System.out.printf("\"%s\": The string has been successfully saved to the file.\n", text);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "TextSaver{" + "textTransformer=" + textTransformer + ", file=" + file + '}';
    }
}
