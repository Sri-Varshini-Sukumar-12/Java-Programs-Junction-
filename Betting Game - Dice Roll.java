/*
In a betting game involving the roll of a dice. Sandeep gains Rs.X if an odd number turns up and
he loses Rs.Y if an even number turns up. The numbers shown on the face of the dice in a certain
number of games is passed as the input. The values of X and Y are also  passed asthe input. The
program must print the net gain or net loss as the output.

Example Input/Output 1:
Input:
1 4 3
10
30

Output:
-10
*/

import java.util.Scanner;
public class BettingGame_DiceRoll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] numbers = input.split(" ");
		int[] intNumbers = new int[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			intNumbers[i] = Integer.parseInt(numbers[i]);
		}
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int profitSum=0,lossSum=0,total=0;
		for(int i=0; i<intNumbers.length; i++) {
			if(intNumbers[i]%2 != 0) {
				profitSum += X;
			}else if(intNumbers[i]%2 == 0) {
				lossSum -= Y;
			}
		}
		total = profitSum + lossSum;
		System.out.println(total);
		sc.close();
	}
}
