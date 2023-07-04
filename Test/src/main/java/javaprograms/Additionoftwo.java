package javaprograms;

public class Additionoftwo {

	public int addition(int a, int b)
	{
		int c=a+b;
		return c;

	}
	
	public static void main(String[] args) {

		int inputNumber1=5;
		int inputNumber2=8;
		int output1=inputNumber1+inputNumber2;
		
		System.out.println("without object" + output1 );
		
		Additionoftwo obj=new Additionoftwo();
		obj.addition(10, 12);
System.out.printf("with object" +obj.addition(10, 12));
	}

	
}
