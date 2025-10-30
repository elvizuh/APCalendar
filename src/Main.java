        public class Main {
    public static void main(String[] args) {
        APCalendar.printLeapYear(2024);
        APCalendar.printLeapYear(2022);

        System.out.println(APCalendar.numberOfLeapYears(1492, 1776));

        System.out.println(APCalendar.dayOfWeek(1, 5, 2019));
        System.out.println(APCalendar.dayOfWeek(1, 10, 2019));

        APCalendar.printFirstDayofYear(2019);

        APCalendar.printDayOfYear(3, 1, 2017);
        APCalendar.printDayOfYear(3, 1, 2016);
    }
}