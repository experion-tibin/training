 import java.io.*;

public class Fact
{
 public static void main(String args[])throws IOException
	  {
		int a,s=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number\n");
		a=Integer.parseInt(br.read());
		for(int i=1;i<=a;i++)
		s=s*i;
		System.out.println("Factorial is ",s);
	}
}	
		
	
