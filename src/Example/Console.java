package Example;

import java.util.ArrayList;

class Console implements WriteRead {
	
	private ArrayList<String> al = new ArrayList<>();
	
	public void write() {
		System.out.println("Console input (end command: end): ");
		while(true) {
			String string = sc.nextLine();
			al.add(string);
			if ("end".equals(string)) {
				break;
			}
		}
		al.remove("end");
	}
	
	public void read() {
		System.out.print(al);
	}
}
