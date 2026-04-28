package Secao15.Exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Main {
	/**
		Fazer um programa para ler o caminho de um arquivo .csv
		contendo os dadosse itens vendidos. Cada item possui um
		nome, preço unitário e quantidade, separados por vírgula.
		Você deve gerar um novo arquivos chamado "summary.csv", localizado
		em uma subpasta chamada "out" a partir da pasta original do
		arquivo de origem, contendo apenas o nome e o valor total para
		aquele item (preço unitário multiplicado pela quantidade).
	*/
	public static void main(String[] args) {
	
		// Adicionando os caminhos dos arquivos e pastas
		String path = "c:\\temp";
		String filePath = "c:\\temp\\produtos.csv";
		String resultPath = "c:\\temp\\out\\summary.csv";
		
		// Criando a lista que armazena todos os produtos
		LinkedList<Produto> listaProdutos = new LinkedList<Produto>();
		
		// Bloco try que armazena a lógica da leitura e escrita dos arquivos
		try (BufferedReader br = new BufferedReader(new FileReader(filePath));
			 BufferedWriter bw = new BufferedWriter(new FileWriter(resultPath))) {
			
			// Criando a subpasta dentro da pasta temp
			// E avisando se foi um sucesso
			boolean success = new File(path + "\\out").mkdir();
			System.out.println("Diretório criado!" + success);
			
			// Lendo a primeira linha do arquivo e separando as palavras por vírgula
			String[] line = br.readLine().split(",");
			
			// Mantém o laço enquanto houver novas linhas
			while (line != null) {
				
				// Adiciona um no arquivo na lista
				// convertendo os valores necessários
				listaProdutos.add(new Produto(line[0], Double.parseDouble(line[1]), Integer.parseInt(line[2])));
				
				// Lendo a próxima linha do arquivo
				line = br.readLine().split(",");
			
			}
			
			// Correndo toda a lista de produtos
			for (Produto prod : listaProdutos) {
				
				// Adicionando todas as informações dos produtos
				// no novo arquivo
				bw.write(prod.getNome() + ", " + prod.calcPrecoTotal());
				bw.newLine();
				
			}
			
		}
		catch (IOException e) {
			
			System.out.println("Erro na leitura ou escrita do arquivo! " + e.getMessage());
			e.printStackTrace();
			
		}
		catch (NullPointerException e) {
			
			System.out.println("Erro com array nulo! " + e.getMessage());
			e.printStackTrace();
			
		}
		

	}
}
