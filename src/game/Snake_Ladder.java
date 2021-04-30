package game;

public class Snake_Ladder 
{
	public static void main(String[] args) 
	{
		System.out.println("#####  Welcome to Snake and Ladder Game  #####");
		System.out.println("\nYou are a Position 0");
		int dice = (int)(Math.floor((Math.random() * 10 ) % 6) + 1);
		System.out.println("You Roll: " +dice);
	}
}
