# Introdução

### **Objetivos de aprendizado**

Neste módulo, você aprenderá como:

- Descreva os benefícios do Amazon EC2 em um nível básico.
- Identifique os diferentes tipos de instância do Amazon EC2.
- Diferencie as diversas opções de faturamento do Amazon EC2.
- Resuma os benefícios do Amazon EC2 Auto Scaling.
- Resuma os benefícios do Elastic Load Balancing.
- Dê um exemplo dos usos do Elastic Load Balancing.
- Resuma as diferenças entre o Amazon Simple Notification Service (Amazon SNS) e o Amazon Simple Queue Service (Amazon SQS).
- Resuma opções adicionais de computação da AWS.

### **Amazon Elastic Compute Cloud (Amazon EC2)**

É um serviço de computação em nuvem que permite que empresas e desenvolvedores implantem e gerenciem servidores virtuais na nuvem da AWS.

A **principal característica do EC2** é a **elasticidade**, o que significa que os usuários podem dimensionar rapidamente a capacidade de computação para cima ou para baixo, conforme necessário. Isso é útil para lidar com cargas de trabalho variáveis ou imprevisíveis, garantindo que você pague apenas pelo que usa.

Aqui estão algumas das principais características e conceitos relacionados ao EC2:

1. **Instâncias:** As instâncias EC2 são os servidores virtuais que você pode criar e executar na AWS. Você pode escolher entre uma variedade de tipos de instâncias com diferentes recursos de CPU, memória, armazenamento e desempenho de rede, adequados para diferentes tipos de cargas de trabalho.
2. **AMI (Amazon Machine Image):** Uma AMI é uma imagem pré-configurada de um sistema operacional e software que você pode usar para criar uma instância EC2. Isso facilita a implantação rápida de ambientes de servidor.
3. **Regiões e Zonas de Disponibilidade:** A AWS possui datacenters em várias regiões ao redor do mundo. Cada região é composta por várias Zonas de Disponibilidade, que são data centers independentes com infraestrutura redundante. Isso permite que você crie arquiteturas altamente disponíveis e resilientes.
4. **Grupos de Segurança:** Os grupos de segurança são conjuntos de regras de firewall que controlam o tráfego de entrada e saída para suas instâncias EC2. Eles ajudam a proteger sua infraestrutura e permitem que você defina políticas de segurança granulares.
5. **Elastic Load Balancers (ELB):** Os ELBs distribuem automaticamente o tráfego de rede entre várias instâncias EC2 em um ambiente altamente disponível, melhorando a escalabilidade e a disponibilidade de suas aplicações.
6. **Auto Scaling:** O Auto Scaling é uma funcionalidade que permite que você ajuste automaticamente o número de instâncias EC2 com base na demanda. Isso ajuda a manter um desempenho consistente e a economizar custos ao reduzir instâncias quando a demanda diminui.
7. **EBS (Elastic Block Store):** É um serviço de armazenamento persistente que pode ser anexado às instâncias EC2 para armazenar dados e sistemas de arquivos.

O EC2 é amplamente utilizado para uma variedade de casos de uso, desde hospedagem de sites até análise de dados, processamento de vídeo, aprendizado de máquina e muito mais, devido à sua flexibilidade e escalabilidade. Ele é um dos serviços mais fundamentais e populares da AWS e desempenha um papel central na infraestrutura de muitas empresas que utilizam a nuvem.

### **Como funciona o Amazon EC2**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/e033d0db-d09b-4be7-a502-95d9442f7a0f/Untitled.png)

**LAUNCH** → Primeiro, você inicia uma instância. Comece selecionando um modelo com configurações básicas para sua instância. Essas configurações incluem o sistema operacional, o servidor de aplicativos ou aplicativos. Você também seleciona o tipo de instância, que é a configuração de hardware específica da sua instância. Ao se preparar para executar uma instância, você especifica configurações de segurança para controlar o tráfego de rede que pode entrar e sair da sua instância. Posteriormente neste curso, exploraremos os recursos de segurança do Amazon EC2 com mais detalhes

**CONNECT** → Em seguida, conecte-se à instância. Você pode se conectar à instância diversas maneiras. Seus programas e aplicativos têm vários métodos diferentes para se conectar diretamente à instância e trocar dados. Os usuários também podem se conectar à instância fazendo login e acessando a área de trabalho do computador.

**USE** → Depois de se conectar à instância, você poderá começar a usá-la. Você pode executar comandos para instalar software, adicionar armazenamento, copiar e organizar arquivos e muito mais.

# Tipos de instância do Amazon EC2

As instâncias EC2 são os servidores virtuais que você pode criar e executar na AWS.

Tipos de instância do Amazon EC2 são otimizados para diferentes tarefas. Ao selecionar um tipo de instância, considere as necessidades específicas de suas cargas de trabalho e aplicativos. Isso pode incluir requisitos de recursos de computação, memória ou armazenamento.

