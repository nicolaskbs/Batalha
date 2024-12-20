# Regras de Personagem

### Instância de classe qualquer:

- (Atributo qualquer >= 3)
    
    Análise do valor limite: {2, 3, 4}


- (Soma atributos = 20)

    Análise do valor limite: {19, 20, 21}


- (Ataque > Defesa)

    Análise do valor limite: {Ataque = Defesa, Ataque > Defesa}*

*Adendo,
essa regra poderia ser isolada para cada classe, pois numa futura alteração poderíamos ter uma classe com Defesa >= Ataque. Tomamos a decisão que é um jogo em que todas as classes futuramente implementadas sempre terão Ataque > Defesa.

### Instância de classe Guerreiro:

- (Ataque > Velocidade)

    Análise do valor limite: {Ataque = Velocidade, Ataque > Velocidade}


- (Resistência > Defesa)

    Análise do valor limite: {Resistência = Defesa, Resistência > Defesa}


- (Resistência > Velocidade)

    Análise do valor limite: {Resistência = Velocidade, Resistência > Velocidade}

### Instância de classe Assassino:

- (Ataque > Resistência)

  Análise do valor limite: {Ataque = Resistência, Ataque > Resistência}


- (Velocidade > Defesa)

  Análise do valor limite: {Velocidade = Defesa, Velocidade > Defesa}


- (Velocidade > Resistência)

  Análise do valor limite: {Velocidade = Resistência, Velocidade > Resistência}




### Tabela de Dispersão para classes gerais

| **Condição**          | Regra 1 | Regra 2 | Regra 3 | Regra 4 | Regra 5 | Regra 6 | Regra 7 |
|-----------------------|---------|---------|---------|---------|---------|---------|---------|
| Defesa >= 3 ?         | False   | True    | True    | True    | True    | True    | True    |
| Resistência >= 3 ?    | -       | False   | True    | True    | True    | True    | True    |
| Velocidade >= 3 ?     | -       | -       | False   | True    | True    | True    | True    |
| Ataque >= 3 ?         | -       | -       | -       | False   | True    | True    | True    |
| Soma atributos = 20 ? | -       | -       | -       | -       | False   | True    | True    |
| Ataque > Defesa ?     | -       | -       | -       | -       | -       | False   | True    |
| **Ação**              | Regra 1 | Regra 2 | Regra 3 | Regra 4 | Regra 5 | Regra 2 | Regra 7 |
| NÃO é Personagem      | X       | X       | X       | X       | X       | X       | ?       |


### Tabela de Dispersão para Guerreiro

| **Condição**               | Regra 7.1.1 | Regra 7.1.2 | Regra 7.1.3 | Regra 7.1.4 |
|----------------------------|-------------|-------------|-------------|-------------|
| Ataque > Velocidade ?      | False       | True        | True        | True        |
| Resistência > Defesa ?     | -           | False       | True        | True        |
| Resistência > Velocidade ? | -           | -           | False       | True        |
| **Ação**                   | Regra 7.1.1 | Regra 7.1.2 | Regra 7.1.3 | Regra 7.1.4 |
| Guerreiro                  | -           | -           | -           | X           |
| NÃO é Guerreiro            | X           | X           | X           | -           |


### Tabela de Dispersão para Assassino

| **Condição**               | Regra 7.2.1 | Regra 7.2.2 | Regra 7.2.3 | Regra 7.2.4 |
|----------------------------|-------------|-------------|-------------|-------------|
| Ataque > Resistência ?     | False       | True        | True        | True        |
| Velocidade > Defesa ?      | -           | False       | True        | True        |
| Velocidade > Resistência ? | -           | -           | False       | True        |
| **Ação**                   | Regra 7.2.1 | Regra 7.2.2 | Regra 7.2.3 | Regra 7.2.4 |
| Assassino                  | -           | -           | -           | X           |
| NÃO é Assassino            | X           | X           | X           | -           |