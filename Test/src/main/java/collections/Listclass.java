package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Listclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> name = new ArrayList<String>();
		name.add("test1");
		name.add("best2");
		name.add("cest3");
		name.add("fest4");
		name.add("qest2");


		System.out.println(name.get(0));
		//string[] array1 = name.toArray();
		System.out.println(name.size());
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
			

			
		}
		if(name.contains("qest2"))
		{
			System.out.println("name exists");
		}
		for (int i = 0; i < name.size(); i++) {
			if (name.get(i)=="qest2")
			{
				System.out.println("name 2 exists");
			}
		}
		
		 Collections.sort(name);//in memebery sorting we dont save in variable
		 System.out.println(name.get(0));
		 
		System.out.println(name);
	//sorting
		//conver to array and sort
		
		Object[] array = name.toArray();
		Arrays.sort(array);//in memebery sorting we dont save in variable
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
}

	//using collection method
	
}
