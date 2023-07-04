package week3.day1;

public class Ipad extends IOS {

	public void watchMovie()
	{
		System.out.println("Video started");
	}
	public void watchMovie(String orientaion)
	{
		System.out.println("in the oreientation:" +orientaion);
	}
	public void watchMovie(String orientaion, int timeout)
	{
		System.out.println("will be played in "+orientaion+" mode " + "for "+timeout+" secs");
	}
}
