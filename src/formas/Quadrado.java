package formas;

import renderizadores.Renderizador;

public class Quadrado extends Forma {

    public Quadrado(Renderizador renderizador) {
        super(renderizador);
    }

    @Override
    public void renderizarForma() {
        this.renderizador.rederizarForma("Quadrado", this.cor);
    }
}
