package funcoes.iphone;

import funcoes.AparelhoTelefonico;
import funcoes.NavegadorInternet;
import funcoes.ReprodutorMusical;

public interface iphone {

    public static void main(String[] args) {

        AparelhoTelefonico at = new AparelhoTelefonico();
    at.ligar("+55 31 99920-2322");
    at.atender();
    at.iniciarCorreioVoz();


        ReprodutorMusical rt = new ReprodutorMusical();

    rt.selecionarMusica("CHIRIRO - Bilie Eilsh");
    rt.tocar();
    rt.pausar();

        NavegadorInternet ni = new NavegadorInternet();

    ni.exibirPagina(null);
    ni.adicionarNovaAba();
    ni.atualizarPagina();
    

}

}
