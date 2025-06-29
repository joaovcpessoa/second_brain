### **Construindo uma presença global**

Para entender a infraestrutura global da AWS, considere a cafeteria. Se um evento como um desfile, inundação ou queda de energia afetar um local, os clientes ainda poderão tomar seu café visitando um local diferente, a apenas alguns quarteirões de distância. Isso é semelhante ao funcionamento da infraestrutura global da AWS.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/b797fd36-9645-4929-a27e-0bd51e728d17/Untitled.png)

# **Selecionando uma região**

Ao determinar a região certa para seus serviços, dados e aplicativos, considere os quatro fatores de negócios a seguir.

- **Conformidade com governança de dados e requisitos legais**
    
    Dependendo da sua empresa e localização, pode ser necessário executar seus dados em áreas específicas. Por exemplo, se a sua empresa exigir que todos os seus dados residam dentro dos limites do Reino Unido, você escolheria a região de Londres. Nem todas as empresas têm regulamentações de dados específicas do local, portanto, talvez seja necessário se concentrar mais nos outros três fatores.
    
- **Proximidade com seus clientes**
    
    Selecionar uma região próxima de seus clientes ajudará você a enviar conteúdo para eles com mais rapidez. Por exemplo, sua empresa está sediada em Washington, DC, e muitos de seus clientes moram em Cingapura. Você pode considerar executar sua infraestrutura na região da Virgínia Norte, perto da sede da empresa, e executar seus aplicativos na região de Cingapura.
    
- **Serviços disponíveis em uma região**
    
    Às vezes, a região mais próxima pode não ter todos os recursos que você deseja oferecer aos clientes. A AWS inova frequentemente criando novos serviços e expandindo recursos em serviços existentes. No entanto, disponibilizar novos serviços em todo o mundo às vezes exige que a AWS construa hardware físico em uma região por vez.
    
    Suponha que seus desenvolvedores desejam criar um aplicativo que use Amazon Braket (plataforma de computação quântica AWS). Neste curso, o Amazon Braket ainda não está disponível em todas as regiões da AWS ao redor do mundo, portanto, seus desenvolvedores teriam que executá-lo em uma das regiões que já o oferece.
    
- **Preços**
    
    Suponha que você esteja pensando em executar aplicativos nos Estados Unidos e no Brasil. Da forma como a estrutura tributária do Brasil está configurada, pode custar 50% mais executar a mesma carga de trabalho na região de São Paulo em comparação com a região de Oregon. Você aprenderá com mais detalhes que vários fatores determinam os preços, mas por enquanto saiba que o custo dos serviços pode variar de região para região.
    

### **Availability Zones (AZ) -** Zonas de disponibilidade

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/dba450cc-1c20-45c8-8306-d857b12640d7/Untitled.png)

Uma **zona de disponibilidade** é um único data center ou um grupo de data centers dentro de uma região. As zonas de disponibilidade estão localizadas a dezenas de quilômetros de distância umas das outras. Isso é próximo o suficiente para ter baixa latência (o tempo entre a solicitação e o recebimento do conteúdo) entre as zonas de disponibilidade. No entanto, se ocorrer um desastre numa parte da Região, estas estarão suficientemente distantes para reduzir a possibilidade de que múltiplas Zonas de Disponibilidade sejam afetadas.

Para revisar um exemplo de execução de instâncias do Amazon EC2 em várias zonas de disponibilidade, escolha os botões de seta.

### **Instância do Amazon EC2 em uma única zona de disponibilidade**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/816c6ed1-59e1-409f-8daa-12c849e22f22/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/5ced7ce9-1134-48ba-98fe-a738784df230/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/50f7084e-7749-48d3-a57a-c4c063c81711/Untitled.png)

### **Instâncias do Amazon EC2 em várias zonas de disponibilidade**

Suponha que você esteja executando um aplicativo em uma única instância do Amazon EC2 na região norte da Califórnia. A instância está em execução na zona de disponibilidade us-west-1a. Se us-west-1a falhar, você perderá sua instância.

