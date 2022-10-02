package DSA.Advance_OOPS;

import java.util.Scanner;

public class TicTacToe {
    private player player1, player2;
    private Board board;
    public static void main(String args[]){
        TicTacToe t = new TicTacToe();
        t.startGame();
    }
    public void startGame(){
        Scanner sc = new Scanner(System.in);
                                //player input 
        player1 = takePlayerInput(1);
        player2 = takePlayerInput(2);
        while(player1.getSymbol() == player2.getSymbol()){
            System.out.println("Symbol Already taken || Pick another symbol !! ");
            char symbol = sc.next().charAt(0);
            player2.setSymbol(symbol);
        }
                             //Create board 
        board = new Board(player1.getSymbol(), player2.getSymbol());
                            //conduct game 
        boolean player1Turn = true;
        int status = Board.INCOMPLETE;
        while(status == Board.INCOMPLETE || status == Board.INVALID){  
			if(player1Turn){
				System.out.println("Player 1 - " + player1.getname() + "'s turn");
				System.out.println("Enter x: ");
				int x = sc.nextInt();
				System.out.println("Enter y: ");
				int y = sc.nextInt();
				 status =  board.move(player1.getSymbol(), x, y);
				if(status != Board.INVALID){
					player1Turn = false;
					board.print();
				}else{
					System.out.println("Invalid Move !! Try Again !!");
				}
			}else{
					System.out.println("Player 2 - " + player2.getname() + "'s turn");
					System.out.println("Enter x: ");
					int x = sc.nextInt();
					System.out.println("Enter y: ");
					int y = sc.nextInt();
					 status =  board.move(player2.getSymbol(), x, y);
					if(status != Board.INVALID){
						player1Turn = true;
						board.print();
					}else{
						System.out.println("Invalid Move !! Try Again !!");
					}				
			}
		}
        if(status == Board.PLAYER_1_WINS){
            System.out.println("Player 1 - " + player1.getname() + " wins !!");
        }else if(status == Board.PLAYER_2_WINS){
            System.out.println("Player 2 - " + player2.getname() + " wins !!");
        }else{
            System.out.println("DRAW !!");
        }

    }

    private player takePlayerInput(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Player " + num + " name : ");
        String name = sc.nextLine();
        System.out.print("Enter Player " + num + " Symbol : ");
        char symbol = sc.next().charAt(0);
        player p = new player(name, symbol);
        return p;
    }
}
