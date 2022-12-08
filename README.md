<h1 align="center">
  <p align="center">POKEDEX</p>
</h1>

## Elaborei uma pokedex simples, o intuito era treinar o consumo de uma API pública, e manipular seus dados.
- ``Utilizei a api pública e gratuita do https://pokeapi.co/``

![pokeapi](https://user-images.githubusercontent.com/104053775/206584469-3120f3ac-fd45-45d1-b768-aca2cf9b1c92.png)

- ``Utilizei para fazer esse consumo o próprio Spring-Framework``
- ``A classe responsável pelas requisições HTTP para uma outra API, é a **RestTemplate**``
- ``É preciso criar um @Bean para o RestTemplate, para que o Spring consiga injetá-lo``

![rest](https://user-images.githubusercontent.com/104053775/206585387-be108235-b1bd-44d4-8d89-825102aa13ad.png)

- ``Feito isso, vamos criar a Classe Pokemon, que vai de fato representar um objeto consumido da API``
- ``Decidi não colocar todos os atributos e features, apenas o nome, peso, altura e uma foto``
- ``Se você ver a API, os Sprites, são imagens que o pokemon pode ter``

![pokemonclass](https://user-images.githubusercontent.com/104053775/206585657-e9f73789-c7f5-4f63-b4c4-f1d5f9c00291.png)

- ``Feita a classe de modelo, vamos criar um Controller, para que ele possa direcionar o endpoint com o resultado que queremos``
- ``Coloquei um endpoint com o método GET para /pokemon/{id}``
- ``É **estritamente necessário passar o ID**, se o ID não for fornecido receberam um 404 ou Not Found.``

![controller](https://user-images.githubusercontent.com/104053775/206586110-1ce85d46-7ad7-4660-9bb6-c307c6bac7d6.png)

- ``O método **getJsonAndSetPokemon()** eu criei numa classe auxiliar, um @Service, somente para essa lógica não ficar dentro do controller.``
- ``Esse método é responsável por extrair os objetos do JSON e transformá-los em objetos JAVA``
- ``O spring ja implementa por padrão a biblioteca do Jackson, resposável por esse parse``

![service](https://user-images.githubusercontent.com/104053775/206586448-3ac55a8c-d3c5-4333-8ea2-3910e8ba6c2f.png)

- ``Feito o parse para objetos JAVA, basta enviá-los para uma página HTML``
- ``E manipular os dados da maneiras que quiser``
- ``A engine usada foi o Thymeleaf (Não esqueça de adicionar a dependêcia necessária)``

![html](https://user-images.githubusercontent.com/104053775/206586689-233d978d-6eed-4ac5-a9ef-628a4b40b41b.png)

- ``O resultado de localhost:8080/pokemon/25 é esse abaixo:``

![pikachu](https://user-images.githubusercontent.com/104053775/206586719-fbf74796-9e07-4c96-a36b-eda2a5429542.png)



