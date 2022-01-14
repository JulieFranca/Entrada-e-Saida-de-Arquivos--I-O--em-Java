package br.com.dio;

import java.io.*;

public class dio_fluxo_bytes {
    public static void copiaArquivo() throws IOException {
        File f = new File("C:\\Users\\kaqui\\IdeaProjects\\Dio-Entrada-e-saida-de-dados\\recomendacoes-copy.txt");
        String nomeArquivo = f.getName();

        InputStream is = new FileInputStream(f.getName());
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f.getName()));

        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat("-copy2.txt");
        File fcopy  = new File(nomeArquivoCopy);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivoCopy));

        int line = 0;
        while (( line = bis.read()) != -1){
            bos.write((char)line);
            bos.flush();
        }
        bis.close();
        bos.close();

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\" copiado com sucesso! esta no diretorio %s com o tamanho: '%d' bytes" ,fcopy.getName(),fcopy.getPath(), fcopy.length());

    }

    public static void main(String[] args) throws IOException {
        copiaArquivo();
    }
}