- **Instâncias de uso geral**
    
    **As instâncias de uso geral** fornecem um equilíbrio entre recursos de computação, memória e rede. Você pode usá-los para diversas cargas de trabalho, como:
    
    - servidores de aplicativos
    - servidores de jogos
    - servidores back-end para aplicativos corporativos
    - bancos de dados pequenos e médios
    
    Suponha que você tenha um aplicativo no qual as necessidades de recursos de computação, memória e rede sejam aproximadamente equivalentes. Você pode considerar executá-lo em uma instância de uso geral porque o aplicativo não requer otimização em nenhuma área de recurso única.
    
- **Instâncias otimizadas para computação**
    
    **As instâncias otimizadas para computação** são ideais para aplicativos vinculados à computação que se beneficiam de processadores de alto desempenho. Assim como as instâncias de uso geral, você pode usar instâncias otimizadas para computação para cargas de trabalho, como servidores da Web, de aplicativos e de jogos.
    
    No entanto, a diferença é que os aplicativos otimizados para computação são ideais para servidores Web de alto desempenho, servidores de aplicativos com uso intensivo de computação e servidores de jogos dedicados.
    
    Você também pode usar instâncias otimizadas para computação para cargas de trabalho de processamento em lote que exigem o processamento de muitas transações em um único grupo.
    
- **Instâncias com otimização de memória**
    
    **As instâncias com otimização de memória** são projetadas para oferecer desempenho rápido para cargas de trabalho que processam grandes conjuntos de dados na memória. Na computação, a memória é uma área de armazenamento temporário. Ele contém todos os dados e instruções que uma unidade central de processamento (CPU) precisa para poder concluir ações. Antes que um programa de computador ou aplicativo possa ser executado, ele é carregado do armazenamento para a memória. Este processo de pré-carregamento dá à CPU acesso direto ao programa de computador.
    
    Suponha que você tenha uma carga de trabalho que exija o pré-carregamento de grandes quantidades de dados antes de executar um aplicativo. Este cenário pode ser um banco de dados de alto desempenho ou uma carga de trabalho que envolve a execução de processamento em tempo real de uma grande quantidade de dados não estruturados. Nesses tipos de casos de uso, considere usar uma instância com otimização de memória. As instâncias com otimização de memória permitem executar cargas de trabalho com grandes necessidades de memória e obter excelente desempenho.
    
- **Instâncias de computação acelerada**
    
    **As instâncias de computação acelerada** usam aceleradores de hardware, ou coprocessadores, para executar algumas funções com mais eficiência do que é possível em software executado em CPUs. Exemplos dessas funções incluem cálculos de números de ponto flutuante, processamento gráfico e correspondência de padrões de dados.
    
    Na computação, um acelerador de hardware é um componente que pode agilizar o processamento de dados. As instâncias de computação acelerada são ideais para cargas de trabalho como aplicativos gráficos, streaming de jogos e streaming de aplicativos.
    
- **Instâncias otimizadas para armazenamento**
    
    **As instâncias otimizadas para armazenamento** são projetadas para cargas de trabalho que exigem acesso alto e sequencial de leitura e gravação a grandes conjuntos de dados no armazenamento local. Exemplos de cargas de trabalho adequadas para instâncias otimizadas para armazenamento incluem sistemas de arquivos distribuídos, aplicativos de armazenamento de dados e sistemas de processamento de transações on-line de alta frequência (OLTP).
    
    Na computação, o termo operações de entrada/saída por segundo (IOPS) é uma métrica que mede o desempenho de um dispositivo de armazenamento. Indica quantas operações diferentes de entrada ou saída um dispositivo pode realizar em um segundo. As instâncias otimizadas para armazenamento são projetadas para fornecer dezenas de milhares de IOPS aleatórios e de baixa latência para aplicativos.
    
    Você pode pensar nas operações de entrada como dados inseridos em um sistema, como registros inseridos em um banco de dados. Uma operação de saída são dados gerados por um servidor. Um exemplo de saída pode ser a análise realizada nos registros de um banco de dados. Se você tiver um aplicativo com alto requisito de IOPS, uma instância otimizada para armazenamento poderá fornecer melhor desempenho em relação a outros tipos de instância não otimizados para esse tipo de caso de uso.
    

# Preços do Amazon EC2

Com o Amazon EC2, você paga apenas pelo tempo de computação usado. O Amazon EC2 oferece diversas opções de preços para diferentes casos de uso. Por exemplo, se o seu caso de uso suportar interrupções, você poderá economizar com instâncias spot. Você também pode economizar comprometendo-se antecipadamente e garantindo um nível mínimo de uso com Instâncias Reservadas.

