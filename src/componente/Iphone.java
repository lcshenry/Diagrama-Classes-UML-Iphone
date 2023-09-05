package componente;

import componente.comportamentos.Aparelho;
import componente.comportamentos.Navegador;
import componente.comportamentos.Reprodutor;

public class Iphone implements Aparelho, Navegador, Reprodutor{
    @Override
    public void ligar() {
        System.out.println("Fazendo ligação...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página web...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }
}
