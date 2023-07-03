import java.awt.*;
public class TextFieldDemo extends Frame{
	TextField Input;
	TextField Echo;
	LayoutManager Layout;

	public TextFieldDemo(){
		Input = new TextField("Input",35);
		Echo= new TextField("Text entered above will appear here.",35);
		Layout = new FlowLayout();

		setBackground(Color.yellow);
		Input.setBackground(Color.green);
		Echo.setForeground(Color.blue);

		setLayout(Layout);
		add(Input);
		add(Echo);

		Echo.setEditable(false);

	}
	public static void main(String[] args){
		TextFieldDemo tfd= new TextFieldDemo();
		tfd.setVisible(true);
		tfd.setSize(300,300);
	}
}
