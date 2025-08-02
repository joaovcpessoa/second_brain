# Resumo

O objetivo aqui é claro. Criar uma série de pequenos pontos que são discutidos no livro e que de fato tem importância significativa para o aprendizado.

## Nomes significativos

### Use nomes que revelam propósito

Especifique seu uso para mensuração e unidade usada.

```java
// Note a diferença, para o caso dessas variáveis 
// que descrevem o tempo decorrido em dias
int d;

int elapsedTimeInDays;
int daysSinceCreation;
int daysSinceModification;
int fileAgeInDays;
```

### Evite Informações erradas

Não adicione aos nomes informações que confundam o propósito das variáveis. Em resumo, não chame de lista o que não é uma lista e use formatos consistentes na hora de escrever.

```java
// Olha que aberração o livro usa de exemplo
// Se eu pego um código assim é justa causa
int a = 1;

if (O == 1):
    a = O1;
else
    l = O1
```

### Use nomes pronunciáveis

Tire proveito da capacidade humana de reconhecer significados através das palavras.

```java
// Compare:

Class DtaRcrd102 {
    private Date genymdhms;
    private Date modymdhms;
    private final String pszgint = '102';
    /* ... */
}

Class Costumer {
    private Date generationTimestamp;
    private Date modificationTimestamp;
    private final String recordId = '102';
    /* ... */
}
```

### Use nomes passíveis de busca

O tamanho de um nome deve ser proporcional ao escopo [N5]. Se uma variáveil ou constante pode ser vista ou usada em vários lugares dentro do código, é imperativo atribui-la um nome fácil para busca.

```java
// Compare:

for (int j = 0; j < 34; j++) {
    s += (t[j] * 4) / 5;
}

int realDaysPerIdealDay = 4;
const int WORK_DAYS_PER_WEEK = 5;
for (int j = 0; j < NUMBER_OF_TASKS; j++) {
    int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
    int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
    sum += realTaskWeeks;
}
```

### Evite codificações

Isso aqui nem é preciso explicar. Deixar o código seguro não é criptografar ele em um formato que só você entende.

### Notação Húngara



### Conclusão

## Funções