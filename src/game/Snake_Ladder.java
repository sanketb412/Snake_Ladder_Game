package game;

public class Snake_Ladder 
{
	public static void main(String[] args) 
	{
		System.out.println("#####  Welcome to Snake and Ladder Game  #####");
		System.out.println("\nYou are at Position 0");
		int dice = (int)(Math.floor((Math.random() * 10 ) % 6) + 1);
		System.out.println("You Roll: " +dice);
		
		final int Ladder = 1;
		final int Snake = 2;
		int position = 0;
		int check = (int)(Math.floor(Math.random() * 10 ) % 3);
		
		switch (check)
		{
      		case Ladder:
      			System.out.println("Player got Ladder");
      			System.out.println("Player move ahead through ladder");
      			position += dice;
      			System.out.println("Now you are at  " +position);
      			break;
      		case Snake:
      			if (position == 0 )
      				System.out.println("player stays at 0");
      			else
      				System.out.println("Player got Snake");
      				System.out.println("Player move behind through snake");
      				position -= dice;
      			break;
      		default:
      			if (position <= 0)
      				position = 0;
      			System.out.println("Player doesnt move"); break;     			
		}	
	}
}
