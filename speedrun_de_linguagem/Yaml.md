### Yaml

Neste documento vou explicar tudo sobre o YAML, veremos para que serve ele serve e veremos a sintaxe de como escrever um arquivo **.yml** válido, isso é um conhecimento muito importante se você utiliza **Docker, Kubernetes, Ansible e Prometheus,** temos os arquivos de configuração de exemplo, todos escritos em yml, porque se tornou um formato amplamente usado para escrever configurações para muitas ferramentas e aplicativos DevOps diferentes, é por isso que, ao usar essas ferramentas, é importante entender os detalhes da sintaxe e seus principais conceitos em geral.?

### O que é YAML?

Yaml é uma linguagem de serialização, assim como a linguagem de serialização XML e JSON, mas o que é isso?

### O que é uma linguagem de serialização?

Basicamente significa que aplicativos escritos com diferentes linguagens de tecnologias, etc., que possuem estruturas de dados diferentes, podem transferir dados entre si usando um formato comum/padrão e os formatos mais populares são yml, jason e xml.

O nome yaml na verdade significa “YAML AIN´T MARKUP LANGUAGE”, ou seja, yaml não é linguagem de marcação. Você pode criar o arquivo yaml com um desses dois formatos de extensões: **.yaml  .yml**

### Comparação entre YAML e outras extensões

Um dos principais motivos pelos quais a popularidade do yaml aumentou tanto nos últimos anos é que ele é super legível e intuitivo, o que o torna uma ótima opção para escrever arquivos de configuração para todas as ferramentas DevOps recentes.

 Para mostrar um exemplo e também uma comparação entre YML, XML e JSON:

É assim que um arquivo yaml se parece, é muito direto e bem limpo:

```yaml
microservices:
	-app: user-authentication
		port: 9000
		version: 1.0
```

Os mesmos dados em xml:

```xml
<microservices>
	<microservice>
		<app>user-authentication</app>
		<port>9000</port>
		<version>1.0</version>
		<microservice>
</microservices>
```

Os mesmos dados em json:

```json
{
	microservices: [
		{
				app: "user-authentication",
				port: 9000,
				version: "1.0"
		}
  ]
}
```

<aside>
💡 yaml é um superconjunto de json: Qualquer arquivo json válido também é um arquivo yaml válido

</aside>

Como você vê em XML e JSON são definidas usando caracteres especiais.

XML você tem o chamado texto com colchetes angulares, Jason você tem chaves e Yaml você não tem esses caracteres especiais, então como a estrutura de dados é definida? No momento é através de separações de linha e identação, é por isso que você pode dar espaços em XML e JSON como desejar, mas no YANL você obtém um erro de validação se tiver um único espaço e uma estrutura de dados errada, o que pode ser um pouco chato, mas torna o formato mais limpo e legível que os outros.

# Sintaxe

### Chave: Valor

Então começou com a sintaxe básica que é simples pares **chave: valor.** Exemplo:

```yaml
app: user-authentication
port: 9000
version: 1.7
```

Temos tipos de dados diferentes.

Temos uma string, que não precisamos colocar entre aspas, mas você pode colocar se quiser, aspas duplas ou aspas simples.  Se você precisar usar algum caractere especial como \n (pular linha), por exemplo, então você deve colocar em strings, caso contrário, não será reconhecido, fora isso você não precisa de aspas.

```yaml
app: user-authentication
app: 'user-authentication'
app: "user-authentication"
app: 'user-authentication \n'
```

Temos um número

```yaml
port: 9000
```

### Comentários

```yaml
# Se começar com #, é interpretado como um comentário
# APP
app: user-authentication # APP
# PORT
port: 9000 # PORT
# VERSION
version: 1.7 # VERSION
```

É possível escrever um comentário entre os atributos ou em qualquer lugar no arquivo onde eu quero tornar mais legível e compreensível, então esta é uma lista simples de pares de valores-chave. 

O que você pode fazer é agrupá-los dentro de um objeto e é disso que trataremos agora.

### Objetos

Para que você possa criar um objeto, basta dar um nome ao objeto, seguido de `:` e realizar a identação dos  seus atributos. Observe que o espaço deve ser exatamente o mesmo para cada atributo dentro do objeto. É importante lembrar que yaml é tão sensível quanto aos espaços e recuos, é sempre uma boa ideia usar um validador antes de, por exemplo, executar um arquivo de configuração no Kubernetes, para ver se está correto.

```yaml
microservices:
	app: user-authentication
	port: 9000
	version: 1.0
```

Há ferramentas on-line para isso, como por exemplo essa: https://onlineyamltools.com/edit-yaml . Existem algumas outras ferramentas on-line também.

Também podemos ter listas, por exemplo, se você tiver vários microsserviços como este, criar uma lista desses microsserviços seria interessante.

### Listas

Basicamente adicionamos `-` e pronto. Sim, é isso. Não esqueça da identação

```yaml
microservices:
	-app: user-authentication
		port: 9000
		version: 1.0
```

Podemos adicionar mais como mostrado abaixo, dessa forma você pode definir listas de objetos.

```yaml
microservices:
	-app: user-authentication
		port: 9000
		version: 1.0
	-app: user-account
		port: 9001
		version: 1.3
```

Podemos também definir listas de valores simples.

```yaml
microservices:
	- user-authentication
	- user-account
```

Podemos colocar listas dentro de listas:

```yaml
microservices:
	-app: user-authentication
		port: 9000
		version: 1.0
	-app: user-account
		port: 9001
		versions: 
			- 1.3
			- 1.0
			- 1.7
```

Podemos também expressá-lo de maneira diferente, através de colchetes, colocando os valores dentro, o que torna mais legível se você tiver apenas tipos de dados simples e não objetos.

```yaml
microservices:
	-app: user-authentication
		port: 9000
		version: 1.0
	-app: user-account
		port: 9001
		versions: [1.3, 1.0, 1.7]
```

### Boolean

Podemos possuir atributos de valor booleano. você pode dizer true(verdadeiro) ou false(falso) e no yaml você também pode expressar expressões booleanas com yes(sim) ou no(não) e on(ligado) ou off(desligado). Perceba que o realce da sintaxe é diferente.

```yaml
microservices:
	-app: user-authentication
		port: 9000
		version: 1.0
		deployed: true # or false
		accessible: yes # or no
		status: on # or off
```

 Vamos ver o exemplo real no Kubernetes para ver como essa sintaxe básica é expressa lá.

```yaml
# Pod configuration
apiVersion: v1
kind: Pod
metadata:
	name: ngnix
	labels:
		app: nginx
spec:
	containers:
	- name: ngnix-container
		image: ngnix
		ports:
		- containerPort: 80
		volumeMounts:
		- name: ngnix-vol
			mountPath: /usr/nginx/html
	- name: sidecar-container
		image: curlimages/curl
		command: ["/bin/sh"]
		args: ["-c", "echo Hello from the sidecar container; sleep 300"]
```

```yaml
# Explicando de forma resumida:
# Versão da API em par chave:valor
# tipo em chave:valor
# objetos “metadata”
# name - atributo do objeto 
# objetos “labels” dentro de objetos "metadata", ou seja, um atributo
# especificação dos contâiners em um outro objeto, 
# lista de nomes - atributo de "spec"
# imagem - atributo de "spec"
# portas
# lista de portas
# lista de montagens de volumes
# caminho das montagens
```