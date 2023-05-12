package br.com.ruescas.devdojo.maratonajava.javacore.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * https://www.youtube.com/watch?v=j7cWU9PM7wc&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=142&ab_channel=DevDojo
 */
public class BufferedWriterTest01 {
    /**
     * BufferedWriter é indicado para trabalhar com arquivos grande
     * e é muito parecido com o FileWriter
     * Ele é mais otimizado pois cria um buffer em memória
     */
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file);
            // Podemos passar um segundo parametro no BufferedWriter para
            // informar o tamanho do Buffer
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Ola Mundo!");
            // Outra vantagem é que para quebrar uma  linha não  precisamos  do \n.
            // O \n pode ser um problema,pois nem todos os sistemas  operacionais
            // entendem que o  \n é uma  quebra de linha. No BufferedWriter usamos
            // o metodo newLine
            bw.newLine();
            bw.write("Olá Diego");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
