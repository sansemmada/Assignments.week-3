package week3.assignment;

public class FindTypes {
	public static void main(String[] args) {
		
				String test = "$$ Welcome to 2nd Class of Automation $$ ";

				
				int  letter = 0, space = 0, num = 0, specialChar = 0;
				char chTraverse[]=test.toCharArray();
				for(char ch:chTraverse)
				{
					int i=0;
					if(Character.isLetter(ch))
					{
						letter++;
						
					}else if(Character.isDigit(ch))
					{
						num++;
					}
					else if(Character.isSpaceChar(ch))
					{
						space++;
					}
					else
						specialChar++;
					}
			
System.out.println(letter);
System.out.println(num);
System.out.println(space);
System.out.println(specialChar);
}
}


