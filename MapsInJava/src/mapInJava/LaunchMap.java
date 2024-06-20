package mapInJava;

import java.util.*;
import java.util.Map.Entry;

class JavaMap
{
	public void javaMap()
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(18, "Kohli");
		hm.put(07, "MS Dhoni");
		hm.put(10, "Sachin");
		
		System.out.println(hm);
		
		Collection c=hm.values();
		Iterator itr1=c.iterator();
		
		System.out.println("Access through values:");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
		Set s=hm.keySet();
		Iterator itr2=s.iterator();
		
		System.out.println("Access through keyset:");
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		System.out.println("Access throuph map entry:");
		
		Set se=hm.entrySet();
		Iterator itr3=se.iterator();
		
		while(itr3.hasNext())
		{
			Map.Entry e=(Entry) itr3.next();
			System.out.println(e);
			//System.out.println(e.getValue() + " and " + e.getKey());
			
		}
		
	}
}

public class LaunchMap 
{

	public static void main(String[] args) 
	{
		JavaMap jm=new JavaMap();
		jm.javaMap();

	}

}