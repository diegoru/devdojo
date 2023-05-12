package br.com.ruescas.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * https://www.youtube.com/watch?v=9Y8FKrklbMQ&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=141&ab_channel=DevDojo
 */

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            FileReader fr = new FileReader(file);
            // Por padrao o FileReader faz a leitura do primeiro caracter do
            // arquivo pegando o código ascii do caracter.
            System.out.println(fr.read());

            // Existe uma opcao no read  onde passamos como parametro um char
            // que é um array. Dessaforma pegamos esse caracter e   colocamos
            // dentro de  um array de char
            /*char[] in = new char[30];
            fr.read(in);
            for (char c : in) {
                System.out.print(c);
            }*/

            int i;
            // o metodo read retorna um int como se fosse um size
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