- **Sob demanda**
    
    **As instâncias sob demanda** são ideais para cargas de trabalho irregulares de curto prazo que não podem ser interrompidas. Não se aplicam custos iniciais ou contratos mínimos. As instâncias são executadas continuamente até que você as interrompa e você paga apenas pelo tempo de computação usado.
    
    Os exemplos de casos de uso para instâncias sob demanda incluem o desenvolvimento e teste de aplicativos e a execução de aplicativos que possuem padrões de uso imprevisíveis. As instâncias sob demanda não são recomendadas para cargas de trabalho que duram um ano ou mais porque essas cargas de trabalho podem obter maiores economias de custos usando instâncias reservadas.
    
- **Instâncias reservadas**
    
    **As Instâncias Reservadas** são um desconto de faturamento aplicado ao uso de Instâncias Sob Demanda em sua conta. Existem dois tipos disponíveis de Instâncias Reservadas:
    
    - Instâncias reservadas padrão
    - Instâncias reservadas conversíveis
    
    Você pode comprar Instâncias Reservadas Padrão e Reservadas Conversíveis por um período de 1 ou 3 anos. Você obtém maiores economias de custos com a opção de 3 anos.
    
    **Instâncias reservadas padrão** : esta opção é uma boa opção se você souber o tipo e o tamanho da instância do EC2 necessários para seus aplicativos de estado estacionário e em qual região da AWS você planeja executá-los. As Instâncias Reservadas exigem que você indique as seguintes qualificações:
    
    - **Tipo e tamanho da instância:**
        
        por exemplo, m5.xlarge
        
    - **Descrição da plataforma (sistema operacional):**
        
        Por exemplo, Microsoft Windows Server ou Red Hat Enterprise Linux
        
    - **Locação:**
        
        locação padrão ou locação dedicada
        
    
    Você tem a opção de especificar uma zona de disponibilidade para suas instâncias reservadas do EC2. Se você fizer esta especificação, obterá reserva de capacidade EC2. Isso garante que a quantidade desejada de instâncias EC2 estará disponível quando você precisar delas.
    
    **Instâncias reservadas conversíveis** : se você precisar executar suas instâncias EC2 em diferentes zonas de disponibilidade ou diferentes tipos de instância, as instâncias reservadas conversíveis podem ser adequadas para você.
    
    Observação: você negocia com um desconto maior quando precisa de flexibilidade para executar suas instâncias do EC2.
    
    Ao final da vigência de uma instância reservada, você poderá continuar usando a instância do Amazon EC2 sem interrupção. No entanto, serão cobradas taxas sob demanda até que você execute uma das seguintes ações:
    
    - Encerre a instância.
    - Compre uma nova instância reservada que corresponda aos atributos da instância (família e tamanho da instância, região, plataforma e locação).
- **Planos de economia de instância EC2**
    
    A AWS oferece Savings Plans para alguns serviços de computação, incluindo Amazon EC2. **Os planos de economia de instâncias do EC2** reduzem os custos da instância do EC2 quando você assume um compromisso de gasto por hora com uma família de instâncias e uma região por um período de 1 ou 3 anos. Este compromisso de prazo resulta em economias de até 72% em comparação com as taxas sob demanda. Qualquer uso até o compromisso será cobrado de acordo com a taxa com desconto do Savings Plans (por exemplo, US$ 10 por hora). Qualquer uso além do compromisso será cobrado de acordo com taxas normais sob demanda.
    
    Os planos de economia de instâncias do EC2 são uma boa opção se você precisar de flexibilidade no uso do Amazon EC2 durante o prazo de compromisso. Você tem o benefício de economizar custos na execução de qualquer instância do EC2 em uma família de instâncias do EC2 em uma região escolhida (por exemplo, uso de M5 na Virgínia do Norte), independentemente da zona de disponibilidade, tamanho da instância, sistema operacional ou locação. As economias com os Planos de Economia de Instâncias do EC2 são semelhantes às economias proporcionadas pelas Instâncias Reservadas Padrão.
    
    Ao contrário das instâncias reservadas, no entanto, você não precisa especificar antecipadamente qual tipo e tamanho da instância do EC2 (por exemplo, m5.xlarge), sistema operacional e locação para obter um desconto. Além disso, você não precisa se comprometer com um determinado número de instâncias do EC2 ao longo de um período de 1 ou 3 anos. Além disso, os planos de economia de instância do EC2 não incluem uma opção de reserva de capacidade do EC2.
    
    Posteriormente neste curso, você revisará o AWS Cost Explorer, que pode ser usado para visualizar, compreender e gerenciar seus custos e uso da AWS ao longo do tempo. Se estiver considerando suas opções de Savings Plans, você poderá usar o AWS Cost Explorer para analisar o uso do Amazon EC2 nos últimos 7, 30 ou 60 dias. O AWS Cost Explorer também fornece recomendações personalizadas para Savings Plans. Essas recomendações estimam quanto você poderia economizar nos custos mensais do Amazon EC2, com base no uso anterior do Amazon EC2 e no valor do compromisso por hora em um Savings Plan de 1 ou 3 anos.
    
