package game;

public class Snake_Ladder 
{
	public static void main(String[] args) 
	{
		System.out.println("#####  Welcome to Snake and Ladder Game  #####");
		System.out.println("\nYou are at Position 0");		
		int position1 = 0;
		int position2 = 0;
		while (position1 < 100 && position2 < 100)
		{
			int dice1 = (int)(Math.floor((Math.random() * 10 ) % 6) + 1);
			System.out.println("\nYou Roll: " +dice1);
			
			int check1 = (int)(Math.floor(Math.random() * 10 ) % 3);		
			switch (check1)
			{
      			case 1:
      				System.out.println("Player1 got Ladder");
      				position1 = +position1 + dice1;
      				if (+position1 > 100) {
      					position1 = +position1 - dice1;
			        	System.out.println("Now Player1 is at " +position1);}
      				else {
      					System.out.println("The player1 move head through Ladder");
			        	System.out.println("Now Player1 is at " +position1);}
      				break;
      			case 2:
      				if (position1 == 0 )
      					System.out.println("player stays at 0");
      				else
      				{
      					if (+position1 > 6) {
      						position1 -= dice1;
      						System.out.println("Player1 got Snake");
      						System.out.println("Player1 move behind through snake");
      						System.out.println("Now you are at  " +position1);
      					}
      				}
      				break;
      			default:
      				if (position1 <= 0)
      					position1 = 0;
      					System.out.println("Player1 doesnt move"); break;     			
			}
			int dice2 = (int)(Math.floor((Math.random() * 10 ) % 6) + 1);
			System.out.println("\nYou Roll: " +dice2);
			
			int check2 = (int)(Math.floor(Math.random() * 10 ) % 3);		
			switch (check2)
			{
      			case 1:
      				System.out.println("Player2 got Ladder");
      				position2 = +position2 + dice2;
      				if (+position2 > 100) {
      					position2 = +position2 - dice2;
			        	System.out.println("Now Player2 is at " +position2);}
      				else {
      					System.out.println("The player2 move head through Ladder");
			        	System.out.println("Now Player2 is at " +position2);}
      				break;
      			case 2:
      				if (position2 == 0 )
      					System.out.println("player2 stays at 0");
      				else
      				{
      					if (+position2 > 6) {
      						position2 -= dice2;
      						System.out.println("Player2 got Snake");
      						System.out.println("Player2 move behind through snake");
      						System.out.println("Now you are at  " +position2);
      					}
      				}
      				break;
      			default:
      				if (position2 <= 0)
      					position2 = 0;
      					System.out.println("Player2 doesnt move"); break;     			
			}
		}
		System.out.println("\nThe Final Position of Player1 is: " +position1);
        System.out.println("\nThe Final Position of Player2 is: " +position2);
        if (position1 == 100)
       	System.out.println("\n####...CONGRATULATION.!!!! PLAYER1 has WON THE GAME...####");
        else
           System.out.println("\n####...CONGRATULATION.!!!! PLAYER2 has WON THE GAME...####");
	}
}
