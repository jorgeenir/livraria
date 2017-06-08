package livraria;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import DAO.DAOLivros;
import DAO.DAOPessoa;
import modelo.Alunos;
import modelo.Livro;

public class Emprestimo {

	static DAOPessoa p = new DAOPessoa();
	static DAOLivros l = new DAOLivros();

	private Alunos aluno = null;
	private Livro libro = null;

	public Alunos verifica_aluno(int matricula) {
		
		
//		HashMap<String, Alunos> aluno_map = p.Ler_Aluno();
//		Set<String> chaves = aluno_map.keySet();
//		
//		for (Iterator<String> iterator = chaves.iterator(); iterator.hasNext();) {
//			String chave = iterator.next();
//			if (chave != null) {
//				System.out.println(chave);
//                                System.out.println("Deu algo no if");
//			} else {
//				System.out.println("Deu problema");
//			}
//		}

		// Set<String> chaves = mapa.keySet();
		// for (Iterator<String> iterator = chaves.iterator();
		// iterator.hasNext();)
		// {
		// String chave = iterator.next();
		// if(chave != null)
		// System.out.println(chave + mapa.get(chave));
		// }

		return aluno;
	}

	public Livro verifica_livro() {
		return null;
	}

}
