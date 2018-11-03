import java.util.*;
class PrintRtoL
{
	void array_dec()
	{
		try
		{
			Scanner s=new Scanner(System.in);
			
			//Getting Array Size
			System.out.print("\nEnter Size of Array:-->");
			int size=s.nextInt();
			
			//Creating An Array With Size
			int value[]=new int[size];
			
			//Getting value or assinging value to Array
			System.out.print("\nEnter Array Values\n");
			for(int i=0;i<size;i++)
			{
				System.out.print("\nEnter value:-->"+(i+1)+"--->");
				value[i]=s.nextInt();
			}
			
			//Printing Stored Array Values
			System.out.print("\nStored Array Values\n");
			for(int i=0;i<size;i++)
			{
				System.out.print("\nValue:-->"+(i+1)+"--is-->"+value[i]+"\n");
			}
			
			//Printing Array Values Right To Left
			System.out.print("\n Array Value Right To Left\n");
			for(int i=size;i>0;i--)
			{
				System.out.print("\nValues:-->"+value[i-1]+"\n");
			}
		}
		
		//Catch mismatch inputs
		catch(InputMismatchException e)
		{
			System.out.print("\nplz Enter Input As Integer\n");
			array_dec();
		}
		
		//catch negative values as Size
		catch(NegativeArraySizeException e)
		{
			System.out.print("\nPlz Enter Possive Value(+ve)Only For Size\n");
			array_dec();	
		}
	}
	public static void main(String[] args) 
	{
		//object Creation
		PrintRtoL obj=new PrintRtoL();
		
		//method or function Calling
		obj.array_dec();
	}
}