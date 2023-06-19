import java.io.*;
import java.util.*;
import java.util.zip.*;
public class TestZip{
	public static void main(String [] args){
		String[] filenames = new String[]{"Student.ser", "inputFile.txt"};
		byte[] buf =new byte[1024];

		try{
			// Create the zipFile
			String outFilename = "outFile.zip";
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outFilename));
			// Compress the files
			for(int i=0;i<filenames.length; i++){
				FileInputStream in = new FileInputStream(filenames[i]);
				//ADD ZIP entry to output stream)
				out.putNextEntry(new ZipEntry(filenames[i]));
				//Transfer bytes from the file to ZIP file
				int len;
				while((len = in.read(buf)) > 0){
					out.write(buf,0,len);
				}
				//Complete the entry
				out.closeEntry();
				in.close();
			}
			// Complete the ZIP file
			out.close();
		}
		catch(IOException e){

		}
	}
}
