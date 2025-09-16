package br.com.unicuritiba;

import java.util.Scanner;

import br.com.unicuritiba.repositories.PlayerRepository;
import br.com.unicuritiba.repositories.Repository;
import br.com.unicuritiba.repositories.WordRepository;
import br.com.unicuritiba.Game;

public class Application {

	public static void main(String[] args) {
		
		Game gv = new Game();
		gv.start();
		
		Scanner scanner = new Scanner(System.in);
		
		
		//System.out.println("Digite uma palavra: ");
		//String word1 = scanner.next();
		
		Repository repository = new WordRepository();
		
		repository.save("CREME");
		repository.save("ARROZ");
		repository.save("PUDIM");
		repository.save("PIZZA");
		repository.save("MILHO");
		
		String chosenWord = repository.get(0);
		
		System.out.println(repository.getAll());
		
		repository = new PlayerRepository();
		
		repository.save("Pedro");
		repository.save("João");
		repository.save("Carlos");
		repository.save("Rodrigo");
		repository.save("Yuri");
		
		System.out.println(repository.getAll());
	}
}
