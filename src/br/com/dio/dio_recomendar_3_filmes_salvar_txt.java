package br.com.dio;

import java.io.*;
import java.util.Scanner;

public class dio_recomendar_3_filmes_salvar_txt {

    public static void lerTecladoEscreverDocumento() throws IOException {

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("digite 3 filmes");
        pw.flush();

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        File f = new File("recomendacoes.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do {

            bw.write(line);
            bw.newLine();
            bw.flush();
            line = scan.nextLine();

        }while (!(line .equalsIgnoreCase("fim")));

        pw.printf("Arquivo criado com sucessso", f.getName());
        pw.close();
        scan.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {

        lerTecladoEscreverDocumento();

    }
}
