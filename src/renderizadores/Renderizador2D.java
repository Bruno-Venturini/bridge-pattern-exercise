package renderizadores;

public class Renderizador2D implements  Renderizador {

    @Override
    public void rederizarForma(String formato, String cor) {
        System.out.println("Renderizado um " + formato + " em 2D");
        System.out.println("Cor: " + cor);
        System.out.println("------------------------------");
    }
}
