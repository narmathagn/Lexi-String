import java.util.*;
public class LexiString{
	public static void main(String args[]){
		String s="qwryupcsfoghjkldezxvbintma";
		String s1="ativedoc";
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(s.charAt(i)==s1.charAt(j))
				{
					ans=ans+s.charAt(i);
				}
			}
		}
		System.out.println(ans);
	}
}