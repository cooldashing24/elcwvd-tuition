import java.io.*;

class FileDemo3
{
	public static void main(String[] args)
	{
		File f1 = new File("Chap10Ex6Demo1.java");
		System.out.println("Filename: " + f1.getName());
		System.out.println("Does file exist ?: " + f1.exists());
		System.out.println("Is a file?: " + f1.isFile());
		System.out.println("Is a folder/directory?: " + f1.isDirectory());
		System.out.println("Is a Chupaveli?: " + f1.isHidden());
		System.out.println("Size: " + f1.length());
		
		System.out.println("-----------------");
		File f2 = new File("C:\\Users\\vishn\\Desktop\\VD", "Teddy");
		System.out.println("Name: " + f2.getName());
		System.out.println("Absolute path: " + f2.getAbsolutePath());
		System.out.println("Does file exist ?: " + f2.exists());
		System.out.println("Is a file?: " + f2.isFile());
		System.out.println("Is a folder/directory?: " + f2.isDirectory());
		System.out.println("Is a Chupaveli?: " + f2.isHidden());
		
		System.out.println("-----------------");
		File f3 = new File("DeepuChupChapSmjiLeje.java");
		System.out.println("Filename: " + f3.getName());
		System.out.println("Does file exist ?: " + f3.exists());
		System.out.println("Is a file?: " + f3.isFile());
		System.out.println("Is a folder/directory?: " + f3.isDirectory());
	}
	
}