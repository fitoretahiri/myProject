import javax.swing.*;
import java.awt.*;
public class VIew extends JPanel{
   Arreys c;
   public VIew(Arreys c)
   {   this.c=c;
      JFrame frame=new JFrame();
      frame.getContentPane().add(this);
      frame.setSize(800,600);
      frame.setVisible(true);
      frame.setTitle("Sistemi per menaxhimin e studenteve");
   }

   public void paintComponent(Graphics g)
   {   g.setColor(Color.white);
      g.fillRect(0,0,800,600);
      g.setColor(Color.black);
   
      for (int i=1;i<c.users.length;i++)
      {   Studenti array=c.users[i];
         int rez=0;
         for (int j=1;j<c.id1.length;j++)
         {
            if (array.getId()==c.id1[j]) {rez++;}
         
         }
         
         g.setColor(Color.DARK_GRAY);
         g.fillRect(10,5,80,205);
      
         g.setColor(Color.WHITE);
         g.drawString("Studenti",20,20);
         g.drawString("Id Number",20,50);
         g.drawString("Emri",20,80);
         g.drawString("Mbiemri",20,110);
         g.drawString("Lenda",20,140);
         g.drawString("Regjisruar",20,170);
         g.drawString("Nota ",20,200);
         
       
         g.setColor(Color.BLACK);
         g.drawString(""+i,120+90*i,20);
         g.drawString("  "+array.getId(),100+90*i,50);
         g.drawString("  "+array.getEmri(),100+90*i,80);
         g.drawString("  "+array.getMbiemri(),100+90*i,110);
         g.drawString("  "+array.getLenda(),80+90*i,140);
         g.drawString("  "+rez+"here",100+90*i,170);
         g.drawString("  "+ array.getNota(),100+90*i,200);
         
         g.drawLine(10, 5, 10, 210);
         g.drawLine(90, 5, 90, 210);
         g.drawLine(160+90*i, 5, 160+90*i, 210);
         
         g.drawLine(10, 5, 160+90*i,5);
         g.drawLine(10,25, 160+90*i,25);
         g.drawLine(10, 55, 160+90*i,55);
         g.drawLine(10, 85, 160+90*i,85);
         g.drawLine(10, 115, 160+90*i,115);
         g.drawLine(10, 145,160+90*i,145);
         g.drawLine(10, 175, 160+90*i,175);
         g.drawLine(10, 210,160+90*i,210);         
      }
   
   }}