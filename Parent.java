import java.time.LocalTime;
import javax.swing.JFrame;

public class Parent{ 
  public static void main(String[] args) throws InterruptedException{
    JFrame frame = new JFrame("FrameTest");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setSize(250, 0);
	boolean looping = true;
    while(looping == true) {
      LocalTime time = LocalTime.now();
      int hour = time.getHour();
      String amPm = "";
      if(hour < 13) {
        amPm = "AM";
      }
      else {
        amPm = "PM";
      }
      if(hour > 12) {
    	  hour -= 12;
      }
      String hourStr = Integer.toString(hour);
      if(hour < 10) {
        hourStr = "0" + hourStr;
      }
      int minute = time.getMinute();
      String minuteStr = Integer.toString(minute);
      if(minute < 10) {
        minuteStr = "0" + minuteStr;
      }
      int second = time.getSecond();
      String secondStr = Integer.toString(second);
      if(second < 10) {
        secondStr = "0" + Integer.toString(second);
      }
      String timeString = hourStr + ":" + minuteStr + ":" + secondStr + amPm;
      frame.setTitle(timeString);
      //System.out.println(timeString);
      Thread.sleep(975);
    }
  }
}