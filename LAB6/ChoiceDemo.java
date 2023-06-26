import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Frame implements ItemListener{
	private LayoutManager Layout;
	private Choice Selector;
	private Font SansSerif;

	public ChoiceDemo(){
		String [] ColorList;
		int i;
		ColorList= new String[9];
		SansSerif=new Font("SansSerif",Font.BOLD,14);
		Layout= new FlowLayout();
		Selector= new Choice();

		ColorList[0]="Red";
		ColorList[1]="Magneta";
		ColorList[2]="Blue";
		ColorList[3]="Cyan";
		ColorList[4]="Green";
		ColorList[5]="Yellow";
		ColorList[6]="White";
		ColorList[7]="Gray";
		ColorLisy[8]="Black";

		for(i=0; i<ColorList.length; ++i){
			Selector.insert(ColorList [i] , i);
		}
		Selector.setBackground(Color.yellow);
		Selector.setForeground(Color.red);
		Selector.setFont(SansSerif);

		setLayout(Layout);
		add(Selector);

		Selector.addItemListener (this);

		Selector.select(5);
		setBackground(Color.yellow);
	}
	public void itemStateChanged(ItemEvent e){
		int Selection;
		Selection = Selector.getSelectedIndex();
		if(Selection== 0){
			setBackground(Color.red);
		}
		else if(Selection ==1){
			setBackground(Color.magneta);
		}
		else if(Selection == 2){
			setBackground(Color.blue);
		}
		else if(Selection == 3){
			setBackground(Color.cyan);
		}
