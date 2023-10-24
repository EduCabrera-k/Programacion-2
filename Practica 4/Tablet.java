public class Tablet extends DispositivoMovil{
   
   private int numap;
   
   public Tablet(int numap){
     super(0);
    this.numap=numap;
    marca = "Iphone";
   }
   
   public void apps(int numap){
   System.out.println("El numero de apps abiertas en la tablet son: " + numap);
   }
   
   public void verMarca(){
       System.out.println("La marca de la tablet es " + marca);
   }
}