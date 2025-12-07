import java.util.*;
import java.text.*;
class Chap9Ex4Demo
{
	public static void main(String[] args)
	{
		SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-YYYY");
		System.out.println(sf.format(new Date()));
	}
}