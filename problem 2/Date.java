/**
 * Date class represents a calendar date with day, month, and year.
 * Valid ranges: day [1, 31], month [1, 12], year [1900, 9999]
 * No input validation is performed.
 */
public class Date {

    private int day;
    private int month;
    private int year;
    
    /**
     * Constructor with day, month, and year parameters
     * @param day The day of the month (1-31)
     * @param month The month (1-12)
     * @param year The year (1900-9999)
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    /**
     * This will get the day
     * @return The day value
     */
    public int getDay() {
        return day;
    }
    
    /**
     * This will get the month
     * @return The month value
     */
    public int getMonth() {
        return month;
    }
    
    /**
     * And this will get the year
     * @return The year value
     */
    public int getYear() {
        return year;
    }
    
    /**
     * This will set the day
     * @param day The day to set
     */
    public void setDay(int day) {
        this.day = day;
    }
    
    /**
     * This will set the month
     * @param month The month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }
    
    /**
     * And this will set the year
     * @param year The year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    /**
     * This completes the set
     * @param day The day to set
     * @param month The month to set
     * @param year The year to set
     */
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    /**
     * Returns a string representation of the date in "dd/mm/yyyy" format with leading zeros
     * @return String in format "dd/mm/yyyy"
     */
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
