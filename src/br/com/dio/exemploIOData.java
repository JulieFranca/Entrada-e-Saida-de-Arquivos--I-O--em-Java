package br.com.dio;

import java.io.*;
import java.util.Scanner;

public class exemploIOData {

    public static void incluirProduto() throws IOException {

        File f = new File("C:\\Users\\kaqui\\OneDrive\\Documentos\\peca-de-roupa.bin");

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));

        Scanner scan = new Scanner(System.in);

        ps.print("nome da peca: ");
        String nome = scan.nextLine();
        dos.writeUTF(nome);

        ps.print("Tamanho da peça \n( P | M | G | U ): ");
        char tamanho = (char) System.in.read();
        dos.writeChar(tamanho);

        ps.print("Quantidade: ");
        int quantidade = scan.nextInt();
        dos.writeInt(quantidade);

        ps.print("Preço: ");
        double preco = scan.nextDouble();
        dos.writeDouble(preco);

        lerProduto(f.getPath());

        dos.close();
        scan.close();


    }
    public static void lerProduto(String arquivo) throws IOException {

        File f = new File(arquivo);

        DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));

        String nome= dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt();
        double preco = dis.readDouble();

        System.out.printf("\nNome: %s", nome);
        System.out.printf("\nTamanho: %c", tamanho);
        System.out.printf("\nQuantidade: %s", quantidade);
        System.out.printf("\nPreço: %.2f", preco);
        System.out.print("\nTotal de valor das peças R$:  " + (quantidade * preco));

        dis.close();
    }

    public static void main(String[] args) throws IOException {
        incluirProduto();
    }
}
