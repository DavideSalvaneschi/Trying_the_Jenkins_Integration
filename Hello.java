public class Hello {
	
	public static void main(String[] args) {
	
		int times = 0;
		if (args.length == 0) {
			System.out.println("\nNo value provided, setting it to 1.\n");
			doPrint(1);
			return;
		}
		if (args.length > 1)
			System.out.println("\nIgnoring all arguments other than the first.\n");
		
		try {
			times = Integer.parseInt(args[0]);
		} catch (NumberFormatException ex) {
			System.out.println("First argument \"" + args[0] + "\" is not an integer!");
			System.out.println("Exiting...");
		}
		doPrint(times);
		return;
	}
	
	private static void doPrint (int times) {
	
		for (var i = 1; i<=times; ++i)
			System.out.println("Hello world times " + i + "!");
	
	}
}