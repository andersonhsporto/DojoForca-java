package com.testingdocs;
import static com.testingdocs.Teste.teste_sucesso;

// Se o tamanho não bate "Tamanho errado"
// Se a letra está no lugar certo C
// Se a letra está no lugar errado E
// Se a letra não existe na palavra X

// Anderson | Raoni
// Raoni | Victor
// Victor | Gustavo
// Gustavo | Anderson
// Anderson | Hugo

public class DojoForca {
    public static void main(String[] args) {
        String palavra_chutada = "Gaty";
        String palavra_correta = "Pato";
        teste_sucesso(palavra_chutada, palavra_correta);
        teste_sucesso("Abelha", "Mosca");
        teste_sucesso("UEPA", "UOPA");
    }
}
