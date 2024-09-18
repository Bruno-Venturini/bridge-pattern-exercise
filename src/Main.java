import formas.Forma;
import formas.Quadrado;
import renderizadores.Renderizador2D;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Forma forma = new Quadrado(new Renderizador2D());

        forma.setCor("Azul");
        forma.renderizarForma();
    }
}