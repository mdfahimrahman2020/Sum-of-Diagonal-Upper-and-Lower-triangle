import java.util.Scanner;
public class array5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[][] A = new int [3][3];
		int SumD = 0;
		int SumU = 0;
		int SumL = 0;

		System.out.print("\n\n\n\t\t\"Sum of Diagonal, Upper and Lower triangle elements of A 3x3 Matrix\"");

        System.out.print("\n\n\nRow number = 3 and Column number = 3. So the total number of elements are 3x3 = 9 for A matrix.");
		System.out.println("\n\nEnter number for A matrix : ");
        //Getting input
		for(int r = 0; r<3; r++)
		{
			for(int c = 0; c<3; c++)
			{
				System.out.printf("A[%d][%d] = " , r,c);
				A[r][c] = input.nextInt();
			}
		}



		System.out.print("\n\n A = ");
		for(int r = 0; r<3; r++)
		{
			for(int c = 0; c<3; c++)
			{
				System.out.print("\t"+A[r][c]);
			}
			System.out.println();
		}
	    

	    for(int r = 0; r<3; r++)
	    {
	    	for(int c = 0; c<3; c++)
	    	{
	    		if (r == c)
	    		{
	    			SumD = SumD + A[r][c];
	    		}

	    		if (r < c)
	    		{
	    			SumU = SumU + A[r][c];
	    		}

	    		if (r > c)
	    		{
	    			SumL = SumL + A[r][c];
	    		}
	    	}
	    }

	    System.out.print("\nSum of Diagonal Matrix :"+SumD);
	    System.out.print("\nSum of upper triangle Matrix :"+SumU);
	    System.out.print("\nSum of Diagonal Matrix :"+SumL);
        


	}

}