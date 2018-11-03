import java.util.*;
class MatrixAdd
{
	void add()
	{
		try
		{
			Scanner s=new Scanner(System.in);

			System.out.print("\nEnter Row Limit Of Array:--->");
			int row=s.nextInt();
			System.out.print("\nEnter Column Limit Of Array:-->");
			int column=s.nextInt();

			int[][] value=new int[row][column];
			int[][] value1=new int[row][column];
			int[][] add=new int[row][column];
			int[][] mul=new int[row][column];

			System.out.print("\nEnter 1st Array Values\n");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print("\nRow No:--"+(i+1)+"--Column No:---"+(j+1)+"--->");
					value[i][j]=s.nextInt();
				}
			}
			System.out.print("\nEnter 2nd Array Values\n");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print("\nRow No:--"+(i+1)+"--Column No:---"+(j+1)+"--->");
					value1[i][j]=s.nextInt();
				}
			}

			System.out.print("\nDisplay first Matrix\n");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print(value[i][j]+" ");
				}
				System.out.println();
			}
			System.out.print("\nDisplay Second Matrix\n");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print(value1[i][j]+" ");
				}
				System.out.println();
			}

			System.out.print("\nAddition Operation Of Two Matrix\n");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					add[i][j]=value[i][j]+value1[i][j];
				}
			}
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print(add[i][j]+" ");
				}
				System.out.println();
			}

			System.out.print("\nMultipiication of Two Matrix\n");
			for(int i=0;i<row;i++)
			{
				for (int j=0;j<column;j++ )
				{
					for(int k=0;k<column;k++)
					{
						mul[i][j]=value[i][k] * value1[k][j];
					}
				}
			}
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print(mul[i][j]+" ");
				}
				System.out.println();
			}
		}
		catch(InputMismatchException e)
		{
			System.out.print("\n Plz Enter values as Integer");
			add();
		}
		catch(NegativeArraySizeException e)
		{
			System.out.print("\nPlz Enter size As (+ve) values");
			add();
		}
	}
	public static void main(String[] args) {
		MatrixAdd obj=new MatrixAdd();
		obj.add();
	}
}