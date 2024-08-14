package atividades;

import java.util.ArrayList;
import java.util.Arrays;

public class Atividade3 {

	public static void main(String[] args) {
				String[] disciplinas = {"matemática", "filosofia","história", "fisica"};
				ArrayList<String> novalista = new ArrayList<String> (Arrays.asList(disciplinas));
				novalista.add ("geografia");
				novalista.add ("lingua inglesa");
				
				for (String i: novalista) {
					System.out.println("Disciplina: " + i);
				}

	}

}
