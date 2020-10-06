import javax.swing.*;

public class Model 
{
   Arreys array;
   VIew view;

   public Model(VIew view,Arreys array)
   {
      this.view=view;
      this.array=array;
   }
       
   public void run()
   {   
      String input  =JOptionPane.showInputDialog(null,"Shtypni(1,2,3,4,5)"+"\n1 - Regjistro \n2 - Ndrysho \n3 - Largo \n4 - Nderro lenden \n5  -Mbyll","Monitorimi i studenteve",JOptionPane.INFORMATION_MESSAGE);
      if (input==null || input.length()==0)
      {
         run();
      }
      
      
      else { int hyrja=readCommand(input);
         if (hyrja == 5) 
         {System.exit(0);} 
         else {
            switch (hyrja) 
            { 
               case 1: {
                  String emri = JOptionPane.showInputDialog("Emri:");
                  emri = emri.substring(0,1).toUpperCase() + emri.substring(1).toLowerCase(); //Kthen cdo here emrin me shkronje te madhe
                  String h = emri;
                // Nuk lejon numra ne emer
                  for (int i = 0; i < h.length(); i++) {
                     char c = h.charAt(i);
                     if (Character.isDigit(c)) {
                       JOptionPane.showMessageDialog(null, "Ju lutem plotsoni mire fushat. Nuk lejohen numra ne emer!");
                       run();
                     }
                  }
                  String mbiemri = JOptionPane.showInputDialog("Mbiemri:"); 
                  mbiemri = mbiemri.substring(0,1).toUpperCase() + mbiemri.substring(1).toLowerCase();//kthen mbiemrin me shkronj te madhe
                   //nuk lejon numra ne mbiemer
                  String s=mbiemri;
                  for (int i = 0; i < s.length(); i++) {
                     char c = s.charAt(i);
                     if (Character.isDigit(c)) {
                        JOptionPane.showMessageDialog(null, "Ju lutem plotsoni mire fushat. Nuk lejohen numra ne mbiemer!");
                        run();
                     }
                  }
               
                  //Pjesa e kodit per perzgjedhjen e lendes, nuk lejon te futen lende te tjera perveq atyre ne liste dhe lejon te shkruhet edhe me shkronje te vogel
               //   String Lenda=JOptionPane.showInputDialog(null,"Lenda:"+"\n - Programim2 \n -Analize2  \n -Algjeber \n -Gjeometri","Lendet e semestrit te dyt",JOptionPane.INFORMATION_MESSAGE);
                  String x[]={"Programim2","Analize2","Algjeber","Gjeometri"};
                 String Lenda=JOptionPane.showInputDialog(null,"Lenda:"+"\n - Programim2 \n -Analize2  \n -Algjeber \n -Gjeometri","Lendet e semestrit te dyt",JOptionPane.INFORMATION_MESSAGE);
                 

                  Lenda = Lenda.substring(0,1).toUpperCase() + Lenda.substring(1).toLowerCase();
                  if(Lenda == null){run();}
                  else    if(  Lenda.equals("Programim2")) {Lenda="Programim2";}
                  else if(Lenda.equals("Analize2")){Lenda="Anailze2";}
                  else 
                     if(Lenda.equals("Algjeber")){Lenda="Algjeber";}
                     else {
                        if(Lenda.equals("Gjeometri")){Lenda="Gjeometri ";}
                        else {JOptionPane.showMessageDialog(null, "Ju lutem shkruani vetem lendet e parapara me orar te cilat gjenden ne liste!");
                        run();}}
                              
                              
                  
                  
                  
                   //Nota eshte lidhe me piket ne menyre qe ti shfaqet userit nota automatikisht pasi te ket shtypur piket e provimit
                  int piket=Integer.parseInt(JOptionPane.showInputDialog(null, "Piket:","Ju lutem shkruani piket",JOptionPane.INFORMATION_MESSAGE));
                                                
                  String nota =""+5 ;
                  if  (piket>100 || piket<0 ){JOptionPane.showMessageDialog(null, "Ju lutem shkruani piket ne itervalin [0,100]!");
                  run();}
                  else{
                  
                     if ( piket >= 90 )
                     { nota =""+ 10; }
                     else  if ( piket >= 80 )
                     { nota =""+ 9;}
                     else    if ( piket >= 70 )
                     { nota =""+ 8; }
                     else   if ( piket >= 60 )
                     { nota =""+ 7; }
                     else    if ( piket >= 50)
                     { nota =""+ 6; }
                     else   if(piket<50)  
                     { nota =""+ 5; }
                  }
                  
                                                   
                                              
                  int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Numri Personal:","Kujdese! te jete unike",JOptionPane.INFORMATION_MESSAGE));
                  if (array.Id_unike(id)){JOptionPane.showMessageDialog(null,"Personi eshte i regjistruar");}
                  
                  else {array.addId(id);
                                                 
                     array.add(new Studenti(emri,mbiemri,id,Lenda,nota));
                     view.repaint(); }
                  run();
                  break;
            
               }
                        
               case 2: {
                                   
                  int index = new Integer(JOptionPane.showInputDialog(null,"Zgjedh sipas indeksit, Studentin tek i cili deshironi"+
                                   "te beni ndryshime ","Ndrysho",JOptionPane.INFORMATION_MESSAGE));
                                    
                  if (index >=0 && index<array.users.length)
                  {
                     String s = JOptionPane.showInputDialog(null,"Komanda (1) \n1 - Ndrysho noten","Ndrysho",JOptionPane.INFORMATION_MESSAGE);
                     int c = readCommand(s);
                     Studenti b = array.users[index];
                                       
                     switch (c) {
                        case 1: {
                           int nota = Integer.parseInt(JOptionPane.showInputDialog(null,"Shkruaj noten","Nota",JOptionPane.INFORMATION_MESSAGE));
                           if(nota >10 || nota <0){JOptionPane.showMessageDialog(null,"Ju lutem shkruani noten ne intervalin [5,10]");
                           run();}
                           else{String nota1=""+nota;
                           b.setNota(nota1);}
                           view.repaint();
                           run();
                           break;
                                             
                        }
                                                      
                       
                        default: {
                           JOptionPane.showMessageDialog(null, "Komanda e shtypur gabim");
                           run();
                        }
                     }
                        
                  }
                        
                        
                  else 
                  {
                     JOptionPane.showMessageDialog(null,"Studenti nuk gjendet ne liste");
                     run();
                  }
                                             
                  break;
               }
                                           
                                           
               case 3: {
                  int index = new Integer(JOptionPane.showInputDialog(null,"Zgjedh sipas indeksit  studentin qe deshiron ta fshijsh nga lista","Fshij",JOptionPane.INFORMATION_MESSAGE));
                  if (index >=0 && index<array.users.length)
                  {array.delete(index);}
                  else {JOptionPane.showMessageDialog(null,"Studenti nuk gjendet ne liste");}
                  view.repaint();
                  run();
                  break;
               }
               case 4: {
                  int index = new Integer(JOptionPane.showInputDialog(null,"Zgjedh sipas indeksit  studentin qe deshironi t'ia nderroni lenden","Nderro lenden",JOptionPane.INFORMATION_MESSAGE));
                  if (index >=0 && index<array.users.length)
                  {Studenti b = array.users[index];
                     String Lenda=JOptionPane.showInputDialog(null,"Shkruaj lenden e re:"+"\n - Programim2 \n -Analize2  \n -Algjeber \n -Gjeometri","Lendet e semestrit te dyt",JOptionPane.INFORMATION_MESSAGE);
                     Lenda = Lenda.substring(0,1).toUpperCase() + Lenda.substring(1).toLowerCase();
                     if(Lenda == null){run();}
                     else    if(  Lenda.equals("Programim2")) {Lenda="Programim2";}
                     else if(Lenda.equals("Analize2")){Lenda="Anailze2";}
                     else 
                        if(Lenda.equals("Algjeber")){Lenda="Algjeber";}
                        else {
                           if(Lenda.equals("Gjeometri")){Lenda="Gjeometri ";}
                           else {JOptionPane.showMessageDialog(null, "Ju lutem shkruani vetem lendet e parapara me orar te cilat gjenden ne liste!");
                           run();}}
                           b.setLenda(Lenda);
                           view.repaint();
                  
                           
                     int piket=Integer.parseInt(JOptionPane.showInputDialog(null, "Piket:","Ju lutem shkruani piket",JOptionPane.INFORMATION_MESSAGE));
                                                 
                     String nota =""+5 ;
                                            
                     if  (piket>100 || piket<0){run();}
                     else{
                     
                        if ( piket >= 90 )
                        { nota =""+ 10; }
                        else  if ( piket >= 80 )
                        { nota =""+ 9;}
                        else    if ( piket >= 70 )
                        { nota =""+ 8; }
                        else   if ( piket >= 60 )
                        { nota =""+ 7; }
                        else    if ( piket >= 50)
                        { nota =""+ 6; }
                        else   if(piket<50)  
                        { nota =""+ 5; }
                        b.setNota(nota);
                     
                        view.repaint();
                     
                           
                           
                     }}
                  else {JOptionPane.showMessageDialog(null,"Studenti nuk gjendet ne liste");}
                  view.repaint();
                  run();
                  break;
               }
               
                        
               default: {
                  JOptionPane.showMessageDialog(null, "Komanda e shtypur gabim");
                  run();
               }
            
            }
         
         }
      
                  
            
      }                
   }
 
   public int readCommand(String s)
   {   
      return  Integer.parseInt(s);   }
}