- **Instâncias spot**
    
    **As instâncias spot** são ideais para cargas de trabalho com horários de início e término flexíveis ou que podem suportar interrupções. As instâncias spot usam capacidade de computação não utilizada do Amazon EC2 e oferecem economia de custos de até 90% em relação aos preços sob demanda.
    
    Suponha que você tenha um trabalho de processamento em segundo plano que pode ser iniciado e interrompido conforme necessário (como o trabalho de processamento de dados para uma pesquisa de cliente). Você deseja iniciar e interromper o trabalho de processamento sem afetar as operações gerais do seu negócio. Se você fizer uma solicitação spot e a capacidade do Amazon EC2 estiver disponível, sua instância spot será executada. No entanto, se você fizer uma solicitação Spot e a capacidade do Amazon EC2 não estiver disponível, a solicitação não será bem-sucedida até que a capacidade fique disponível. A capacidade indisponível pode atrasar o lançamento do seu trabalho de processamento em segundo plano.
    
    Depois de executar uma instância spot, se a capacidade não estiver mais disponível ou a demanda por instâncias spot aumentar, sua instância poderá ser interrompida. Isso pode não representar nenhum problema para o seu trabalho de processamento em segundo plano. Entretanto, no exemplo anterior de desenvolvimento e teste de aplicativos, você provavelmente desejaria evitar interrupções inesperadas. Portanto, escolha um tipo de instância EC2 diferente que seja ideal para essas tarefas.
    
- **Anfitriões Dedicados**
    

# Dimensionamento do Amazon EC2

### **Escalabilidade**

**A escalabilidade** envolve começar apenas com os recursos necessários e projetar sua arquitetura para responder automaticamente às mudanças na demanda, aumentando ou aumentando a escala. Como resultado, você paga apenas pelos recursos que usa. Você não precisa se preocupar com a falta de capacidade computacional para atender às necessidades de seus clientes.

Se você quisesse que o processo de escalonamento acontecesse automaticamente, qual serviço da AWS você usaria? O serviço da AWS que fornece essa funcionalidade para instâncias do Amazon EC2 é **o Amazon EC2 Auto Scaling** .

### **Escalonamento automático do Amazon EC2**

Se você tentou acessar um site que não carregava e frequentemente expirava, o site pode ter recebido mais solicitações do que era capaz de atender. Essa situação é semelhante à espera em uma longa fila em uma cafeteria, quando há apenas um barista presente para receber os pedidos dos clientes.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/a3f4dd1c-9bad-428e-84b4-34d7016d0706/Untitled.png)

O Amazon EC2 Auto Scaling permite adicionar ou remover automaticamente instâncias do Amazon EC2 em resposta às mudanças na demanda dos aplicativos. Ao aumentar e diminuir automaticamente suas instâncias conforme necessário, você pode manter uma maior sensação de disponibilidade do aplicativo.

No Amazon EC2 Auto Scaling, você pode usar duas abordagens: escalabilidade dinâmica e escalabilidade preditiva.

- _A escalabilidade dinâmica_
    
    responde às mudanças na demanda.
    
- _A escalabilidade preditiva_
    
    programa automaticamente o número certo de instâncias do Amazon EC2 com base na demanda prevista.
    

### **Exemplo: escalonamento automático do Amazon EC2**

Na nuvem, o poder da computação é um recurso programático, portanto você pode adotar uma abordagem mais flexível para a questão do dimensionamento. Ao adicionar o Amazon EC2 Auto Scaling a um aplicativo, você pode adicionar novas instâncias ao aplicativo quando necessário e encerrá-las quando não forem mais necessárias.

Suponha que você esteja se preparando para executar um aplicativo em instâncias do Amazon EC2. Ao configurar o tamanho do seu grupo de Auto Scaling, você pode definir o número mínimo de instâncias do Amazon EC2 como uma. Isso significa que sempre deve haver pelo menos uma instância do Amazon EC2 em execução.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/3d704a76-6772-43f0-a08b-28f43326fddd/Untitled.png)

Ao criar um grupo do Auto Scaling, você pode definir o número mínimo de instâncias do Amazon EC2. A **capacidade mínima** é o número de instâncias do Amazon EC2 executadas imediatamente após a criação do grupo do Auto Scaling. Neste exemplo, o grupo do Auto Scaling tem capacidade mínima de uma instância do Amazon EC2.

Em seguida, você pode definir a **capacidade desejada** em duas instâncias do Amazon EC2, mesmo que seu aplicativo precise de no mínimo uma única instância do Amazon EC2 para ser executado.

A terceira configuração que você pode definir em um grupo do Auto Scaling é a **capacidade máxima** . Por exemplo, você pode configurar o grupo do Auto Scaling para escalar horizontalmente em resposta ao aumento da demanda, mas apenas para um máximo de quatro instâncias do Amazon EC2.

