public class Solution {

    public static int getHours(int minutesSinceMidnight) {
        // TODO: Return the hour (0-23) from minutes since midnight
        return 0;
    }

    public static int getMinutes(int minutesSinceMidnight) {
        // TODO: Return the remaining minutes (0-59)
        return 0;
    }

    public static boolean isAM(int minutesSinceMidnight) {
        // TODO: Return true if the time is before noon (AM)
        return false;
    }

    public static void main(String[] args) {
        int time = 810; // 1:30 PM
        System.out.println("Minutes since midnight: " + time);
        System.out.println("Hours: " + getHours(time));
        System.out.println("Minutes: " + getMinutes(time));
        System.out.println("Is AM: " + isAM(time));
    }
}
