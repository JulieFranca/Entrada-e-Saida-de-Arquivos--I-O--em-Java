package br.com.dio;

import java.io.*;

public class exIOObject {

    public static void serealizacao() throws IOException {

        Gato gato = new Gato("simba",6,"amarelado", true,false);

        File f = new File("gato");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));

        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\" criado com sucesso! com tamanho '%d' bytes" ,f.getName(), f.length());

        oos.close();
        ps.close();

    }
    public static void desserializacao(String arquivo) throws IOException, ClassNotFoundException {


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));

        Gato objetoGato = (Gato) ois.readObject();

        System.out.printf("\nNome: %s", objetoGato.getNome());
        System.out.printf("\nIdade: %d", objetoGato.getIdade());
        System.out.printf("\nCor: %s", objetoGato.getCor());
        System.out.printf("\nCastrado: %s", objetoGato.isCastrado());
        System.out.printf("\nRonrona: %s", objetoGato.isRonrona());
        System.out.println("\n"+objetoGato);

        ois.close();

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serealizacao();
        desserializacao("C:\\Users\\kaqui\\IdeaProjects\\Dio-Entrada-e-saida-de-dados\\Gato");
    }
}
