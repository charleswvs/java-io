package br.com.alura.java.io;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter
{
    public static void main(String[] args) throws IOException {
        //Fluxo de Entrada com Arquivo
        //OutputStream fos = new FileOutputStream("lorem2.txt");
        //Writer osw = new OutputStreamWriter(fos);
        //BufferedWriter bw = new BufferedWriter(osw);
        //FileWriter fw = new FileWriter("lorem2.txt");

        //BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        //PrintStream ps = new PrintStream("lorem2.txt");

        PrintWriter ps = new PrintWriter("lorem2.txt");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println("asfasdfsafdas dfs sdf asf assdß porta");

        ps.close();
    }
}
