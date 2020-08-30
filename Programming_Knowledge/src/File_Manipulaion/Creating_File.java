package File_Manipulaion;
import java.util.*;
import java.io.*;

public class Creating_File {

	public static void main(String[] args) {
		
try {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the name of the file: ");
		String filename = sc.nextLine();
		File file = new File(filename+".txt");
		System.out.println("Enter the content of the file: ");
		String content = sc.nextLine();
		sc.close();
		
		if(!file.exists()) 
		{
			 
			file.createNewFile();
			PrintWriter pw = new PrintWriter(file);
			pw.println(content);
			pw.close();
			System.out.println("Geneated the file successfully");
		}
		else
		{
			System.out.println("File of similar name already exists");
		}
		
		
	}
catch (IOException e) 
{
			// TODO Auto-generated catch block
			e.printStackTrace();
}
	}
}
