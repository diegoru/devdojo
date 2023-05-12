package br.com.ruescas.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * https://www.youtube.com/watch?v=4wsysT3OxO4&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=140&ab_channel=DevDojo
 */

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        // Usamos o try with source pois o FileWrither herda da classe closable
        // Por padrao o FileWriter sobrescreve o arquivo caso exista. Para con-
        // tinuarmos a escrita no arquivo adicionamos um segundo  parametro
        // booleano para informar o append
        try(FileWriter fw = new FileWriter(file, true)) {
            //O FileWriter não possui um método para quebra de linha, mas para
            // isso utilizamos o \n
            fw.write("Olá Mundo!\nDiego\n");
            // Quando estamos escrevendo no arquivo estamos pegando recursos do
            // sistema operacional  e existe a possibilidade de por exemplo
            // fecharmos o arquivo e  o sistema operacional não ter mandado todos
            // esses dados para o arquivo e para isso utilizamos  o flush. Basica-
            // mente estamos dizendo envia tudo  para o arquivo.
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
