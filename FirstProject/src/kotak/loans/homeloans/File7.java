package kotak.loans.homeloans;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File7 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text1.txt");
		if(f.exists())
			f.delete();
		f.createNewFile();
		
		String line = "";
		String ap = "my Name is ravikanth";
		String text = "Hello what is you name?";
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		while((line = br.readLine()) != null)
				text =line + "\n";
				
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write(text + ap);
		
		bw.flush();
		bw.close();
		
	}

}
