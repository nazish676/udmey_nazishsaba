package practice;

public class find_larger_number {

	public static void main(String[] args) {
		
		String s="Nazish";
		char  ch;
		String rev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println(rev);
	}

}
