import java.awt.*;
public class BorderPanelDemo extends Frame{
	public BorderPanelDemo(String title){
		super(title);
		addComponent("North", new Button ("North"));
		addComponent("South", new Button("South"));
		addComponent("East", new Button("East"));
		addComponent("West", new Button ("West"));
		addComponent("Center",new Button("Center"));
	}
	public void addComponent(String region, Component component){
		Panel panel = new Panel();
		panel.add(component);
		add(region,panel);
	}
	public static void main(String[] args){
		BorderPanelDemo bpd=new BorderPanelDemo("Border Panel Demo");
		bpd.setSize(200,150);
		bpd.setVisible(true);
	}
}
