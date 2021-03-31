package Task4;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Class {
    // Дракон и его сокровища. Создать программу,
    // позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
    // Реализовать возможность просмотра сокровищ,
    // выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Color[] colors = arrayColors(random);
        Prise[] prises = arrayPrice();

        Treasures treasures = new Treasures();
        treasures.setTreasures(arrayTreasures(colors, prises));

        int xxx = 0;
        while (xxx != 4) {
            menu();
            xxx = input(scanner, treasures);
        }
    }

    public static void menu() {
        System.out.println("\"Выберете пункт меню:"
                + "\n" +
                "1. Просмтотр сокровищ."
                + "\n" +
                "2. Выбрать самое дорогое сокровище."
                + "\n" +
                "3. Выбор сокровища на заданную сумму."
                + "\n" +
                "4. Выход.");
        System.out.print("Ваш выбор - ");
    }

    public static int input(Scanner scanner, Treasures treasures) {
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println(treasures);
            case 2:
                System.out.println(treasures);
                System.out.println("-------------");
                System.out.println("Самое дорогое сокровище: " + treasures.maxTreasure());
            case 3:
                System.out.println(treasures);
                System.out.print("На какую сумму вы расчитываете произвести выбор сокровища - ");
                int x = scanner.nextInt();
                Treasure[] treasure = treasures.treasurePrice(x);
                System.out.println(Arrays.toString(treasure));
        }
        return input;
    }


    public static Treasure[] arrayTreasures(Color[] colors, Prise[] prises) {
        Treasure[] treasures = new Treasure[100];
        for (int i = 0; i < treasures.length; i++) {
            treasures[i] = new Treasure(colors[i], prises[i]);
        }
        return treasures;
    }


    public static int num() {
        return new Random().nextInt(300);
    }

    public static Prise[] arrayPrice() {
        Prise[] array = new Prise[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Prise(num());
        }
        return array;
    }

    public static Color colorRandom(Random random) {
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);

        return new Color(r, g, b);
    }

    public static Color[] arrayColors(Random random) {
        Color[] color = new Color[100];
        for (int i = 0; i < color.length; i++) {
            color[i] = colorRandom(random);
        }
        return color;
    }
}
