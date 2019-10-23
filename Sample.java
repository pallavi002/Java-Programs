import java.awt. *;
import java.applet.*;
/* <applet code = "Sample" height = 300 width = 400>
</applet> */
public class Sample extends Applet{
	String msg;
	public void init(){
	     msg = "Inside init()";
	setBackground(Color.blue);
	}
	public void start(){
		msg+= " Inside start()";
	}
	public void paint( Graphics g){
		msg+= "Inside paint()";
		g.drawString(msg , 10, 30);
	}
}