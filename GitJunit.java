import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class GitJunit {

	@Test
	void test() {
		 Scanner entrada = new Scanner(System.in);  
	     System.out.println("Introdueix numero de felicitat"); 
	     int F1 = entrada.nextInt();
	     int F2 = entrada.nextInt();
	     int F3 = entrada.nextInt();
	     if(F1<F2 && F2<F3 && F1<F3) {
	    	 System.out.println("Si");
	     }else {
	    	 System.out.println("No");
	     }
		 
	}

}
