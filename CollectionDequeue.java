import java.util.*;  
public class CollectionDequeue{  
public static void main(String[] args) {  

Deque<String> deque = new ArrayDeque<String>();  
deque.add("navya");  
deque.add("Kavya");  
deque.add("Ajay");  

for (String str : deque) {  
System.out.println(str);  
}  
}  
}  