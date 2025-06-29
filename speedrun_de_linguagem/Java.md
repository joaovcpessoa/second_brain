# Fundamentos

Java é uma linguagem de programação popular, criada em 1995. Ela é de propriedade da Oracle, e mais de 3 bilhões de dispositivos executam Java.

É usado para:
- Aplicativos móveis (especialmente aplicativos Android)
- Aplicações de desktop
- Aplicações web
- Servidores web e servidores de aplicativos
- Jogos
- Conexão de banco de dados
- ...

### Características

Java funciona em diferentes plataformas (Windows, Mac, Linux, Raspberry Pi, etc.), sendo uma das linguagens de programação mais populares do mundo, possui grande procura no mercado de trabalho atual e é péssima de aprender, não sei como tem um enorme apoio da comunidade, bando de doentes desocupados.
Java é uma linguagem orientada a objetos que fornece uma estrutura clara aos programas e permite que o código seja reutilizado, reduzindo os custos de desenvolvimento.

Isso é um guia rápido, ao final você será capaz de escrever programas básicos e xingar mais palavrões dentro de uma frase. Não é necessário ter nenhuma experiência prévia em programação, mas é necessário interesse em ir para o inferno.

## Instalação

O problema já começa ai. Para instalar essa porcaria aqui, tu tem que dar a volta ao mundo em 80 dias igual Julio Verne.

Pode ser que algum aplicativo malidito já tenha baixado ele no teu PC, então antes verifica se já não está instalado. Considerando que você está usando Windows, abre o cmd e digita:

```sh
java --version
```

Se tiver instalado, vai responder algo como:

```sh
java version "21.0.1" 2023-10-17 LTS
Java(TM) SE Runtime Environment (build 21.0.1+12-LTS-29)
Java HotSpot(TM) 64-Bit Server VM (build 21.0.1+12-LTS-29, mixed mode, sharing)
```
Se não tiver, baixa por [aqui](https://www.oracle.com/java/technologies/downloads/).

Vou explicar mais que isso não, tu sabe instalar Torrent e vai me falar que não sabe instalar um Java, segue as instruções ai e valeu.

"Ah, mas estou no linux", pesquisa então o tutorial ai, quer tudo na mão também.

### Hello, World!

Em Java, cada aplicativo começa com um nome de classe, e essa classe deve corresponder ao nome do arquivo.

Cria teu primeiro arquivo Java, chamado <i>Main.java</i>. Cola o código abaixo no arquivo e salva:

```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

"Entendi nada disso ai". Então está tudo certo, você já começa sem entender e termina pior do que começou.

Abre o cmd, vai no diretório do arquivo (ou simplesmente passao o diretório no comando) e digita:

```sh
javac Main.java
```

Se você está usando o VsCode, abre o terminal copia e cola igual tu faz com o GPT. Isso ai vai compilar seu código. Se não houver erros no código, o prompt de comando o levará para a próxima linha. Agora, digite:

```sh
java Main
```

Ele vai lançar o famoso: Hello World
"Ah, falta vírgula e a exclamação". Quem pode reclamar pode fazer. Altera lá o código e executa de novo. Não funcionou né?

<b>Primeira lição:</b> Java é uma linguagem compilado. Erro? Conserta, compila de novo e depois roda.

Já quer ir embora? Não, fica mais, tu não inventou de aprender essa p#$@, agora tu vai aprender na marra.

## Sintaxe

Agora deixa eu tentar explicar o que tu fez ali. Cada linha de código executada em Java deve estar dentro de uma <code>classe</code>. <b>O nome da classe deve sempre começar com a primeira letra maiúscula.</b>

<b>Segunda lição:</b> Java é "case sensitive", ou seja, diferencia maiúsculas de minúsculas: "MyClass" e "myclass" são consideradas diferentes.

<b>Terceira lição:</b> O nome do arquivo Java deve corresponder ao nome da classe. 

Ao salvar o arquivo, use o nome da classe e adicione ".java" ao final do nome do arquivo.

### main()

O método main() é necessário e você o verá em todos os programas Java. Qualquer código dentro de main() será executado.

```java
public static void main(String[] args)
```

Para imprimir ma tela você já sabe. Use <code>System.out.println()</code>

Obs.: As chaves marcam o início e o fim de um bloco de código.

System é uma classe Java integrada que contém membros úteis, como out, que é a abreviação de "output". O método println(), abreviação de "print line", é usado para imprimir um valor na tela.

<b>Quarta lição:</b> Cada instrução de código deve terminar com um <code>;</code>.

Agora vou adicionar mais linhas para explicar que há também um <code>print()</code>, que difere do que aprendemos em uma única coisa, ele não insere uma nova linha

```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    System.out.print("This is a Java program.");
    System.out.println("Java is a versatile programming language.");
  }
}

