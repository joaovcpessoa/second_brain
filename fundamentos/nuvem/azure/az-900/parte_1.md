# Fundamentos do Microsoft Azure

### Introdução aos fundamentos do Microsoft Azure

O Microsoft Azure é uma plataforma de computação em nuvem com um conjunto de serviços em constante expansão para ajudá-lo a criar soluções para atingir suas metas de negócios. Os serviços do Azure suportam tudo, desde simples a complexos. O Azure tem serviços Web simples para alojar a presença da sua empresa na nuvem. O Azure também suporta a execução de computadores totalmente virtualizados que gerem as suas soluções de software personalizadas. O Azure fornece uma grande variedade de serviços baseados na nuvem, como armazenamento remoto, hospedagem de banco de dados e gerenciamento centralizado de contas. O Azure também oferece novos recursos, como inteligência artificial (IA) e serviços focados em Internet das Coisas (IoT).

Nesta série, você abordará noções básicas de computação em nuvem, será apresentado a alguns dos principais serviços fornecidos pelo Microsoft Azure e aprenderá mais sobre os serviços de governança e conformidade que você pode usar.

### O que é o Azure Fundamentals?

Os Fundamentos do Azure são uma série de três caminhos de aprendizagem que o familiarizam com o Azure e os seus muitos serviços e funcionalidades.

Se você está interessado em serviços de computação, rede ou armazenamento; aprender sobre as melhores práticas de segurança na nuvem; ou explorando opções de governança e gerenciamento, pense nos Fundamentos do Azure como seu guia selecionado para o Azure.

Os Fundamentos do Azure incluem exercícios interativos que lhe dão uma experiência prática com o Azure. Muitos exercícios fornecem um ambiente temporário do portal do Azure chamado sandbox, que permite que você pratique a criação gratuita de recursos de nuvem no seu próprio ritmo.

Não é necessária experiência técnica em TI; no entanto, ter conhecimentos gerais de TI irá ajudá-lo a tirar o máximo partido da sua experiência de aprendizagem.

### Por que devo usar o Azure Fundamentals?

Se você está apenas começando a trabalhar com a nuvem ou se já tem experiência na nuvem, o Azure Fundamentals fornece tudo o que você precisa para começar.

Independentemente dos seus objetivos, o Azure Fundamentals tem algo para si. Deve frequentar este curso se:

- Ter interesse geral no Azure ou na computação em nuvem
- Quer obter a certificação oficial da Microsoft (AZ-900)

A série de caminhos de aprendizagem Azure Fundamentals pode ajudá-lo a preparar-se para o Exame AZ-900: Fundamentos do Microsoft Azure. Este exame inclui três áreas de domínio do conhecimento:

| Área de Domínio AZ-900 | Peso  |
| ---------------------- | ----- |
| Descrever conceitos de nuvem | 25-30% |
| Descrever a arquitetura e os serviços do Azure | 35-40% |
| Descrever o gerenciamento e a governança do Azure | 30-35% |

Cada área de domínio é mapeada para um caminho de aprendizagem nos Fundamentos do Azure. As percentagens apresentadas indicam o peso relativo de cada área no exame. Quanto maior a porcentagem, mais questões essa parte do exame conterá. Certifique-se de ler a página do exame para obter detalhes sobre quais habilidades são cobertas em cada área.

Este treinamento ajuda você a desenvolver uma compreensão ampla do Azure.

### Introdução à computação na cloud

Neste módulo, você será apresentado aos conceitos gerais de nuvem. Você começará com uma introdução à nuvem em geral. Em seguida, você mergulhará em conceitos como responsabilidade compartilhada, diferentes modelos de nuvem e explorará o método de preços exclusivo para a nuvem.

Se você já está familiarizado com a computação em nuvem, este módulo pode ser amplamente revisado para você.

### Objetivos de aprendizagem

Depois de concluir este módulo, conseguirá:

- Defina cloud computing.
- Descreva o modelo de responsabilidade partilhada.
- Defina modelos de nuvem, incluindo pública, privada e híbrida.
- Identifique casos de uso apropriados para cada modelo de nuvem.
- Descreva o modelo baseado no consumo.
- Compare modelos de preços na nuvem.

