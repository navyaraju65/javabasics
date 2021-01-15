import java.util.*;  
class Collectionarray{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();
list.add("navya");
list.add("shree");  
list.add("raju");  
list.add("daddy");  

Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  