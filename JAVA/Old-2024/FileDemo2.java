import java.io.*;

class FileDemo2
{
	public static void main(String[] args)
	{
		File f1 = new File("Chap10Ex6Demo1.java");
		System.out.println(f1.getName());
		System.out.println(f1.length());
		System.out.println("Is a file? " + f1.isFile());
		System.out.println("Is a folder? " + f1.isDirectory());
		System.out.println("Is Hidden? " + f1.isHidden());
		System.out.println("-------------------");

		File f2 = new File("C:\\Users\\vishn\\Desktop\\VD", "Teddy");
		System.out.println("Does exists? "+ f2.exists());
		System.out.println("Dir/File name: "+ f2.getName());
		System.out.println("Absolute Path: "+ f2.getAbsolutePath());
		System.out.println("Is a file? " + f2.isFile());
		System.out.println("Is a folder? " + f2.isDirectory());
		System.out.println("Is Hidden? " + f2.isHidden());
		
		System.out.println("-------------------");
		File f3 = new File("NetarBhutwala");
		System.out.println(f3.exists());
		System.out.println("Absolute Path: "+ f3.getAbsolutePath());
		System.out.println("Is a file? " + f3.isFile());
		System.out.println("Is a folder? " + f3.isDirectory());
	}
	
}