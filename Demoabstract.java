class Ex1{
   public void display1(){
      System.out.println("method1");
   }
}
abstract class Ex2{
   public void display2(){
      System.out.println("method2");
   }
}
abstract class Ex3 extends Ex1{
   abstract void display3();
}
class Ex4 extends Ex3{
   public void display3(){
      System.out.println("method3");
   }
}
class Demoabstract{
   public static void main(String args[]){
       Ex4 obj=new Ex4();
       obj.display3();
   }
}