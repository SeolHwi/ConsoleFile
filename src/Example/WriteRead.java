package Example;

import java.util.Scanner;
import java.io.IOException;

public interface WriteRead {
	static Scanner sc = new Scanner(System.in);
	
	void write() throws IOException;
	void read() throws IOException;
}
