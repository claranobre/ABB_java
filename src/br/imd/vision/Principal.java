package br.imd.vision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.sun.org.apache.xpath.internal.SourceTreeManager;

import br.imd.model.NodeABB;
import br.imd.model.TreeABB;
import sun.reflect.generics.tree.Tree;
import br.imd.model.*;
public class Principal {

	public static void main(String[] args) {
		try{
			BufferedReader readerAbb = new BufferedReader(new FileReader("src/br/imd/model/abb.txt"));
			BufferedReader readerOperations = new BufferedReader(new FileReader("src/br/imd/model/operations.txt"));
			String linhaAbb = readerAbb.readLine();
			String linhaOperations = readerOperations.readLine();
			int i = 0;
			int resultado = 0;
			TreeABB tree = null;
			NodeABB root = null;
			
			// Pegando valores para a arvore
			if(linhaAbb != null){
				String nodes[] = linhaAbb.trim().split(" ");
				try{
					while(i < nodes.length){
						if(i == 0){
							root = new NodeABB(Integer.parseInt(nodes[i]));
							tree = new TreeABB(root);
						}
						else{
							tree.insert(Integer.parseInt(nodes[i]), root);
						}
						i = i+1;
					}
				}
				catch(Exception e){
					System.out.println("Erro: Formato de número errado");
				}
				linhaAbb = readerAbb.readLine();
			}
			readerAbb.close();
			
			while(linhaOperations != null){
				String palavras[] = linhaOperations.trim().split(" ");
				try{
					if(palavras.length <= 2){
						if(palavras[0].equals("ENESIMO")){
							if(palavras[1] != null){
								System.out.println(tree.nElement(root, Integer.parseInt(palavras[1])));
							}
						}
						else if(palavras[0].equals("POSICAO")){
							if(palavras[1] != null){
								System.out.println("Funcao nao implementada :(");
							}
						}
						else if(palavras[0].equals("MEDIANA")){
							System.out.println(tree.median(root));
						}
						else if(palavras[0].equals("CHEIA")){
							System.out.println("A arvore eh cheia:"+tree.isFull(root));
						}
						else if(palavras[0].equals("COMPLETA")){
							System.out.println("A arvore eh completa:"+tree.isComplete(root));
						}
						else if(palavras[0].equals("IMPRIMA")){
							System.out.println(tree.toString(root));
						}
						else if(palavras[0].equals("REMOVA")){
							if(palavras[1] != null){
								System.out.println("Funcao nao implementada :(");
							}
						}
					}
					else{
						System.out.println("Erro: Parametros em quantidade errada");
					}
				}
				catch(Exception e){
					System.out.println("Erro: Formato de número errado");
				}
				linhaOperations = readerOperations.readLine();
			}
			readerOperations.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Arquivo não encontrado");
		}
		catch(IOException e){
			System.out.println("Exceção: "+e);
		}
	}

}
