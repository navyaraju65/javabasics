abstract class Exabs1{
   protected abstract void display1();
   public abstract void display2();
   }
class Exabs2 extends Exabs1{
   public void display1(){
       System.out.println("first method");
   }
   public void display2(){
      System.out.println("second method");
   }
}
class Demo{
   public static void main(String args[]){
      Exabs2 obj=new Exabs2();
      obj.display1();
   }
}