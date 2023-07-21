import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends Frame implements MouseListener{
 Lablel l;
 MouseListenerExample()
 {
 addMouseListener(this);
 l=new Label();
 l.setBounds(20,50,100,20);
 add(l);
 setSize(300,300);
 setLayout(null);
 setVisible(true);
 }
 public void mouseEntered(MouseEvent e){
 l.setText("Mouse Entered");
}
  public void mouseExited(MouseEvent e){
  l.setText("Mouse Exited");
}
  public void mousePressed(MouseEvent e){
  l.setText("Mouse Exited");
}
  public void mouseRelease(MouseEvent e){
   l.setText("Mouse Released");
}
 public static void main(String[]args){
  new MouseListenerExample();
 }
 }
 
