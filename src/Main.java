import formas.Circulo;
import formas.Forma;
import formas.Quadrado;
import renderizadores.Renderizador2D;
import renderizadores.Renderizador3D;

public class Main {
    public static void main(String[] args) {

        Forma forma = new Quadrado(new Renderizador2D());

        forma.setCor("Azul");
        forma.renderizarForma();

        forma = new Quadrado(new Renderizador3D());

        forma.setCor("Vermelho");
        forma.renderizarForma();

        forma = new Circulo(new Renderizador2D());

        forma.setCor("Azul");
        forma.renderizarForma();

        forma = new Circulo(new Renderizador3D());

        forma.setCor("Vermelho");
        forma.renderizarForma();
    }
}