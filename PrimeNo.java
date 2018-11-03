import java.util.*;
class PrimeNo
{
	void prime_check(int n)
	{
		boolean flag = true;

    	for(int i=2;i<=n/2;++i)
    	{
        	if(n%i==0)
        	{
            	flag = false;
            	break;
        	}
    	}
    	if(n==1) 
    	{
      		System.out.println("1 is neither a prime nor a composite number.");
    	}
    	else 
    	{
        	if (flag)
         		System.out.print("\nNo----"+n+"---is PrimeNo\n");
        	else
         		System.out.print("\nNo---"+n+"---is Not PrimeNo\n");
    	}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter Value:--->");
		int n=s.nextInt();
		PrimeNo obj=new PrimeNo();
		obj.prime_check(n);
	}
}
