public class Studenti {
   String emri,mbiemri,nota,piket;
   int id;
   String Lenda;
   public Studenti(String emri,String mbiemri,int id,String Lenda, String nota)
   {
      this.emri=emri;
      this.mbiemri=mbiemri;
      this.id=id;
      this.nota=nota;
      this.Lenda=Lenda;
      this.piket=piket; }
      
   public String getEmri()
   { 
      return emri;}

   public String getMbiemri()
   { 
      return mbiemri;}

   public String getLenda()
   { 
      return Lenda;}
        
   public int getId()
   {
      return id;}

   public String getNota()
   {
      return nota;}
   
   public void setNota(String i)
   {nota=i;}
   
   public void setLenda(String i)
   {Lenda=i;}
}