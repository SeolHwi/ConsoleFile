package Example;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;

import java.io.IOException;

class File implements WriteRead {
	String filename = "d:/example.txt";
	
	public void write() throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter(filename));
		System.out.println("File input (end command: end): ");
		while(true) {
			String string = sc.nextLine();
			pw.write(string + "\n");
			if ("end".equals(string)) {
				break;
			}
		}
		pw.close();
	}
	public void read() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));		// line 53
		while(true) {
			String line = br.readLine();
			if ("end".equals(line)) break;
			System.out.println(line);
//		String line = "";
//		while((line = br.readLine()) != null) {
//			System.out.println(line);

		}
		br.close();
	}
}