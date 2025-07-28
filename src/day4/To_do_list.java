package day4;

public class To_do_list {
	public static void main(String[] args) {
        String[] tasks = {
            "wake up",
            "Do yoga",
            "Fresh up",
            "Breakfast",
            "Attend java class",
            "lunch break",
            "Practice Coding"
        };

        double[] times = {5.00, 6.00, 7.00, 8.00, 9.00, 13.00, 14.00};  // 24-hour format
        String meridiem;

        for (int i = 0; i < times.length; i++) {
            double hour = times[i];
            meridiem = (hour < 12) ? "AM" : "PM";

            int displayHour = (int) hour;
            if (displayHour > 12) {
                displayHour -= 12;
            } else if (displayHour == 0) {
                displayHour = 12;
            }

            System.out.println("Now the time is: " + displayHour + ":00 " + meridiem);
            System.out.println("Your task: " + tasks[i]);
            System.out.println("---------------------------");
        }
    }

}
