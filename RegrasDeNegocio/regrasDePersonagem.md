# Regras de Personagem

### Instância de classe qualquer:

- (Atributo qualquer >= 3)
    
    Análise do valor limite: {2, 3, 4}


- (Soma atributos = 20)

    Análise do valor limite: {19, 20, 21}

### Instância de classe Guerreiro:

- (Ataque > Defesa)

    Análise do valor limite: {Ataque = Defesa, Ataque > Defesa}


- (Ataque > Velocidade)

    Análise do valor limite: {Ataque = Velocidade, Ataque > Velocidade}


- (Resistência > Defesa)

    Análise do valor limite: {Resistência = Defesa, Resistência > Defesa}


- (Resistência > Velocidade)

    Análise do valor limite: {Resistência = Velocidade, Resistência > Velocidade}

### Instância de classe Assassino:

- (Ataque > Defesa)

  Análise do valor limite: {Ataque = Defesa, Ataque > Defesa}


- (Ataque > Resistência)

  Análise do valor limite: {Ataque = Resistência, Ataque > Resistência}


- (Velocidade > Defesa)

  Análise do valor limite: {Velocidade = Defesa, Velocidade > Defesa}


- (Velocidade > Resistência)

  Análise do valor limite: {Velocidade = Resistência, Velocidade > Resistência}




### Tabela de Dispersão para classes gerais

| **Condição**          | Regra 1 | Regra 2 | Regra 3 | Regra 4 | Regra 5 | Regra 6 |
|-----------------------|---------|---------|---------|---------|---------|---------|
| Soma atributos = 20 ? | False   | True    | True    | True    | True    | True    |
| Resistência >= 3 ?    | -       | False   | True    | True    | True    | True    |
| Velocidade >= 3 ?     | -       | -       | False   | True    | True    | True    |
| Ataque >= 3 ?         | -       | -       | -       | False   | True    | True    |
| Defesa >= 3 ?         | -       | -       | -       | -       | False   | True    |
| **Ação**              | Regra 1 | Regra 2 | Regra 3 | Regra 4 | Regra 5 | Regra 6 |
| NÃO é Personagem      | X       | X       | X       | X       | X       | ?       |


### Tabela de Dispersão para Guerreiro

| **Condição**               | Regra 6.1.1 | Regra 6.1.2 | Regra 6.1.3 | Regra 6.1.4 | Regra 6.1.5 |
|----------------------------|-------------|-------------|-------------|-------------|-------------|
| Ataque > Defesa ?          | False       | True        | True        | True        | True        |
| Ataque > Velocidade ?      | -           | False       | True        | True        | True        |
| Resistência > Defesa ?     | -           | -           | False       | True        | True        |
| Resistência > Velocidade ? | -           | -           | -           | False       | True        |
| **Ação**                   | Regra 6.1.1 | Regra 6.1.2 | Regra 6.1.3 | Regra 6.1.4 | Regra 6.1.5 |
| Guerreiro                  | -           | -           | -           | -           | X           |
| NÃO é Guerreiro            | X           | X           | X           | X           | -           |


### Tabela de Dispersão para Assassino

| **Condição**               | Regra 6.2.1 | Regra 6.2.2 | Regra 6.2.3 | Regra 6.2.4 | Regra 6.2.5 |
|----------------------------|-------------|-------------|-------------|-------------|-------------|
| Ataque > Defesa ?          | False       | True        | True        | True        | True        |
| Ataque > Resistência ?     | -           | False       | True        | True        | True        |
| Velocidade > Defesa ?      | -           | -           | False       | True        | True        |
| Velocidade > Resistência ? | -           | -           | -           | False       | True        |
| **Ação**                   | Regra 6.2.1 | Regra 6.2.2 | Regra 6.2.3 | Regra 6.2.4 | Regra 6.2.5 |
| Assassino                  | -           | -           | -           | -           | X           |
| NÃO é Assassino            | X           | X           | X           | X           | -           |

