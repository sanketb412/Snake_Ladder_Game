package game;

public class Snake_Ladder 
{
	public static void main(String[] args) 
	{
		System.out.println("#####  Welcome to Snake and Ladder Game  #####");
		System.out.println("\nYou are at Position 0");
		
		int position = 0;
		
		while (position < 100)
		{
			int dice = (int)(Math.floor((Math.random() * 10 ) % 6) + 1);
			System.out.println("\nYou Roll: " +dice);
			
			final int Ladder = 1;
			final int Snake = 2;
			int check = (int)(Math.floor(Math.random() * 10 ) % 3);		
			switch (check)
			{
      			case Ladder:
      				System.out.println("Player got Ladder");
      				position = +position + dice;
      				if (+position > 100) {
      					position = +position - dice;
			        	System.out.println("Now Player is at " +position);}
      				else {
      					System.out.println("The player move head through Ladder");
			        	System.out.println("Now Player is at " +position);}
      				break;
      			case Snake:
      				if (position == 0 )
      					System.out.println("player stays at 0");
      				else
      				{
      					if (+position > 6) {
      						position -= dice;
      						System.out.println("Player got Snake");
      						System.out.println("Player move behind through snake");
      						System.out.println("Now you are at  " +position);
      					}
      				}
      				break;
      			default:
      				if (position <= 0)
      					position = 0;
      					System.out.println("Player doesnt move"); break;     			
			}
		}
		System.out.println("\n***Player Wins***");
	}
}
