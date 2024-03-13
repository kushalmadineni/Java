import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Umpire  u = new Umpire();
       u.collectGuessNumber();
       u.collectPlayerNum();
       u.compare();
	}

}
class Guesser{
	int guessed_number;
	int guessNum() {
    Scanner s = new Scanner(System.in);
    System.out.println("Guess the number between 1 to 25");
    guessed_number= s.nextInt();
	return guessed_number;
	}
}
class Player{
	int pnum;
	int playerNum() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Guess the number between 1 to 25");
		pnum = s.nextInt();
		return pnum;
	}
}
class Umpire{
	int g1num;
	int pnum1;
	int pnum2;
	int pnum3;
	
	void collectGuessNumber() {
		Guesser g = new Guesser();
		g1num = g.guessNum();
	}
	void collectPlayerNum() {
		
		System.out.println("Player1");
		Player p1 = new Player();
		pnum1 = p1.playerNum();
		
		System.out.println("Player2");
		Player p2 = new Player();
		pnum2 = p2.playerNum();
		
		System.out.println("Player3");
		Player p3 = new Player();
		pnum3 = p3.playerNum();
		
	}
	void compare(){
		if(g1num == pnum1) {
			System.out.println("Player 1 wins");
		}
		else if( g1num == pnum2){
			System.out.println("Player 2 wins");
		}
		else if(g1num == pnum3) {
			System.out.println("Player 3 wins");
		}else {
			System.out.println("Players looses");
			
		}
		
	}
		
}



