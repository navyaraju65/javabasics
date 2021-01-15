import java.util.*;  
public class CollectionHashset{  
public static void main(String args[]){  
  
HashSet<String> set=new HashSet<String>();  
set.add("Ram");  
set.add("Vijay");  
set.add("Rachana");  
set.add("Ajay");  

Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  