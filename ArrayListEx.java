package col;
import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		//Object o= list.get(0);
		//int firstElement=(int)o;
		int firstElement=list.get(0);
		System.out.println(firstElement);
		ArrayListEx ex=new ArrayListEx();
		/*ex.print(list);*/
		list.remove(1);
		Object object=1;
		list.remove(object);
	    ex.print(list);
		list.add(0,1);
		ex.print(list);
		int size=list.size();
		System.out.println("size="+size);
		boolean isEmpty=list.isEmpty();
		System.out.println("isEmpty="+isEmpty);
		boolean contains=list.contains(1);
		System.out.println("list contains 1" +contains);
		ex.printByIterator(list);
		IntegerComparator comparator=new IntegerComparator();
		list.sort(comparator);
		ex.print(list);
		
		
	}
	
	
	public void printByIterator(List list) {
		Iterator <Integer>iterator=list.iterator();
		while (iterator.hasNext()) {
		   int num=iterator.next();
		   //object o=iterator.next();
			//int num=(int)o;
			
			System.out.println("element="+num);
		}
	}
	public void print(List list) {
		for(Object e:list) {
			int num = (int)e;
		System.out.println(num);
		}
		
	}

}
