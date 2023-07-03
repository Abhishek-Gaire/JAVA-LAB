import java.awt.*;
public class GridLayoutExample extends Frame{
	public GridLayoutExample(String title){
		setLayout(new GridLayout(3,2));
		add(new Button("1"));
		add(new Button("2"));
		add(new Button("3"));
		add(new Button("4"));
		add (new Button("5"));
		add (new Button ("6"));
	}
	public static void main(String[] args){
		GridLayoutExample gl=new GridLayoutExample("Grid Layout Example");
		gl.setSize(300,200);
		gl.setVisible(true);
	}
}

