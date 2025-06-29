# Javascript

### Perigo!!!
### Área nociva para o intelecto humano!!!
### Volte enquanto ainda há tempo!!!

## NodeJs

### Definição
---
Node.js é um ambiente de tempo de execução (runtime) JavaScript de código aberto e multiplataforma, que permite aos desenvolvedores executar código JavaScript no servidor. Ele utiliza o motor V8 do Google Chrome para executar o código JavaScript fora de um navegador web.

> [!note] Notas
> Um ambiente de tempo de execução (runtime environment) é uma coleção de ferramentas e bibliotecas que permitem a execução de programas em uma linguagem de programação específica, fornecendo o suporte necessário para que o código seja executado corretamente, incluindo a gestão de memória, a execução de threads, a manipulação de entrada e saída, entre outras funcionalidades.
> 
> O motor V8 (Máquina Virtual V8) é um motor de interpretação JavaScript desenvolvido pelo Google, sendo de código aberto, utilizado para compilar e executar código. Ele é usado principalmente no navegador Google Chrome, mas também é a base do Node.js para executar JavaScript no lado do servidor. Possui como características principais:
> 
> - **Compilação Just-In-Time (JIT)**: compila o código JavaScript diretamente para código de máquina nativo, o que melhora significativamente o desempenho em comparação com a interpretação do código em tempo real.
> - **Garbage Collection (Coleta de Lixo)**: gerencia automaticamente a memória, liberando espaço que não está mais sendo usado por programas, o que ajuda a evitar vazamentos de memória.
> - **Otimização de Código**: otimiza o código durante a execução, tornando-o mais rápido à medida que é executado repetidamente.
> - **Suporte a ECMAScript**: suporta as especificações mais recentes do ECMAScript (a padronização do JavaScript), garantindo compatibilidade com as funcionalidades modernas da linguagem.
> - **Integração com C++**: escrito em C++, o que permite uma integração eficiente com outras bibliotecas e componentes de software escritos em C++.
> - 
Foi assim que o Javascript passou a fazer parte do **Back-end** de um site. 

### Características
---
Node.js é conhecido por sua eficiência e capacidade de lidar com um grande número de conexões simultâneas, sendo muito utilizado para construir aplicações de rede escaláveis e de alto desempenho. Além disso é possível criar utilitários de linha de comando, conhecidos como **CLI**, **aplicações desktop**, **chatbots** e até **redes neurais**.

A estrela principal pela popularização e eficácia do Node, se dá ao Javascript, que possui uma arquitetura NÃO BLOQUEANTE DE TREAD ÚNICA, baseada em eventos, se diferenciando das tecnologias anteriores.

**Arquitetura Javascript**

A arquitetura do JavaScript é fundamental para entender como ele lida com operações assíncronas e multitarefas. Temos 3 componentes principais:

**1 Call Stack (Pilha de Chamadas)**

A Call Stack é uma estrutura de dados que segue o princípio LIFO (Last In, First Out), onde o último item a entrar é o primeiro a sair. Ela gerencia a execução das funções no JavaScript.

- **Funcionamento**:
    - Quando uma função é chamada, ela é empilhada na Call Stack.
    - Quando a função termina a execução, ela é removida da Call Stack.
    - Se uma função invocar outra função, a função chamada é adicionada ao topo da Call Stack.

- **Exemplo**:
```javascript
function primeiro() {   
	segundo(); 
}  

function segundo() {   
	console.log('Olá do segundo!'); 
}  
	
primeiro(); // Ordem na Call Stack: primeiro -> segundo
``` 

**2 Callback Queue (Fila de Retorno de Chamada)**

A Callback Queue é uma fila onde as mensagens (funções de callback) aguardam para serem processadas. É utilizada principalmente para gerenciar as funções assíncronas (como `setTimeout`, `Promises`, eventos de DOM, etc.).

- **Funcionamento**:
    
    - Quando uma operação assíncrona é concluída, sua função de callback é enviada para a Callback Queue.
    - As funções na Callback Queue são processadas em ordem FIFO (First In, First Out).

- **Exemplo**:
```javascript   
console.log('Primeiro');

setTimeout(() => {   
	console.log('Segundo');
 }, 1000);  

console.log('Terceiro'); // Saída: Primeiro, Terceiro, Segundo
```

**3 Event Loop (Laço de Eventos)**

O Event Loop é o mecanismo que coordena a Call Stack e a Callback Queue, garantindo que funções assíncronas sejam executadas no momento apropriado.

