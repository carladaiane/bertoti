# Atividades Bertoti

<details close>
<summary>Atividade 1</summary>
 
#### Texto 1
> Withain Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomesnsion to programming. Cubes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, mmimaintenance). The addition of time adds an important new dime


#### Texto 2
> We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.


 - Link Livro: https://abseil.io/resources/swe-book


## Com base nesses dois textos, diga: O que é engenharia de Software?

  É o planejamento mais complexo de uma estrutura total de desenvolvimento. Engenharia de software não é programção, mas a programação está dentro da engenharia de software. 
A engenharia de software engloba: 
- o desenvolvimento inicial;
- a modificação do software;
- E a manutenção do software ao longo do tempo.

A engenharia de software leva em consideração fatores como o tempo, a escala do projeto e os compromissos envolvidos. PLaneja comob lidar com a passagem do tempo, a necessidade futura de mudanças, a eficiência do software produzido e da organização que o produz, e a tomada de decisões complexas com base em estimativas imprecisas de tempo e crescimento. Resumindo, a engenharia de software abrange não apenas a programação, mas também aspectos amplos relacionados à criação, manutenção e escalabilidade do software

### Tempo na engenharia de software:

- Tempo de Desenvolvimento: O período necessário para completar o desenvolvimento de um software. Inclui o tempo desde a concepção inicial até a entrega final. Esse tempo pode ser influenciado por vários fatores, incluindo a complexidade do projeto, a experiência da equipe, as ferramentas utilizadas, e as metodologias de desenvolvimento adotadas.

- Tempo de Execução: Este termo refere-se ao tempo que um software leva para executar um conjunto de tarefas. É uma medida de performance e eficiência do código. Reduzir o tempo de execução é frequentemente um objetivo importante na otimização de software.

- Tempo de Resposta: Refere-se ao tempo que um sistema leva para responder a uma solicitação.
  
- Tempo de Ciclo (Cycle Time): Na gestão de projetos, tempo de ciclo refere-se ao tempo total que leva para uma unidade de trabalho passar por todo o processo de desenvolvimento, desde a entrada até a saída.

Tempo de Inatividade (Downtime): Refere-se ao período durante o qual um sistema está indisponível ou inoperante. Minimizar o tempo de inatividade é crucial para garantir a disponibilidade e confiabilidade de sistemas críticos.

Time to Market (TTM): Tempo que leva para um produto ser desenvolvido e estar disponível no mercado. Este é um critério importante para determinar o sucesso comercial de um produto, especialmente em mercados altamente competitivos.

Estimativas de Tempo: Envolvem a previsão de quanto tempo levará para completar várias tarefas e atividades durante o ciclo de vida do desenvolvimento de software. Técnicas comuns para estimativa incluem análise de pontos de função, Wideband Delphi, e PERT (Program Evaluation Review Technique).

Tempo Real (Real-time): Refere-se a sistemas ou processos que devem operar dentro de restrições de tempo rigorosas. Sistemas em tempo real são projetados para fornecer respostas ou resultados em um prazo específico e previsível.

Cada uma dessas interpretações do "tempo" tem implicações significativas na forma como o desenvolvimento de software é gerido, executado e avaliado. A gestão eficaz do tempo em todas essas dimensões é crucial para o sucesso de projetos de software.

### Escala do projeto na engenharia de software:

A escala de um projeto afeta muitos aspectos da sua gestão, incluindo planejamento, alocação de recursos, estimativa de custos, mitigação de riscos e comunicação. Projetos de grande escala frequentemente exigem uma gestão mais sofisticada e detalhada, bem como maior coordenação e colaboração entre equipes. Por outro lado, projetos de pequena escala podem ser mais ágeis e menos burocráticos, mas ainda requerem uma abordagem estruturada para garantir o sucesso.

Avaliar corretamente a escala do projeto ajuda os gestores a tomar decisões informadas sobre a melhor forma de abordar o desenvolvimento e a implementação do software, garantindo que os objetivos do projeto sejam alcançados de maneira eficiente e eficaz.


