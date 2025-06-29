# Perl

## Intro

Este **tutorial Perl** foi preparado para iniciantes para ajudá-los a entender os conceitos básicos e avançados relacionados às linguagens de script Perl.

**Perl** é uma **linguagem** de programação desenvolvida por Larry Wall, especialmente projetada para processamento de texto. Significa Practical Extraction and Report Language. Ele é executado em uma variedade de plataformas, como Windows, Mac OS e várias versões do UNIX. Este tutorial fornece uma compreensão completa sobre Perl.

## **Por que aprender Perl?**

- Perl é uma linguagem de programação multiplataforma estável.
- Embora Perl não seja oficialmente um acrônimo, poucas pessoas o usaram como **linguagem prática de extração e relatório** .
- É usado para projetos de missão crítica nos setores público e privado.
- Perl é um software de *código* aberto, licenciado sob sua *Licença Artística* ou *GNU General Public License (GPL)* .
- Perl foi criado por Larry Wall.
- Perl 1.0 foi lançado para alt.comp.sources da usenet em 1987.
- No momento da redação deste tutorial, a versão mais recente do perl era 5.16.2.
- Perl está listado no *Oxford English Dictionary* .

A PC Magazine anunciou Perl como finalista de seu Prêmio de Excelência Técnica de 1998 na categoria Ferramenta de Desenvolvimento.

## **Recursos do Perl**

