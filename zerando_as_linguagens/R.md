# R

R é uma linguagem de programação popular usada para computação estatística e apresentação gráfica. Seu uso mais comum é analisar e visualizar dados.

# Por que usar R?

- É um ótimo recurso para análise de dados, visualização de dados, ciência de dados e aprendizado de máquina
- Ele fornece muitas técnicas estatísticas (como testes estatísticos, classificação, agrupamento e redução de dados)
- É fácil desenhar gráficos em R, como gráficos de pizza, histogramas, box plot, scatter plot, etc++
- Funciona em diferentes plataformas (Windows, Mac, Linux)
- É de código aberto e gratuito
- Tem um grande apoio da comunidade
- Possui muitos pacotes (bibliotecas de funções) que podem ser usados para resolver diferentes problemas

# Como instalar R

Para instalar o R, acesse https://cloud.r-project.org/ e baixe a versão mais recente do R para Windows, Mac ou Linux.

Depois de baixar e instalar o R, você pode executar o R em seu computador.

## Sintexe

Para produzir texto em R, use aspas simples ou duplas:

```r
"Hello World!”

Resultado:
[1] "Hello World!"
```

Para gerar números, basta digitar o número (sem aspas):

```r
5
10

Resultado:
[1] 5
[2] 10
```

Para fazer cálculos simples, some os números:

```r
5 + 2

Resultado:
[1] 7
```

# Imprimir

Ao contrário de muitas outras linguagens de programação, você pode gerar código em R sem usar uma função de impressão:

No entanto, R tem uma função `print()` disponível se você quiser usá-la.

```r
print("Hello, World!")

Resultado:
[1] "Hello World!"
```

E há momentos em que você deve usar a `print()`função para gerar código, por exemplo, ao trabalhar com [`for`](https://www.w3schools.com/r/r_for_loop.asp) loops (sobre os quais você aprenderá mais em um capítulo posterior):

```r
for (x in 1:10){
		print(x)
		}
```

**Conclusão:** É possível utilizar a função normalmente. Quando seu código estiver dentro de uma expressão R (por exemplo, dentro de chaves `{}`como no exemplo acima), use a função `print()` para gerar o resultado.

Os comentários podem ser usados para explicar o código R e torná-lo mais legível. Ele também pode ser usado para impedir a execução ao testar código alternativo.

Os comentários começam com um `#`. Ao executar o código, o R ignorará qualquer coisa que comece com `#`.

Este exemplo usa um comentário antes de uma linha de código:

```r
# Isso é um comentário
"Hello World!"
"Veja outro exemplo" # Outra maneira de adicionar comentário
```

# Comentários de várias linhas

Ao contrário de outras linguagens de programação, como Java , não há sintaxe em R para comentários de várias linhas. No entanto, podemos apenas inserir um `#`para cada linha para criar comentários de várias linhas.

```r
# Dessa
# maneira
# aqui
```

# Criando Variáveis em R

Variáveis são contêineres para armazenar valores de dados.

R não tem um comando para declarar uma variável. Uma variável é criada no momento em que você atribui um valor a ela. Para atribuir um valor a uma variável, use o `<-` sinal. Para imprimir (ou imprimir) o valor da variável, basta digitar o nome da variável:

```r
name <- "John"
age <- 40

name   # output "John"
age    # output 40
```

Do exemplo acima, `name`e `age`são **variáveis** , enquanto `"John"`e `40`são **valores**.

Em outras linguagens de programação, é comum usar `=`como operador de atribuição. Em R, podemos usar ambos `=`e `<-`como operadores de atribuição.

No entanto, `<-`é preferido na maioria dos casos porque o `=`operador pode ser proibido em algum contexto em R.

# Variáveis de impressão/saída

Comparado com muitas outras linguagens de programação, você não precisa usar uma função para imprimir/exibir variáveis em R. Você pode simplesmente digitar o nome da variável:

```r
name <- "John"
name # realiza a impressão, podemos usar print(name)
```

## Tipos de dados

Na programação, o tipo de dados é um conceito importante.

Variáveis podem armazenar dados de diferentes tipos, e diferentes tipos podem fazer coisas diferentes.

Em R, as variáveis não precisam ser declaradas com nenhum tipo específico e podem até mudar de tipo depois de definidas:

```r
my_var <- 30      # my_var is type of **numeric**
my_var <- "Sally" # my_var is now of type **character** (aka string)
```

R tem uma variedade de tipos de dados e classes de objetos. Você aprenderá muito mais sobre isso à medida que continuar conhecendo R.

# Tipos de dados básicos

Os tipos de dados básicos em R podem ser divididos nos seguintes tipos:

- **numérico:** (10,5, 55, 787)
- **inteiro:** (1L, 55L, 100L, onde a letra "L" declara isso como um número inteiro)
- **complexo:** (9 + 3i, onde "i" é a parte imaginária)
- **caractere/string:** (também conhecido como string) - ("k", "R é emocionante", "FALSE", "11.5")
- **logico/booleano:** (também conhecido como booleano) - (VERDADEIRO ou FALSO)

Podemos usar a função `class()` para verificar o tipo de dados de uma variável:

```r
# numerico
x <- 10.5
class(x)

# inteiro
x <- 1000L
class(x)

# complexo
x <- 9i + 3
class(x)

# caractere/string
x <- "R is exciting"
class(x)

# logico/booleano
x <- TRUE
class(x)
```

### Números

Existem três tipos de números em R:

- **numérico**
- **inteiro**
- **complexo**

Variáveis de tipos numéricos são criadas quando você atribui um valor a elas:

```r
x <- 10.5   # numerico
y <- 10L    # inteiro
z <- 1i     # complexO
```

# Numérico

Um tip**o** **numérico** de dados é o tipo mais comum em R e contém qualquer número com ou sem decimal, como: 10,5, 55, 787:

```r
x <- 10.5
y <- 55
# Imprime os valores de x e y
x
y
# Imprime a classe de x e y
class(x)
class(y)
```

# Inteiro

Os inteiros são dados numéricos sem decimais. Isso é usado quando você tem certeza de que nunca criará uma variável que deve conter decimais. Para criar uma variável inteira, você deve usar a letra `L` após o valor inteiro:

```r
x <- 1000L
y <- 55L
# Imprime os valores de x e y
x
y
# Imprime a classe de x e y
class(x)
class(y)
```

# Complexo

Um `complex`número é escrito com um " `i`" como parte imaginária:

x <- 3+5i

y <- 5i

# Print values of x and y

x

y

# Print the class name of x and y

class(x)

class(y)

# Conversão de tipo

Você pode converter de um tipo para outro com as seguintes funções:

- **as.numeric()**
- **as.integer()**
- **as.complex()**

```r
x <- 1L # inteiro
y <- 2 # numerico
# Converte de inteiro para numerico:
a <- as.numeric(x)
# Converte de numerico para inteiro
b <- as.integer(y)
# Imprime os valores de x e y
x
y
# Imprime a classe de x e y
class(a)
class(b)
```