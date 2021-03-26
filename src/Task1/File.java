package Task1;

public class File {
    String fileName;
    Directory directory;

    public File(String fileName, Directory directory) {
        this.fileName = fileName;
        this.directory = directory;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                ", directory=" + directory +
                '}';
    }

    public String getFileName() {
        return fileName;
    }

}
