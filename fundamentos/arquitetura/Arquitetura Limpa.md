# Aprendendo sobre arquitetura de software

"Eu sempre desejei aprender a programar, depois que comecei a escrever alguns códigos, passei a desejar entender o mundo ao redor do que eu escrevia. Agora fico me perguntando, sou apenas um escritor de códigos ou me tornei um astrônomo desse universo digital? Se é isso, antes de buscar vida em outros planetas, preciso aprender a preservar a vida daquele em que vivo."<br>

-$ LJ

## Introdução

Uma das histórias mais interessantes do livro é contada aqui. "Esopo a Tartaruga e a Lebre". Há algumas frases que considerei importante manter anotadas para consulta em todos os meus projetos até tornar hábito.

"Devagar e sempre e você vence a corrida"
"A corrida não é para os velozes, nem a batalha é para os fortes"
"Quanto mais pressa, menor a velocidade"
"A única maneira de seguir rápido é seguir bem"
"Fazer bagunça é sempre mais lento que manter tudo limpo"

## O conto dos dois valores

Aqui é descrito o conflito dos programadores para equilibrar comportamento e estrutura dos programas. A maioria não consegue manter os dois valores aceitáveis e quando não conseguem, sacrificam justamente o valor mais importante.

Acho que a definição mais concreta para comportamento seria:
"Programadores são contratados para fazer com que as máquinas se comportem de uma maneira que dê ou economize dinheiro para seus stakeholders. Se as máquinas não seguem os requisitos que você desenhou com os stakeholders, cabe a você corrigir esse comportamento"

"Um software deve ser fácil de mudar, pois com certeza irão ocorrer mudanças e a dificuldade em implementar essas mudanças é justamente o medidor se seu software segue o valor da estrutura"

Na prática o livro faz uma brincadeira para entendermos a importância da função e da arquitetura em um software. Para examinar isso o livro propõe um problema de lógica super interessante.

"Se você der um programa que funcione perfeitamente, mas seja impossível de mudar, então ele não funcionará quando as exigências mudarem e eu não serei capaz de fazê-lo mudar. Portanto, o programa será inútil."

"Se você me der um programa que não funcione, mas seja fácil de mudar, então eu posso fazê-lo funcionar, e posso mantê-lo funcionando à medida que as exigências mudarem. Portanto, o programa permanecerá continuamente útil."

Para fazer essa separação, o livro faz referência a matriz do presidente norte-americano Dwight D. Eisenhower (criador da matriz de Eisenhower). Nas palavras dele:

"Eu tenho dois tipos de problemas, os urgentes e os importantes. Os urgentes não são importantes e os importantes nunca são urgentes."

Disso podemos chegar sozinhos a seguinte conclusão:

Comportamento é urgente, mas não é tão importante, já arquitetura é importante, mas nunca é urgente.

Quando olhamos para as 4 separações da matriz:

1. Urgente e importante
2. Não urgente e importante
3. Urgente e não importante
4. Não urgente e não importante

Arquitetura está nas duas primeiras posições e comportamento está nas duas últimas.

Agora falando de responsabilidade, que acredito que seja o objetivo principal do capítulo. Pensando na arquitetura de empresas de tecnologia, você provavelmente tem um gerente, responsável pelo negócio. Essa pessoa geralmente não tem capacidade para avaliar esses critérios e ai vem o seu trabalho. Garantir a importância da arquitetura em lugar da urgência dos recursos. Como desenvolvedor, você é parte do software, não se permita facilmente entregar uma porcaria para satisfazer prazos. Lute com tudo, no fim, você pode perder a batalha, mas com honra de ter lutado pelo que acredita. Esse é o caminho do guerreiro! URRA!

## Começando com os tijolos: Os paradigmas da programação

Essa parte do livro muitas pessoas pularam e eu tenho uma teoria sobre isso. Sinto que a maioria das pessoas não está interessada no entendimento completo das coisas, elas tendem a procurar apenas o suficiente para se virarem com suas prioridades atuais. O superficial ou até o mediócre já lhes satisfaz. Eu não desejo isso. Quer uma dica? <br>

NESSE MOMENTO, SE DESLIGUE DO AMANHÃ, ESTEJA PRESENTE AQUI E AGORA.

É a sua chance de fazer a diferença no seu próprio aprendizado. Sem mais delongas... Conheça agora, alguns responsáveis pela existência do mundo que você vive hoje. Sua profissão, seus comportamentos e talvez até seus valores foram influenciados por eles. Grandes nomes passam despercebidos pela história, subjulgados por sua realidade ou permaneceram ocultos por sua própria natureza, já outros, serão lembrados enquanto as pessoas tiverem espírito, pois um dos frutos do espírito é a humildade e aqui ela se apresenta, em pequenos trechos de texto, reconhecendo a grandiosidade do trabalho dessas almas. Permita-me agora, parafrasear um pouco:

