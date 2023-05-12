package br.com.ruescas.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class FileTest01 {
    /**
     *  File é uma classe   bem baixo nível
     *  por isso  não temos performance
     */
    public static void main(String[] args) {
        File file = new File("file.txt");
//        File file = new File("C:\\workspace\\devdojo\\maratona-java\\arquivo\\file.txt");
        try {
            // Cria um arquivo
            boolean isCreated = file.createNewFile();
            System.out.println("is created " + isCreated);

            // o path do arquivo
            System.out.println("path " + file.getPath());

            // o caminho absoluto do arquivo
            System.out.println("path absolute " + file.getAbsolutePath());

            // se é  um diretório
            boolean isDirectory = file.isDirectory();
            System.out.println("is directory " + isDirectory);

            // se  é  um arquivo
            boolean isFile = file.isFile();
            System.out.println("is file " + isFile);

            // se o arquivo  é  oculto
            boolean isHidden = file.isHidden();
            System.out.println("ius hidden " + isHidden);

            // data da última  modificacao

            // long milisegundos desde 1970
//            long lastModified = file.lastModified();

            // data  com date.util
//            Date lastModified = new Date(file.lastModified());

            // instant ultima  modificacao
//            Instant lastModified = Instant.ofEpochMilli(file.lastModified());

            // zone id  ultima  modificacao
//            ZonedDateTime lastModified =

            // LocalDate ultima modificacao
            LocalDate lastModified = Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate();

            System.out.println("Last modified " + lastModified);

            // verifica se existe
            boolean exists = file.exists();
            if (exists) {
                // Deleta arquivo
                boolean deleted = file.delete();
                System.out.println("is delete " + deleted);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