- Linhas de Código (LOC): Uma medida direta do tamanho do código-fonte do projeto.
- Número de Módulos/Componentes: A quantidade de componentes distintos ou módulos de software.
- Tamanho da Equipe: Número de desenvolvedores e outros membros da equipe envolvidos no projeto.
- Complexidade Técnica: Grau de dificuldade técnica envolvida, incluindo algoritmos complexos, integração de sistemas, dependências externas, etc.
- Complexidade de Requisitos: Quantidade e variedade de funcionalidades e requisitos que o software precisa atender.
- Arquitetura do Sistema: Número de camadas, microserviços, componentes distribuídos, etc.
- Prazo de Desenvolvimento: Tempo total estimado ou real necessário para concluir o projeto.
- Marcos e Entregas: Datas importantes para a entrega de partes específicas do projeto.
- Funcionalidades e Recursos: Número de funcionalidades e recursos que o software deve oferecer.
- Áreas de Aplicação: Quantidade de áreas ou domínios de aplicação que o software abrange.
- Número de Usuários: Quantidade de usuários finais que utilizarão o software.
- Uso Conjunto: Carga esperada em termos de uso simultâneo ou volume de dados processados.
- Custo Total: Recursos financeiros alocados para o desenvolvimento, teste, implementação e manutenção do software.
- Ferramentas e Tecnologias Utilizadas: Tipos de ferramentas, linguagens de programação, frameworks e plataformas empregadas.
- Métodos de Desenvolvimento: Metodologias e práticas de desenvolvimento adotadas (por exemplo, Agile, Scrum, Waterfall). 

 
</details>

<details close>
  <summary>Atividade 2</summary>

 #### Dê exemplos de trade-offs:

**1º Cypress:**

Contras:
- Focado em aplicações web, não oferece suporte nativo a testes em aplicativos móveis;
- Difícil de escalar se houver uma grande quantidade de testes;
- Custo com funcionalidades avançadas estão disponíveis apenas na versão paga do Cypress (dashboard, máquinas virtuais, servidores e armazenamento);
- O Cypress não oferece suporte nativo a testes de acessibilidade;
- Problemas de sincronização em relação a API;
- Depender de plugins de terceiros;
- Dificuldade execução de testes em múltiplos dispositivos simultaneamente;
- Limitações para aplicações que requerem autenticação complexa ou em cenários de autenticação específicos, dificuldades na configuração dos testes;
- O Cypress pode não ter recursos nativos para interagir com esses elementos (Exemplo: notificação);
- Não recomendado para aplicações altamente interativas;
- A confiabilidade pode ser perdida ao longo do processo, em ambientescom muitas solicitações de rede ou interações complexas com APIs, podem ocorrer instabilidades nos testes.

Prós:
- Uma das ferramentas mais completas para teste, com documentação extensa, boa performance, diversos fóruns de ajuda;
- 7 anos no mercado;
- O Cypress gera relatórios informativos e bem formatados, facilitando a análise dos resultados dos testes;
- O Cypress uma velocidade de execução rápida quando comparado com outras ferramentas de teste de front-end;
- O Cypress é uma ferramenta de código aberto e gratuita para uso individual e em projetos de código aberto.
- Não é necessária a instalação a parte de um driver para execução dos testes, assim como selenium.

