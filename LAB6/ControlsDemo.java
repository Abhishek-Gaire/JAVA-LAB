import java.awt.*;

public class ControlsDemo extends Frame{
	private Label DemoLabel;
	private Button DemoButton;
	private Scrollbar DemoSlider;
	private Checkbox DemoRadio;
	private Checkbox DemoBox;
	private TextField DemoText;
	private TextArea DemoArea;
	private Choice DemoCombo;
	private List DemoList;
	private LayoutManager Layout;
	private CheckboxGroup Group;

	public ControlsDemo(){
		DemoLabel=new Label();
		DemoSlider= new Scrollbar();
		Group = new CheckboxGroup();
		DemoRadio = new Checkbox("Checkbox", Group, false);
		DemoBox= new Checkbox();
		DemoButton = new Button();
		DemoText = new TextField();
		DemoCombo= new Choice();
		DemoList = new List(3);
		DemoArea = new TextArea(5,30);
		Layout = new FlowLayout();

		setLayout(Layout);
		add(DemoLabel);
		add(DemoSlider);
		add(Group);
		add(DemoRadio);
		add(DemoBox);
		add(DemoButton);
		add(DemoText);
		add(DemoCombo);
		add(DemoList);
		add(DemoArea);

		DemoLabel.setText("Label");
		DemoSlider.setName("Scrollbar");
		DemoButton.setLabel("Button");
		DemoBox.setLabel("CheckBox");
		DemoText.setText("TextField");
		DemoCombo.addItem("Selection");
		DemoCombo.addItem("Choice");
		DemoList.add("List");
		DemoList.add("Selection");
		DemoArea.setText("TextArea");
	}
	public static void main(String[] args){
		ControlsDemo t = new ContrlsDemo();
		t.setVisible(true);
		t.setSize(300,300);
	}
}
