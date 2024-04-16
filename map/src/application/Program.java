package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Hugo");
		cookies.put("email", "Hugo@email.com");
		cookies.put("phone", "999999999");
		
		cookies.remove("email");
		cookies.put("phone", "999999988");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));		
		System.out.println("ALL COOKIES:");

		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
