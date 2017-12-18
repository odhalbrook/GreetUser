import java.util.Scanner;

public class greetUserMethod
	{

		public static void main(String[] args)
			{
				greetUser();

			}

		private static void greetUser()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				
				int randomNum = (int) (Math.random( ) * 3);
				
				String [] comp = new String [4];
				comp [0] = ", you look like you've been hitting the gym lately.";
				comp [1] = ", I like your backpack.";
				comp [2] = ", you look great today.";
				comp [3] = ", you look very good today.";
				
				System.out.println(name + comp[randomNum]);
				
			}

	}
