package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Chute {

	public static void main(String[] args) {
		
		final int numCarros=5;
		Carro carro1 = new Carro("HRV");

		List<Carro> carrosList = new LinkedList<>();		
		carrosList.add(carro1);
		carrosList.add(new Carro("Gol"));
		
		for (Carro carro : carrosList) {
			System.out.println(carro);
					
			}
		carrosList.remove(carro1);
		System.out.println();
		
		for (Carro carro : carrosList) {
			System.out.println(carro);
					
			}
	}
	
}	
	
	
