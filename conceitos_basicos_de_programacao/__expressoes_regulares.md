# Expressões regulares

### Introdução ao tema

Uma expressão regular é um método formal de se especificar um padrão de texto. Mais detalhadamente, é uma composição de símbolos, caracteres com funções especiais, que, agrupados entre si e com caracteres literais, formam uma sequência, uma expressão. Essa expressão é interpretada como uma regra que indicará sucesso se uma entrada de dados qualquer casar com essa regra, ou seja, obedecer exatamente a todas as suas condições.

Podemos atribuir o início de sua história em 1943, mas o encontro com o computador só acorreu em 1968, em um algoritmo de busca utilizado no editor de textos <i>qed</i>, que depois virou o <i>ed</i>, editor padrão dos primeiros sistemas Unix. Este <i>ed</i> tinha o comando de contexto <i>g</i>, que aceitava expressões regulares e um comando <i>p</i>. Sua sintaxe ficava g/RE/p (“Global Regular Expression Print”), que deu origem ao
aplicativo <i>grep</i>, que por sua vez originou o <i>egrep</i>. Você pode encontrar um pouco sobre a história das expressões regulares ao final do documento.

<div style="display: flex; gap: 10px; align-items: flex-start;">

  <figure style="text-align: center;">
    <img src="./images/WarrenAndWalter.png" alt="Warren e Walter" width="300">
    <figcaption>Walter Pitts e Warren McCulloch</figcaption>
  </figure>

  <figure style="text-align: center;">
    <img src="./images/StephenKleene.png" alt="Outra imagem" width="300">
    <figcaption>Stephen Kleene</figcaption>
  </figure>

</div>

### Os metacaracteres

As expressões são formadas por símbolos e caracteres literais. Esses símbolos são chamados de
<b>metacaracteres</b>, pois possuem funções especiais. <br>
Os metacaractetes-padrão são: ```. ? * + ^ $ | [ ] { } ( ) \ ```<br>
Cada símbolo desse tem sua função específica, que pode mudar dependendo do contexto no qual está inserido e podemos agregá-los uns com os outros, combinando suas funções e fazendo
construções mais complexas. Além destes, temos outros metacaracteres estendidos que foram criados posteriormente, pois tarefas mais complexas requisitavam funções mais específicas ainda. Um detalhe importante é sua sintaxe de utilização não é a mesma para todos os programas que suportam expressões regulares, ou seja, a forma como você escreve e usa expressões regulares pode variar dependendo da linguagem ou ferramenta que está utilizando.<br>

Abaixo temos uma lista dos nomes:

| Metacaractere | Nome          |
|---------------|---------------|
| .             | Ponto         |
| [ ]           | Lista         |
| [^ ]          | Lista negada  | 
| ?             | Opcional      |
| *             | Asterisco     |
| +             | Mais          |
| { }           | Chaves        |
| ^             | Circunflexo   |
| $             | Cifrão        |
| \b            | Borda         |
| \             | Escape        |
| \|            | Ou            |
| ( )           | Grupo         |
| \1            | Retrovisor    |

Alé disso, eles estão divididos em quatro grupos distintos, de acordo com características
comuns entre eles, conforme as tabelas abaixo:

<details>
<summary><b>Representantes</b></summary>

| Metacaractere | Nome          | Descrição                      |
|---------------|---------------|--------------------------------|
| .             | Ponto         | Um caractere qualquer          |
| [...]         | Lista         | Lista de caracteres permitidos |
| [^...]        | Lista negada  | Lista de caracteres proibidos  |
</details>

---

<details>
<summary><b>Quantificadores</b></summary>

| Metacaractere | Nome          | Descrição        |
|---------------|---------------|------------------|
| ?             | Opcional      | Zero ou um       |
| *             | Asterisco     | Zero, um ou mais |
| +             | Mais          | Um ou mais       |
| {n , m}       | Chaves        | De n até m       |
</details>

---


<details>
<summary><b>Âncoras</b></summary>

| Metacaractere | Nome          | Descrição                |
|---------------|---------------|--------------------------|
| ^             | Circunflexo   | Início da linha          |
| $             | Cifrão        | Fim da linha             |
| \b            | Borda         | Início ou fim de palavra |
</details>

---

<details>
<summary><b>Outros</b></summary>

| Metacaractere | Nome          | Descrição                     |
|---------------|---------------|-------------------------------|
| \c            | Escape        | Torna literal o caracter c    |
| |             | Ou            | Ou um ou outro                |
| (...)         | Grupo         | Delimita um grupo             |
| \1...\9       | Retrovisor    | Texto casado nos grupos 1...9 |
</details>

---


### História
<details>
<summary>Warren And Walter</summary>
Walter Pitts e Warren McCulloch, juntos, eles publicaram, em 1943, o artigo "A Logical Calculus of the Ideas Immanent in Nervous Activity", que é considerado o nascimento da neurocomputação.

Contribuições principais:
1. Criação do primeiro modelo matemático de um neurônio
2. Demonstração que redes de neurônios artificiais podem simular qualquer função lógica
3. Fizeram parte da base para Redes Neurais e IA

O artigo deles é uma das sementes do que viria a ser Inteligência Artificial, Redes Neurais Artificiais, Computação simbólica, Linguagens formais.

Sua ideia sobre como redes podem reconhecer padrões influenciou diretamente os estudos de autômatos finitos, linguagens regulares e, claro, expressões regulares — que seriam formalizadas por Kleene um pouco depois.
</details>

<details>
<summary>Sthephen Kleene</summary>
Stephen Cole Kleene foi um matemático e lógico americano e um dos principais nomes da teoria da computação. Na década de 1950, formalizou uma forma de descrever padrões de strings em linguagens — que ele chamou de <i>regular sets</i>.
Ele definiu uma notação matemática para representar essas linguagens, o que hoje chamamos de expressões regulares. 

As operações básicas criadas:
  - Concatenação (ab): sequência de símbolos.
  - Alternância (a|b): escolha entre símbolos.
  - Fecho de Kleene (a*): repetição zero ou mais vezes.

O alicerce matemático para os autômatos finitos (máquinas teóricas que leem e interpretam padrões) . Essa relação foi comprovada no famoso Teorema de Kleene, que mostra que as linguagens descritas por expressões regulares são exatamente as linguagens que podem ser reconhecidas por autômatos finitos determinísticos (DFA). Compiladores entendem sintaxe com base em autômatos. Editores de texto, navegadores, bancos de dados e até inteligência artificial usam expressões regulares para lidar com padrões em texto.
</details>
