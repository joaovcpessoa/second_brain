# Kotlin

### Quando que inventei de aprender isso?

Acho que foi quando eu era estagiário e surgiu um projeto para fazer um APP.
A introdução disso passa pelo Android Studio. Foi algo tão ruim que eu nem registrei o aprendizado...

### Sintaxe

No capítulo anterior, criamos um arquivo Kotlin chamado `Main.kt`, e usamos o seguinte código para imprimir "Hello World" na tela:

### Exemplo explicado

```kotlin
fun main() {
  println("Hello World")
}
```

A palavra-chave `fun` é usada para declarar uma função. Uma função é um bloco de código projetado para executar uma tarefa específica.

No exemplo acima, ele declara a função `main()`, que é algo que você verá em todos os programas Kotlin. Esta função é usada para **executar** o código. Qualquer código dentro das chaves da função será **executado.**

Por exemplo, a função `println()` está dentro, o que significa que ela será executada. 

A `println()`função é usada para produzir/imprimir texto e, em nosso exemplo, produzirá "Hello World".

**Observação:** em Kotlin, as instruções de código não precisam terminar com um ponto e vírgula ( `;`) (que geralmente é necessário para outras linguagens de programação, como Java , C++ , C# , etc.).

# Println() e Print

A `println()`função é usada para saída de valores/texto de impressão, além de textos, você também pode imprimir números e realizar cálculos matemáticos:

```kotlin
fun main() {
  println("Salve!")
  println("Você está aprendendo a programar em Kotlin.")
  println("Por enquanto está fácil...Mais fácil que isso só somar 1 + 1")
  println(1 + 1)
}
```

Há também uma função `print()`, que é semelhante a `println()`. A única diferença é que ele não insere uma nova linha no final da saída:

```kotlin
fun main() {
  print("É quase a outra só que diferente ")
  print("Observe que adicionamos um caractere de espaço para criar um espaço entre as frases. ")
  print("Devido ao fato dele não inserir uma nova linha hehe.")
}
```

# Comentários

Os comentários podem ser usados para explicar o código Kotlin e torná-lo mais legível. Ele também pode ser usado para impedir a execução ao testar código alternativo.

**Comentários de linha única**

Comentários de linha única começam com duas barras ( `//`). Qualquer texto entre `//`e o final da linha é ignorado pelo Kotlin (não será executado).

**Exemplo**

```kotlin
fun main()
		{
		// Isso é um comentário
		println("Este exemplo usa um comentário de linha única antes de uma linha de código") // Isso aqui também é um comentário
		}
```

Este exemplo usa um comentário de linha única antes do código e no final de uma linha de código.

**Comentários de várias linhas**

Comentários de várias linhas começam `/*`e terminam com `*/`. Qualquer texto entre `/*`e `*/`será ignorado pelo Kotlin.

**Exemplo**

```kotlin
/* Isso é 
um comentário de várias linhas
de várias linhas*/
println("Este exemplo usa um comentário de várias linhas (um bloco de comentários) para explicar o código")
```

### Variáveis e tipos de dados

# Variáveis Kotlin

Variáveis são contêineres para armazenar valores de dados. Para criar uma variável, use `var`ou `val`e atribua um valor a ela com o sinal de igual ( `=`):

Sintaxe: 

var variableName = value
val variableName =value

**Exemplo:**

```kotlin
var nome = "João"
val aniversario = 1975

println(nome)          // Imprime o valor do nome
println(aniversario)   // Imprime o valor do aniversário do infeliz

// Perceba que os números não ficam entre aspas.
```

A diferença entre `var`e `val`é que as variáveis declaradas com a palavra-chave `var` **podem ser alteradas/modificadas** , enquanto com a palavra-chave `val`as variáveis **não podem.**

# Tipo de variável

Ao contrário de muitas outras linguagens de programação, as variáveis em Kotlin não precisam ser declaradas com um *tipo* específico (como "String" para texto ou "Int" para números, se você estiver familiarizado com eles).

Para criar uma variável em Kotlin que deve armazenar texto e outra que deve armazenar um número, veja o exemplo a seguir:

Kotlin é inteligente o suficiente para entender que **"John"** é um `String`(texto) e que **1975** é uma `Int` variável (número).

No entanto, é possível especificar o tipo se você insistir:

```kotlin
var nome : String = "João"
val aniversario : Int = 1975

println(nome)
println(aniversario
```

Você também pode declarar uma variável sem atribuir o valor e atribuir o valor posteriormente. **No entanto** , isso só é possível quando você especifica o tipo:

# Tipos de dados Kotlin

Em Kotlin, o *tipo* de uma variável é decidido pelo seu valor:

```kotlin
val myNum = 5             // Int
val myDoubleNum = 5.99    // Double
val myLetter = 'D'        // Char
val myBoolean = true      // Boolean
val myText = "Olá"        // String
```

Às vezes você tem que especificar o tipo, e muitas vezes não. De qualquer forma, é bom saber o que os diferentes tipos representam.

Você aprenderá mais sobre **quando precisar** especificar o tipo posteriormente.

Os tipos de dados são divididos em diferentes grupos:

- Números
- Carácter
- Booleanos
- Strings
- Matrizes

### Números

Os tipos de números são divididos em dois grupos:

**Os tipos inteiros** armazenam números inteiros, positivos ou negativos, sem decimais. Os tipos válidos são `Byte`, `Short`, `Int` e `Long`

**Os tipos de ponto flutuante** representam números com uma parte fracionária, contendo um ou mais decimais. Existem dois tipos: `Float` e `Double`.

Se você não especificar o tipo de uma variável numérica, ela geralmente é retornada como `Int` para números inteiros e `Double` para números de ponto flutuante.

### Tipos inteiros

**Byte**

O tipo `Byte` de dados pode armazenar números inteiros de -128 a 127. Isso pode ser usado em vez de `Int`ou outros tipos inteiros para economizar memória quando você tiver certeza de que o valor estará entre -128 e 127:

```kotlin
val myNum: Byte = 100
println(myNum)
```

**Short**

O tipo `Short` de dados pode armazenar números inteiros de -32768 a 32767:

```kotlin
val myNum: Short = 5000
println(myNum)
```

**Int**

O tipo `Int` de dados pode armazenar números inteiros de -2147483648 a 2147483647:

```kotlin
val myNum: Int = 100000
println(myNum)
```

**Long**

O  tipo `Long` de dados pode armazenar números inteiros de -9223372036854775807 a 9223372036854775807. Isso é usado quando `Int`não é grande o suficiente para armazenar o valor. Opcionalmente, você pode terminar o valor com um "L":

```kotlin
val myNum: Long = 15000000000L
println(myNum)
```

A diferença entre int e long é definida da seguinte maneira:
Um número inteiro é um `Int`desde que seja até 2147483647. Se for além disso, é definido como `Long`:

```kotlin
val myNum1 = 2147483647  // Int
val myNum2 = 2147483648  // Long
```

### Tipos de ponto flutuante

Os tipos de ponto flutuante representam números com um decimal, como 9,99 ou 3,14515.

Os tipos de dados `Float`e `Double`podem armazenar números fracionários:

```kotlin
val myNum1: Float = 5.75F
val myNum2: Double = 19.99
println(myNum1)
println(myNum2)

// Observe também que você deve terminar o valor de um Floattipo com um "F".
```

<aside>
💡 Usar `Float`ou `Double`?

A **precisão** de um valor de ponto flutuante indica quantos dígitos o valor pode ter após o ponto decimal. A precisão de `Float`é de apenas seis ou sete dígitos decimais, enquanto em `Double`as variáveis têm uma precisão de cerca de 15 dígitos. Portanto, é mais seguro usar `Double`para a maioria dos cálculos.

</aside>

### Números científicos

Um número de ponto flutuante também pode ser um número científico com um "e" ou "E" para indicar a potência de 10:

```kotlin
val myNum1: Float = 35E3F
val myNum2: Double = 12E4
println(myNum1)
println(myNum2)
```

### Booleanos

O tipo`Boolean` de dados e só pode receber os valores `true`ou `false`:

```kotlin
val isKotlinFun: Boolean = true
val isFishTasty: Boolean = false
println(isKotlinFun)   // Saída true
println(isFishTasty)   // Saída false
```

Os valores booleanos são usados principalmente para testes condicionais, sobre os quais você aprenderá mais em um capítulo posterior.

### Char

O tipo `Char` de dados é usado para armazenar um **único** caractere. Um valor char deve estar entre aspas **simples , como 'A' ou 'c':**

```kotlin
val myLetra: Char = 'B'
println(myLetra)
```

Ao contrário do Java, você não pode usar valores ASCII para exibir determinados caracteres. O valor 66 geraria um "B" em Java, mas geraria um erro em Kotlin:

```kotlin
val myLetra: Char = 66
println(myLetra) // Error
```

O tipo `String` de dados é usado para armazenar uma sequência de caracteres (texto). Os valores de string devem estar entre aspas **duplas** :

```kotlin
val myText: String = "Hello World"
println(myText)
```

### Matrizes

Arrays são usados para armazenar vários valores em uma única variável, em vez de declarar variáveis separadas para cada valor.

# Conversão de tipo

A conversão de tipo é quando você converte o valor de um tipo de dados para outro tipo.

Em Kotlin, a conversão de tipo numérico é diferente de Java. Por exemplo, não é possível converter um tipo `Int` em um tipo `Long` com o seguinte código:

```kotlin
val x: Int = 5
val y: Long = x
println(y) // Error: Type mismatch
```

Para converter um tipo de dados numérico para outro tipo, você deve usar uma das seguintes funções: 

`toByte()`, `toShort()`, `toInt()`, `toLong()`, ou `toFloat()`:`toDouble()toChar()`

```kotlin
val x: Int = 5
val y: Long = x.toLong()
println(y)
```

### Operadores

Os operadores são usados para realizar operações em variáveis e valores.

O valor é chamado de operando, enquanto a operação (a ser realizada entre os dois operandos) é definida por um **operador** :

| Operando | Operador | Operando |
| --- | --- | --- |
| 100 | + | 50 |

Embora o `+`operador seja frequentemente usado para somar dois valores, ele também pode ser usado para somar uma variável e um valor, ou uma variável e uma variável:

```kotlin
var sum1 = 100 + 50       // 150 (100 + 50)
var sum2 = sum1 + 250     // 400 (150 + 250)
var sum3 = sum2 + sum2    // 800 (400 + 400)
```

Kotlin divide os operadores nos seguintes grupos:

- Operadores aritméticos
- Operadores de atribuição
- Operadores de comparação
- Operadores lógicos

### Operadores aritméticos

Operadores aritméticos são usados para realizar operações matemáticas comuns.

| Operador | Nome | Descrição | Exemplo |
| --- | --- | --- | --- |
| + | Adição | Soma dois valores | x + y |
| - | Subtração | Subtrai um valor de outro | x - y |
| * | Multiplicação | Multiplica dois valores | x * y |
| / | Divisão | Divide um valor de outro | x / y |
| % | Módulo | Retorna o resto da divisão | x % y |
| ++ | Incremento | Aumenta o valor em 1 | ++x |
| -- | Decremento | Diminui o valor em 1 | --x |

### Operadores de atribuição

Os operadores de atribuição são usados para atribuir valores a variáveis.

Uma lista de todos os operadores de atribuição:

| Operador | Exemplo | Resultado |
| --- | --- | --- |
| = | x = 5 | x = 5 |
| += | x += 3 | x = x + 3 |
| -= | x -= 3 | x = x - 3 |
| *= | x *= 3 | x = x * 3 |
| /= | x /= 3 | x = x / 3 |
| %= | x %= 3 | x = x % 3 |

### Operadores de comparação

Os operadores de comparação são usados para comparar dois valores e retornam um `Boolean` valor: ou `true`ou `false`.

| Operador | Nome | Exemplo |
| --- | --- | --- |
| == | Igual | x == y |
| != | Não igual | x != y |
| > | Maior que | x > y |
| < | Menor que | x < y |
| >= | Maior ou igual | x >= y |
| <= | Menor ou igual | x <= y |

### Operadores lógicos

Os operadores lógicos são usados para determinar a lógica entre variáveis ou valores:

| Operador | Nome | Descrição |
| --- | --- | --- |
| &&  | Lógico e | Retorna verdadeiro se ambas as declarações forem verdadeiras |
| ||  | Lógico ou | Retorna verdadeiro se uma das afirmações for verdadeira |
| ! | Lógico não | Inverte o resultado, retorna falso se o resultado for verdadeiro |

### Booleanos

Muitas vezes, na programação, você precisará de um tipo de dados que só pode ter um de dois valores, como:

- YES / NO
- ON / OFF
- TRUE / FALSE

Para isso, um tipo booleano pode ser declarado com a palavra-chave `Boolean` e só pode receber os valores `true`ou `false`:

```kotlin
val KTeFacil: Boolean = true       // val KTeFacil = true
val KTeimpossivel: Boolean = false // val KTeimpossivel = false
println(KTeFacil)                  // true
println(KTeimpossivel)             // false
```

Uma expressão booleana **retorna** um valor booleano: `true`ou `false`.

Você pode usar um operador de comparação, como o operador **maior que** ( `>`) para descobrir se uma expressão (ou uma variável) é verdadeira:

```kotlin
val x = 10
val y = 9
println(x > y)  // Retorna True
// Pode ser feito diretamente com valores
println(10 > 9) // Retorna True
//Utilizando o operador igual a (==) para avaliar uma expressão:
val w = 10;
println(w == 10); //  Retorna True
println(10 == 15); // Retorna False
```

O valor booleano de uma expressão é a base para todas as comparações e condições Kotlin.

## Estruturas de decisão

### If & Else

# Condições Kotlin e If..Else

Você pode usar condições lógicas para executar várias ações diferentes.

Kotlin tem as seguintes condicionais:

- Use `if` para especificar um bloco de código a ser executado, se uma condição especificada for verdadeira
- Use `else` para especificar um bloco de código a ser executado, se a mesma condição for falsa
- Use `else if` para especificar uma nova condição a ser testada, se a primeira condição for falsa
- Use `when` para especificar muitos blocos alternativos de código a serem executados

**Nota:** Ao contrário do Java, `if..else`pode ser usado como uma **instrução** ou como uma **expressão** (para atribuir um valor a uma variável) em Kotlin. 

### Sintaxe If

```kotlin
if (condição) {
// bloco de código para ser executado se a condição for verdadeira}
```

Observe que `if` está em letras minúsculas. Letras maiúsculas (If ou IF) gerarão um erro.

### **Exemplo explicativo:**

```kotlin
if (20 > 18) {
  println("20 é maior que 18")
}
//Também podemos testar variáveis:
val x = 20
val y = 18
if (x > y) {
  println("x é maior que y")
}
```

# Sintaxe else

Use `else`para especificar um bloco de código a ser executado se a condição for `false`.

```kotlin
if (condição) {
// bloco de código para ser executado se a condição for verdadeira} 
else {
// bloco de código para ser executado se a condição for falsa}
```

### Exemplo explicativo:

```kotlin
val tempo = 20
if (tempo < 18) {
  println("Bom dia.")
} else {
  println("Boa noite.")
}
// Boa noite.
```

# Kotlin else if

Use `else if` para especificar uma nova condição se a primeira condição for `false`.

```kotlin
if (condição1) {
// bloco de código a ser executado se condição1 for Verdadeira} 
else if (condição2) {
// bloco de código a ser executado se a condição1 for Falsa e a condição2 for Verdadeira} 
else {
// bloco de código a ser executado se a condição1 for Falsa e a condição2 for Falsa}
```

```kotlin
val tempo = 22
if (tempo < 10) {
  println("Bom dia.")
} else if (tempo < 20) {
  println("Bom tarde.")
} else {
  println("Boa noite.")
}
// "Boa noite."
```

### **Expressões If..Else**

No Kotlin, você também pode usar `if..else` instruções como expressões (atribuir um valor a uma variável e devolvê-lo):

```kotlin
val tempo = 20
val x = if (tempo < 18) {
  "Bom dia."
} else {
  "Boa noite."
}
println(x)
```

Ao usar `if` como expressão, você também deve incluir `else`(obrigatório).

**Nota:** Você pode omitir as chaves `{}` quando `if` tiver apenas uma instrução:

```kotlin
fun main() {
  val tempo = 20
  val x = if (tempo < 18) "Bom dia." else "Bom noite."
  println(x)
}
```

### When

Em vez de escrever muitas expressões `if..else`, você pode usar a expressão `when`, que é muito mais fácil de ler.

Ele é usado para selecionar um dos muitos blocos de código a serem executados:

```kotlin
// Use o número do dia da semana para calcular o nome do dia da semana:

val dia = 4

val resultado = when (dia) {
  1 -> "Segunda"
  2 -> "Terça"
  3 -> "Quarta"
  4 -> "Quinta"
  5 -> "Sexta"
  6 -> "Sábado"
  7 -> "Domingo"
  else -> "Dia inválido."
}
println(resultado)

//  "Quinta" (dia 4)
```

É assim que funciona:

- A variável `when(dia)` ****é avaliada uma vez
- O valor da variável **dia** é comparado com os valores de cada "ramo"
- Cada ramo começa com um valor, seguido por uma seta (->) e um resultado
- Se houver uma correspondência, o bloco de código associado é executado
- `else`é usado para especificar algum código a ser executado se não houver correspondência
- No exemplo acima, o valor de dia 4 é, significando que "Quinta" será impresso

## Estruturas de controle

### **Loops**

Os loops podem executar um bloco de código desde que uma condição especificada seja alcançada.

Os loops são úteis porque economizam tempo, reduzem erros e tornam o código mais legível.

### **While Loop**

O loop `while` percorre um bloco de código desde que uma condição especificada seja `true`:

```kotlin
while (condição) {
// bloco de código a ser executado
}
```

No exemplo abaixo, o código no loop será executado repetidamente, desde que a variável do contador (i) seja menor que 5:

```kotlin
var i = 0
while (i < 5) {
  println(i)
  i++
}
//Nota: Não esqueça de aumentar a variável usada na condição, caso contrário o loop nunca terminará.
```
### Break

A instrução `break` é usada para sair de um **loop.**

Este exemplo sai do loop quando i é igual a 4:

```kotlin
var i = 0
while (i < 10) {
  println(i)
  i++
  if (i == 4) {
    break
  }
}
```

### Continue

A instrução `continue` interrompe uma iteração (no loop), se ocorrer uma condição especificada, e continua com a próxima iteração no loop.

Este exemplo ignora o valor de 4:

```kotlin
var i = 0
while (i < 10) {
  if (i == 4) {
    i++
    continue
  }
  println(i)
  i++
}
```

## Matrizes

As matrizes são usadas para armazenar vários valores em uma única variável, em vez de criar variáveis separadas para cada valor.

Para criar uma matriz, use a função `arrayOf()` e coloque os valores em uma lista separada por vírgulas dentro dela:

```kotlin
val carros = arrayOf("Volvo", "BMW", "Ford", "Mazda")
val tipos = arrayOf(1, 2, 3, 4)
```

# Acesse os elementos de um array

Você pode acessar um elemento da matriz referindo-se ao **número do índice** , **entre colchetes** .

Neste exemplo, acessamos o valor do primeiro elemento em cars:

```kotlin
val carros = arrayOf("Volvo", "BMW", "Ford", "Mazda")
println(carros[0])
// Volvo
```

# Alterar um elemento de matriz

Para alterar o valor de um elemento específico, consulte o número do índice:

```kotlin
carros[0] = "Opel"
val carros = arrayOf("Volvo", "BMW", "Ford", "Mazda")
carros[0] = "Opel"
println(carros[0])
// Opel
```

# Comprimento / Tamanho da Matriz

Para descobrir quantos elementos um array possui, use a propriedade `size`:

```kotlin
val carros = arrayOf("Volvo", "BMW", "Ford", "Mazda")
println(carros.size)
// 4
```

# Verifique se existe um elemento

Você pode usar o operador `in` para verificar se existe um elemento em uma matriz:

```kotlin
val carros = arrayOf("Volvo", "BMW", "Ford", "Mazda")
if ("Volvo" in carros) {
  println("Existe!")
} else {
  println("Não existe.")
}
```

# Loop através de uma matriz

Muitas vezes, quando você trabalha com arrays, precisa percorrer todos os elementos.

Você pode percorrer os elementos do array com o loop `for`, sobre o qual aprenderá ainda mais no próximo capítulo.

O exemplo a seguir gera todos os elementos na matriz **carros :**

```kotlin
val carros = arrayOf("Volvo", "BMW", "Ford", "Mazda")
for (x in carros) {
  println(x)
}
```

## Funções

Uma **função** é um bloco de código que só é executado quando é chamado.

Você pode passar dados, conhecidos como parâmetros, para uma função.

As funções são usadas para executar determinadas ações e também são conhecidas como **métodos** .

# Funções predefinidas

`println()` é uma função. É usado para saída/impressão de texto na tela:

```kotlin
fun main() {
  println("Hello World")
}
```

# Crie suas próprias funções

Para criar sua própria função, use a palavra-chave `fun` e escreva o nome da função, seguido de parênteses **()** :

Exemplo: Crie uma função chamada "myFunction" que deve gerar algum texto:

```kotlin
fun myFunction() {
  println("Acho que começamos a entender...")
}
```

# Chamar uma função

Agora que você criou uma função, você pode executá-la **chamando**-a.

Para chamar uma função em Kotlin, escreva o nome da função seguido por dois parênteses **()** .

No exemplo a seguir, `myFunction()`imprimirá algum texto (a ação), quando for chamada:

```kotlin
fun main() {
  myFunction() // Chamando myFunction
}

// Saída "Acho que começamos a entender..."
```

Uma função pode ser chamada várias vezes, se você quiser.

# Parâmetros de função

As informações podem ser passadas para funções como parâmetros.

Os parâmetros são especificados após o nome da função, dentro dos parênteses. Você pode adicionar quantos parâmetros quiser, basta separá-los com uma vírgula. Apenas observe que você deve especificar o tipo de cada parâmetro (Int, String, etc).

O exemplo a seguir tem uma função que usa um **ftext** do tipo ****`String` chamado como parâmetro. Quando a função é chamada, passamos um primeiro nome, que é usado dentro da função para imprimir o nome completo:

```kotlin
fun myFunction(ftext: String) {
  println(ftext + "entender")
}

fun main() {
  myFunction("Eu consegui")
  myFunction("Você consegue")
  myFunction("Nós conseguimos")
}
  
// Eu consegui entender
// Você consegue entender
// Nós conseguimos entender
```

Quando um **parâmetro** é passado para uma função, ele é chamado de **argumento**. 

Temos do exemplo acima: `ftext`é um **parâmetro da função, já** `Eu consegui` , `Você consegue` e  `Nós conseguimos` são **argumentos da função**.