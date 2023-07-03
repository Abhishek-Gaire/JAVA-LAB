import java.awt.*;
import java.awt.event.*
import javax.swing.*;
public class CardLayoutExample extends JFrame implements ActionListener{
	CardLayout card;
	JButton b1,b2,b3,b4;
	Container c;
	CardLayoutExample(){
		c=getContentPane();// Gets the content pane
		card =new CardLayout(40,30);
