package Secao15.Aula165;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Olá", "Bom dia!", "É isso..."};
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			for (String line : lines) {
				bw.write(line );
				bw.newLine();
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
