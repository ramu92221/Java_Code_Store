package org.strs;
import java.util.Iterator;
import java.util.Scanner;

public class NewStrings 
{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		String rvs=strRevs(str);
		System.out.println(rvs);
		
	}

	private static String strRevs(String str) 
	{
		String st=str;
		String k="";
		for(int i=0;i<st.length();i++) {
		k=st.charAt(i)+k;
		}
			
		
		
		
		return k;
	}
}