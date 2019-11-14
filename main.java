package assignmentupgrad;
import java.util.*;
public class main {
public static void main(String[] args )
{
	Scanner s=new Scanner(System.in);
	int a=0;
	int a[]=new int[100];
	int c=0;
	int n=0;
	System.out.println(" enter the length");
	n=s.nextInt();
	System.out.println(" enter value of a");
	a=s.nextInt();
	int m=(n+1)-a;
	c=(m*(m+1))/2;
	System.out.println("count is"+c);
}
}
