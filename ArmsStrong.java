import java.util.*;
class ArmsStrong
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter Value For Finding ArmsStrong:--->");
		int value=s.nextInt();
		int original=value;

		String convert=String.valueOf(value);
		System.out.println("String Value:--->"+convert.length());
		
		int re;
		int result=0;

		while(original !=0)
		{
			re=original % 10;
			int ret=1;
			for(int i=0;i<convert.length();i++)
			{
				ret *= re;
			}
			result +=ret;
			original /= 10;
		}



		if(result==value)
		{
			System.out.print("\nGiven No Is ArmsStrong\n");
		}
		else
		{
			System.out.print("\nGiven No Is Not ArmsStrong\n");
		}
	}
}