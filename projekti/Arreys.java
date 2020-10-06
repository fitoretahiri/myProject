public class Arreys {
    Studenti []users= new Studenti[1];
    int []id1=new int[1];

   public void add(Studenti u)
   {
      Studenti []users1=new Studenti[users.length+1];
    
      for (int i=1;i<users.length;i++)
      {
         users1[i]=users[i];
      }
       users1[users1.length-1]=u;
       users=users1;
   }
   
   
   public void delete(int index)
   {
      Studenti []users1=new Studenti[users.length-1];
      for (int i=1;i<index;i++)
      {
         users1[i]=users[i];
      }
      for (int i=index;i<users1.length;i++)
      {
         users1[i]=users[i+1];
      }
         users=users1;
   }
   public void addId(int n)
   {
      int [] id2=new int[id1.length+1];
      for (int i=1;i<id1.length;i++)
      {
         id2[i]=id1[i];
      }
      id2[id2.length-1]=n;
      id1=id2;
   }
   public boolean Id_unike(int u)
   {   boolean ok=false;
       for (int i=1;i<users.length;i++)
      {   Studenti array=users[i];
          if (array.getId()==u){ok=true;}
      
      }
      return ok;
   }
}