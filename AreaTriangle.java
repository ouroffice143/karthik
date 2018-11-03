import java.util.*;
class AreaTriangle
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nFind Area OF Triangle And Circle");
		System.out.print("\n=================================\n");
		int option;
		do
		{
			System.out.print("\n1.Area Of Triangle\n2.Perimeter of Triangle\n3.Area of Circle\n4.Perimeter of Circle\n5.Exit\n");
			System.out.print("\nEnter Ur Option:-->");
			option=s.nextInt();
			switch(option)
			{
				case 1:
					{
						System.out.print("\nEnter Triangle Breath:-->");
						double b=s.nextDouble();
						System.out.print("\nEnter Triangle Height:-->");
						double h=s.nextDouble();
						double res=(1/2 * b * h);
						System.out.print("\nArea Of Triangle:-->"+res);
						break;
					}
				case 2:
					{
						System.out.print("\nEnter Side1 value:-->");
						double a=s.nextDouble();
						System.out.print("\nEnter Side2 value:-->");
						double c=s.nextDouble();
						System.out.print("\nEnter Base value:-->");
						double b=s.nextDouble();
						double res=(a+b+c);
						System.out.print("\nPerimeter Of Triangle:-->"+res);
						break;
					}
				case 3:
					{
						System.out.print("\nEnter Radious value:-->");
						double a=s.nextDouble();
						double res=3.14 * a * a;
						System.out.print("\nArea of Circle:-->"+res);
						break;
					}
				case 4:
					{
						System.out.print("\nEnter Radious value:-->");
						double a=s.nextDouble();
						double res=2 * 3.14 * a;
						System.out.print("\nPerimeter Of Circle:-->"+res);
						break;
					}
				default :
				{
					System.out.print("\nThank You\n");
					System.exit(0);
				}
			}
		}
		while(option >= 1 && option <=4);
	}		
}
