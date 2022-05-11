package com.testingdocs;

public class Teste {
    public static void teste_sucesso(String palavra_chutada, String palavra_correta) {
        if (teste_tamanho_errado(palavra_chutada, palavra_correta)) {
            System.out.println("Tamanho correto");
            String formated = format_output(palavra_chutada, palavra_correta);
            System.out.println(formated);
        } else {
            System.out.println("Tamanho errado");
        }
    }
    public static boolean teste_tamanho_errado(String palavra_chutada, String palavra_correta) {
        if (palavra_chutada.length() != palavra_correta.length()) {
            return false;
        } else {
            return true;
        }
    }

    public static String format_output(String palavra_chutada, String palavra_correta) {
        String resultado = "";
        for (int i = 0; i < palavra_chutada.length(); i++) {
            if (palavra_chutada.charAt(i) == palavra_correta.charAt(i)) {
                resultado = resultado.concat("C");
            } else if (palavra_correta.contains(String.valueOf(palavra_chutada.charAt(i)))) {
                resultado = resultado.concat("E");
            } else {
                resultado = resultado.concat("X");
            }
        }
        return resultado;
    }
}
