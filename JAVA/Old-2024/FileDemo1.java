import java.io.*;

class FileDemo1
{
	public static void main(String[] args)
	{
		File f1 = new File("Chap10Ex6Demo1.java");
		System.out.println("File nu naam: " + f1.getName());
		System.out.println("Absolute Path: " + f1.getAbsolutePath());
		System.out.println("Is a file: " + f1.isFile());
		System.out.println("Is a Directory/Folder: " + f1.isDirectory());
		System.out.println("Is a Directory/Folder Hidden: " + f1.isHidden());
		System.out.println("Astitva Dharave 6e? " + f1.exists());
		System.out.println("File size: " + f1.length());

		System.out.println("------------------");
		
		File f2 = new File("C:\\Users\\vishn\\Desktop", "VD");
		System.out.println("File nu naam: " + f2.getName());
		System.out.println("Absoulte Path: " + f2.getAbsolutePath());
		System.out.println("Is a file: " + f2.isFile());
		System.out.println("Is a Directory/Folder: " + f2.isDirectory());
		System.out.println("Astitva Dharave 6e? " + f2.exists());
		
		System.out.println("------------------");
		
		File f3 = new File("KompozerEx111");
		System.out.println("File nu naam: " + f3.getName());
		System.out.println("Absoulte Path: " + f3.getAbsolutePath());
		System.out.println("Is a file: " + f3.isFile());
		System.out.println("Is a Directory/Folder: " + f3.isDirectory());
		System.out.println("Astitva Dharave 6e? " + f3.exists());
	}
}