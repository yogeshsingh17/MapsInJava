package mapInJava;

import java.util.*;
import java.util.Map.Entry;

class JavaHashMap
{
	private String name;
	private int age;
	private String city;
	
	public JavaHashMap(String name,int age,String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	
	public String toString()
	{
		return name + " " + age + " " + city ;
	}
	
}

class JavaHashMapSecondClass
{
	public void javaHashMapSecondClass()
	{
		JavaHashMap jhm=new JavaHashMap("Yogesh",26,"Pune");
		JavaHashMap jhm1=new JavaHashMap("Hemant",27,"Delhi");
		JavaHashMap jhm2=new JavaHashMap("Nitin",22,"Bengaluru");
		
		HashMap hmj=new HashMap();
		hmj.put(1, jhm);
		hmj.put(2, jhm1);
		hmj.put(3, jhm1);
		
		System.out.println(hmj);
		
		Collection c=hmj.values();
		Iterator it=c.iterator();
		
		System.out.println("Accessing the data of hash set using Iterator:");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Set set=hmj.keySet();
		Iterator it1=set.iterator();
		
		System.out.println("The keys are as follows:");
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		Set set1=hmj.entrySet();
		Iterator it2=set1.iterator();
		
		System.out.println("Accessing both key and values from the hash set:");
		while(it2.hasNext())
		{
			Map.Entry mej= (Entry) it2.next();
			System.out.println(mej.getKey() + " : " + mej.getValue());
		}
	}
}

public class HashMapInJava 
{

	public static void main(String[] args) 
	{
		JavaHashMapSecondClass hsmsc=new JavaHashMapSecondClass();
		hsmsc.javaHashMapSecondClass();
	}

}