### O que é a computação na cloud

A computação em nuvem é a prestação de serviços de computação através da Internet. Os serviços de computação incluem infraestrutura de TI comum, como máquinas virtuais, armazenamento, bancos de dados e rede. Os serviços em nuvem também expandem as ofertas tradicionais de TI para incluir coisas como Internet das Coisas (IoT), aprendizado de máquina (ML) e inteligência artificial (IA).

Como a computação em nuvem usa a internet para fornecer esses serviços, ela não precisa ser restringida pela infraestrutura física da mesma forma que um datacenter tradicional. Isso significa que, se você precisar aumentar sua infraestrutura de TI rapidamente, não precisará esperar para criar um novo datacenter — você pode usar a nuvem para expandir rapidamente sua pegada de TI.

### Modelo de responsabilidade partilhada

Comece com um datacenter corporativo tradicional. A empresa é responsável por manter o espaço físico, garantir a segurança e manter ou substituir os servidores caso algo aconteça. O departamento de TI é responsável pela manutenção de toda a infraestrutura e software necessários para manter o datacenter em funcionamento. Eles também provavelmente serão responsáveis por manter todos os sistemas corrigidos e na versão correta.

Com o modelo de responsabilidade compartilhada, essas responsabilidades são compartilhadas entre o provedor de nuvem e o consumidor. Segurança física, energia, resfriamento e conectividade de rede são de responsabilidade do provedor de nuvem. O consumidor não está localizado no mesmo local que o datacenter, então não faria sentido para o consumidor ter nenhuma dessas responsabilidades.

Ao mesmo tempo, o consumidor é responsável pelos dados e informações armazenados na nuvem. (Você não gostaria que o provedor de nuvem pudesse ler suas informações.) O consumidor também é responsável pela segurança de acesso, ou seja, só dá acesso a quem precisa.

Depois, para algumas coisas, a responsabilidade depende da situação. Se você estiver usando um banco de dados SQL na nuvem, o provedor de nuvem será responsável pela manutenção do banco de dados real. No entanto, você ainda é responsável pelos dados que são ingeridos no banco de dados. Se você implantou uma máquina virtual e instalou um banco de dados SQL nela, será responsável por patches e atualizações de banco de dados, bem como pela manutenção dos dados e informações armazenados no banco de dados.

Com um datacenter local, você é responsável por tudo. Com a computação em nuvem, essas responsabilidades mudam. O modelo de responsabilidade compartilhada está fortemente ligado aos tipos de serviços em nuvem (abordados mais adiante neste caminho de aprendizagem): infraestrutura como serviço (IaaS), plataforma como serviço (PaaS) e software como serviço (SaaS). A IaaS coloca a maior responsabilidade no consumidor, com o provedor de nuvem sendo responsável pelos conceitos básicos de segurança física, energia e conectividade. No outro extremo do espectro, o SaaS coloca a maior parte da responsabilidade no provedor de nuvem. O PaaS, sendo um meio termo entre IaaS e SaaS, repousa em algum lugar no meio e distribui uniformemente a responsabilidade entre o provedor de nuvem e o consumidor.

O diagrama a seguir destaca como o Modelo de Responsabilidade Compartilhada informa quem é responsável por quê, dependendo do tipo de serviço de nuvem.

![alt text](/fundamentos/nuvem/azure/images/modelo_de_responsabilidade_compartilhada.png)

Ao usar um provedor de nuvem, você sempre será responsável por:
- As informações e os dados armazenados na nuvem
- Dispositivos que têm permissão para se conectar à sua nuvem (telefones celulares, computadores e assim por diante)
- As contas e identidades das pessoas, serviços e dispositivos dentro da sua organização

O provedor de nuvem é sempre responsável por:
- O datacenter físico
- A rede física
- Os anfitriões físicos

Seu modelo de serviço determinará a responsabilidade por coisas como:
- Sistemas operacionais
- Controlos de rede
- Aplicações
- Identidade e infraestrutura

### Definir modelos de nuvem

