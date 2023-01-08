package arrayList01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Computer implements Comparable {
	int serial;
	String owner;
	
	public Computer(int serial, String owner) {
		this.serial = serial;
		this.owner = owner;
	}
	
	public int compareTo(Object o) {
		return this.serial - ((Computer)o).serial;
	}
	
	public String toString() {
		return serial + " " + owner;
	}
	
}

public class What02  {
	
	public static void main(String[] args) {
		
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500, "yi"));
		computers.add(new Computer(200, "jung"));
		computers.add(new Computer(3233, "mok"));
		
		Iterator i = computers.iterator();
		
		System.out.println("before");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		Collections.sort(computers);
		i = computers.iterator();
		
		System.out.println("\nafter");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}
	
}
