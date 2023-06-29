package br.com.ian.minhasmusicas.Principal;

import br.com.ian.minhasmusicas.Modelos.MinhasPreferidas;
import br.com.ian.minhasmusicas.Modelos.Musica;
import br.com.ian.minhasmusicas.Modelos.PodCast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        PodCast podCast = new PodCast();
        podCast.setTitulo("BolhaDev");
        podCast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            podCast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
           podCast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podCast);
        preferidas.inclui(minhaMusica);
    }
}
