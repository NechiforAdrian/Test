package itschoolS8;

public class AdvancePractice {
    public static void main(String[] args) {

    }

    public static class AdvancedFlowControl {

        //public - access modifier
        public static final String DAY_OF_WEEK_MONDAY = "Monday";
        public static final String DAY_OF_WEEK_TUESDAY = "Tuesday";
        public static final String DAY_OF_WEEK_WEDNESDAY = "Wednesday";
        public static final int USER_AGE = 25;

        public static void main(String[] args) {
            boolean isActive = false;

            if (isActive) {
                //
            } else {
                //code is executed
            }

            //classic switch construction
            String dayOfWeek = getDayOfWeek();
            switch (dayOfWeek) {
                case DAY_OF_WEEK_MONDAY:
                    System.out.println("Is Monday");
                    break;
                case DAY_OF_WEEK_TUESDAY:
                    System.out.println("Is Tuesday");
                    break;
                case DAY_OF_WEEK_WEDNESDAY:
                    System.out.println("Is Wednesday");
                    break;
                default:
                    System.out.println("Is another day");
                    break;
            }

            //switch logic with if-else construction
            if (dayOfWeek.equals("Monday")) {
                System.out.println("Is Monday");

            } else if (dayOfWeek.equals("Tuesday")) {
                System.out.println("Is Tuesday");

            } else if (dayOfWeek.equals("Wednesday")) {
                System.out.println("Is Wednesday");

            } else
                System.out.println("Is another day");


            switch (getDayOfWeek()) {
                case "Monday" -> System.out.println("Is Monday");
                case "Tuesday" -> System.out.println("Is Tuesday");
                case "Wednesday" -> System.out.println("Is Wednesday");
                default -> System.out.println("Is another day");
            }
        }

        public static String getDayOfWeek() {
            //return the day of the week
            return "Wednesday";
        }
    }
}
