package javapgms;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Srushti";
		int count=0;
		for(int i=str.length()-1;i>=0;i--)
			for(int j=str.length()-1;j>=0;j--)
			{
				if(str.charAt(i)==str.charAt(j))
					count++;
			}
		System.out.println("Total no of duplicate char in the string are " +count);
	}

}
