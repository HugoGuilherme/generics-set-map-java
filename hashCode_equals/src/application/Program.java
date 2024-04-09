package application;

import entites.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Hugo", "hugo@gmail.com");
		Client c2 = new Client("Guilherme", "guilherme@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	}
}