- **Funcionamento**:
    
    - O Event Loop observa a Call Stack e a Callback Queue.
    - Se a Call Stack estiver vazia, o Event Loop pega a primeira função da Callback Queue e a coloca na Call Stack para ser executada.
    - Este processo continua indefinidamente, garantindo que funções assíncronas sejam tratadas.
    
- **Exemplo**:
```javascript
console.log('Primeiro');  

setTimeout(() => {   
	console.log('Segundo'); 
}, 0);  
	
console.log('Terceiro'); // Saída: Primeiro, Terceiro, Segundo
```    

### Interação entre Call Stack, Callback Queue e Event Loop

- **Operações Síncronas**: Executadas diretamente na Call Stack.
- **Operações Assíncronas**: Suas funções de callback são colocadas na Callback Queue e aguardam o Event Loop para serem movidas para a Call Stack.

### Na programação NÃO existe bala de prata

Essa arquitetura permite que o JavaScript execute operações de forma não bloqueante, tornando-o eficiente para aplicações de rede e outras tarefas que envolvem operações de I/O (entrada/saída).

Linguagens como **PHP, RUST, DOT.NET** (que são Multithread), não possuem esse comportamento, ou seja, não conseguem atender mais de uma requisição por vez, forçando o usuário a esperar por cada requisição.

A cada nova requisição, eles criam uma nova Thread, se o servidor chegar no limite de threads simultâneas, os usuários podem até mesmo ocupar todas as vagas e o próximo usuário deverá esperar até que uma se encerre para ele solicitar, o famoso "gargalo".

No entanto, ele não é uma solução perfeita para todos os problemas do universo, sua arquitetura baseada em eventos do Javascript, torna o Node ideal para aplicações com I/O intenso (Input/Output), servindo mais usuários utilizando menos hardware. 

Por outro lado, aplicações que requerem alto uso de CPU, como cálculos intensivos e operações computacionais pesadas, podem não se beneficiar tanto do Node.js. Isso ocorre porque o Node.js é single-threaded, o que significa que ele utiliza apenas um núcleo de CPU por vez. Se uma operação intensiva está em execução, outras requisições precisam esperar até que ela seja concluída, podendo tornar a aplicação bloqueante e reduzir sua capacidade de resposta para outras requisições.

Para esses tipos de aplicações, frameworks e ambientes que suportam multi-threading ou processamento paralelo podem ser mais adequados, já que permitem distribuir cargas de trabalho intensivas entre múltiplos núcleos de CPU, evitando bloqueios e melhorando o desempenho geral da aplicação em cenários de alto uso de CPU.
### Instalação
---
Acessar o site: https://nodejs.org/pt
Realizar o Download

### Pacotes
---
Para instalar pacotes no Node.Js, é utilizado principalmente o npm (Node Package Manager), um gerenciador de pacotes. Ele permite que os desenvolvedores compartilhem e reutilizem código JavaScript em forma de pacotes, que são armazenados em um registro online, o que facilita a instalação, atualização e gerenciamento de dependências em projetos JavaScript.

Aqui estão algumas funcionalidades principais do npm:

1. **Instalação de pacotes**: O npm permite que você instale pacotes de bibliotecas e ferramentas que pode usar em seus projetos. Por exemplo, para instalar um pacote chamado `express`, você pode usar o comando:

```javascript
npm install express
```

2. **Gerenciamento de dependências**: O npm mantém um arquivo chamado `package.json` no qual todas as dependências do seu projeto são listadas. Isso facilita o gerenciamento de quais pacotes são necessários para o projeto e suas versões específicas.
    
3. **Publicação de pacotes**: Se você criar um módulo ou biblioteca que deseja compartilhar com outros desenvolvedores, pode publicar seu pacote no registro do npm para que outros possam instalá-lo facilmente.
    
4. **Scripts de automação**: O npm permite definir scripts que podem ser usados para automatizar tarefas comuns, como testar, compilar ou iniciar seu aplicativo. Esses scripts são definidos no arquivo `package.json`.
    

Um exemplo de um arquivo `package.json` básico seria:

```json
{
	"name": "meu-projeto",
	"version": "1.0.0",
	"description": "Descrição do meu projeto",
	"main": "index.js",
	"scripts": {
		"start": "node index.js",
		"test": "echo \"Error: no test specified\" && exit 1"
	},   
	"dependencies": {
		"express": "^4.17.1"
	} 
}
```

Nesse exemplo, o projeto tem uma dependência do pacote `express` e define scripts para iniciar o aplicativo e executar testes.

### Primeiros Passos
---

É um interpretador JS que não depende do navegador, ou seja, totalmente disvinculado do navegador 