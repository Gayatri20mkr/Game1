import java.util.Random;
import java.util.Scanner;

public class miniproject {
 public static void main(String args[]) {
	 System.out.println("Welcome to Rock Papaer Scissor Game");
	 System.out.println("1 for Rock");
	 System.out.println("2 for Paper");
	 System.out.println("3 for Scissor");
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your number between 1 to 3 to seeing above Rule");
	 int y = sc.nextInt();
	 if(y > 3 || y<1) {
		 System.out.println("You put worng number\nPut the number between 1 to 3");
		 System.exit(0);
	 }
	 System.out.println("The Computer Nummber is: ");
	 Random dc = new Random();
	 int x = dc.nextInt(1,4);
	 System.out.println(x);
	 
	 if(y==x) {
		 System.out.println("Match is draw\nBecause same number is come");
	 }
	 if(y==1 && x==2) {
		 System.out.println("You lose\nBeacuse Paper beats Rock");
	 }
	 if(y==1 && x==3) {
		 System.out.println("You win\nBeause Rock beats Scissors");
	 }
	 if(y==2 && x==1) {
		 System.out.println("You win\nBeacuse Paper beats Rock");
	 }
	 if(y==2 && x==3) {
		 System.out.println("You lose\nBeacuse Scissor beats Paper");
	 }
	 if(y==3 && x==1) {
		 System.out.println("You lose\nBeacuse Rock  beats Paper");
	 }
	 
	 if(y==3 && x==2) {
		 System.out.println("You win\nBeacuse Scissor beats Paper");
	 }
	 
	 
 }
}
