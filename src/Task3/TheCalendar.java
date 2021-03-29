package Task3;


public class TheCalendar {
    Month[] month;

    public void setTheCalendar(Month[] month) {
        this.month = month;
    }


    public static class Month {
        String name;
        int numDay;

        public Month(String name, int numDay) {
            this.name = name;
            this.numDay = numDay;
        }


        public String getName() {
            return name;
        }

        public int getNumDay() {
            return numDay;
        }

        @Override
        public String toString() {
            return "Month{" +
                    "name='" + name + '\'' +
                    ", numDay=" + numDay +
                    '}';
        }
    }

    public String[] arrayNameMouth() {
        String[] strings = new String[this.month.length];
        for (int i = 0; i < this.month.length; i++) {
            strings[i] = this.month[i].getName();
        }
        return strings;
    }

    public int numDay(String str) {
        int num = 0;
        for (int i = 0; i < this.month.length; i++) {
            if (str.equalsIgnoreCase(this.month[i].getName())) {
                num = this.month[i].getNumDay();
            }
        }
        return num;
    }

    public int amountOfDays(String str) {
        int amountOfDays = 0;
        for (int i = 0; i < this.month.length; i++) {
            if (str.equalsIgnoreCase(this.month[i].getName())) {
                amountOfDays = this.month[i].getNumDay();
            }
        }
        return amountOfDays;
    }

}
