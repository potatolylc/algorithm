package peomformat;

import java.util.Scanner;

public class FormatPeomTest {

	/**
	 * Format Peom: format the horizontal viewed peom vertical
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("输入一首诗词。");
		Scanner scanner = new Scanner(System.in);
		String peom = scanner.next();
		
		char[][] charSet = new char[20][20];
		char[] sentenChar = new char[20];
		String[] sentences = peom.split("，");
		for(int i = 0; i < sentences.length; i++){
			sentenChar = sentences[i].toCharArray();
			for(int j = 0; j < sentenChar.length; j++){
				charSet[i][j] = sentenChar[j];
			}
		}
		
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				char character = charSet[19-j][i];
				if(character == '\u0000')
					System.out.print("  ");
				System.out.print(character);
			}
			System.out.println();
		}
		
	}

}
