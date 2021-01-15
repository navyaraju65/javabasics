import java.util.*;  
public class Collectionvector{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Ajju");  
v.add("Ammu");  
v.add("Ashish");  
v.add("akhiila");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  