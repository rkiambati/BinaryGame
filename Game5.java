import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Game5 {
	public static int getRandom(int[] array) {
	    int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	}
	public static int getRandom2(int[] array2) {
		int rnd2 = new Random().nextInt(array2.length);
		return array2[rnd2];
	}
	public static void main(String args[])throws Exception {
	//Defining variables
	for (int s = 0; s < 10; s++) {
	int bV = 0;
	int dV = 0;
	String hV = null;
	Bite bite = new Bite();
	Game5 n = new Game5();
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	Random rand = new Random();
	int score = 0;
	int pointsawarded = 10;
	int num = rand.nextInt(256);
	int[] bases = new int[]{2,10,16};
	
	int rndbase = Game5.getRandom(bases);
	
	//Code for base selection
	if(rndbase == 2) {
		bite.setBite(num);
		String BV = bite.getStringBite();
		bV = Integer.parseInt(BV);
	}
	else if(rndbase == 10) {
		dV = num;
	}
	else if(rndbase == 16) {
		hV = Integer.toHexString(num);
	}
	
	
	
	//Code for user base selection
	System.out.println("Convert this number to base " + rndbase + "!");
	System.out.println(num);
	String answer = reader.readLine();
	
	if(rndbase == 2) {
		int answer3 = Integer.parseInt(answer);
			if(answer3 == bV) {
				System.out.println("Correct!");
				score += pointsawarded;
			}
			else if(answer3 > bV) {
				System.out.println("Hint: Lower");
				pointsawarded -= 2;
			}
			else if(answer3 < bV) {
				System.out.println("Hint: Higher");
				pointsawarded -=2;
			}
		}
	
	if(rndbase == 10) {
		int answer4 = Integer.parseInt(answer);
			if(answer4 == dV) {
				System.out.println("Correct!");
				score += pointsawarded;
			}
			else if(answer4 > dV) {
				System.out.println("Hint: Lower");
				pointsawarded -= 2;
			}
			else if(answer4 < dV) {
				System.out.println("Hint: Higher");
				pointsawarded -= 2;
			}
		}
	
	if(rndbase == 16) {
			if(answer.equals(hV)) {
				System.out.println("Correct!");
				score += pointsawarded;
			}
			else {
				System.out.println("Wrong!");
				pointsawarded -=2;
			}
		}
	}
}
}