- Perl pega os melhores recursos de outras linguagens, como C, awk, sed, sh e BASIC, entre outras.
- Interface de integração de banco de dados Perls O DBI oferece suporte a bancos de dados de terceiros, incluindo Oracle, Sybase, Postgres, MySQL e outros.
- Perl trabalha com HTML, XML e outras linguagens de marcação.
- Perl suporta Unicode.
- Perl é compatível com Y2K.
- Perl suporta programação procedural e orientada a objetos.
- Perl faz interface com bibliotecas C/C++ externas por meio de XS ou SWIG.
- Perl é extensível. Existem mais de 20.000 módulos de terceiros disponíveis na Comprehensive Perl Archive Network ( [CPAN](https://cpan.perl.org/) ).
- O interpretador Perl pode ser embutido em outros sistemas.

## **Olá mundo usando Perl.**

Apenas para dar a você um pouco de emoção sobre o Perl, vou dar a você um pequeno programa convencional Perl Hello World.

```perl
#!/usr/bin/perl

# This will print "Hello, World"
print "Hello, world\n";
```

## **Aplicações de Perl**

Como mencionado anteriormente, Perl é uma das linguagens mais usadas na web. Vou listar alguns deles aqui:

- Costumava ser a linguagem de programação web mais popular devido às suas capacidades de manipulação de texto e rápido ciclo de desenvolvimento.
- Amplamente conhecido como " [a fita adesiva da Internet](https://www.google.com/search?q=the%20duct-tape%20of%20the%20Internet) ".
- Capaz de lidar com dados da Web criptografados, incluindo transações de comércio eletrônico.
- Pode ser incorporado em servidores web para acelerar o processamento em até 2.000%.
- [O mod_perl](https://perl.apache.org/)  permite que o servidor web Apache incorpore um interpretador Perl.
- [O pacote DBI](https://dbi.perl.org/) facilita a integração do banco de dados da web.

## **Pré-requisitos**

Antes de começar a praticar com vários tipos de exemplos fornecidos nesta referência, estamos assumindo que você já teve contato prévio com programação C e Unix Shell.

Antes de começarmos a escrever nossos programas Perl, vamos entender como configurar nosso ambiente Perl. 

Perl está disponível em uma ampla variedade de plataformas

É mais provável que seu sistema tenha o perl instalado. Apenas tente dar o seguinte comando no prompt:

```perl
$perl -v
```

Se você tiver o perl instalado em sua máquina, receberá uma mensagem como a seguir:

```perl
This is perl 5, version 32, subversion 1 (v5.32.1) built for MSWin32-x64-multi-thread

Copyright 1987-2021, Larry Wall

Perl may be copied only under the terms of either the Artistic License or the
GNU General Public License, which may be found in the Perl 5 source kit.

Complete documentation for Perl, including FAQ lists, should be found on
this system using "man perl" or "perldoc perl".  If you have access to the
Internet, point your browser at http://www.perl.org/, the Perl Home Page.
```

## I**nstalação do Perl**

O código-fonte e documentação mais atualizados estão disponíveis no site oficial do Perl. **Site oficial do Perl** - https://www.perl.org/

A distribuição Perl está disponível para uma ampla variedade de plataformas. Você precisa baixar apenas o código binário aplicável à sua plataforma e instalar o Perl.

Se o código binário para sua plataforma não estiver disponível, você precisará de um compilador C para compilar o código-fonte manualmente. A compilação do código-fonte oferece mais flexibilidade em termos de escolha dos recursos que você precisa em sua instalação.

Aqui está uma rápida visão geral da instalação do Perl em várias plataformas.

## **Instalação Unix e Linux**

Aqui estão os passos simples para instalar o Perl na máquina Unix/Linux.

- Abra um navegador da Web e vá para [https://www.perl.org/get.html.](https://www.perl.org/get.html)
- Siga o link para baixar o código-fonte compactado disponível para Unix/Linux.
- Baixe o arquivo **perl-5.xytar.gz** e emita os seguintes comandos no prompt.

```bash
tar -xzf perl-5.x.y.tar.gz
cd perl-5.x.y
./Configure -de
make
make test
make install
```

Isso instalará o Perl em um local padrão */usr/local/bin* e suas bibliotecas serão instaladas em */usr/local/lib/perlXX* , onde XX é a versão do Perl que você está usando.

Levará algum tempo para compilar o código-fonte após emitir o comando **make .** Depois que a instalação estiver concluída, você pode emitir o comando **perl -v** no prompt para verificar a instalação do perl. Se tudo estiver bem, ele exibirá a mensagem como mostramos acima.

## **Instalação do Windows**

Aqui estão as etapas para instalar o Perl na máquina Windows.

- Siga o link para a instalação do Strawberry Perl no Windows [http://strawberryperl.com](http://strawberryperl.com/)
- Baixe a versão de instalação de 32 ou 64 bits.
- Execute o arquivo baixado clicando duas vezes no Windows Explorer. Isso abre o assistente de instalação do Perl, que é realmente fácil de usar. Apenas aceite as configurações padrão, aguarde até que a instalação seja concluída e você estará pronto para começar!

## **Instalação Mac**

Para construir sua própria versão do Perl, você precisará de 'make', que faz parte das ferramentas de desenvolvedor da Apple geralmente fornecidas com os DVDs de instalação do Mac OS. Você não precisa da versão mais recente do Xcode (que agora é cobrada) para instalar o make.

Aqui estão os passos simples para instalar o Perl na máquina Mac OS X.

- Abra um navegador da Web e vá para https://www.perl.org/get.html .
- Siga o link para baixar o código-fonte compactado disponível para Mac OS X.
- Baixe o arquivo **perl-5.xytar.gz** e emita os seguintes comandos no prompt.

```bash
tar -xzf perl-5.x.y.tar.gz
cd perl-5.x.y
./Configure -de
make
make test
make install
```

A seguir estão as diferentes maneiras de iniciar o Perl.

**Interpretador Interativo**

Você pode inserir **perl** e começar a codificar imediatamente no interpretador interativo iniciando-o na linha de comando. Você pode fazer isso no Unix, DOS ou em qualquer outro sistema, que forneça um interpretador de linha de comando ou janela de shell.

```bash
$perl  -e <perl code>           # Unix/Linux

or 

C:>perl -e <perl code>          # Windows/DOS
```

Aqui está a lista de todas as opções de linha de comando disponíveis:

| COMANDO | DESCRIÇÃO |
| --- | --- |
| **-d[:debugger]** | Executa o programa no depurador |
| **-Idirectory** | Especifica o diretório @INC/#include |
| **-T**
 | Permite verificações de contaminação |
| **-t** | Habilita avisos de contaminação |
| **-U**
 | Permite operações inseguras |
| **-w** | Permite muitos avisos úteis |
| **-W** | Habilita todos os avisos |
| **-X** | Desativa todos os avisos |
| **-e program**
 | Executa o script Perl enviado como programa |
| **file**
 | Executa o script Perl de um determinado arquivo |

### **Script na linha de comando**

Um script Perl é um arquivo de texto, que mantém o código perl nele e pode ser executado na linha de comando invocando o interpretador em seu aplicativo, como no seguinte:

```perl
$perl  script.pl          # Unix/Linux

or

C:>perl script.pl         # Windows/DOS
```

### **Ambiente de desenvolvimento integrado**

Você também pode executar o Perl a partir de um ambiente de interface gráfica do usuário (GUI). Tudo o que você precisa é de um aplicativo GUI em seu sistema que suporte Perl. Você pode baixar o **VSCODE**.

## Sintaxe

Um programa Perl consiste em uma sequência de declarações e instruções, que vão de cima para baixo. Loops, sub-rotinas e outras estruturas de controle permitem que você pule dentro do código. Cada declaração simples deve terminar com um ponto e vírgula `;`

Perl é uma linguagem de forma livre: você pode formatá-la e indentá-la como quiser. O espaço em branco serve principalmente para separar tokens, ao contrário de linguagens como Python, onde é uma parte importante da sintaxe, ou Fortran, onde é imaterial.

## **Primeiro Programa**

### **Programação em Modo Interativo**

Você pode usar o interpretador Perl com a opção **-e** na linha de comando, que permite executar instruções Perl a partir da linha de comando. 

```perl
perl -e 'print "Hello World\n";'

# Saída:
Hello World
```

### **Programação em modo de script**

Supondo que você já esteja no prompt, vamos abrir um arquivo de texto hello.pl usando o bloco de notas e colocar as seguintes linhas dentro do seu arquivo.

```perl
#!/usr/bin/perl

# This will print "Hello, World"
print "Hello, world\n";
```

Aqui **/usr/bin/perl** é o binário real do interpretador perl. Antes de executar seu script, certifique-se de alterar o modo do arquivo de script e dar privilégio de execução, geralmente uma configuração de 0755 funciona perfeitamente e, finalmente, você executa o script acima da seguinte maneira

```perl
chmod 0755 hello.pl
./hello.pl

# Saída:
Hello, world
```

Você pode usar parênteses para argumentos de funções ou omiti-los de acordo com seu gosto pessoal. Eles são necessários apenas ocasionalmente para esclarecer as questões de precedência. As duas declarações seguintes produzem o mesmo resultado. Um programa Perl não se preocupa com espaços em branco.

```perl
print("Hello, world\n");
print "Hello, world\n";
```

### **Extensão de Arquivo**

Como uma convenção Perl, um arquivo Perl deve ser salvo com uma extensão de arquivo .pl ou .PL para ser reconhecido como um script Perl funcional. Os nomes dos arquivos podem conter números, símbolos e letras, mas não devem conter espaços.

### **Comentários**

Os comentários podem ser usados para tornar o programa amigável e são simplesmente ignorados pelo interpretador sem afetar a funcionalidade do código. Por exemplo, no programa acima, uma linha começando com **`#`** é um comentário.

Os comentários começam com `#` e vão até o final da linha:

```perl
# Isso é um comentário em perl
```

As linhas que começam com `=` são interpretadas como o início de uma seção de documentação incorporada (pod) e todas as linhas subsequentes até o próximo `=cut` são ignoradas pelo compilador.

```perl
#!/usr/bin/perl

# Isso é um comentário isolado.
print "Hello, world\n";

=início de comentário
Isso é um comentário multilinha
Você pode utilizar também
Embora não seja comum
=cut
```

### **Espaços em branco em Perl**

Um programa Perl não se preocupa com espaços em branco, mas se os espaços estiverem dentro das strings entre aspas, eles serão impressos.

Todos os tipos de espaços em branco como espaços, tabulações, novas linhas, etc. são equivalentes para o interpretador quando são usados fora das aspas. Uma linha contendo apenas espaços em branco, possivelmente com um comentário, é conhecida como linha em branco, e o Perl a ignora totalmente.

```perl
#!/usr/bin/perl

print       "Hello, world\n";
print "Hello
          world\n";

# Saída:
Hello, world
 
Hello
          world
```

## **Aspas Simples e Duplas em Perl**

Você pode usar aspas duplas ou aspas simples em strings literais, mas há uma diferença, somente aspas duplas **interpolam** variáveis e caracteres especiais, como novas linhas(\n), enquanto aspas simples não interpolam nenhuma variável ou caractere especial. 

```perl
#!/usr/bin/perl

print "Hello, world\n";
print 'Hello, world\n';

$a = 10;
print "Value of a = $a\n";
print 'Value of a = $a\n';

#Saída:
Hello, world
Hello, world\n$
Value of a = 10
Value of a = $a\n$

```

### **Caractere de escape**

Perl usa o caractere de barra invertida (\) para escapar de qualquer tipo de caractere que possa interferir em nosso código.

```perl
#!/usr/bin/perl

$result = "This is \"number\"";
print "$result\n";
print "\$result\n";

#Saída:
This is "number"
$result

```

## **Identificadores Perl**

Um identificador Perl é um nome usado para identificar uma variável, função, classe, módulo ou outro objeto. 

Um nome de variável Perl começa com $, @ ou % seguido por zero ou mais letras, sublinhados e dígitos (0 a 9).

Perl é uma linguagem de programação que **diferencia maiúsculas de minúsculas(case sensitive),** portanto, **$Manpower** e **$manpower** são dois identificadores diferentes em Perl.

## **Documentos "Here"**

Você pode armazenar ou imprimir texto multilinha com grande conforto. Até você pode usar variáveis dentro do documento "Here". 

Abaixo segue uma sintaxe simples, verifique com atenção se não deve haver espaço entre o << e o identificador.

Um identificador pode ser uma palavra simples ou algum texto entre aspas, como usamos o EOF abaixo. Se o identificador estiver entre aspas, o tipo de citação que você usar determinará o tratamento do texto dentro do documento here, assim como nas citações normais. Um identificador sem aspas funciona como aspas duplas.

```perl
#!/usr/bin/perl

$a = 10;
$var = <<"EOF";
This is the syntax for here document and it will continue
until it encounters a EOF in the first line.
This is case of double quote so variable value will be
interpolated. For example value of a = $a
EOF
print "$var\n";

$var = <<'EOF';
This is case of single quote so variable value will be
interpolated. For example value of a = $a
EOF
print "$var\n";

#Saída:
This is the syntax for here document and it will continue
until it encounters a EOF in the first line.
This is case of double quote so variable value will be
interpolated. For example value of a = 10

This is case of single quote so variable value will be
interpolated. For example value of a = $a
```

## Tipos de dados

Existem 3 tipos de dados em Perl:

1. Escalares → $
2. Arrays → @ ou qw
3. Hashes → %

```perl
my $escalar = "Escalar";
my @matriz = ( "Matriz", 2, 4 );
my %hash = ( "Número"=> 5,
              Texto => ': Olá Mundo' );
print $escalar,"\n", @matriz,"\n", %hash;

# Resposta:
Escalar
Matriz24
Número5Texto: Olá Mundo
```

### Escalar

Escalar é uma variável que pode conter um inteiro, uma string, um float, etc. Nenhum tipo específico mencionado como integer, string (ou) float.

Escalar numérico, escalar de string, escalar flutuante, etc.

Sintaxe:

```perl
my $variavel_1  = "valor";
```

Operações aritméticas (+,-)

Operador de concatenação:

- ponto (ou) vírgula é usado para concatenar strings.

Operador de repetição

- x é usado para repetir o escalar
- ex: $scalarNum x 5

vStrings

- declaração escalar usando números ASCII

```perl
my $strEscalar_1 = "Gostaria de ";
my $numEscalar   = 2;
my $strEscalar_2 = " expressos, por favor.";
my $vEscalar     = v85.78.73.88;
my $strEscalar_3 = "PROCESSANDO...";

print $strEscalar_1.$numEscalar.$strEscalar_2,"\n";
print "Código: $vEscalar\n";
print "$strEscalar_3" x 5,"\n";
```

Também é possível concatenar as strings da seguinte maneira:

```perl
my $strEscalar_1 = "C";
my $strEscalar_2 = "3PO";
my $strEscalar_3 = "&";
my $strEscalar_4 = "R2";
my $strEscalar_5 = "D2";

print $strEscalar_1."-".$strEscalar_2."-".$strEscalar_3."-".$strEscalar_4."-".$strEscalar_5,"\n";
print $strEscalar_1,",",$strEscalar_2,",",$strEscalar_3,",",$strEscalar_4,",",$strEscalar_5,"\n";
```

### Array

Uma matriz é uma lista de dados escalares. Os elementos podem ser acessados por índice a partir de 0 (ou) por operador de intervalo (...). O tamanho do array pode ser conhecido de 2 maneiras:

1. escalar @<Nome do Array>
2. $#Array + 1

Alguns métodos importantes para utilizar:

```
**push()**
Anexa um elemento no final da matriz
Sintaxe: push(@<ArrayName>,<elemento>)

**pop()**
Remove um elemento no final da matriz
Sintaxe: pop(@<ArrayName>)

**unshift()**
Anexa um elemento no início do array
Sintaxe: unshift(@<ArrayName>,<elemento>)

**shift()**
Remove um elemento no início do array
Sintaxe: shift(@<ArrayName>)
```

### Hash

Um hash é um conjunto de pares **chave/valor .** As variáveis de hash são precedidas por um sinal de porcentagem (%). Para se referir a um único elemento de um hash, você usará o nome da variável hash precedido por um sinal "$" e seguido pela "chave" associada ao valor entre chaves.

Aqui está um exemplo simples de uso das variáveis hash:

```perl
%data = ('John Paul', 45, 'Lisa', 30, 'Kumar', 40);

print "\$data{'John Paul'} = $data{'John Paul'}\n";
print "\$data{'Lisa'} = $data{'Lisa'}\n";
print "\$data{'Kumar'} = $data{'Kumar'}\n";
```

```perl
# Output:
$data{'John Paul'} = 45
$data{'Lisa'} = 30
$data{'Kumar'} = 40
```

Para criar um hash, você pode utilizar duas maneiras. 

1. Atribuir um valor a uma chave nomeada individualmente:

```perl
$data{'John Paul'} = 45;
$data{'Lisa'} = 30;
$data{'Kumar'} = 40;
```

2. Uma lista, que é convertida tomando pares individuais da lista: o primeiro elemento do par é usado como a chave e o segundo, como o valor. 

```perl
%data = ('John Paul', 45, 'Lisa', 30, 'Kumar', 40);
# Para maior clareza, você pode usar `=>` como um alias para indicar os pares chave/valor da seguinte forma:
%data = ('John Paul' => 45, 'Lisa' => 30, 'Kumar' => 40);
# Aqui todas as chaves foram precedidas por hífen (-) e nenhuma citação é necessária entre elas
%data = (-JohnPaul => 45, -Lisa => 30, -Kumar => 40);
```

Variáveis

Uma variável é apenas um lugar prático para guardar algo, um lugar com um nome, para que você saiba onde encontrar algo especial quando voltar a procurá-lo mais tarde. Tal como na vida real, existem vários tipos de locais para guardar coisas, alguns bastante privados, outros públicos. Alguns lugares são temporários e outros lugares são mais permanentes. Os cientistas da computação adoram falar sobre o “escopo” das variáveis, mas isso é tudo o que eles querem dizer com isso. Mas uma maneira mais imediatamente útil de classificar variáveis é por meio do tipo de dados que elas podem conter. A principal distinção de tipo do Perl é entre **dados singulares** e **plurais**. Strings e números são dados singulares, enquanto listas de strings ou números são plurais. Chamamos uma variável singular de escalar e uma variável plural de matriz. Como uma string pode ser armazenada em uma variável escalar, podemos escrever uma versão um pouco mais longa (e comentada) do nosso primeiro exemplo assim:

```perl
my $frase = "Hello, World!\n"; # Criando a variavel.
print $frase;                  # Imprimindo a variavel.
```

O my diz ao Perl que $frase é uma variável totalmente nova, então não deve procurar por uma existente. Observe que não precisamos ser muito específicos sobre o tipo de variável $frase. O caractere $ informa ao Perl que a frase é uma variável escalar; isto é, um contendo um valor singular. Uma variável de matriz, por outro lado, começaria com um caractere @. (Pode ser útil lembrar que $ é um “s” estilizado para “escalar”, enquanto @ é um “a” estilizado para “array”.)
Perl tem alguns outros tipos de variáveis, com nomes improváveis como “hash”, “handle” e “typeglob”. Como escalares e matrizes, esses tipos de variáveis também são precedidos por caracteres engraçados, comumente conhecidos como sigilos. Para completar, a Tabela 1-1 lista todos os sigilos que você encontrará.

## Estruturas de controle

As declarações condicionais do Perl ajudam na tomada de decisão, que exige que o programador especifique uma ou mais condições a serem avaliadas ou testadas pelo programa, juntamente com uma declaração ou declarações a serem executadas se a condição for determinada como verdadeira e, opcionalmente, outras instruções a serem executadas se a condição for determinada como falsa.

Uma **instrução if** consiste em: 

| Instrução | Descrição |
| --- | --- |
| **if** | Uma instrução if consiste em uma expressão booleana seguida por uma ou mais instruções. |
| **if...else** | Uma instrução if pode ser seguida por uma instrução else opcional. |
| **if...elsif...else** | Uma instrução if pode ser seguida por uma instrução elsif opcional e, em seguida, por uma instrução else opcional. |
| **unless** | Uma instrução unless consiste em uma expressão booleana seguida por uma ou mais instruções. |
| **unless else** | Uma instrução unless pode ser seguida por uma instrução else opcional. |
| **unless elsif else** | Uma instrução unless pode ser seguida por uma instrução elsif opcional e, em seguida, por uma instrução else opcional. |
| **swtich** | Com as versões mais recentes do Perl, você pode usar a instrução switch. que permite uma maneira simples de comparar um valor variável com várias condições. |

### IF ELSIF ELSE

Usado para testar se uma condição é verdadeira.

**Sintaxe:**

```perl
if (condição){
	# código 1
} elseif {
	#codigo 2
} else {
	#codigo 3
}
```

**Exemplo:**

```perl
my $variable = 10;

if ($variable < 9){
   print"O valor é menor que 9";
} elsif ($variable > 11) {
   print"O valor é maior que 1";
} else {
   print"O valor é 10";
}

# Saída:
O valor é 10
```

### UNLESS ELSIF ELSE

Usado para testar se um instrução é falsa.

**Sintaxe:**

```perl
unless (condição){
	# código 1
} elseif {
	#codigo 2
} else {
	#codigo 3
}
```

**Exemplo:**

```perl
my $variable = 10;

unless ($variable > 9){
   print"O valor é maior que 9";
} elsif ($variable > 11) {
   print"O valor é maior que 11";
} else {
   print"O valor é 10";
}

# Saída:
O valor é 10
```

### Operador **? :**

Vamos verificar o **operador condicional ? :** que pode ser usado para substituir instruções **if...else.**

```perl
Exp1 ? Exp2 : Exp3;
```

Onde Exp1, Exp2 e Exp3 são expressões. Observe o uso e a posição dos dois pontos.

Exp1 é avaliado → Se for verdadeiro, então Exp2 é avaliada e se torna o valor da expressão.

Se Exp1 for falso, então Exp3 é avaliado e e torna o valor da expressão.

```perl
#!/usr/local/bin/perl
 
$nome = "Joao";
$dia_treinando = 102;

$status = ($dia_treinando > 90 )? "forte" : "frango";

print "$name ficou $status\n";

#Saída:
Joao ficou forte
```

## Funções (sub-rotinas)

Em PERL, funções são chamadas de sub-rotinas e são construídas da seguinte maneira:

1. Declaração: 

A palavra-chave “sub” seguida de um par de chaves.

```perl
sub nome_da_subrotina{
# código
}
```

2. Chamada: 

```perl
sub nome_da_subrotina(argumentos);
sub &nome_da_subrotina(argumentos); # em versões anteriores ao PERL 5
```

3. Argumentos:

a. shift

b. $_[0]

c. @_

Retorno de valores:

Uso da palavra-chave “return” seguida de um escalar ou lista.

```perl
sub nome_da_subrotina{
# código
return;
}
```

Exemplo prático:

```perl
#!/usr/bin/perl

use strict;
use warnings;

my @lines = {"google.com 100", "yahoo.com 101", "microsoft.com 102", "gitam.org 300", "au.org 301", "flipkart.com 302"}

sub displayComLines {
		foreach(@lines) {
			if ( $_ =~ /com/ ) {
				print "$_\n";
			}
	  }
}

displayComLines();
```

Agora iremos passar alguns argumentos para a sub-rotina:

```perl
#!/usr/bin/perl

use strict;
use warnings;

my @lines = {"google.com 100", "yahoo.com 101", "microsoft.com 102", "gitam.org 300", "au.org 301", "flipkart.com 302"}
my $msg = "org";

sub displayComLines {
	$msg = shift;	
	foreach(@lines) {
			if ( $_ =~ /$msg/ ) {
				print "$_\n";
			}
	  }
}

displayComLines($msg);
```

Podemos realizar também a seguinte maneira

```perl
#!/usr/bin/perl

use strict;
use warnings;

my @lines = {"google.com 100", "yahoo.com 101", "microsoft.com 102", "gitam.org 300", "au.org 301", "flipkart.com 302"}

sub displayComLines {
	$msg = shift;
  $num = shift;	
	foreach(@lines) {
			if ( $_ =~ /$msg.*$num/ ) {
				print "$_\n";
			}
	  }
}

displayComLines("com", 101);
```

Podemos também utilizar um variável indexada

```perl
#!/usr/bin/perl

use strict;
use warnings;

my @lines = {"google.com 100", "yahoo.com 101", "microsoft.com 102", "gitam.org 300", "au.org 301", "flipkart.com 302"}

sub displayComLines {
	$msg = $_[0]; # primeiro parametro
  $num = $_[1];	# segundo parametro 
	foreach(@lines) {
			if ( $_ =~ /$msg.*$num/ ) {
				print "$_\n";
			}
	  }
}

displayComLines("com", 101);
```

Outra maneira é utilizando um array:

```perl
#!/usr/bin/perl

use strict;
use warnings;

my @lines = {"google.com 100", "yahoo.com 101", "microsoft.com 102", "gitam.org 300", "au.org 301", "flipkart.com 302"}

sub displayComLines {
	my ($msg, $num) = @_;
	foreach(@lines) {
			if ( $_ =~ /$msg.*$num/ ) {
				print "$_\n";
			}
	  }
}

displayComLines("com", 101);
```

## Bibliotecas interessantes:

### NET::SSH::EXPECT

**Objetivo:** SSH wrapper para executar comandos remotos

**Chamada: `use`** `Net::SSH::Expect;`

Segue abaixo um exemplo que será explicado aos poucos:

```perl
use Net::SSH::Expect;
 
#
# You can do SSH authentication with user-password or without it.
#
 
# Making an ssh connection with user-password authentication
# 1) construct the object
my $ssh = Net::SSH::Expect->new (
    host => "myserver.com", 
    password=> 'pass87word', 
    user => 'bnegrao', 
    raw_pty => 1
);
 
# 2) logon to the SSH server using those credentials.
# test the login output to make sure we had success
my $login_output = $ssh->login();
if ($login_output !~ /Welcome/) {
    die "Login has failed. Login output was $login_output";
}
 
# - now you know you're logged in - #
 
# Starting ssh without password
# 1) run the constructor
my $ssh = Net::SSH::Expect->new (
    host => "myserver.com", 
    user => 'bnegrao', 
    raw_pty => 1
);
# 2) now start the ssh process
$ssh->run_ssh() or die "SSH process couldn't start: $!";
 
# 3) you should be logged on now. Test if you received the remote prompt:
($ssh->read_all(2) =~ />\s*\z/) or die "where's the remote prompt?"
 
# - now you know you're logged in - #
 
# disable terminal translations and echo on the SSH server
# executing on the server the stty command:
$ssh->exec("stty raw -echo");
 
# runs arbitrary commands and print their outputs 
# (including the remote prompt comming at the end)
my $ls = $ssh->exec("ls -l /");
print($ls);
 
my $who = $ssh->exec("who");
print ($who);
 
# When running a command that causes a huge output,
# lets get the output line by line:
$ssh->send("find /");   # using send() instead of exec()
my $line;
# returns the next line, removing it from the input stream:
while ( defined ($line = $ssh->read_line()) ) {
    print $line . "\n";  
}
 
# take a look in what is immediately available on the input stream
print $ssh->peek(0);    # you'll probably see the remote prompt
 
# the last read_line() on the previous loop will not include the
# remote prompt that appears at the end of the output, because the prompt
# doesn't end with a '\n' character. So let's remove the remainder
# prompt from the input stream:
$ssh->eat($ssh->peek(0));  # removes whatever is on the input stream now
 
# We can also iterate over the output in chunks,
# printing everything that's available at each 1 second:
$ssh->send ("find /home");
my $chunk;
while ($chunk = $ssh->peek(1)) { # grabs chunks of output each 1 second
    print $ssh->eat($chunk);
}
 
# Now let's run an interactive command, like passwd.
# This is done combining send() and waitfor() methods together:
$ssh->send("passwd");
$ssh->waitfor('password:\s*\z', 1) or die "prompt 'password' not found after 1 second";
$ssh->send("curren_password");
$ssh->waitfor(':\s*\z', 1) or die "prompt 'New password:' not found";
$ssh->send("new_password");
$ssh->waitfor(':\s*\z', 1) or die "prompt 'Confirm new password:' not found";
$ssh->send("new_password");
 
# check that we have the system prompt again.
my ($before_match, $match) = $ssh->waitfor('>\s*\z', 1);  # waitfor() in a list context
die "passwd failed. passwd said '$before_match'." unless ($match);
 
# closes the ssh connection
$ssh->close();
```