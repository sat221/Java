package test;

import java.util.Random;
import java.util.Scanner;

class Game{
	int rno;
	int no=0;
	int guess=0;
	public void setguess(int guess) {
		this.guess=guess;
				
	}
	public int getguess() {
		return guess;
	}
	Game(){
		Random r= new Random();
		this.rno=r.nextInt(100);
	}
	int userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user no");
		no=sc.nextInt();
		return no;
	}
	boolean isCorrect() {
		guess++;
		if(rno==no) {
			System.out.println("matched");
			return true;
		}
		else if(rno>no){
			System.out.println("too low");
		}
		else if(rno<no){
			System.out.println("too  high");
		}
		return false;
	}
	public void setGuess(int guess) {
		this.guess = guess;
	}
}
public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g=new Game();
		boolean b=false;
		while(!b) {
		g.userInput();
		g.isCorrect();
	}
	}
}
