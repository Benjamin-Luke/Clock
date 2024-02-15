import java.awt.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.awt.*;
public class Main extends JFrame {
    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;
    Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);
        this.setVisible(true);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        timeLabel = new JLabel();

        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);

        this.add(timeLabel);
        this.setVisible(true);

        setTime();
    }

    public void setTime(){
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setOpaque(true);

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}