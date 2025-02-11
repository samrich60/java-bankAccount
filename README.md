# Sistema de Conta Bancária

Este projeto é um simples sistema de conta bancária desenvolvido em Java. Ele permite criar contas, realizar depósitos e saques, além de exibir os dados da conta.

## Funcionalidades
O programa permite:
- Criar uma conta com número e titular.
- Opcionalmente, definir um depósito inicial.
- Depositar valores na conta.
- Sacar valores da conta (com taxa de $5.00 por saque).
- Exibir os dados atualizados da conta.

## Estrutura do Projeto
O projeto contém duas classes principais:
- **Program.java** (Pacote `application`): Classe principal que interage com o usuário e executa as operações bancárias.
- **Account.java** (Pacote `entities`): Classe que representa a conta bancária e contém os métodos de depósito, saque e exibição de dados.

## Exemplo de Uso
### Cenário 1: Criando conta com depósito inicial
```
Enter account number: 1234
Enter account holder: John Doe
Is there an initial deposit (y/n)? y
Enter initial deposit value: 500.00

Account data:
Account 1234, Holder: John Doe, Balance: $ 500.00

Enter a deposit value: 200.00
Updated account data:
Account 1234, Holder: John Doe, Balance: $ 700.00

Enter a withdraw value: 100.00
Updated account data:
Account 1234, Holder: John Doe, Balance: $ 595.00
```

### Cenário 2: Criando conta sem depósito inicial, depois depositando e ficando com saldo negativo
```
Enter account number: 5678
Enter account holder: Jane Doe
Is there an initial deposit (y/n)? n

Account data:
Account 5678, Holder: Jane Doe, Balance: $ 0.00

Enter a deposit value: 50.00
Updated account data:
Account 5678, Holder: Jane Doe, Balance: $ 50.00

Enter a withdraw value: 55.00
Updated account data:
Account 5678, Holder: Jane Doe, Balance: $ -10.00
```
(O saldo fica negativo porque há uma taxa de saque de $5.00)

## Licença
Este projeto é de código aberto e pode ser modificado livremente.

---
Código original desenvolvido pelo Professor Nélio Alves.

Utilizado para aprendizado e prática por Sammy Richard.

