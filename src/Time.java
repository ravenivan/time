public class Time {
    private int hours;
    private int minutes;
    private int seconds;


    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public void tick() {
        seconds++;
        timeLogic();
    }


    public void timeLogic() {
        if (seconds >= 60) {
            seconds -= 60;
            minutes++;
        }
        if (minutes >= 60) {
            minutes -= 60;
            hours++;
        }
        if (hours >= 24) {
            hours -= 24;
        }
    }


    public String info() {
        String stringHours;
        String stringMinutes;
        String stringSeconds;
        if (hours < 10) {
            stringHours = "0" + hours;
        } else {
            stringHours = Integer.toString(hours);
        }
        if (minutes < 10) {
            stringMinutes = "0" + minutes;
        } else {
            stringMinutes = Integer.toString(minutes);
        }
        if (seconds < 10) {
            stringSeconds = "0" + seconds;
        } else {
            stringSeconds = Integer.toString(seconds);
        }
        return stringHours + ":" + stringMinutes + ":" + stringSeconds;


    }


    public void add(Time otherTime) {
        hours += otherTime.hours;
        minutes += otherTime.minutes;
        seconds += otherTime.seconds;
        timeLogic();
    }

    public void add(String info) {
        int infoHours = Integer.parseInt(info.substring(0, 2));
        int infoMinutes = Integer.parseInt(info.substring(3, 5));
        int infoSeconds = Integer.parseInt(info.substring(6, 8));
        hours += infoHours;
        minutes += infoMinutes;
        seconds += infoSeconds;
        timeLogic();
    }



}
