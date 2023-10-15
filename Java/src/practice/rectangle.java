package practice;


class rectangletest
{
	 int length;
	 int breath;
	 
	 void insert(int l,int b)
	 {
		 length=l;
		 breath=b;
		 
	 }
	 void calarea()
	 {
		 System.out.println(length*breath);
	 }
}


public class rectangle {

	public static void main(String[] args) 
	{
		
  rectangletest s=new rectangletest();
  rectangletest s1=new rectangletest();
  s1.insert(100, 100);
  s.insert(10, 20);
  s.calarea();
  s1.calarea();
	}

}
