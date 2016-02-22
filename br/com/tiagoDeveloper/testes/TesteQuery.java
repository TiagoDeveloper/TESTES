package testes;

import java.util.List;


public class TesteQuery {
	
		
		private String query;
		private StringBuilder sb;
		
		
		
		public TesteQuery(List<String> col){
			
			this.query = "insert into tabela(parametros)values(?)";
			
			
			System.out.println(this.query.indexOf("?"));
			
			boolean index = false;
			
			for(String collumn : col){
				
				if(index){
				sb = new StringBuilder(this.query);
				this.query = sb.insert(this.query.lastIndexOf("?")+1, ","+"?").toString();
				System.out.println(this.query);
				}else{
					
					index =true;
				}
				
			}
			
			index=false;
			System.out.println("index:"+index);
			
			
			/**int begin =0;
			int end = 0;
			System.out.println(begin=this.query.lastIndexOf("(?"));
			System.out.println(end=this.query.length());
			
			System.out.println(this.query.replace("(?)", this.query.substring(begin, end)));
			**/
		
			this.query = this.query.replace("(parametros)", this.query.substring(this.query.indexOf("(?"), this.query.length()));
			System.out.println(this.query);
		

		for(String collumn : col){
			
			System.out.println(this.query.replace(query.substring(this.query.indexOf("?"),this.query.indexOf(",")), collumn));
			
			
			
		}
	
	
		}

}
