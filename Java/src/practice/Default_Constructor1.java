package practice;
//Let us see another example of default constructor  
//which displays the default values  
class student
{
	int id;
	String name;
	//method to display the value of id and name 
	void disp()
	{
		System.out.println(id+"  "+name);
	}
}



public class Default_Constructor1 {

	public static void main(String[] args) {
		student s=new student();
		s.id=10;
		s.name="nazish";
		s.disp();
		

	}

}
