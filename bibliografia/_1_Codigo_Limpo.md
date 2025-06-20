# Resumo


# Código Limpo

O primeiro capítulo já começa lançando a braba: Nunca vamos nos livrar de código, pois eles representam os detalhes dos requisitos, o fato de não conseguirmos ignorar esses detalhes em algum nível, faz necessário especificarmos e a especificação de requisitos de modo que o computador entenda é programar.

O resto do primeiro capítulo é uma prova de A + B que fazer código sem pensar para entregar rápido só cria atrasos futuros. Tem várias definições do que é código limpo, mas na prática o que serve é a aplicação dos conceitos ensinados ao longo do livro.

<b>DETALHE IMPORTANTÍSSIMO:</b> O infeliz do autor usa Java como base de exemplo... Adivinha? Tive que aprender o básico de Java para compreender tudo. Faça o mesmo, caso contrário você irá observar somente a redução de texto dentro de funções e criação de funções menores. (quase que o principal conceito do código limpo haha)

# Nomes significativos

A função <code>getThem()</code> não tem um método <code>main</code> porque ela é apenas parte de uma classe maior. O objetivo dela é filtrar uma lista de arrays de inteiros (TheList), retornando somente os arrays cujo primeiro elemento é 4.

```java
public List<int[]> getThem() {
    List<int[]> = list1 = new ArrayList<int[]>();
    for (int[] x : TheList)
        if(x[0] == 4)
            list1.add(x);
    return list1;
}
```
Se TheList contém:

```java
[
  [4, 10, 20],
  [1, 5],
  [4, 30, 40],
  [2]
]
```

Após executar <code>getThem()</code>, o retorno será:

```java
[
  [4, 10, 20],
  [4, 30, 40]
]
```
