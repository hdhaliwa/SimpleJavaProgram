package co.edureka.demo.java.basics;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
			map.put(101,"John");
			map.put(33,"Jerry");
			map.put(45,"Kia");
			map.put(104,"Joshua");
			map.put(402,"Jonthan");
			map.put(101,"Kerry"); // Same key will update the value
			// same values will be duplicated
			map.put(47, "Kia");
			System.out.println(map);

	}

}
