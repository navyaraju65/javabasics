class Superclass
{
public static void main(String args[]){	
   int num = 100;
}
}
//inheritance
class Subclass extends Superclass
{
    int num = 110;
    void printNumber(){
	System.out.println(num);
    }
    public static void main(String args[]){
	Subclass obj= new Subclass();
	obj.printNumber();	
    }
}