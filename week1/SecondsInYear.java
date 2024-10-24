public class SecondsInYear {
    public static void main(String[] args) {
        int secondsPerMinute = 60;
        int minutesPerHour = 60;
        int hoursPerDay = 24;
        int daysPerYear = 365;

        int secondsInYear = secondsPerMinute * minutesPerHour * hoursPerDay * daysPerYear;

        System.out.println("There are " + secondsInYear + " seconds in a year.");
    }
}
