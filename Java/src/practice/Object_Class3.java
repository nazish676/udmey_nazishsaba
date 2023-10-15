package practice;
//Object and Class Example: Initialization through a constructor
class Employee
{
	int id;
	String name;
	float salary;
	void insert(int i,String n,float f)
	{
		id=i;
		name=n;
		salary=f;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}
}

public class Object_Class3 {

	public static void main(String[] args) {
		Employee s=new Employee();
		Employee s1=new Employee();
		s1.insert(100, "nazish", 6000);
		s.insert(20, "Saba", 500);
		s.display();
		s1.display();
		

	}

}
