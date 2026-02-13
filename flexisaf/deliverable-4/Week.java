// 1. Define the Enum for Days of the Week
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// 2. Superclass (Parent)
class CalendarBase {
    protected String title;

    public CalendarBase(String title) {
        this.title = title;
    }

    public void showHeader() {
        System.out.println("=== " + title + " ===");
    }
}

// 3. Subclass (Child)
class WeeklyDisplay extends CalendarBase {
    
    public WeeklyDisplay(String name) {
        // Calling the superclass constructor
        super(name);
    }

    public void printDays() {
        // Accessing the Enum values
        for (Day d : Day.values()) {
            System.out.println("Day: " + d);
        }
    }
}

// 4. Main Class to run the program
public class Week {
    public static void main(String[] args) {
        // Instantiate the subclass
        WeeklyDisplay myCalendar = new WeeklyDisplay("My Weekly Schedule");

        // Use methods from both the superclass and subclass
        myCalendar.showHeader();
        myCalendar.printDays();
    }
}