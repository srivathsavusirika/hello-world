import javax.swing.*;
import java.awt.event.*;
public class xyz extends JFrame implements ActionListener,ItemListener
{
String disamount,netamount;
double dis,net,discount;
JLabel l1,l2,l3,l4,l5,l6;
JButton b1,b2,b3;
JTextField t1,t2,t3;
JRadioButton rb1,rb2,rb3;
xyz()
{
l1=new JLabel("FOR U SHOP");
l1.setBounds(350,0,150,150);
l2=new JLabel("DISCOUNT CALCULATOR");
l2.setBounds(305,20,200,150);
l3=new JLabel("Shopping Amount:");
l3.setBounds(45,148,150,30);
l4=new JLabel("Payment Mode");
l4.setBounds(45,190,150,30);
l5=new JLabel("Discount Amount:");
l5.setBounds(45,390,150,30);
l6=new JLabel("Net Price:");
l6.setBounds(435,390,150,30);
b1=new JButton("Clear All");
b1.setBounds(550,250,100,30);
b2=new JButton("Calculate");
b2.setBounds(435,250,100,30);
b3=new JButton("Exit");
b3.setBounds(500,290,100,30);
t1=new JTextField();
t1.setBounds(155,148,150,30);
t2=new JTextField();
t2.setBounds(155,390,150,30);
t3=new JTextField();
t3.setBounds(500,390,150,30);
rb1=new JRadioButton("Cash");
rb1.setBounds(45,240,100,30);
rb2=new JRadioButton("Cheque");
rb2.setBounds(145,240,100,30);
rb3=new JRadioButton("Credit Card");
rb3.setBounds(245,240,100,30);
ButtonGroup bg=new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
bg.add(rb3);
add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(b1);add(b2);add(b3);
add(t1);add(t2);add(t3);add(rb1);add(rb2);add(rb3);
setSize(700,500);
setLayout(null);
setVisible(true);
b1.addActionListener(this); 
b2.addActionListener(this);
b3.addActionListener(this);
rb1.addItemListener(this);
rb2.addItemListener(this);
rb3.addItemListener(this);
}
public void itemStateChanged(ItemEvent a)
{
String s=t1.getText();
int b=Integer.parseInt(s);
if(a.getSource()==rb1)
{
if(b<10000)
{
discount=0.2;
dis=b*0.2;
net=b-dis;
disamount=Double.toString(dis);
netamount=Double.toString(net);
t2.setText(disamount);
t3.setText(netamount);
}
}
else if(a.getSource()==rb2)
{
if(b<15000)
{
discount=0.1;
dis=b*0.1;
net=b-dis;
disamount=Double.toString(dis);
netamount=Double.toString(net);
t2.setText(disamount);
t3.setText(netamount);
}
}
else
{
if(b<10000)
{
discount=0.1;
dis=b*0.1;
net=b-dis;
disamount=Double.toString(dis);
netamount=Double.toString(net);
t2.setText(disamount);
t3.setText(netamount);
}
}
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
t1.setText("");
t2.setText("");
t3.setText("");
rb1.setSelected(true);
}
else if(e.getSource()==b2)
{
String s=t1.getText();
int b=Integer.parseInt(s);
t2.setText(disamount);
t3.setText(netamount);
}
else
{
System.exit(0);
}
}
public static void main(String args[])
{
new xyz();
}
}