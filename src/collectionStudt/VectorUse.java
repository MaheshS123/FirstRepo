package collectionStudt;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorUse {

	public static void main(String[] args) {
		Vector<Object> V = new Vector<>();
		
		V.add("Countries");
		V.add(363);
		V.add(null);
		V.add("Hello");
		V.add(98.66);
		V.add('A');
		System.out.println(V);
		System.out.println(V.capacity());
		
		System.out.println("==========================");
		
		System.out.println(V.elementAt(3));
		
		System.out.println("==========================");
		
		System.out.println(V.isEmpty());
		
		System.out.println("==========================");
		
		System.out.println(V.firstElement());
		System.out.println(V.lastElement());
		
		System.out.println("===========by for loop===============");
		
		for(int i=0;i<=V.size()-1;i++) {
			
			System.out.println(V.get(i));
			}
		
		System.out.println("===========by for each===============");
		
		for(Object a:V) {
			System.out.println(a);
		}
		
		System.out.println("===========by iterator===============");
		
		Iterator<Object> A = V.iterator();
		
		while(A.hasNext()) {
			System.out.println(A.next());
		}
		
		System.out.println("===========by ListIterator===============");
		
		ListIterator<Object> B = V.listIterator();
		
		while(B.hasNext()) {
			System.out.println(B.next());
		}
		
		System.out.println("===========by Enumeration===============");
		
		Enumeration<Object> C = V.elements();
		
		while(C.hasMoreElements()) {
			System.out.println(C.nextElement());
		}
		
	}

}
