package br.com.dio;

import java.io.*;

public class dio_recomendar_3_livros_salvar_txt {

    public static void copiarArquivo() throws IOException {

        File f = new File("C:\\Users\\kaqui\\IdeaProjects\\Dio-Entrada-e-saida-de-dados\\recomendacoes.txt");
        String nameArquivo = f.getName();

        BufferedReader br = new BufferedReader(new FileReader(nameArquivo));

        String nameArquivoCopy = nameArquivo.substring(0,nameArquivo.indexOf(".")).concat("-copy.txt");

        File fcopy = new File(nameArquivoCopy);
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));


        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        }while (!(line == null));

        System.out.printf("Arquivo \"%s\" copiado com sucesso! com o tamanho: '%d' bytes" ,f.getName(), f.length());
        System.out.printf("Arquivo \"%s\" criado com sucesso! com tamanho '%d' bytes" ,fcopy.getName(), fcopy.length());


        PrintWriter pw = new PrintWriter(System.out);
        pw.println("\ndigite 3 Livros");
        pw.flush();

        adicionarInfoNoArquivo(fcopy.getName());
        pw.printf("ok, tudo certo. tamanho do arquivo %d bytes", fcopy.length());
        br.close();
        bw.close();
        pw.close();


    }
    public static void adicionarInfoNoArquivo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));
        //salva sem apagar informaçoes contidas no arquivo salvo

        //BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
        //salva por cima dos arquvos anteriores

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while (!(line.equalsIgnoreCase("fim")));

        br.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }

}
