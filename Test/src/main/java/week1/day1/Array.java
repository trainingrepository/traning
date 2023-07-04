package week1.day1;


public class Array {

	public static void main(String[] args) {
	
		int[] marks= {80,78,97,86,60};
		String sub[]= {"tamil","English","Maths","Science","Social"};
		//System.out.print(marks[0]);
		//System.out.print(sub[0]);
		
		for (int i = 0; i < sub.length; i++) {
			//for (int j = 0; j < sub.length; j++) {
			System.out.println(sub[i]+" :");	
			System.out.println(marks[i]);
		//}
		}

	}

}