Como o Amazon EC2 Auto Scaling usa instâncias do Amazon EC2, você paga apenas pelas instâncias que usar, quando usá-las. Agora você tem uma arquitetura econômica que oferece a melhor experiência ao cliente e, ao mesmo tempo, reduz despesas.

# Direcionando o tráfego com o Elastic Load Balancing

### **Balanceamento de carga elástico**

**Elastic Load Balancing** é o serviço da AWS que distribui automaticamente o tráfego de entrada de aplicativos entre vários recursos, como instâncias do Amazon EC2.

Um balanceador de carga atua como um ponto único de contato para todo o tráfego da Web de entrada em seu grupo de Auto Scaling. Isso significa que, à medida que você adiciona ou remove instâncias do Amazon EC2 em resposta à quantidade de tráfego de entrada, essas solicitações são roteadas primeiro para o balanceador de carga. Então, as solicitações se espalham por vários recursos que irão tratá-las. Por exemplo, se você tiver várias instâncias do Amazon EC2, o Elastic Load Balancing distribuirá a carga de trabalho entre as várias instâncias para que nenhuma instância tenha que transportar a maior parte dela.

Embora o Elastic Load Balancing e o Amazon EC2 Auto Scaling sejam serviços separados, eles trabalham juntos para ajudar a garantir que os aplicativos em execução no Amazon EC2 possam fornecer alto desempenho e disponibilidade.

---

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/a2441379-4e1b-4892-94b6-0e3882f7164f/Untitled.png)

### **Exemplo: Elastic Load Balancing**

**Período de baixa demanda**

Aqui está um exemplo de como funciona o Elastic Load Balancing. Suponha que alguns clientes tenham vindo à cafeteria e estejam prontos para fazer seus pedidos.

Se apenas alguns registros estiverem abertos, isso corresponde à demanda dos clientes que necessitam de atendimento. É menos provável que a cafeteria tenha caixas abertas sem clientes. Neste exemplo, você pode pensar nos registros como instâncias do Amazon EC2.

---

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/7a901b43-e31d-4b25-b959-637943c2a646/Untitled.png)

**Período de alta demanda**

Ao longo do dia, à medida que aumenta o número de clientes, a cafeteria abre mais caixas para acomodá-los.

Além disso, um funcionário da cafeteria direciona os clientes para o registro mais apropriado, para que o número de solicitações possa ser distribuído uniformemente pelos registros abertos. Você pode pensar nesse funcionário da cafeteria como um balanceador de carga.

# Mensagens e filas

### **Aplicativos monolíticos e microsserviços**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/eaf0dd74-8f37-4718-8228-3dba8f2dae79/Untitled.png)

Os aplicativos são feitos de vários componentes. Os componentes se comunicam entre si para transmitir dados, atender solicitações e manter o aplicativo em execução.

Suponha que você tenha um aplicativo com componentes fortemente acoplados. Esses componentes podem incluir bancos de dados, servidores, interface do usuário, lógica de negócios e assim por diante. Este tipo de arquitetura pode ser considerada uma **aplicação monolítica** .

Nesta abordagem da arquitetura de aplicativos, se um único componente falhar, outros componentes falharão e, possivelmente, todo o aplicativo falhará.

**Para ajudar a manter a disponibilidade do aplicativo quando um único componente falha, você pode projetar seu aplicativo por meio de uma abordagem de microsserviços .**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/c7f27510-6f8f-4f00-a158-089ffc5ec0ac/Untitled.png)

Em uma abordagem de microsserviços, os componentes do aplicativo são fracamente acoplados. Neste caso, se um único componente falhar, os outros componentes continuam a funcionar porque estão se comunicando entre si. O acoplamento frouxo evita que todo o aplicativo falhe.

Ao projetar aplicativos na AWS, você pode adotar uma abordagem de microsserviços com serviços e componentes que cumprem diferentes funções. Dois serviços facilitam a integração de aplicativos: Amazon Simple Notification Service (Amazon SNS) e Amazon Simple Queue Service (Amazon SQS).

### **Serviço de notificação simples da Amazon (Amazon SNS)**

**Amazon Simple Notification Service (Amazon SNS)**  é um serviço de publicação/assinatura. Usando tópicos do Amazon SNS, um editor publica mensagens aos assinantes. Isto é semelhante à cafeteria; o caixa entrega os pedidos de café ao barista que prepara as bebidas.

No Amazon SNS, os assinantes podem ser servidores web, endereços de e-mail, funções do AWS Lambda ou diversas outras opções.

### **Publicar atualizações de um único tópico**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/ec02c25c-79af-4953-9d2d-5ad8e53f8319/Untitled.png)

