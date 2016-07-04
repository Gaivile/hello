import java.io.*;

public class hello 
{
	public static void main(String[] args) 
	{
		try 
		{
			// open a file and pass it to FileReader
			File file = new File("hello_unicode.txt");
			FileReader readFile = new FileReader(file);
			// read file line by line
			BufferedReader readByLine = new BufferedReader(readFile);
			String line;
			while ((line = readByLine.readLine()) != null) 
			{
				// print each line to the console 
				System.out.println(line);
			}
			// close FileReader
			readFile.close();
		} 
		// handle file exception
		catch (IOException e) 
		{
			System.out.println("File not found.");
		}
	}
}
