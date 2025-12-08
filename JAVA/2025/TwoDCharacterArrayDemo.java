class TwoDCharacterArrayDemo
{
	public static void main(String[] args)
	{
		char names[][] = {
			{'R', 'a', 'j' , 'u'},
			{'H', 'o', 'n', 'e', 'y'},
			{'J', 'a', 'd', 'd', 'u'},
			{'V', 'i', 's', 'h', 'n', 'u'},
			{'O', 'm'},
		};
			
		// loop for rows
		int nRows = names.length;
		System.out.println("#Rows: " + nRows);
		for (int i = 0; i < nRows; i++)
		{
			int nCols = names[i].length;
			//System.out.println("#Elements in a Row: " + nCols);
			for (int j = 0; j < nCols; j++)
			{
				System.out.print(names[i][j]);
			}
			System.out.println();
		}
	}
}






