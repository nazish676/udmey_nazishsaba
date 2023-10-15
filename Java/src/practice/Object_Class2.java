package practice;

//2. Object and Class Example: Initialization through method

class second

{
	int rollno;
	String name;
	
	void insertrecord(int r,String n )
	{
		rollno=r;
		name=n;
		
	}
	
	void disinformation()
	{
		System.out.println(rollno+"   "+name);
	}
			
}
class Object_Class2 {

	public static void main(String[] args)
	{
	second s=new second();
	second s1=new second();
	s.insertrecord(20, "nayab");
	s1.insertrecord(50, "nazish");
	
s.disinformation();
s1.disinformation();
	}

}