Uma prática recomendada é executar aplicativos em pelo menos duas zonas de disponibilidade em uma região. Neste exemplo, você pode optar por executar uma segunda instância do Amazon EC2 em us-west-1b.

Se us-west-1a falhasse, seu aplicativo ainda estaria em execução em us-west-1b.

Planejar falhas e implantar aplicativos em diversas zonas de disponibilidade é uma parte importante da construção de uma arquitetura resiliente e altamente disponível.

Um local de borda é um site que o Amazon CloudFront usa para armazenar cópias em cache do seu conteúdo mais próximo dos clientes para uma entrega mais rápida.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/47376a39-d87f-4b7b-93b7-05fb8e63658e/ad932aad-e333-45b5-8b23-d8dc6b9d5570/Untitled.png)

Suponha que os dados da sua empresa estejam armazenados no Brasil e você tenha clientes que moram na China. Para fornecer conteúdo a esses clientes, não é necessário mover todo o conteúdo para uma das regiões chinesas. Em vez de exigir que seus clientes obtenham seus dados do Brasil, você pode armazenar em cache uma cópia localmente em um local de borda próximo aos seus clientes na China. Enquanto um cliente na China solicita um de seus arquivos, o Amazon CloudFront recupera o arquivo do cache no local de borda e entrega o arquivo ao cliente. O arquivo é entregue ao cliente mais rapidamente porque veio de um ponto de presença próximo à China, em vez da origem original no Brasil

- **Quiz**
        
        ### Qual afirmação descreve melhor uma zona de disponibilidade?
        
        - [ ] Uma área geográfica que contém recursos da AWS
        - [x] Um único data center ou grupo de data centers em uma região
        - [ ] Um data center que um serviço da AWS usa para executar operações específicas do serviço
        - [ ] Um serviço que você pode usar para executar a infraestrutura da AWS em seu próprio data center local em uma abordagem híbrida
        
        ### Qual afirmação é VERDADEIRA para a infraestrutura global da AWS?
        
        - [ ] Uma região consiste em uma única zona de disponibilidade.
        - [ ] Uma zona de disponibilidade consiste em duas ou mais regiões.
        - [ ] Uma região consiste em três ou mais zonas de disponibilidade.
        - [ ] Uma zona de disponibilidade consiste em uma única região.
        
        ### Que fatores devem ser considerados ao selecionar uma região? (Selecione DOIS.)
        
        - [ ] Conformidade com governança de dados e requisitos legais
        - [ ] Proximidade com seus clientes
        - [ ] Acesso a suporte técnico 24 horas por dia, 7 dias por semana
        - [ ] Capacidade de atribuir permissões personalizadas a diferentes usuários
        - [ ] Acesso à interface de linha de comando da AWS (AWS CLI)
        
        ### Qual afirmação descreve melhor o Amazon CloudFront?
        
        - [ ] Um serviço que permite executar infraestrutura em uma abordagem de nuvem híbrida
        - [ ] Um mecanismo de computação sem servidor para contêineres
        - [ ] Um serviço que permite enviar e receber mensagens entre componentes de software por meio de uma fila
        - [ ] Um serviço global de entrega de conteúdo
        
        ### Qual site o Amazon CloudFront usa para armazenar cópias de conteúdo em cache para entrega mais rápida aos usuários em qualquer local?
        
        - [ ] Região
        - [ ] Zona de disponibilidade
        - [ ] Localização de borda
        - [ ] Origem
        
        ### Qual ação você pode executar com o AWS Outposts?
        
        - [ ] Automatize ações para serviços e aplicativos da AWS por meio de scripts.
        - [ ] Acesse assistentes e fluxos de trabalho automatizados para executar tarefas em serviços AWS.
        - [ ] Desenvolva aplicativos AWS em linguagens de programação compatíveis.
        - [ ] Amplie a infraestrutura e os serviços da AWS para diferentes locais, incluindo seu data center local.