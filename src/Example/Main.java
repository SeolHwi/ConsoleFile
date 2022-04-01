package Example;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("Console or File(1: Console, 2: File, 3: End) ");
			try {
				int choose = sc.nextInt();
				if (choose == 1) {
					WriteRead console = new Console();
					console.write();
					console.read();
					break;
				}
				else if (choose == 2) {
					WriteRead file = new File();
					file.write();
					file.read();
					break;
				}
				else if (choose == 3) {
					break;
				}
				else {
					System.out.println("Select 1 or 2.");
					continue;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Input Integer");
				return ;
			}
		}
	}

}

// 정수가 아닌 것을 입력했을 때 예외 처리