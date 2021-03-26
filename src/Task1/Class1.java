package Task1;

import java.util.Scanner;

public class Class1 {
    //Создать объект класса Текстовый файл, используя классы Файл, Директория.
    // Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Directory directory = new Directory("disk D");
        File file = new File("Мое хобби", directory);
        String text = "Привет, меня зовут Евгений мое хобби пентбол, бадминтон, волейбол.";
        TextFile textFile = new TextFile();
        textFile.setTextFile(file, text);
        System.out.println("Начнем работу? да или нет ?");

        String str = scanner.nextLine();
        while (str.equals("да")) {
            finish(scanner, textFile, file, text);
        }
    }

    public static void finish(Scanner scanner, TextFile textFile, File file, String text) {
        System.out.println("\"Выберете пункт меню:" + "\n" +
                "1. Создать новый текстовый файл." + "\n" +
                "2. Переименовать файл" + "\n" +
                "3. Вывести на консоль содержимое" + "\n" +
                "4. Дополнить файл" + "\n" +
                "5.Удалить файл");
        System.out.print("Ваш выбор - ");
        int x = Integer.parseInt(scanner.nextLine());
        if (x == 1) {
            System.out.print("Введите расположение файла");
            String location = scanner.nextLine();
            Directory directory1 = new Directory(location);
            System.out.print("Введите название файла - ");
            String fileName = scanner.nextLine();
            File file1 = new File(fileName, directory1);
            System.out.print("Введите текст - ");
            String text1 = scanner.nextLine();
            TextFile textFile1 = new TextFile();
            textFile1.setTextFile(file1, text1);

            System.out.println(textFile1);
        }
        if (x == 2) {
            System.out.print("Введите нове название файла - ");
            String str = scanner.nextLine();
            File file1 = textFile.renameFile(str);
            TextFile textFile1 = new TextFile();
            textFile1.setTextFile(file1, text);
            System.out.println(textFile1);
        }
        if (x == 3) {
            String str = textFile.getText();
            System.out.println(str);
        }
        if (x == 4) {
            System.out.print("Введите чем хотете дополнить файл - ");
            String sss = scanner.nextLine();
            String text1 = textFile.addText(sss);
            TextFile textFile1 = new TextFile();
            textFile1.setTextFile(file, text1);
            System.out.println(textFile1);
        }
        if (x == 5) {
            String text1 = textFile.deleteText();
            TextFile textFile1 = new TextFile();
            textFile1.setTextFile(file, text1);
            System.out.println(textFile1);
        }
    }
}