O que são modelos de nuvem? Os modelos de nuvem definem o tipo de implantação de recursos de nuvem. Os três principais modelos de nuvem são: privada, pública e híbrida.

<b>Cloud privada</b><br>
Vamos começar com uma nuvem privada. Uma nuvem privada é, de certa forma, a evolução natural de um datacenter corporativo. É uma nuvem (que fornece serviços de TI pela internet) que é usada por uma única entidade. A nuvem privada proporciona um controle muito maior para a empresa e seu departamento de TI. No entanto, ele também vem com maior custo e menos benefícios de uma implantação de nuvem pública. Finalmente, uma nuvem privada pode ser hospedada a partir do seu datacenter no local. Ele também pode ser hospedado em um datacenter dedicado externo, potencialmente até mesmo por um terceiro que dedicou esse datacenter à sua empresa.

<b>Cloud pública</b><br>
Uma nuvem pública é construída, controlada e mantida por um provedor de nuvem de terceiros. Com uma nuvem pública, qualquer pessoa que queira comprar serviços de nuvem pode acessar e usar recursos. A disponibilidade pública geral é uma diferença fundamental entre nuvens públicas e privadas.

<b>Cloud híbrida</b><br>
Uma nuvem híbrida é um ambiente de computação que usa nuvens públicas e privadas em um ambiente interconectado. Um ambiente de nuvem híbrida pode ser usado para permitir que uma nuvem privada aumente a demanda temporária implantando recursos de nuvem pública. A nuvem híbrida pode ser usada para fornecer uma camada extra de segurança. Por exemplo, os usuários podem escolher de forma flexível quais serviços manter na nuvem pública e quais implantar em sua infraestrutura de nuvem privada.

A tabela a seguir destaca alguns aspetos comparativos importantes entre os modelos de nuvem.

| Cloud pública	| Cloud privada	| Cloud híbrida |
| ------------- | ------------- | ------------- |
| Sem despesas de capital para aumentar a escala | As organizações têm controle total sobre recursos e segurança | Proporciona a maior flexibilidade |
| Os aplicativos podem ser rapidamente provisionados e desprovisionados	| Os dados não são colocados com os dados de outras organizações | As organizações determinam onde executar seus aplicativos |
As organizações pagam apenas pelo que usam | O hardware deve ser adquirido para inicialização e manutenção | As organizações controlam requisitos de segurança, conformidade ou legais |
| As organizações não têm controle total sobre recursos e segurança | As organizações são responsáveis pela manutenção e atualizações de hardware |

<b>Várias clouds</b><br>
Um quarto cenário, cada vez mais provável, é um cenário multinuvem. Em um cenário de várias nuvens, você usa vários provedores de nuvem pública. Talvez você use recursos diferentes de diferentes provedores de nuvem. Ou talvez você tenha começado sua jornada na nuvem com um provedor e esteja no processo de migração para um provedor diferente. Independentemente disso, em um ambiente multinuvem você lida com dois (ou mais) provedores de nuvem pública e gerencia recursos e segurança em ambos os ambientes.

<b>Azure Arc</b><br>
O Azure Arc é um conjunto de tecnologias que ajuda a gerenciar seu ambiente de nuvem. O Azure Arc pode ajudar a gerenciar seu ambiente de nuvem, seja uma nuvem pública exclusivamente no Azure, uma nuvem privada em seu datacenter, uma configuração híbrida ou até mesmo um ambiente multinuvem executado em vários provedores de nuvem ao mesmo tempo.

<b>Solução VMware do Azure</b><br>
E se você já estiver estabelecido com a VMware em um ambiente de nuvem privada, mas quiser migrar para uma nuvem pública ou híbrida? A Solução VMware do Azure permite executar suas cargas de trabalho VMware no Azure com integração e escalabilidade perfeitas.

### Descrever o modelo baseado no consumo

Ao comparar modelos de infraestrutura de TI, há dois tipos de despesas a considerar. Despesas de capital (CapEx) e despesas operacionais (OpEx).

