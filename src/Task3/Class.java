package Task3;

import java.sql.SQLOutput;
import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;

public class Class {
    //Создать класс Календарь с внутренним классом,
    // с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TheCalendar theCalendar = new TheCalendar();
        TheCalendar.Month[] months = arrayMonths();
        theCalendar.setTheCalendar(months);

        System.out.println(Arrays.toString(theCalendar.arrayNameMouth()));
        System.out.print("Введите месяц дня - ");
        String str = scanner.nextLine();

        System.out.println("Количество дней данногомесяца -" + theCalendar.numDay(str));
        System.out.print("Введите день - ");
        int t = Integer.parseInt(scanner.nextLine());

        String[] strings = arrayDays();
        int numDay = numDay(str, t, theCalendar);
        nameDay(strings, numDay);
        characteristic(numDay);

    }

    public static TheCalendar.Month[] arrayMonths() {
        return new TheCalendar.Month[]{
                new TheCalendar.Month("January", 31),
                new TheCalendar.Month("January", 30),
                new TheCalendar.Month("March", 31)};
    }

    public static String[] arrayDays() {
        return new String[]{"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
    }

    public static int numDay(String str, int t, TheCalendar theCalendar) {

        int x = 0;
        if (t > 0 && t <= 7) {
            x = t;
        } else if (t > 7 && t <= theCalendar.amountOfDays(str)) {
            x = t % 7;
        }
        return x;
    }

    public static void nameDay(String[] strings, int nymDay) {
        System.out.println(strings[nymDay - 1]);
    }

    public static void characteristic(int nymDay) {
        if (nymDay - 1 > 4) {
            System.out.println("День выходной");
        } else {
            System.out.println("Будний день");
        }
    }
}

