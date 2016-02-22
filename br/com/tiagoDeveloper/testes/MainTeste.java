package testes;

import java.util.ArrayList;
import java.util.List;

public class MainTeste {

	public static void main(String[] args) {
		List<String> collumn = new ArrayList<String>();
		
		collumn.add("id");
		collumn.add("nome");
		collumn.add("sobreNome");
		collumn.add("end");
		TesteQuery testeConexao = new TesteQuery(collumn);

	}

}
