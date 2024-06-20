package mapInJava;

import java.util.*;
import java.util.Map.Entry;

//POJO class
class Information
{
	private String name;
	private int age;
	private String location;
	private String fathersName;
	private long mobileNo;
	
	public Information(String name,int age,String location,String fathersName,long mobileNo)
	{
		this.name=name;
		this.age=age;
		this.location=location;
		this.fathersName=fathersName;
		this.mobileNo=mobileNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public String getFathersName()
	{
		return fathersName;
	}
	
	public long getMobileNo()
	{
		return mobileNo;
	}
	
	public String toString()
	{
		return name + " " + age + " " + location + " " + fathersName + " " + mobileNo;
	}
}

class UserInput
{
	public void userInput()
	{
		Information i1=new Information("Ankit", 26, "Pune","Tikam Singh", 9920237968l);
		Information i2=new Information("Sachin", 29, "Delhi","Tekchand Singh", 9066320899l);
		Information i3=new Information("Nitin", 22, "Bengaluru","Tikam Singh", 7011004402l);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the key");
		int k=scan.nextInt();
		
		HashMap ham=new HashMap();
		ham.put(101, i1);
		ham.put(201, i2);
		ham.put(301, i3);
		
		boolean flag=false;
		
		Set me=ham.entrySet();
		
		Iterator h1=me.iterator();
		while(h1.hasNext())
		{
			Map.Entry e=(Entry) h1.next();
			Integer Key=(Integer) e.getKey();
			if(k==Key)
			{
				System.out.println(e.getKey() + " : " + e.getValue());
				flag=true;
				
			}
		}
		if(flag==false)
		{
			System.out.println("Key not found");
		}
		
		System.out.println("***************************");
		
		  Collection c =ham.values();
		  
		  Iterator h=c.iterator(); 
		  while(h.hasNext())
		  {
			  Object s= h.next();
			  System.out.println(s);
		  }
		 
	}
}

public class HashMapExample2 
{

	public static void main(String[] args) 
	{
		
		UserInput ui=new UserInput();
		ui.userInput();
	
	}

}
