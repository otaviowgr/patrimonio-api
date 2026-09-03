package br.com.senai.patrimonio.avaliacao;

import br.com.senai.patrimonio.avaliacao.interfaces.Notificacao;

public class Email implements Notificacao {
    @Override
    public void enviar() {
        System.out.println("Enviando e-mail...");
    }
}
