# Atividades em Aula - Engenharia de software

## Atividade 1 - 
Withain Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomesnsion to programming. Cubes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, mmimaintenance). The addition of time adds an important new dime

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

https://abseil.io/resources/swe-book


O que é engenharia de Software?

É o planejamento mais complexo de uma estrutura total de desenvolvimento.


Atividade 01/03/2024 

Slide do teams página 24 ao 29

Escrever o nome da arquitetura, onde você aplicaria e justificar sua escolha com base na lista de tradoff

comentário, explicação do prof:



#### Microservices Architecture (Arquitetura de microsserviços)
Modularity ⭐⭐⭐⭐⭐
Simplicity ⭐

Em aplicações de grande porte, onde é necessário a manutenção de partes do produto, nisso a parte que foi alterada tem menos chances de falha.


#### Event-Driven Architecture Style (Estilo de arquitetura orientada a eventos)

Performance ⭐⭐⭐⭐⭐
Simplicity ⭐

Em aplicações que necessitam de respostas em tempo real e que precisam ser replicadas para vários consumidores onde é necessário a manutenção de partes do produto, porém não é simples de se implementar.


#### Service-Based Architecture Style (Estilo de arquitetura baseada em serviços)

⭐⭐⭐⭐ Fault Tolerance
⭐⭐ Elasticity

Em aplicações que necessitam a reutilização de serviços em sistemas diferentes ou precisam combinar vários serviços independentes para realizar tarefas complexas, porém acapacidade de expansação da arquitetura não é das melhores.


#### Microkernel Architecture Style

⭐⭐⭐⭐⭐ Overall cost
⭐ Fault Tolerance

Exemplo:


#### Pipeline Architecture Style

⭐⭐⭐⭐⭐ Overall cost
⭐ Fault Tolerance

Exemplo:

#### Layered Architecture Style

⭐⭐⭐⭐⭐ Overall cost
⭐ Fault Tolerance

Exemplo:




Sobre a explicação do prof:

slide 24:
A








04/03/2024 Continuação da aula passada

























