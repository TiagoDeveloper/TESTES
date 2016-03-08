package br.com.caelum;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LeituraXML3 {

	
	public void teste() throws SAXException, IOException, ParserConfigurationException{
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		Document doc = db.parse("C:\\Users\\Tiago\\Desktop\\arquivoXML.xml");
		
		Element raiz = doc.getDocumentElement();

		NodeList endList = raiz.getElementsByTagName("contato");
	
	
		boolean confere;
		
		for(int i = 0; i < endList.getLength(); i++){
			
			Element endElement = (Element) endList.item(i);
			
				for(int x = 0; x < endList.getLength(); x++){
				
					confere =  endElement.getChildNodes().item(x).hasChildNodes();
					
					
						
						if(confere){
							
							System.out.print(endElement.getChildNodes().item(x).getNodeName().toUpperCase()+":");
							System.out.print(endElement.getChildNodes().item(x).getTextContent()+" ");
						}
						
				}//segundo for
				
			System.out.println();
			
		}//primeiro for

		
	}//fim do teste()
	
}//fim da class Leitura
