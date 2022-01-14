package week3.assignment;

public class StringPalindrome {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		int size = s.length();
		for(int i=size-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		if(s.equals(rev))
		{
			System.out.println(" string is palindrome");
		}else
			System.out.println("Not palindrome");
		
	}

	}


