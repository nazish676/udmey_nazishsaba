package practice;

public class upper_lower_word_find {

	public static void main(String[] args) {
		String s="naZihs IS gEnTAL MaN";
		String upper="";
		String lower="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				upper=upper+ch;
			}else
			{
				lower=lower+ch;
			}
			
		}
		System.out.println(lower+" "+upper);
	}
	

}
