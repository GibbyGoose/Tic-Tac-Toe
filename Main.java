import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Name:" );
    String name1 = sc.next();
    System.out.println("Enter Other Person's Name:");
    String name2 = sc.next();
    System.out.println("\n Well, " + name1 + " and " + name2 + ", welcome to the tik tac tow game! \n Let the first person click on a space. \n Once he/she has clicked on a space, it is the next person's turn. Good luck!");
		TicTacToe tictactoe = new TicTacToe();
		
	}
}