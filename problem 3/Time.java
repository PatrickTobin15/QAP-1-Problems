/**
 * Time class represents time with hour, minute, and second.
 * Valid ranges: hour [0, 23], minute [0, 59], second [0, 59]
 * No input validation is performed.
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    /**
     * Constructor with the hour, the minute, and the second parameters
     * @param hour The amount in hours (0-23)
     * @param minute The amount in minutes (0-59)
     * @param second The amount in seconds (0-59)
     */
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    /**
     * This will get the hour
     * @return The hour value
     */
    public int getHour() {
        return hour;
    }
    
    /**
     * This will get the minute
     * @return The minute value
     */
    public int getMinute() {
        return minute;
    }
    
    /**
     * And this will get the second
     * @return The second value
     */
    public int getSecond() {
        return second;
    }
    
    /**
     * This will set the hour
     * @param hour The hour to set
     */
    public void setHour(int hour) {
        this.hour = hour;
    }
    
    /**
     * This will set the minutes
     * @param minute The minute to set
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }
    
    /**
     * And this will set the seconds
     * @param second The second to set
     */
    public void setSecond(int second) {
        this.second = second;
    }
    
    /**
     * This sets the complete time
     * @param hour The hour to set
     * @param minute The minute to set
     * @param second The second to set
     */
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    /**
     * @return String in format "hh:mm:ss"
     */
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    /**
     * This will advance the time by a singular second and returns this instance
     * Handles rollover from 23:59:59 to 00:00:00
     * @return This Time object
     */
    public Time nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
    
    /**
     * This decreases the time by a singular second and returns this instance
     * Handles rollover from 00:00:00 to 23:59:59
     * @return This Time object
     */
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}
