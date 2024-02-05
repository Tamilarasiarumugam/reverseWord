package assignments;

public class ReverseWord {
	
	public static String reverseWord(String str)
	{
		if(str==null || str.length()==0)
		{
			return "";
		}
		String temp="";
		String[] words=str.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			temp=temp+words[i];
		}
		return temp;
		
		
	}
	
	public static void main(String[] args)
	{
		String input= "i love india";
		String output=reverseWord(input);
		System.out.println("recerse string is :"+output); 
	}

}

