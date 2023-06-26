import java.io.*;
import java.util.*;
import java.util.zip.*;
public class ZipContents{
	public static void main(String [] args){
		try{
			//Open the ZIP FILE
			ZipFile zf= new ZipFile("outfile.zip");
			// Enumerate Each Entry
			for(Enumeration entries =zf.entries(); entries.hasMoreElements();){
				// Get the entry name
				String zipEntryName = ((ZipEntry)entries.nextElement()).getName();
				System.out.println("name: " +zipEntryName);
			}
		}
		catch(IOException e){

		}
	}
}