> Onde Cypress é usado: [Amazon](https://www.amazon.com.br/)")

2º Java: 

Contras:
- Sua sintaxe verbose, sendo necessário escrever mais código para realizar tarefas simples em comparação com linguagens mais concisas,
- Tempo de inicialização mais longo do que aplicativos escritos em linguagens compiladas, devido à necessidade de inicializar a JVM e carregar todas as classes necessárias,
- Java é uma linguagem de programação robusta, exibe os possíveis erros de programação em tempo de compilação, então não tem tanta tolerancia a erros;
- Consome muita me consumida, O uso da JVM pode consumir muita memória do sistema, o que pode ser um problema em sistemas com pouca memória disponível.

Prós:  
- Os programas escritos em Java podem ser executados em qualquer plataforma que tenha uma máquina virtual Java (JVM).
- Java é uma linguagem de programação robusta, exibe os possíveis erros de programação em tempo de compilação.
- Ele oferece várias características de segurança, como a verificação de bytecode na JVM, gerenciamento de memória automático e segurança na manipulação de exceções.
- Uma extensa biblioteca padrão (Java Standard Library), que oferece funcionalidades prontas para uso em diversas áreas, como coleções de dados, manipulação de arquivos, rede.

- Onde Java é usado: [Amazon](https://www.amazon.com.br/)")

3º Elixir: É uma linguagem de programação funcional, baseada na Erlang Virtual Machine (BEAM), que também é utilizada na linguagem Erlang. O elixir tem uma ótima vantagem na escalabilidade pois temsua arquitetura baseada em Erlang, sendo altamente escalável e tolerante a falhas. Usada para construir sistemas distribuídos e de alta disponibilidade. Essa ferramenta é excelente para atividades paralelas, pois fornece um modelo de concorrência baseado em processos leves, que são executados de forma independente e isolada. Isso permite que os programas Elixir lidem facilmente com tarefas concorrentes e paralelas. Por outroi lado, em algumas áreas específicas, como manipulação intensiva de dados ou cálculos numéricos intensivos, outras linguagens como C e C++ podem ter um desempenho melhor devido à sua otimização específica, mesmo que exijam mais esforço e tempo.

Prós:



Contras:


- Onde Exilir é usado: [Discord](https://discord.com/")

</details>

<details close>
  <summary>Atividade 3</summary>

#### Slide do teams página 24 ao 29

Escrever o nome da arquitetura, onde você aplicaria e justificar sua escolha com base na lista de tradoff

comentário, explicação do prof:

Microservices Architecture: Em aplicações de grande porte, onde é necessário a manutenção de partes do produto, nisso a parte que foi alterada tem menos chances

1º MongoDB: ótimo e rápido para escrita de dados, porém paa a leitura dos dados ele apresenta lentidão.

2º Python: Uma linguagem simples de ser escrita, fácil entendimento, porém ela tem atalhos que o usuário usa, está longe da base do hardware, é uma lingaugem mais lenta.

3º Java: 

### Trade-off de arquiteturas:

Layered Architecture Style(Arquitetura em camadas):

A arquitetura em camadas (Layered Architecture) é um estilo de arquitetura de software onde o sistema é dividido em várias camadas, cada uma com responsabilidades distintas e bem definidas. Esse estilo é amplamente utilizado devido à sua simplicidade e organização clara. Aqui estão os pontos positivos e negativos dessa abordagem:

Pontos Positivos:
- Facilidade de Manutenção: Como as funcionalidades estão bem divididas entre as camadas, localizar e corrigir problemas se torna mais simples. Isso também facilita a implementação de novas funcionalidades sem impactar outras partes do sistema.
- Reusabilidade: Componentes de uma camada podem ser reutilizados em outros projetos ou partes do sistema. Por exemplo, a lógica de negócios pode ser usada em diferentes interfaces de usuário.
- Escalabilidade: É possível escalar diferentes camadas de forma independente, dependendo das necessidades do sistema. Por exemplo, a camada de dados pode ser otimizada separadamente da camada de apresentação.
- Testabilidade: Com a separação clara entre as camadas, fica mais fácil criar testes unitários e de integração. Cada camada pode ser testada isoladamente, garantindo a confiabilidade do sistema.

Pontos Negativos:
- Desempenho: A comunicação entre camadas pode introduzir sobrecarga, impactando o desempenho do sistema. Cada camada pode adicionar latência, especialmente se as chamadas entre camadas forem síncronas.
- Rigidez: A arquitetura em camadas pode ser muito rígida, tornando difícil a adaptação a novas tecnologias ou requisitos. Modificar a estrutura das camadas pode ser complexo e custoso.
- Complexidade Adicional: A implementação de uma arquitetura em camadas pode adicionar complexidade desnecessária a sistemas pequenos ou simples, onde uma abordagem mais direta poderia ser mais eficiente.
- Desenvolvimento Inicial: O tempo e o esforço iniciais para definir e implementar as diferentes camadas podem ser significativos. Isso pode ser uma desvantagem em projetos com prazos curtos.

Uso: Aplicações de E-commerce e Sistemas Bancários e Financeiros


Pipeline Architecture Style(Arquitetura em pipeline):

Pontos positivo: 
Pontos negativos:
Uso: 


Microkernel Architecture Style(Arquitetura em camadas):

Pontos positivo: 
Pontos negativos:
Uso: 

Service-based Architecture Style(Arquitetura baseada em serviços):

Pontos positivo: 
Pontos negativos:
Uso: 

Event-driven Architecture Style(Arquitetura baseada em eventos):

Pontos positivo: 
Pontos negativos:
Uso: 

Microservices Architecture (Arquitetura de microsserviços):

Pontos positivo: 
Pontos negativos:
Uso: 

</details>


<details close>
  <summary>Atividade 4</summary>

 #### Escolha um sistema
Defina sua arquitetura debatendo tradeoffs com os requisitos não funcionais comentados em aula
Você irá criar o sistema em java
Qual sistema escolhi?
Porque escolhi?
Um sistema que com misto de simplicidade e complexidade. As notas dos alunos deverão ser lançadas para cada atividade ou prova.

Qual arquitetura escolhi?
Porque escolhi essa arquitetura?
Trade offs:

Ferramenta para criação da classe: draw.io
</details>

<details close>
  <summary>Atividade 5</summary>

 - Inicie seu diagrama de classes de uma das partes da arquitetura (escolha uma parte de backend por favor).
</details>


