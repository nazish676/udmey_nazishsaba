package practice;
//Java program to overload constructors  
public class Constructor_Overloading 
{

	String name;
	int id;
	int age;
	
	
	//creating two arg constructor  
	Constructor_Overloading(int i,String n)
	{
		id=i;
		name=n;
	}
	 //creating three arg constructor
	
	Constructor_Overloading(int i,String n,int a)
	{
		id=i;
		age=a;
		name=n;
	}
	void disp()
	{
		System.out.println(id+"  "+name+"  "+age);
	}
	
	
	public static void main(String[] args)
	{
		Constructor_Overloading s=new Constructor_Overloading(101,"Nazish",29);
		Constructor_Overloading s1=new Constructor_Overloading(101,"saba");
		s.disp();
		s1.disp();
		
		

	}

}
