package br.com.caelum;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LeituraXML {

	//private File file = new File("C:\\Users\\Tiago\\Desktop\\arquivoXML.xml");
	
	
	public void lerXML() throws ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		//Document doc = db.parse(new InputSource(this.file.toString()));
		
		Document doc = db.parse("C:\\Users\\Tiago\\Desktop\\arquivoXML.xml");
		
		Element raiz = doc.getDocumentElement();
		
		NodeList endList = raiz.getElementsByTagName("contato");
		
		//aqui define o bloco através to parametro da função item();
		Element endElement = (Element) endList.item(0);
		
		
		
		
		//variar os número da função item() para observar o seu funcionamento
		System.out.println(endElement.getChildNodes().item(1).hasChildNodes());
		//esse é o tamanho do for
		
		String tag = endElement.getChildNodes().item(1).getNodeName();
		String conteudo = endElement.getChildNodes().item(1).getTextContent();
		
		System.out.println( tag +" : "+conteudo);
		
		tag = endElement.getChildNodes().item(3).getNodeName();
		conteudo = endElement.getChildNodes().item(3).getTextContent();
		
		System.out.println( tag +" : "+conteudo);
		
		
		
		
		System.out.println(endList.getLength());
		
		
	}//fim do lerXML
	
	public void teste() throws SAXException, IOException, ParserConfigurationException{
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		//Document doc = db.parse(new InputSource(this.file.toString()));
		
		Document doc = db.parse("C:\\Users\\Tiago\\Desktop\\arquivoXML.xml");
		
		Element raiz = doc.getDocumentElement();
		
		NodeList endList = raiz.getElementsByTagName("contato");
		
		//aqui define o bloco através to parametro da função item();
		Element endElement = (Element) endList.item(1);
		

		//variar os número da função item() para observar o seu funcionamento
		System.out.println(endElement.getChildNodes().item(1).hasChildNodes());
		//esse é o tamanho do for
		
		String tag = endElement.getChildNodes().item(1).getNodeName();
		String conteudo = endElement.getChildNodes().item(1).getTextContent();
		
		System.out.println( tag +" : "+conteudo);
		
		tag = endElement.getChildNodes().item(3).getNodeName();
		conteudo = endElement.getChildNodes().item(3).getTextContent();
		
		System.out.println( tag +" : "+conteudo);
		
		
		
		
		System.out.println(endList.getLength());
		
		
		
	}//fim do teste()
	
}//fim da class Leitura
