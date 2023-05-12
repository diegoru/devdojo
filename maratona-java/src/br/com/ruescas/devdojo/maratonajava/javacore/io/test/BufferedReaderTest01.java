package br.com.ruescas.devdojo.maratonajava.javacore.io.test;

import java.io.*;

/**
 * <a href="https://www.youtube.com/watch?v=Z-EG0cRvVBQ&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=143&ab_channel=DevDojo">BufferedReader</a>
 */
public class BufferedReaderTest01 {
    /**
     * A FileReader é mais performatica, pois cria um Buffer
     * Pensamos  em  Buffer como os Stream de videos (YouTube, NetFlix e etc)
     * armazena os daos em memoria
     */
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
             // A classe BufferedReader recebe um FileReader
             BufferedReader br = new BufferedReader(fr)) {

            // Assim como  o FileReader o BufferedReader possui o metodo read,
            // mas o BufferedReader tambem possui o metodo readLine() que le
            // uma linha inteira e no caso do read no FileReader retorna -1 e
            // o readLine() retorna null
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
