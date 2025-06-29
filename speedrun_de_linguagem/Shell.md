# Scripts Shell

Se por algum motivo tu não tem a menor noção sobre comandos em sistemas Unix\Linux, suma daqui e volte quando tiver!

Scripts em shell costumam ter uma má reputação entre programadores mais experientes, principalmente por causa do desempenho. Em comparação com programas escritos em linguagens como C ou Perl, eles podem ser mais lentos, especialmente quando mal otimizados. Um exemplo clássico de ineficiência, veja esse comando:

```sh
cat /tmp/meuarquivo | grep "minhastring"
```

Ele funciona, mas é desnecessariamente complexo. A versão abaixo faz a mesma coisa, de forma mais rápida e direta:

```sh
grep "minhastring" /tmp/meuarquivo
```

O primeiro exemplo cria dois processos: um para cat e outro para grep. Isso exige mais do sistema operacional:
- Carregar dois programas da memória (mesmo que pequenos);
- Criar e gerenciar um pipe para conectar os dois processos;
- Liberar esses recursos ao final.

Em um script simples, isso pode parecer insignificante. Mas se esse comando estiver em um loop ou rodar centenas de vezes (como em um script CGI), o custo de desempenho se acumula.

Então vou deixar aqui regras importantes que inclusive servem para qualquer linguagem: 

1. Não use comandos extras sem necessidade
2. Idente corretamente

### Criando arquivos

Existem várias maneiras de criar um arquivo de script shell no Linux. Uma das mais simples é usando o comando <code>touch</code>, que cria um novo arquivo vazio:

```sh
touch meu_primeiro_script.sh
```

Esse comando cria o arquivo <<code>meu_primeiro_script.sh</code> no diretório atual. Ele ainda estará vazio, mas pronto para você editar e adicionar comandos.

### Editando o script

Depois de criar o arquivo, você pode abri-lo em qualquer editor de texto. Por exemplo:

```sh
nano meu_primeiro_script.sh  # 1
vim meu_primeiro_script.sh   # 2
gedit meu_primeiro_script.sh # 3
```

Escreva o seguinte no arquivo:

```sh
#!/bin/sh
# Comentario
echo Olá, mundo # Comentario
```

Na primeira linha temos o que é chamado <code>shebang</code>, isso informa ao sistema que o script deve ser executado usando o interpretador do Bash (/bin/sh)

### Permissão de execução

Após adicionar comandos no script, é necessário dar permissão de execução:

```sh
chmod +x meu_primeiro_script.sh
```

Agora, você pode executá-lo assim:

```sh
./meu_primeiro_script.sh
```

A única exceção é quando a primeira linha do arquivo começa com #!-, como o nosso. Esta é uma diretiva especial que o Unix trata de forma especial. Isso significa que, mesmo se você estiver usando csh, ksh ou qualquer outro como seu shell interativo, o que se segue deve ser interpretado pelo shell Bourne.
Da mesma forma, um script Perl pode começar com a linha #!/usr/bin/perl para informar ao seu shell interativo que o programa a seguir deve ser executado pelo Perl. Para programação em shell Bourne, nos ateremos a#!/bin/sh.

A terceira linha executa um comando: echo, com dois parâmetros, ou argumentos - o primeiro é "Hello"; o segundo é "World".
Observe que ele echocolocará automaticamente um espaço entre seus parâmetros.
O #símbolo ainda marca um comentário; o # e qualquer coisa que o siga são ignorados pelo shell.

Agora execute chmod 755 first.shpara tornar o arquivo de texto executável e execute ./first.sh.
Sua tela deverá ficar assim:

$ chmod 755 primeiro . sh $ ./ primeiro . sh Olá Mundo $ 

 
Você provavelmente já esperava por isso! Você poderia até mesmo executar:

$ echo Olá Mundo Olá Mundo $  
 
 Agora vamos fazer algumas alterações.
Primeiro, observe que echocoloca UM espaço entre seus parâmetros. Coloque alguns espaços entre "Hello" e "World". Qual é a saída esperada? Que tal colocar um caractere TAB entre eles?
Como sempre na programação shell, experimente e veja.
A saída é exatamente a mesma! Estamos chamando o echoprograma com dois argumentos; ele não se importa mais do cpque com os espaços entre eles. Agora modifique o código novamente:

#!/bin/sh # Este é um comentário! echo "Olá, mundo" # Este também é um comentário!
        
Desta vez funciona. Você provavelmente também esperava isso, se tem experiência com outras linguagens de programação. Mas a chave para entender o que acontece com comandos e scripts de shell mais complexos é entender e ser capaz de explicar: POR QUÊ?
echoagora foi chamado com apenas UM argumento - a string "Hello World". Ele imprime exatamente isso.
O ponto a ser entendido aqui é que o shell analisa os argumentos ANTES de passá-los para o programa que está sendo chamado. Nesse caso, ele remove as aspas, mas passa a string como um argumento.
Como exemplo final, digite o seguinte script. Tente prever o resultado antes de executá-lo:

primeiro2.sh
#!/bin/sh # Este é um comentário! echo "Olá Mundo" # Este também é um comentário! echo "Olá Mundo" echo "Olá * Mundo" echo Olá * Mundo echo Olá Mundo echo "Olá" Mundo echo Olá " " Mundo echo "Olá " * " Mundo" echo `olá` mundo echo 'olá' mundo
 
Está tudo como você esperava? Se não, não se preocupe! Estes são apenas alguns dos aspectos que abordaremos neste tutorial... e sim, usaremos comandos mais poderosos do que echo!