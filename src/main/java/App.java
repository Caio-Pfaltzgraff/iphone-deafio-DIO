import com.apple.Aba;
import com.apple.Chamada;
import com.apple.Iphone;
import com.apple.Musica;

public class App {
    public static void main(String[] args) {
        Iphone myIphone = new Iphone();

        myIphone.ligar();
        myIphone.atenderChamada();
        myIphone.tocarMusica();

        Musica musica = new Musica("blind", "korn", 180);
        myIphone.selecionarMusica(musica);
        myIphone.tocarMusica();

        Aba aba = new Aba("https://web.dio.me/", "Curso");
        myIphone.adicionarNovaAba(aba);
        myIphone.exibirPagina(aba.getUrl());
        myIphone.atualizarPagina(aba);

        Chamada chamada = new Chamada("123456789", 60);
        myIphone.atenderChamada();
        myIphone.iniciarCorreioVoz();

        System.out.println("Chamada atendida de: " + chamada.getNumero());
        System.out.println("Duração da chamada: " + chamada.getDuracao() + " segundos");


        myIphone.desligar();
    }
}
