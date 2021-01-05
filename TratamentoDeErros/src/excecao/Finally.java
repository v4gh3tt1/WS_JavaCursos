package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println(7/ sc.nextInt());
			
		} catch (Exception e) {			
			e.printStackTrace();
			
		} finally { // bloco finallly sempre sera executado
			System.out.println("Finally");			
			sc.close();
		}
		
		System.out.println("End");
	}

}
