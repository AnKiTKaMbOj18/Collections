package java_collections;
import java.util.*;
public class TestArrayLinked {

	public static void main(String[] args) {
	//this is ArrayList
	ArrayList<String> list=new ArrayList<String>();
	list.add("ammy");
	list.add("peter");
	list.add("roger");
        
	//this  is LinkedList in collections
	LinkedList<String> list2=new LinkedList<String>();
	list2.add("abd");
	list2.add("duplessis");
	list2.add("ntini");
	
	System.out.println("ArrayList"+list);
	System.out.println("LinkedList"+list2);

	}

}
