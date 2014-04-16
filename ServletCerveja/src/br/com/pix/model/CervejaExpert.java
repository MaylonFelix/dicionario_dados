package br.com.pix.model;

import java.util.ArrayList;
import java.util.List;

public class CervejaExpert {
	
	public List<String> getMarcas(String cor) {
		
		List<String> marcas = new ArrayList<String>();
		if(cor.equals("Clara")) {
			marcas.add("Antartica");
			marcas.add("Brahma");
		} else {
			marcas.add("Bohemia");
			marcas.add("Original");
		}
		return marcas;
	}

}
