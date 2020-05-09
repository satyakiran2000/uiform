import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="UIform" width=400 height=250>
</applet>
*/

public class UIform extends Applet implements ActionListener {
	String str="";
	TextField name,age,phone;
	Button submitb;
	public void init()
	{
		Label namep=new Label("Name: ",Label.RIGHT);
		Label agep=new Label("AGE: ",Label.RIGHT);
		Label phonep=new Label("PHONE NUMBER",Label.RIGHT);
		name = new TextField(12);
		age = new TextField(4);
		phone =new TextField(12);
		submitb=new Button("SUBMIT");
		
		add(namep);
		add(name);
		add(agep);
		add(age);
		add(phonep);
		add(phone);
		add(submitb);
		name.addActionListener(this);
		age.addActionListener(this);
		phone.addActionListener(this);
		submitb.addActionListener(this);
		add(submitb);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("SUBMIT"))
		{
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		g.drawString("NAME"+name.getText(),6,60);
		g.drawString("AGE: " + age.getText(), 6, 100);
		g.drawString("PHONE: " + phone.getText(), 6, 140);
	}
}