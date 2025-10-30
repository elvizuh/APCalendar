public class APCalendar {
    /**
     * Returns true if year is a leap year and false otherwise.
     */
    private static boolean isLeapYear(int year) {
        if (year % 100 == 0){
            return year % 400 == 0;
        }

        return year % 4 == 0;
    }

    public static void printLeapYear(int year) {
        System.out.println(isLeapYear(year));
    }

    /**
     * Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
     */
    public static int numberOfLeapYears(int year1, int year2) {
        int total = 0;
        for (int i = year1; i < year2 + 1; i++) {

            if (isLeapYear(i)) total++;
        }

        return total;
    }

    /**
     * Returns the value representing the day of the week for the first day of year,
     * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
     */
    private static int firstDayOfYear(int year) {
        // year 1AD was on a monday

        int leaps = numberOfLeapYears(1, year - 1);

        return (leaps + year) % 7;
    }

    public static void printFirstDayofYear(int year) {
        System.out.println(firstDayOfYear(year));
    }

    /**
     * Returns n, where month, day, and year specify the nth day of the year.
     * Returns 1 for January 1 (month = 1, day = 1) of any year.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    private static int dayOfYear(int month, int day, int year) {
        int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysPerMonth[1] = 29;
        }

        int dayInYear = 0;

        for (int i = 0; i < month - 1; i++) {
            dayInYear += daysPerMonth[i];
        }

        return dayInYear += day;
    }

    public static void printDayOfYear(int month, int day, int year) {
        System.out.println(dayOfYear(month, day, year));
    }

    /**
     * Returns the value representing the day of the week for the given date
     * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
     * and 6 denotes Saturday.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    public static int dayOfWeek(int month, int day, int year) {
        return (dayOfYear(month, day, year) - 1 + firstDayOfYear(year)) % 7;
    }
}
