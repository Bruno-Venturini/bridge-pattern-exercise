package formas;

import renderizadores.Renderizador;

public class Circulo extends Forma {

    public Circulo(Renderizador renderizador) {
        super(renderizador);
    }

    @Override
    public void renderizarForma() {
        this.renderizador.rederizarForma("Circulo", this.cor);
    }
}
