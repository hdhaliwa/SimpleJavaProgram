package co.edureka.demo.java.basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.google.common.collect.Multiset.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		//1. Add data in Hashmap
		map.put(101,"John");
			map.put(33,"Jerry");
			map.put(45,"Kia");
			map.put(104,"Joshua");
			map.put(402,"Jonthan");
			map.put(101,"Kerry"); // Same key will update the value
			// same values will be duplicated
			map.put(47, "Kia");
			//Allows null values also
			map.put(null, "Harry");
			map.put(89, null);
			
			//2. View data in Hashmap
			System.out.println(map);
			
			//3. API on Hashmap
			if(map.containsKey(101)){
				System.out.println("key is in map");
			}
			if(map.containsValue("Harry")){
				System.out.println("value is in map");
			}
			System.out.println("map size is "+map.size());
			
			//4.Remove element from map
			
			map.remove(101);
			System.out.println("now map is "+map);
			//map.clear(); remove all record
			
			//5. Retrive single record
			String name = map.get(402);
			System.out.println("name is " + name);
			
			//6. Iterate through the hashmap
			Set<Integer> keys = map.keySet(); //Fetch all the keys
			System.out.println(" the keys are " + keys);
			
			Iterator<Integer>itr = keys.iterator();
			while(itr.hasNext()){
				Integer key = itr.next();
				String value = map.get(key);
				System.out.println(">>keys "+key + "\t value " + value);
				
			}
			
			

	}

}
