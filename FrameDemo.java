package framedemo;

import java.awt.Color;
import java.awt.Frame;

public class FrameDemo {

    public static void main(String[] args) {
        
       Frame frame = new Frame("Demo Frame");
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setBackground(Color.yellow);
  
    }
    
}
