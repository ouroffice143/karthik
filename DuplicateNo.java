import java.util.*;
class DuplicateNo
{
	void dupli_display()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter the Limit of Array:--->");
		int limit=s.nextInt();

		//Creating Array With size
		int value[]=new int[limit];
		
		//Getting integer value to Array
		System.out.print("\nEnter Array values\n");
		for(int i=0;i<limit;i++)
		{
			System.out.print("\nEnter value--->"+(i+1)+"-->");
			value[i]=s.nextInt();
		}

		//Printing Stored Array Values
		System.out.print("\nStored Array Values Are\n");
		for(int i=0;i<limit;i++)
		{
			System.out.print("\n\nvalue--->"+(i+1)+"-->"+value[i]);
		}

		//find Duplicate values in Integer Array

		for(int i=0;i<limit;i++)
		{
			int count=1;
			if(value[i]!=0)
			{
				for(int j=i+1;j<limit;j++)
				{
					if(value[i]==value[j])
					{
						count++;
						value[j]=0;
					}	
				}
				System.out.print("\nDuplicate Value:-->"+value[i]+"---No Of time:-->"+count);
			}
			
		}
	}
	public static void main(String[] args)
	{
		DuplicateNo obj=new DuplicateNo();
		obj.dupli_display();
	}
}