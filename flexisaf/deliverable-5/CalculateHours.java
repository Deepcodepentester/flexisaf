// The Interface
interface TimeCalculator {
    // Method to perform the calculation
    int calculateHours(int days);
    
    // Method to display the result
    void displayResult(int days, int hours);
}

//  The Class implementing the Interface
class DayToHourConverter implements TimeCalculator {
    
    // Constant for hours in a single day
    private static final int HOURS_IN_DAY = 24;

    @Override
    public int calculateHours(int days) {
        return days * HOURS_IN_DAY;
    }

    @Override
    public void displayResult(int days, int hours) {
        System.out.println("--- Conversion Result ---");
        System.out.println(days + " day(s) is equal to " + hours + " hours.");
    }
}

//  Main Class to execute
public class CalculateHours {
    public static void main(String[] args) {
        DayToHourConverter converter = new DayToHourConverter();
        
        int inputDays = 5; // Example input
        int totalHours = converter.calculateHours(inputDays);
        
        converter.displayResult(inputDays, totalHours);
    }
}