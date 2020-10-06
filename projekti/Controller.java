public class Controller {
   public static void main(String[] args) {
    //Krijim i objektit  te Array
      Arreys array=new Arreys();
      // objekt view me parameter array.
      VIew view=new  VIew(array);
      Model c=new Model(view,array);
      c.run();
   }
}