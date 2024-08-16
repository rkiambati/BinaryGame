import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class MainPge {
	
	public void mainPage() throws Exception{
		System.out.println("Welcome! Please Select The Game you would like to play by typing the number of the game:");
		//User input Buffered Reader call
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1. Decimal to Binary Game");
		System.out.println("2. Binary to Decimal Game");
		System.out.println("3. Binary to Hexadecimal Game");
		System.out.println("4. Hexadecimal to Binary Game");
		String answer = reader.readLine();
		
		//If statements for the user selection to start each individual Game based on which number is selected
		if(answer.equals("1")) {
			DtoBtest.main(null);
		}
		else if(answer.equals("2")){
			BtoDtest.main(null);
		}
		else if(answer.equals("3")) {
			BtoHtest.main(null);
		}
		else if(answer.equals("4"));{
			HtoB.main(null);
		}
		
	}
	public static void main(String args[]) throws Exception{
		MainPge l = new MainPge();
		l.mainPage();
	}
}
