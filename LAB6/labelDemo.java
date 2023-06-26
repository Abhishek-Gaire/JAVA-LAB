import java.awt.*;
public class labelDemo extends Frame{
	private LayoutManager Layout;
	private Label Label1;
	private Label Label2;
	private Label Label3;

	public labelDemo(){
	//Instantiation
		Layout= new GridLayout(7,1);
		Label1=new Label("A Simple Label");
		Label2=new Label("A Label with LEFT aligment",Label.LEFT);
		Label3=new Label("A Label with CENTER aligment", Label.CENTER);

		//Location
		setLayout(Layout);
		add(Label1);
		add (Label2);
		add (Label3);

		//Decorqation
		Label2.setBackground(Color.yellow);
		Label1.setForeground(Color.blue);
	}
	public static void main(String[] args){
		labelDemo ld = new labelDemo();
		ld.setVisible(true);
		ld.setSize(400,300);
	}
}
