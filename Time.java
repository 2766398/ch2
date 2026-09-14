public class Time{
	public static void main (String[] args){
		int hours1 = 14;
		int minutes1 = 34;
		int seconds1 = 55;
		double a = hours1 * 3600 + minutes1 * 60 + seconds1;
		double b = 60*60*24 - a;
		double c = b + a;
		double d = (a/c)*100;
		int hours2 = 14 - hours1;
		int minutes2 = 39 - minutes1;
		int seconds2 = 34;
		int e = 60 - seconds1;
		if (34 - seconds1 < 0){
			minutes2--;
			seconds2 = e;
			}
			System.out.println("# of seconds since midnight: " + a);
			System.out.println("# of seconds remaining in the day: " + b);
			System.out.println("% of the day that has passed: " + d + "%");
			System.out.println("Time elaspsed to completetion from start: " + hours2 + " hours, " + minutes2 + " minutes and " + seconds2 + " seconds.");
	}
}