"Em 1938, Alan Turing estabeleceu  as bases do que se tornaria a programação de computadores. Embora outros já tivessem concebido a ideia de uma máquina programável, o matemático inglês foi o primeiroa entender que programas eram simplesmente dados. Em 1945, Turing já escrevia programas de verdade em computadores de verdade, utilizando um código que nós reconheceríamos (se nos esforçassemos o suficiente). Esses programas usavam laços, ramificações, atribuições, sub-rotinas, pilhas e outras estruturas familiares. A linguagem de Turing era binária.

Desde então, ocorreram várias revoluções na programação. Uma delas, que conhecemos muito bem, foi a revolução das linguagens. Primeiro, no final da década de 1940, vieram as assemblers (linguagens de montagem). "Essas linguagens" livraram osd programadores do trabalho chato de traduzir seus programas para o código binário. Em 1951, Grace Hopper inventou o A0, o primeiro compilador. Na verdade, foi ela quem cunhou o nome <i>compilador</i>. O Fortran foi inventado em 1953 (um ano depois do meu nascimento). Em seguida, veio uma inundação ininterrupta de novas linguagens de programação --- COBOL, PL/1, SNOBOL, C, Pascal, C++, Java, até o infinito."

Nesses dois parágrafos há muita história e se eles foram capazes de despertar sua curiosidade, vou deixar aqui alguns conteúdos para satisfazer.

[EM CONTRUÇÃO]

Sabemos que não parou por ai. Estamos vivendo inovações hoje. A história está sendo escrita bem debaixo de nossos narizes.

O desfecho do capítulo apresenta o conceito de paradigma, sendo maneiras de programar que dizem quais estruturas de programação usar e quando usá-las. Por razões que iremos aprender juntos ao longo da leitura, talvez não surja mais nenhum.

Acho importante ir no dicionário buscar os significados dessa palavra. No dicionário Aurélio:

Modelo ou padrão: O termo paradigma frequentemente se refere a algo que serve como modelo, exemplo ou padrão a ser seguido.

## Panorama do Paradigma

Como vimos anteriormente, o objetivo dos capítulos seguintes é abordar os 3 principais paradigmas da programação. Em termos simples, um paradigma é uma abordagem para resolver problemas computacionais. Ele define:
- Como os dados são organizados
- Como o controle do programa é estruturado
- Qual é o papel das funções, objetos e instruções
- Como o estado do sistema é tratado(princípios de imutabilidade, mutabilidade, efeitos colateris etc.)

A linha do tempo dos paradigmas na programação pode ser vista da seguinte maneira:

### 1. Paradigma Imperativo (1940-50)

É o mais antigo e praticamente nasceu junto com os primeiros computadores programáveis. A ideia era programar instruções passo-a-passo, alterando diretamente o estado da máquina. Baseada na arquitetura de Von Neumann e nas máquinas de Turing.<br>

<b>Características:</b>
- Uso explícito de comandos (for, if, while, goto...)
- Modificação direta de variáveis
- Controle de fluxo detalhado

<b>Exemplos de linguagens:</b> Assembly(1940), Fortran(1957), Algol(1958), C(1972)

### 2. Paradigma Funcional (1950-60)

Baseado no cálculo lambda de Alonzo Church (1930s) ganhou expressão prática com linguagenas funcionais puras. Computação como avaliação de funções matemáticas puras. Interesse em modelos matemáticos formais e ausência de estado mutável.<br>

<b>Características:</b>
- Uso explícito de comandos (for, if, while, goto...)
- Modificação direta de variáveis
- Controle de fluxo detalhado

<b>Exemplos de linguagens:</b> Lisp(1958), Scheme(1975), ML(1973), Haskell(1990)

### 3.


Programação estruturada

Programação orientada a objetos

Programação funcional

Conceitos importantes que apareceram se não expliquei:

<b>Mutabilidade:</b> Uma variável ou estrutura é mutável quando seu valor pode ser alterado após ser criado. Imagine um quadro branco. Se você escreve "A" e depois apaga e escreve "B", você está mutando o conteúdo.<br>

Exemplo em python:
```python
my_list = [1,2,3]
my_list.append(4)
print(my_list)

# [1,2,3,4]
```

<b>Imutabilidade</b>: Uma estrutura é imutável quando, após ser criada, não pode ser modificada. Qualquer "mudança" gera uma nova cópia. Imagina um papel timbrado e assinado. Você não pode apagar nem mudar, só criar uma nova versão dele.

Exemplo em python:
```python
my_tuple = (1,2,3)          # tuplas são imutáveis
new_tuple = my_tuple + (4,) # isso cria uma nova tupla
print(new_tuple) 

# (1,2,3,4)
```

<b>Efeitos colaterais</b>: Mudanças inesperadas de estado