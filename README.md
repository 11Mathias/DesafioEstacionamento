# Park.io
Este projeto consiste em uma máquina de estacionamento que realiza as seguintes operações:

Emissão de ticket com valor fixo.
Controle do status do ticket (pago ou não pago).
Recebimento do pagamento do ticket.
Consulta de saldo total das operações.
Funcionalidades
## 1. Emitir Ticket
    
A máquina emite um ticket para o usuário com um número único e valor fixo. O ticket é registrado com status não pago até que o pagamento seja efetuado.

## 2. Controle de Status do Ticket

Cada ticket possui dois estados possíveis:

#### Não Pago: 
O ticket foi emitido, mas ainda não foi pago.

#### Pago: 
O ticket foi emitido e o pagamento foi realizado com sucesso.
## 3. Receber Pagamento
O sistema permite que o usuário pague um ticket. Uma vez que o pagamento é recebido, o ticket muda seu status para Pago. O valor do ticket é adicionado ao saldo total.

## 4. Consultar Saldo das Operações
A máquina permite a consulta do saldo acumulado a partir do total de tickets pagos.
