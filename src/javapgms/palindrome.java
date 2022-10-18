package javapgms;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="gadag";
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
		}
		System.out.println(temp);
		if (str.equals(temp))
		{
			System.out.println("Given string in palindrome");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}
	}

}