Suponha que a cafeteria tenha um único boletim informativo que inclua atualizações de todas as áreas de seu negócio. Inclui tópicos como cupons, curiosidades sobre café e novos produtos. Todos esses tópicos estão agrupados porque este é um boletim informativo único. Todos os clientes que assinam a newsletter recebem atualizações sobre cupons, curiosidades sobre café e novos produtos.

Depois de um tempo, alguns clientes expressam que prefeririam receber newsletters separadas apenas para tópicos específicos de seu interesse. Os donos das cafeterias decidem tentar essa abordagem.

### **Publicação de atualizações de vários tópicos**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/20f1c8d4-bd30-47d2-8852-b5e9db320373/Untitled.png)

Agora, em vez de ter um único boletim informativo para todos os tópicos, a cafeteria o dividiu em três boletins informativos separados. Cada boletim informativo é dedicado a um tópico específico: cupons, curiosidades sobre café e novos produtos.

Os assinantes agora receberão atualizações imediatamente apenas para os tópicos específicos nos quais se inscreveram.

É possível que os assinantes se inscrevam em um único tópico ou em vários tópicos. Por exemplo, o primeiro cliente assina apenas o tópico de cupons e o segundo assinante assina apenas o tópico de curiosidades sobre café. O terceiro cliente assina os tópicos de curiosidades sobre café e novos produtos.

Embora esses exemplos da cafeteria envolvam assinantes que são pessoas, no Amazon SNS os assinantes podem ser servidores web, endereços de e-mail, funções do AWS Lambda ou várias outras opções.

### **Serviço de fila simples da Amazon (Amazon SQS)**

**Amazon Simple Queue Service (Amazon SQS)** é um serviço de enfileiramento de mensagens.

Usando o Amazon SQS, você pode enviar, armazenar e receber mensagens entre componentes de software, sem perder mensagens ou exigir a disponibilidade de outros serviços. No Amazon SQS, um aplicativo envia mensagens para uma fila. Um usuário ou serviço recupera uma mensagem da fila, processa-a e, em seguida, exclui-a da fila.

Para revisar dois exemplos de como usar o Amazon SQS, escolha os botões de seta para exibir cada um deles.

### **Exemplo 1: Cumprindo um pedido**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/b2224b7b-f43b-42c7-8fff-0d70bfb8865b/Untitled.png)

Suponha que a cafeteria tenha um processo de pedidos em que um caixa recebe os pedidos e um barista os faz. Pense no caixa e no barista como dois componentes separados de um aplicativo.

Primeiro, o caixa recebe um pedido e o anota em um pedaço de papel. Em seguida, o caixa entrega o papel ao barista. Por fim, o barista prepara a bebida e entrega ao cliente.

Quando chega o próximo pedido, o processo se repete. Este processo funciona sem problemas, desde que o caixa e o barista estejam coordenados.

O que poderia acontecer se o caixa anotasse um pedido e fosse entregá-lo ao barista, mas o barista estivesse fora de folga ou ocupado com outro pedido? O caixa precisaria esperar até que o barista estivesse pronto para aceitar o pedido. Isso causaria atrasos no processo de pedido e exigiria que os clientes esperassem mais para receber seus pedidos.

À medida que a cafeteria se tornou mais popular e a fila de pedidos se move mais lentamente, os proprietários percebem que o atual processo de pedidos é demorado e ineficiente. Eles decidem tentar uma abordagem diferente que usa uma fila.

### **Exemplo 2: Pedidos em fila**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/ada7dcf8-4923-4e37-95ba-b34d478bb99e/Untitled.png)

Lembre-se de que o caixa e o barista são dois componentes separados de um aplicativo. Um serviço de enfileiramento de mensagens, como o Amazon SQS, permite mensagens entre complementos de aplicativos desacoplados.

Neste exemplo, a primeira etapa do processo permanece a mesma de antes: um cliente faz um pedido ao caixa.

O caixa coloca o pedido em uma fila. Você pode pensar nisso como um quadro de pedidos que serve como uma barreira entre o caixa e o barista. Mesmo que o barista esteja de folga ou ocupado com outro pedido, o caixa pode continuar colocando novos pedidos na fila.

Em seguida, o barista verifica a fila e recupera o pedido.

O barista prepara a bebida e entrega ao cliente.

O barista então remove o pedido concluído da fila.

Enquanto o barista prepara a bebida, o caixa pode continuar anotando novos pedidos e adicionando-os à fila.

Para aplicações e microsserviços desacoplados, o Amazon SQS permite enviar, armazenar e recuperar mensagens entre componentes.

Esta abordagem desacoplada permite que os componentes separados funcionem de forma mais eficiente e independente.

# Serviços de computação adicionais

# **Computação sem servidor**

Anteriormente neste módulo, você aprendeu sobre o Amazon EC2, um serviço que permite executar servidores virtuais na nuvem. Se você tiver aplicativos que deseja executar no Amazon EC2, faça o seguinte:

