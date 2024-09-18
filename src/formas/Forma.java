package formas;

import renderizadores.Renderizador;

public abstract class Forma {

    protected Renderizador renderizador;
    protected String cor;

    public Forma(Renderizador renderizador) {
        this.renderizador = renderizador;
    }

    public abstract void renderizarForma();

    public void setCor(String cor) {
        this.cor = cor;
    };
}
