import java.io.*;
import java.util.Random;
public class HtoB {
	public static void main(String args[]) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Random rand = new Random();
		int score = 0;
		
		for(int i = 0; i < 10; i++) {
			Bite bite = new Bite();
			int num = rand.nextInt(256);
			bite.setBite(num);
			String binary = bite.getStringBite();
			String hex = Integer.toHexString(num);
			System.out.println("Convert these Hexadecimal Numbers to binary!");
			System.out.println(hex);
			String answer = reader.readLine();
			if(answer.equals(binary)) {
				System.out.println("Correct!");
				score += 1;
			}
			else {
				System.out.println("Wrong! The correct answer was " + binary);
			}
			
			
		}
		score *=10;
		System.out.println("Game Over! Your final score is " + score + "%");
	}
}
