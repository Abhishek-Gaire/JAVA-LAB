import java.awt.*;
import javax.swing.*;
public class GridBagBasic{
	public static void main(String[] args){
		JFrame f= new JFrame();
		JPanel p=new JPanel();

		p.setLayout(new GridBagLayout());
		p.add(new JLabel("Java"));
		p.add(new JLabel("Programming"));
		p.add(new JLabel("Year 1"));
		p.add(new JButton("Button 1"));
		p.add(new JButton("Button 2"));
		p.add(new JTextField("Pokhara University"));
		p.add(new JTextField("2"));
		p.add(new JTextField("3"));

		f.getContentPane().add(p);
		f.setSize(600,200);
		f.setVisible(true);
	}
}
