package javapgms;

public class NoofVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= new String("Hi How Are you");
		str= str.toLowerCase();
		int  count=0;
		for(int i=1;i<=str.length()-1;i++)
		{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			count++;
		
	}
		int cCount = str.length()-count;
		System.out.println("Total no of vowels " +count);
		System.out.println("Total no of consonents " +cCount);
}
}
