class TwoDArrayDemo
{
	public static void main(String[] args)
	{
		int x[][] = {
			{7,84, 5, 0, 8},
			{-14,0, 0, 8, 6, 3},
			{-14 * 2, 0 * 5, 0 + 8, 8 / 2, 6 , 3},
			{-5 * -2,10 * 5, 6, 18 / 2, 73},
		};
			
		// loop for rows
		int nRows = x.length;
		System.out.println("#Rows: " + nRows);
		for (int i = 0; i < nRows; i++)
		{
			int nCols = x[i].length;
			//System.out.println("#Elements in a Row: " + nCols);
			for (int j = 0; j < nCols; j++)
			{
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
			
	}
}






