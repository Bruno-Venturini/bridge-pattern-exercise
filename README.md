# Padrão Bridge

O padrão Bridge é um padrão estrutural que tem como objetivo desacoplar uma abstração da sua implementação, permitindo que ambas possam evoluir de forma independente. Este padrão é particularmente útil quando você deseja evitar a criação de uma quantidade excessiva de classes, que podem surgir da combinação de múltiplas implementações de abstrações.

## Problema

Considere um sistema que envolve diferentes formas geométricas (como `Círculo` e `Quadrado`) e diferentes tipos de renderizadores (como `RenderizadorSVG` e `RenderizadorRaster`). Sem o padrão Bridge, você acabaria criando uma classe para cada combinação de forma e renderizador, resultando em um número exponencial de classes, como:

- `CírculoRenderizador2D`
- `CírculoRenderizador3D`
- `QuadradoRenderizador2D`
- `QuadradoRenderizador3D`

Esse aumento no número de classes torna o código mais difícil de manter e entender.

## Solução

O padrão Bridge permite a separação das abstrações e suas implementações. Podemos definir uma interface para as formas e outra para os renderizadores. Assim, as formas podem ser associadas a qualquer renderizador sem a necessidade de criar novas classes para cada combinação.

### Estrutura do Código

1. **Interface de Renderizador**: Define métodos que todos os renderizadores devem implementar.
2. **Classes Concretas de Renderizador**: Implementações específicas de renderizadores (por exemplo, `Renderizador2D` e `Renderizador3D`).
3. **Interface de Forma**: Define métodos para as formas.
4. **Classes Concretas de Forma**: Implementações específicas de formas (por exemplo, `Círculo` e `Quadrado`).
