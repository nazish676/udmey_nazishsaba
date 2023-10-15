package practice;

public class count_lower_upper_alphabet {

	public static void main(String[] args) {
		String s="liFe JHand Hai";
		int countlower=0;
		int countupper=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				countupper++;
			}
			else
			{
				countlower++;
			}
		}
		System.out.println("lower"+" "+countlower);
		System.out.println("upper"+" "+countupper);

	}

}
