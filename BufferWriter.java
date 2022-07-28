import java.io.*;
             
public class BufferWriter{
	public static void main(String[] args){
		FileWriter fw= null;
		BufferedWriter bw = null;
		String data = "Hi, this is Satish";

		try{
			fw = new FileWriter("test-file4.txt");
			bw = new BufferedWriter(fw);
			bw.write(data);
			bw.flush();
			System.out.println("Data is written to file");
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
}
}