- Provisionar instâncias (servidores virtuais).
- Carregue seu código.
- Continue gerenciando as instâncias enquanto seu aplicativo estiver em execução.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/21922c89-c4ef-48a4-8da8-d74eb24eae54/Untitled.png)

O termo “sem servidor” significa que seu código é executado em servidores, mas você não precisa provisionar ou gerenciar esses servidores. Com a computação sem servidor, você pode se concentrar mais na inovação de novos produtos e recursos, em vez de manter servidores.

Outro benefício da computação sem servidor é a flexibilidade de dimensionar aplicativos sem servidor automaticamente. A computação sem servidor pode ajustar a capacidade dos aplicativos modificando as unidades de consumo, como taxa de transferência e memória.

Um serviço AWS para computação sem servidor é o **AWS Lambda** .

### **AWS Lambda**

**[AWS Lambda](https://aws.amazon.com/lambda)** é um serviço que permite executar código sem a necessidade de provisionar ou gerenciar servidores.

Ao usar o AWS Lambda, você paga apenas pelo tempo de computação consumido. As cobranças se aplicam somente quando seu código está em execução. Você também pode executar código para praticamente qualquer tipo de aplicativo ou serviço de back-end, tudo sem administração.

Por exemplo, uma função Lambda simples pode envolver o redimensionamento automático de imagens carregadas na Nuvem AWS. Neste caso, a função é acionada ao fazer upload de uma nova imagem.

### **Como funciona o AWS Lambda**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/e7379934-1254-4168-ad7d-e5acd0b5becd/Untitled.png)

- Você carrega seu código no Lambda.
- Você define seu código para ser acionado a partir de uma fonte de eventos, como serviços da AWS, aplicativos móveis ou endpoints HTTP.
- O Lambda executa seu código somente quando acionado.
- Você paga apenas pelo tempo de computação usado. No exemplo anterior de redimensionamento de imagens, você pagaria apenas pelo tempo de computação usado ao fazer upload de novas imagens. O upload das imagens aciona o Lambda para executar o código para a função de redimensionamento de imagem.

Na AWS, você também pode criar e executar aplicativos **em contêineres .**

### **Containers**

**Os contêineres** fornecem uma maneira padrão de empacotar o código e as dependências do seu aplicativo em um único objeto. Você também pode usar contêineres para processos e fluxos de trabalho nos quais há requisitos essenciais de segurança, confiabilidade e escalabilidade.

### **Um host com vários contêineres**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/6030b6e4-1d50-433d-8ea1-c1dfbbf66a7c/Untitled.png)

Suponha que o desenvolvedor de aplicativos de uma empresa tenha um ambiente em seu computador diferente do ambiente dos computadores usados pela equipe de operações de TI. O desenvolvedor deseja garantir que o ambiente do aplicativo permaneça consistente, independentemente da implantação, por isso usa uma abordagem em contêineres. Isso ajuda a reduzir o tempo gasto na depuração de aplicativos e no diagnóstico de diferenças em ambientes de computação.

### **Dezenas de hosts com centenas de contêineres**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/a32add8c-9c97-414a-9a1f-5e287f63ad50/Untitled.png)

Ao executar aplicativos em contêineres, é importante considerar a escalabilidade. Suponha que, em vez de um único host com vários contêineres, você precise gerenciar dezenas de hosts com centenas de contêineres. Alternativamente, você terá que gerenciar possivelmente centenas de hosts com milhares de contêineres. Em grande escala, imagine quanto tempo pode levar para monitorar o uso de memória, segurança, registro e assim por diante.

Os serviços de orquestração de contêineres ajudam você a implantar, gerenciar e dimensionar seus aplicativos em contêineres. A seguir, você aprenderá sobre dois serviços que fornecem orquestração de contêineres: Amazon Elastic Container Service e Amazon Elastic Kubernetes Service.

### **Amazon Elastic Container Service (Amazon ECS)**

**[Amazon Elastic Container Service (Amazon ECS)](https://aws.amazon.com/ecs/)** é um sistema de gerenciamento de contêineres altamente escalonável e de alto desempenho que permite executar e dimensionar aplicativos em contêineres na AWS.

O Amazon ECS oferece suporte a contêineres Docker. [Docker](https://www.docker.com/) é uma plataforma de software que permite criar, testar e implantar aplicativos rapidamente. A AWS oferece suporte ao uso do Docker Community Edition de código aberto e do Docker Enterprise Edition baseado em assinatura. Com o Amazon ECS, você pode usar chamadas de API para iniciar e interromper aplicativos habilitados para Docker.

### **Serviço Amazon Elastic Kubernetes (Amazon EKS)**

**[Serviço Amazon Elastic Kubernetes (Amazon EKS)](https://aws.amazon.com/eks/)** é um serviço totalmente gerenciado que você pode usar para executar Kubernetes na AWS.

[Kubernetes(abre em uma nova aba)](https://kubernetes.io/)é um software de código aberto que permite implantar e gerenciar aplicativos em contêineres em escala. Uma grande comunidade de voluntários mantém o Kubernetes, e a AWS trabalha ativamente em conjunto com a comunidade do Kubernetes. À medida que novos recursos e funcionalidades são lançados para aplicativos Kubernetes, você pode aplicar facilmente essas atualizações aos seus aplicativos gerenciados pelo Amazon EKS.

### **AWS Fargate**

**[AWS Fargate](https://aws.amazon.com/fargate/)** é um mecanismo de computação sem servidor para contêineres. Funciona com Amazon ECS e Amazon EKS.

Ao usar o AWS Fargate, você não precisa provisionar ou gerenciar servidores. O AWS Fargate gerencia sua infraestrutura de servidores para você. Você pode se concentrar mais na inovação e no desenvolvimento de seus aplicativos e pagar apenas pelos recursos necessários para executar seus contêineres.

---

- **Perguntas**
    
    ### Qual tipo de instância do Amazon EC2 é adequado para aplicações de armazenamento de dados?
    
    - [ ] Memória otimizada
    - [x] Armazenamento otimizado
    - [ ] Propósito geral
    - [ ] Computação otimizada
    
    ### Qual tipo de instância do Amazon EC2 equilibra recursos de computação, memória e rede?
    
    - [ ] Memória otimizada
    - [ ] Armazenamento otimizado
    - [x] Propósito geral
    - [ ] Computação otimizada
    
    ### Qual tipo de instância do Amazon EC2 é ideal para bancos de dados de alto desempenho?
    
    - [x] Memória otimizada
    - [ ] Armazenamento otimizado
    - [ ] Propósito geral
    - [ ] Computação otimizada
    
    ### Qual tipo de instância do Amazon EC2 oferece processadores de alto desempenho?
    
    - [ ] Memória otimizada
    - [ ] Armazenamento otimizado
    - [ ] Propósito geral
    - [x] Computação otimizada
    
    ### Qual opção de preço do Amazon EC2 oferece desconto quando você especifica um número de instâncias do EC2 para executar um sistema operacional, família e tamanho de instâncias e locação específicos em uma região?
    
    - [ ] Instâncias reservadas conversíveis
    - [ ] Planos de economia de instância EC2
    - [ ] Instâncias spot
    - [x] Instâncias reservadas padrão
    
    ### Qual opção de preço do Amazon EC2 oferece desconto quando você assume um compromisso de gasto por hora com uma família de instâncias e uma região por um período de 1 ou 3 anos?
    
    - [ ] Sob demanda
    - [x] Planos de economia de instância EC2
    - [ ] Instâncias spot
    - [ ] Instâncias reservadas
    
    ### Qual serviço AWS é a melhor escolha para publicar mensagens para assinantes?
    
    - [ ] Serviço de fila simples da Amazon (Amazon SQS)
    - [ ] Escalonamento automático do Amazon EC2
    - [x] Serviço de notificação simples da Amazon (Amazon SNS)
    - [ ] Balanceamento de carga elástico
    
    ### Você deseja usar uma instância do Amazon EC2 para uma carga de trabalho de processamento em lote. Qual seria o melhor tipo de instância do Amazon EC2 para usar?
    
    - [ ] Propósito geral
    - [ ] Memória otimizada
    - [x] Computação otimizada
    - [ ] Armazenamento otimizado
    
    ### Quais são as opções de duração do contrato para instâncias reservadas do Amazon EC2? (Selecione DOIS.)
    
    - [x] 1 ano
    - [ ] 2 anos
    - [x] 3 anos
    - [ ] 4 anos
    - [ ] 5 anos
    
    ### Você tem uma carga de trabalho que durará um total de 6 meses e pode suportar interrupções. Qual seria a opção de compra do Amazon EC2 mais econômica?
    
    - [ ] Instância Reservada
    - [x] Instância spot
    - [ ] Instância dedicada
    - [ ] Instância sob demanda
    
    ### Qual processo é um exemplo de Elastic Load Balancing?
    
    - [ ] Garantir que nenhuma instância do Amazon EC2 tenha que carregar toda a carga de trabalho sozinha
    - [ ] Remoção de instâncias desnecessárias do Amazon EC2 quando a demanda é baixa
    - [ ] Adicionar uma segunda instância do Amazon EC2 durante uma promoção popular de uma loja online
    - [ ] Ajustar automaticamente o número de instâncias do Amazon EC2 para atender à demanda
    
    ### Você deseja implantar e gerenciar aplicativos em contêineres. Qual serviço você deve usar?
    
    - [ ] AWS Lambda
    - [ ] Serviço de notificação simples da Amazon (Amazon SNS)
    - [ ] Serviço de fila simples da Amazon (Amazon SQS)
    - [ ] Serviço Amazon Elastic Kubernetes (Amazon EKS)