// Resultado:
// Hello, World!
// This is a Java program.Java is a versatile programming language.
```

<b>Quinta lição:</b> O texto deve ser colocado entre <code>""</code>.

Se você quiser imprimir números, não é necessário usar aspas duplas.

```java
System.out.println(3);
System.out.println(358);
System.out.println(50000);
```
Também é possível realizar cálculos matemáticos dentro do println():

```java
System.out.println(3 + 3);
System.out.println(2 * 5);
```

### Comentários

Já vou te ensinar para você não usar. Se teu código precisa ser explicado, está errado ou mal escrito. Tu só vai usar para evitar execução mesmo.

```java
// Comentário de linha única
/* Comentários de
várias
linhas
*/
System.out.println("Hello World");
```

## Variáveis

Variáveis ​​são contêineres para armazenar valores de dados.

Em Java, existem diferentes tipos de variáveis, por exemplo:

- String - armazena texto. Valores de string são colocados entre aspas duplas
- int - armazena números inteiros como 123 ou -123
- float - armazena números de ponto flutuante, como 19,99 ou -19,99
- char - armazena caracteres únicos, como 'a' ou 'B'. Os valores char são colocados entre aspas simples
- boolean - armazena valores com dois estados: true or false

Para criar uma variável, você deve especificar o tipo e atribuir um valor a ela:

```java
type variableName = value;
```
Onde <i>type</i> é um dos tipos Java, e variableName é o nome da variável. O sinal de igual é usado para atribuir valores à variável. Dá para declarar mais de uma variável do mesmo tipo separando por <code>,</code>. Também é possível atribuir um único valor para múltiplas variáveis.

```java
String name = "John";
int myNum = 15;
int x = 5, y = 6, z = 50;
int x, y, z;
x = y = z = 60;
System.out.println(name);
System.out.println(myNum);
```

Você também pode declarar uma variável sem atribuir o valor e atribuí-lo mais tarde. Se você atribuir um novo valor a uma variável existente, ele substituirá o valor anterior.

```java
int myNum;
myNum = 15;
System.out.println(myNum);
myNum = 20;
System.out.println(myNum);
```

Se você não quiser que os valores sejam substituídos, use a palavra-chave <code>final</code> (isso significa que o valor é imutável e somente leitura)

```java
final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable
```

Para combinar variáveis, use o <code>+</code>.

```java
String name = "John";
System.out.println("Hello " + name);
String firstName = "John ";
String lastName = "Doe";
String fullName = firstName + lastName;
System.out.println(fullName);
```

Para valores numéricos, funciona como um operador matemático.

```java
int x = 5;
int y = 6;
System.out.println(x + y);
```

### Identificadores

Todas as variáveis ​​Java devem ser identificadas com nomes exclusivos. Esses nomes exclusivos são chamados de identificadores. Os identificadores podem ser nomes curtos (como x e y) ou nomes mais descritivos (idade, soma, volume total).

Sexta lição: Use nomes descritivos para criar um código compreensível e sustentável

```java
// Good
int minutesPerHour = 60;

// OK, but not so easy to understand what m actually is
int m = 60;
```

As regras gerais para nomear variáveis ​​são:

- Os nomes podem conter letras, dígitos, sublinhados e cifrões
- Os nomes devem começar com uma letra
- Os nomes devem começar com uma letra minúscula e não podem conter espaços em branco
- Os nomes também podem começar com $ e _
- Os nomes diferenciam maiúsculas de minúsculas ("myVar" e "myvar" são variáveis ​​diferentes)
- Palavras reservadas (como palavras-chave Java, como intou boolean) não podem ser usadas como nomes

Exemplos um pouco mais descritivos:

Armazena diferentes dados sobre um estudante universitário:

```java
// Student data
String studentName = "John Doe";
int studentID = 15;
int studentAge = 23;
float studentFee = 75.25f;
char studentGrade = 'B';

// Print variables
System.out.println("Student name: " + studentName);
System.out.println("Student id: " + studentID);
System.out.println("Student age: " + studentAge);
System.out.println("Student fee: " + studentFee);
System.out.println("Student grade: " + studentGrade);
```

Calcular a área de um retângulo:

```java
public class RectangleArea {
  public static void main(String[] args) {
    calculateArea();
  }

  public static void calculateArea() {
    int length = 5;
    int width = 10;
    int area;

    area = length * width;
    System.out.println("Calculating the area of a rectangle:");
    System.out.println("Given dimensions:");
    System.out.println("Length: " + length);
    System.out.println("Width: " + width);
    System.out.println("Area of the rectangle: " + area);
  }
}
```

## Tipos de dados

Uma demonstração de como declarar variáveis ​​de outros tipos:

```java
int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String
```

Os tipos de dados são divididos em dois grupos:

- Tipos de dados primitivos - inclui byte, short, int, long, float, double, booleanechar
- Tipos de dados não primitivos - como Stringmatrizes e classes (você aprenderá mais sobre eles em um capítulo posterior)

Tipos de Dados Primitivos
Um tipo de dado primitivo especifica o tipo de uma variável e o tipo de valores que ela pode conter.

Existem oito tipos de dados primitivos em Java:

| Data Type |	Description |
| --------- | --------------------------------------------------------------------------------- |
| byte	    | Stores whole numbers from -128 to 127                                             |
| short	    | Stores whole numbers from -32,768 to 32,767                                       |                                            
| int	      | Stores whole numbers from -2,147,483,648 to 2,147,483,647                         |
| long	    | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float	    | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits           |
| double	  | Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits         |
| boolean	  | Stores true or false values                                                       |
| char	    | Stores a single character/letter or ASCII values                                  |

# POO


# Cllections + Generics + Streams


# Threads e Concorrência

# JVM + GC + Performance

# Frameworks e APIs modernas
