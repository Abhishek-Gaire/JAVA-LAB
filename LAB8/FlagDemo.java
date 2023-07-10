import java.awt.*;
import javax.swing.*;
class FlagDemo extends JFrame{
	public FlagDemo(){
		super("Nepali Flag");
		setSize(150,200);
		setVisible(true);
	}
	int x[]={10,80,30,80,10};
	int y[]={40,90,90,150,150};

	public void paint (Graphics g){
		g.setColor(Color.red);
		g.fillPolygon(x,y,5);
		g.setColor(Color.blue);
		g.drawPolygon(x,y,5);
		g.setColor(Color.white);
		g.fillOval(20,115,20,20);
		g.drawArc(20,60,20,20,0,-180);
		g.setColor(Color.green);
		g.drawLine(10,150,10,190);
	}
	public static void main(String[] args){
		FlagDemo fd=new FlagDemo();
		fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
