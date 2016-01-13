package br.com.tiagoDeveloper.testes;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class Teste {

	public Teste(Object objeto) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
	
		Class<?> classe  = objeto.getClass();
		
		Method[] metodos = classe.getDeclaredMethods();
		
		for(Method metodo : metodos){
			
			if(metodo.getName().startsWith("get")){

				Object o = classe.getMethod(metodo.getName()).invoke(objeto, (Object[])null);
				
				System.out.println(o);
			}
			
			
			
		}
		
		
	}//fim do metodo construtor
	
	
	
	
}
