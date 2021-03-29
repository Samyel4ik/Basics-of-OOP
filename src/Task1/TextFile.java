package Task1;

public class TextFile {
    File file;
    String text;

    public void setTextFile(File file, String text) {
        this.file = file;
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "file=" + file +
                ", text='" + text + '\'' +
                '}';
    }

    public void setText(String text) {
        this.text = text;
    }



    public String addText(String sss) {
        String str = this.text + sss;
        return str;
    }

    public String deleteText() {
        String str = "";
        return str;
    }

    public File renameFile(String str) {
        this.file.setFileName(str);
        return this.file;
    }
    public String getText() {
        return text;
    }
}
