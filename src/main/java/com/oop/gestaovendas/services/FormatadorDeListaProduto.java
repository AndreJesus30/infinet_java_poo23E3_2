package com.oop.gestaovendas.services;
import java.io.*;

public class FormatadorDeListaProduto {

    public static void formatadorDelistaProdutos (String pathInput, String pathOutput) {

        String listaProdutosArquivo = pathInput;
        String listaProdutosFormatado = pathOutput;

        try (
                BufferedReader br = new BufferedReader(new FileReader(listaProdutosArquivo));
                BufferedWriter bw = new BufferedWriter(new FileWriter(listaProdutosFormatado))
        ) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] colunas = linha.split(",");

                for (String coluna : colunas) {
                    System.out.print(coluna + " | ");
                }
                System.out.println();
                bw.write(String.join(" | ", colunas));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
