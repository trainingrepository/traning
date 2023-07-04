package week3.day1;

public class MyPad extends Ipad {

	public static void main(String[] args) {
		
		MyPad obj=new MyPad();
		obj.watchMovie();
		obj.watchMovie("landscape");
		obj.watchMovie("landscape", 10);
	}

}
