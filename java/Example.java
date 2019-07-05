package Applet;
import java.applet.Applet;
import java.awt.*;
public class Example extends Applet{

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
       g.setColor(Color.red);
       g.drawString("´ó¼ÒºÃ", 40, 80);
       g.drawLine(30, 40, 130, 40);
       g.drawOval(30,40, 80, 60);
	}

}
