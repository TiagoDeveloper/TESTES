package br.com.tiagoDeveloper.testes;

import java.lang.reflect.InvocationTargetException;


public class Main {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		
		Pessoas pessoa = new Pessoas();
		pessoa.setId(1);
		pessoa.setNome("tiago");
		
		Teste teste = new Teste(pessoa);

	}

}
