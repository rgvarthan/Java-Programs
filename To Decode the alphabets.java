// Sample Input 1 : 12514

// Sample Output 1 : 
//    ABEAD (12514)
//    LEN (12514)

// Sample Input 2 : 312216

// Sample Output 2 : 
//    CABBAF (312216)
//    CLUF (312216)


// Coding : 

import java.util.*;
class A
{
    public static void main(String[] args)throws Exception
	{
		Scanner sn=new Scanner(System.in);
		String n=sn.next();
		
		int count = 1;
		int temp=0;
		char[] a= new char[100];
		String result="";
		
		for (char i='A';i<='z';i++)
		{
			a[count]=i;
			count ++;
		}
		
		for(int i=0;i<n.length();i++)
		{
		    temp = Integer.parseInt(Character.toString( n.charAt(i)) );
		    result+=a[temp];
		}
		
		System.out.println(result+" ("+n+")");
		
		int z=0;
		result="";
		
		while(z<n.length())
		{
		    if(z==n.length()-1)
		        temp=Integer.parseInt( n.substring(z) );
	        else
		        temp=Integer.parseInt( n.substring(z,z+2) );
		        
		    if(temp>26)
		    {
		        temp=Integer.parseInt( n.substring(z,z+1) );
		        result+=a[temp];
		        z++;
		    }
		    else
		    {
		        result+=a[temp];
		        z+=2;
		    }
		}
		System.out.println(result+" ("+n+")");
	}
}
