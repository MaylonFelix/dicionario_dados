package br.com.pix.model;

import java.util.ArrayList;
import java.util.List;

public class NumeroExpert {

	public List<String> getNumeros(String tipo){
		List<String> numeros = new ArrayList<String>();
		if(tipo.equals("par")){
			numeros.add("Zero");
			numeros.add("Dois");
			numeros.add("Quatro");
		}
		else{
			numeros.add("Um");
			numeros.add("Três");
			numeros.add("Cinco");
		}
		return numeros;
	}
}
