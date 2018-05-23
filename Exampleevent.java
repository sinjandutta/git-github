import java.io.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.applet.*;
public class Exampleevent extends Applet implements MouseListener
{
StringBuffer str;
public void init()
{
addMouseListener(this);
str = new StringBuffer();
addItem("the applet is initialized ");
}
public void start()
{
addItem("the applet is started");
}
public void stop()
{
addItem("the applet is stopped");

}
public void destroy ()
{
addItem("the applert is  destroyed");
}
public void addItem(String s)
{
System.out.println(s);
str.append(s);
repaint();
}
public void paint(Graphics g)
{
g.drawRect(0,0,getWidth()-1,getHeight()-1);
}
public void mouseEntered(MouseEvent event)
{
}
public void mouseExited(MouseEvent event)
{
}
public void mousePressed(MouseEvent event)
{
}
public void mouseReleased(MouseEvent event)
{
}
public void mouseClicked(MouseEvent event)
{
addItem("the mouse is clicked");
}

}
/*
<applet code = "Exampleevent.class" width = "300" height = "300">
</applet>
*/