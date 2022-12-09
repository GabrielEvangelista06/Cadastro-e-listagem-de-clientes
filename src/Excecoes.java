import java.util.Scanner;

public class Excecoes extends Exception {
	private Scanner in = new Scanner(System.in);
	
	private String msg = "";

	public Excecoes(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return this.msg;
	}

	public void printMessage() {
		System.out.println(msg);
	}

}
