package practice;

public class Parameterized_Constructor {
	
	int id;
	String name;
	 //creating a parameterized constructor
	Parameterized_Constructor(int i,String s)
	{
		id=i;
		name=s;
	}
	 //method to display the values  
	void disp()
	{
		System.out.println(id+"   "+name);
	}
	
	public static void main(String[] args) 
	{
		 //creating objects and passing values  
		Parameterized_Constructor k=new Parameterized_Constructor(10,"nazish");
k.disp();

	}

}