O CapEx é normalmente uma despesa única e inicial para comprar ou garantir recursos tangíveis. Um novo edifício, a repavimentação do estacionamento, a construção de um datacenter ou a compra de um veículo da empresa são exemplos de CapEx.

Em contraste, o OpEx está gastando dinheiro em serviços ou produtos ao longo do tempo. Alugar um centro de convenções, alugar um veículo da empresa ou inscrever-se em serviços na nuvem são exemplos de OpEx.

A computação em nuvem se enquadra no OpEx porque a computação em nuvem opera em um modelo baseado no consumo. Com a computação em nuvem, você não paga pela infraestrutura física, eletricidade, segurança ou qualquer outra coisa associada à manutenção de um datacenter. Em vez disso, você paga pelos recursos de TI que usa. Se você não usar nenhum recurso de TI este mês, não pagará por nenhum recurso de TI.

Este modelo baseado no consumo tem muitos benefícios, incluindo:
- Ausência de custos iniciais.
- Não há necessidade de comprar e gerenciar infraestruturas dispendiosas que os usuários podem não usar em todo o seu potencial.
- A capacidade de pagar por mais recursos quando eles são necessários.
- A capacidade de parar de pagar recursos que já não são necessários.

Com um datacenter tradicional, você tenta estimar as necessidades futuras de recursos. Se você superestimar, gastará mais em seu datacenter do que precisa e, potencialmente, desperdiçará dinheiro. Se você subestimar, seu datacenter atingirá rapidamente a capacidade e seus aplicativos e serviços poderão sofrer com a diminuição do desempenho. A correção de um datacenter subprovisionado pode levar muito tempo. Pode ser necessário encomendar, receber e instalar mais hardware. Você também precisará adicionar energia, resfriamento e rede para o hardware extra.

Em um modelo baseado em nuvem, você não precisa se preocupar em acertar as necessidades de recursos. Se você achar que precisa de mais máquinas virtuais, adicione mais. Se a demanda cair e você não precisar de tantas máquinas virtuais, remova as máquinas conforme necessário. De qualquer forma, você está pagando apenas pelas máquinas virtuais que usa, não pela "capacidade extra" que o provedor de nuvem tem em mãos.

<b>Compare modelos de preços na nuvem</b><br>
A computação na cloud é o fornecimento de serviços de computação através da Internet com um modelo de preços pay as you go. Normalmente, paga apenas pelos serviços cloud que utiliza, o que ajuda a:

- Planeie e faça a gestão dos seus custos operacionais.
- Executar a sua infraestrutura com mais eficiência.
- Dimensionar conforme as suas necessidades empresariais mudam.

Dito de outra forma, a computação em nuvem é uma maneira de alugar poder de computação e armazenamento do datacenter de outra pessoa. Você pode tratar os recursos de nuvem como trataria os recursos em seu próprio datacenter. No entanto, ao contrário do seu próprio datacenter, quando você termina de usar recursos de nuvem, você os devolve. Você é cobrado apenas pelo que usar.

Em vez de manter as CPUs e o armazenamento no seu datacenter, aluga-os enquanto precisar deles. O fornecedor de cloud encarrega-se de manter a infraestrutura subjacente para si. A cloud permite-lhe resolver rapidamente os seus desafios empresariais mais exigentes e criar soluções de ponta para os seus utilizadores.

### Descrever os benefícios da alta disponibilidade e escalabilidade na nuvem

Ao criar ou implantar um aplicativo em nuvem, duas das maiores considerações são o tempo de atividade (ou disponibilidade) e a capacidade de lidar com a demanda (ou escala).

<b>Elevada disponibilidade</b><br>
Quando você está implantando um aplicativo, um serviço ou quaisquer recursos de TI, é importante que os recursos estejam disponíveis quando necessário. A alta disponibilidade se concentra em garantir a máxima disponibilidade, independentemente de interrupções ou eventos que possam ocorrer.

Ao arquitetar sua solução, você precisará levar em conta as garantias de disponibilidade do serviço. O Azure é um ambiente de nuvem altamente disponível com garantias de tempo de atividade dependendo do serviço. Essas garantias fazem parte dos acordos de nível de serviço (SLAs).