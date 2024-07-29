# Documentação do Trabalho

A arquitetura do projeto foi definida seguindo o principio de divisão de responsabilidades, as classes estão organizadas em 3 packages, sendo eles Modelo, Coleção e Gerenciador.

O package Modelo armazena as classes:
* Consulta
* Medico
* Paciente
* Pessoa
* Prontuario 
* Secretaria

O package Coleção armazena as classes:
* ColecaoConsultas
* ColecaoMedicos
* ColecaoPacientes
* ColecaoProntuarios
* ColecaoSecretarias
* ColecaoDadosMedicos

Sendo elas usadas para armazenar em memória os objetos que são criador durante a execução do programa (emulando um banco de dados)

O package Gerenciador armazena as classes:
* GerenciadorAdm
* GerenciadorMedicos
* GerenciadorSecratarias

:memo: Adicionar a descrição dos métodos das classes

## Descrição das classes

### Package Coleção

<!--Start: ColecaoConsultas-->
#### ColecaoConsultas
A classe `ColecaoConsultas` é responsável por armazenar e gerenciar uma coleção de objetos da classe `Consulta`.

##### Atributos

- `consultas`:
  - **Tipo:** `List<Consulta>`
  - **Descrição:** Lista que armazena os objetos da classe `Consulta`.

##### Construtores

- `ColecaoConsultas()`:
  - **Descrição:** Construtor padrão que inicializa a lista de consultas como uma nova instância de `ArrayList<Consulta>` vazia.

##### Métodos

- `getConsultas()`:
  - **Descrição:** Retorna a lista de consultas armazenadas na coleção.
  - **Tipo de Retorno:** `List<Consulta>`

- `setConsultas(List<Consulta> consultas)`:
  - **Descrição:** Define a lista de consultas da coleção para a lista especificada.
  - **Parâmetros:**
    - `consultas`: Nova lista de consultas a ser definida.
  - **Tipo de Retorno:** `void`
<!--End: ColecaoConsultas-->


<!--Start ColecaoMedicos-->
#### ColecaoMedicos
A classe `ColecaoMedicos` é responsável por armazenar e gerenciar uma coleção de objetos da classe `Medico`.

##### Atributos

- `medicos`:
  - **Tipo:** `List<Medico>`
  - **Descrição:** Lista que armazena os objetos da classe `Medico`.

##### Construtores

- `ColecaoMedicos()`:
  - **Descrição:** Construtor padrão que inicializa a lista de médicos como uma nova instância de `ArrayList<Medico>` vazia.

##### Métodos

- `getMedicos()`:
  - **Descrição:** Retorna a lista de médicos armazenados na coleção.
  - **Tipo de Retorno:** `List<Medico>`

- `setMedicos(List<Medico> medicos)`:
  - **Descrição:** Define a lista de médicos da coleção para a lista especificada.
  - **Parâmetros:**
    - `medicos`: Nova lista de médicos a ser definida.
  - **Tipo de Retorno:** `void`
<!--End ColecaoMedicos-->


<!--Start ColecaoPacientes-->
#### ColecaoPacientes
A classe `ColecaoPacientes` é responsável por armazenar e gerenciar uma coleção de objetos da classe `Paciente`.

##### Atributos

- `pacientes`:
  - **Tipo:** `List<Paciente>`
  - **Descrição:** Lista que armazena os objetos da classe `Paciente`.

##### Construtores

- `ColecaoPacientes()`:
  - **Descrição:** Construtor padrão que inicializa a lista de pacientes como uma nova instância de `ArrayList<Paciente>` vazia.

##### Métodos

- `getPacientes()`:
  - **Descrição:** Retorna a lista de pacientes armazenados na coleção.
  - **Tipo de Retorno:** `List<Paciente>`

- `setPacientes(List<Paciente> pacientes)`:
  - **Descrição:** Define a lista de pacientes da coleção para a lista especificada.
  - **Parâmetros:**
    - `pacientes`: Nova lista de pacientes a ser definida.
  - **Tipo de Retorno:** `void`
<!--End ColecaoPacientes-->


<!--Start ColecaoProntuarios-->
#### ColecaoProntuarios
A classe `ColecaoProntuarios` é responsável por armazenar e gerenciar uma coleção de objetos da classe `Prontuario`.

##### Atributos

- `prontuarios`:
  - **Tipo:** `List<Prontuario>`
  - **Descrição:** Lista que armazena os objetos da classe `Prontuario`.

##### Construtores

- `ColecaoProntuarios()`:
  - **Descrição:** Construtor padrão que inicializa a lista de prontuários como uma nova instância de `ArrayList<Prontuario>` vazia.

##### Métodos

- `getProntuarios()`:
  - **Descrição:** Retorna a lista de prontuários armazenados na coleção.
  - **Tipo de Retorno:** `List<Prontuario>`

- `setProntuarios(List<Prontuario> prontuarios)`:
  - **Descrição:** Define a lista de prontuários da coleção para a lista especificada.
  - **Parâmetros:**
    - `prontuarios`: Nova lista de prontuários a ser definida.
  - **Tipo de Retorno:** `void`
<!--End ColecaoProntuarios-->


<!--Start ColecaoSecretarias-->
#### ColecaoSecretarias
A classe `ColecaoSecretarias` é responsável por armazenar e gerenciar uma coleção de objetos da classe `Secretaria`.

##### Atributos

- `secretarias`:
  - **Tipo:** `List<Secretaria>`
  - **Descrição:** Lista que armazena os objetos da classe `Secretaria`.

##### Construtores

- `ColecaoSecretarias()`:
  - **Descrição:** Construtor padrão que inicializa a lista de secretárias como uma nova instância de `ArrayList<Secretaria>` vazia.

##### Métodos

- `getSecretarias()`:
  - **Descrição:** Retorna a lista de secretárias armazenadas na coleção.
  - **Tipo de Retorno:** `List<Secretaria>`

- `setSecretarias(List<Secretaria> secretarias)`:
  - **Descrição:** Define a lista de secretárias da coleção para a lista especificada.
  - **Parâmetros:**
    - `secretarias`: Nova lista de secretárias a ser definida.
  - **Tipo de Retorno:** `void`
<!--End ColecaoSecretarias-->






## Descrição das classes

### Package Gerenciador

<!--Start: GerenciadorAdm-->
#### GerenciadorAdm

A classe `GerenciadorAdm` é responsável por gerenciar as operações de CRUD(Create, Read, Uptdate, Delete) dos objetos da classe `Medico` e `Secretaria`, permitindo ao administrador do sistema cadastrar, atualizar, remover e listar registros desses profissonais de forma eficiente e organizada.

##### Atributos

- `colecaoMedicos`
  - **Tipo**: `ColecaoMedicos`
  - **Descrição:** Armazena a coleção de objetos da `Medico`. Esta coleção é usada para realizar operações de CRUD (Create, Read, Update, Delete) nos registros de médicos.

- `colecaoSecretarias`
  - **Tipo**: `ColecaoSecretarias`
  - **Descrição:** Armazena a coleção de objetos da classe `Secretaria`. Esta coleção é usada para realizar operações de CRUD (Create, Read, Update, Delete) nos registros de secretárias.

- `idMedicoControle`
  - **Tipo**: `int`
  - **Descrição:** Controla os IDs únicos atribuídos aos médicos. Este contador é incrementado cada vez que um novo médico é cadastrado para garantir que cada médico tenha um ID exclusivo.

- `idSecretariaControle`
  - **Tipo**: `int`
  - **Descrição:** Controla os IDs únicos atribuídos às secretárias. Este contador é incrementado cada vez que uma nova secretária é cadastrada para garantir que cada secretária tenha um ID exclusivo.

- `read`
  - **Tipo**: `Scanner`
  - **Descrição:** Objeto da classe `Scanner` é usado para ler entradas do console. Ele é utilizado nos métodos que interagem com o usuário para obter informações sobre médicos e secretárias.

##### Construtores

- `GerenciadorAdm()`:
  - **Descrição:** Construtor com parâmetros que é resposável por inicializar um novo objeto da classe `GerenciadorAdm` com as coleções de médicos e secretárias fornecidas como parâmetros. Ele configura as coleções que serão gerenciadas por esta instância da classe e prepara os atributos necessários para o funcionamento das operações de CRUD (Create, Read, Update, Delete) para médicos e secretárias.

##### Métodos

- `cadastrarMedico()`:
  - **Descrição:** Permite ao administrador inserir manualmente os dados de um novo médico, incluindo nome, data de nascimento, telefone, email, especialidade, CRM e secretaria associada.
  - **Tipo de Retorno:** `void`

- `atualizarMedico()`:
  - **Descrição:** Permite ao administrador atualizar os dados de um médico existente, fornecendo novos valores para os campos desejados.
  - **Tipo de Retorno:** `void`

- `removerMedico()`:
  - **Descrição:** Permite ao administrador remover um médico do sistema com base no ID fornecido.
  - **Tipo de Retorno:** `void`

- `listarMedico()`:
  - **Descrição:**  Exibe uma lista de todos os médicos cadastrados, mostrando detalhes como nome, data de nascimento, telefone, email, especialidade, CRM e secretaria associada.
  - **Tipo de Retorno:** `void`

- `cadastrarSecretaria()`:
  - **Descrição:** Permite ao administrador inserir manualmente os dados de uma nova secretária, incluindo nome, data de nascimento, telefone e email.
  - **Tipo de Retorno:** `void`

- `atualizarSecretaria()`:
  - **Descrição:** Permite ao administrador atualizar os dados de uma secretária existente, fornecendo novos valores para os campos desejados.
  - **Tipo de Retorno:** `void`

- `removerSecretaria()`:
  - **Descrição:** Permite ao administrador remover uma secretária do sistema com base no ID fornecido.
  - **Tipo de Retorno:** `void`

- `listarSecretaria()`:
  - **Descrição:** Exibe uma lista de todas as secretárias cadastradas, mostrando detalhes como nome, data de nascimento, telefone e email.
  - **Tipo de Retorno:** `void`
<!--End GerenciadorAdm-->


<!--Start: GerenciadorMedicos-->
#### GerenciadorMedicos

##### Atributos

- `colecaoConsultas`
  - **Tipo**: `ColecaoConsultas`
  - **Descrição:** Armazena a coleção de consultas. Esta coleção é usada para realizar operações de CRUD (Create, Read, Update, Delete) nos registros de consultas.

- `colecaoPacientes`
  - **Tipo**: `ColecaoPacientes`
  - **Descrição:** Armazena a coleção de pacientes. Esta coleção é usada para realizar operações de CRUD (Create, Read, Update, Delete) nos registros de pacientes.
 
- `colecaoProntuarios`
  - **Tipo**: `ColecaoProntuarios`
  - **Descrição:** Armazena a coleção de prontuários. Esta coleção é usada para realizar operações de CRUD (Create, Read, Update, Delete) nos registros de prontuários.

- `colecaoDadosMedicos`
  - **Tipo**: `ColecaoDadosMedicos`
  - **Descrição:** Armazena a coleção de dados médicos. Esta coleção é usada para realizar operações de CRUD (Create, Read, Update, Delete) nos registros de dados médicos.
 
- `medico`
  - **Tipo**: `Medico`
  - **Descrição:** Instância do objeto `Medico` associado à classe. Representa o médico responsável ou atualmente em foco na classe.
 
- `consultaAtual`
  - **Tipo**: `Consulta`
  - **Descrição:** Instância da consulta que está atualmente em andamento.
 
- `consultasDoDia`
  - **Tipo**: `ArrayList<Consulta>`
  - **Descrição:** Lista que contém todas as consultas agendadas para o dia de um determinado médico.
 
- `idDadosMedicosControle`
  - **Tipo**: `int`
  - **Descrição:** Controle de ID dos dados médicos. Utilizado para gerenciar de forma única cada entrada de dados médicos.
 
- `idProtuarioControle`
  - **Tipo**: `int`
  - **Descrição:** Controle de ID dos prontuários. Utilizado para gerenciar de forma única cada prontuário.

##### Construtores

- `GerenciadorMedicos()`:
  - **Descrição:** O construtor da classe `GerenciadorMedicos` inicializa o objeto com as coleções necessárias para gerenciar consultas, pacientes, prontuários e dados médicos. Ele recebe quatro parâmetros e os atribui aos atributos correspondentes da classe.

##### Métodos

- `getMedico()`:
  - **Descrição:** Retorna a instância do objeto `Medico` associado à classe.
  - **Tipo de Retorno:** `Medico`

- `setMedico()`:
  - **Descrição:** Define a instância do objeto Medico associado à classe com o valor passado como parâmetro.
  - **Tipo de Retorno:** `void`
 
- `getConsultaAtual()`:
  - **Descrição:** Retorna a instância da consulta que está atualmente em andamento.
  - **Tipo de Retorno:** `Consulta`
 
- `setConsultaAtual()`:
  - **Descrição:** Define a consulta atual removendo a primeira consulta da lista `consultasDoDia` e atribuindo-a ao atributo `consultaAtual`, caso exista.
  - **Tipo de Retorno:** `void`

- `resetConsultaAtual()`:
  - **Descrição:** Reseta a consulta atual, atribuindo `null` ao atributo `consultaAtual`.
  - **Tipo de Retorno:** `void`
 
- `setConsultasDoDia()`:
  - **Descrição:** Popula a lista consultasDoDia com as consultas do médico associado à classe para a data atual. Ordena as consultas por horário.
  - **Tipo de Retorno:** `void`
 
    - `compare()`:
      - **Descrição:** Compara duas instâncias de `Consulta` com base no horário das consultas.
      - **Tipo de Retorno:** `int`

- `listaConsultasDoDia()`:
  - **Descrição:** Lista todas as consultas do dia do médico. Se não houver consultas na lista `consultasDoDia`, chama o método `setConsultasDoDia` para preenchê-la. Se a lista ainda estiver vazia após isso, exibe uma mensagem indicando que não há consultas para hoje. Caso contrário, exibe os detalhes de cada consulta do dia.
  - **Tipo de Retorno:** `void`
 
- `cadastrarProntuario()`:
  - **Descrição:**  Permite ao usuário cadastrar um novo prontuário para a consulta atual. Coleta os dados da consulta, sintomas, diagnóstico e tratamento, e cria um novo prontuário. Adiciona o prontuário à coleção de prontuários e atualiza a consulta atual com o ID do prontuário.
  - **Tipo de Retorno:** `void`
 
- `atualizarProntuario()`:
  - **Descrição:** Permite ao usuário atualizar um prontuário existente. Solicita o ID do prontuário a ser atualizado e permite modificar a data da consulta, sintomas, diagnóstico e tratamento.
  - **Tipo de Retorno:** `void`

- `removerProntuario()`:
  - **Descrição:** Permite ao usuário remover um prontuário da coleção de prontuários. Solicita o ID do prontuário a ser removido e o exclui da coleção.
  - **Tipo de Retorno:** `void`
 
- `cadastrarDados()`:
  - **Descrição:** Permite ao usuário cadastrar os dados médicos de um paciente. Verifica se o paciente já possui dados médicos cadastrados. Se não possuir, coleta as informações necessárias (como se fuma, bebe, nível de colesterol, etc.) e cria um novo registro de dados médicos para o paciente.
  - **Tipo de Retorno:** `void`
 
- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:** ``

- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:** ``
 
- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:** ``
 
- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:** ``

- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:** ``
 
- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:** ``
 
- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:** ``

- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:** ``
 
- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:** ``

<!--End GerenciadorMedicos-->


<!--Start: GerenciadorSecretarias-->
#### GerenciadorSecretarias

##### Atributos

- ``
  - **Tipo**: ``
  - **Descrição:**

- ``
  - **Tipo**: ``
  - **Descrição:**

##### Construtores

- ``:
  - **Descrição:** 

##### Métodos

- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**

- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**
 
- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**


<!--End GerenciadorSecretarias-->




## Descrição das classes

### Package Modelo

<!--Start: Consulta-->
#### Consulta

A classe ´Consulta´ gerencia informações sobre uma consulta médica, incluindo o id da consulta, a data, o horário, o id do médico responsável, o id do paciente e o tipo de consulta(normal ou retorno). Os métodos get e set permitem acessar e modificar esses atributos de forma controlada.

##### Atributos

- `id`
  - **Tipo**: `int`
  - **Descrição:** Identificador único para cada consulta. É gerado automaticamente em ordem crescente.

- `data`
  - **Tipo**: `LocalDate`
  - **Descrição:** Data em que a consulta está marcada. Utiliza a classe ´LocalDate´ do pacote ´java.time´ para representar uma data (ano, mês, dia) sem fuso horário.

- `horario`
  - **Tipo**: `LocalTime`
  - **Descrição:** Horário em que a consulta está marcada. Utiliza a classe ´LocalTime´ do pacote ´java.time´ para representar um horário (hora, minuto, segundo) sem fuso horário.
 
- `medicoId`
  - **Tipo**: `int`
  - **Descrição:**  Identificador do médico responsável pela consulta.
 
- `pacienteId`
  - **Tipo**: `int`
  - **Descrição:** Identificador do paciente que será atendido na consulta
 
- `tipo`
  - **Tipo**: `enum`
  - **Descrição:** Enumeração que define o tipo da consulta. Pode ser normal (uma consulta regular) ou retorno (uma consulta de acompanhamento).


##### Construtores

- `Consulta`:
  - **Descrição:** O construtor da classe ´Consulta´ é responsável por inicializar uma nova instância da classe com uma ´data´ e um ´horário´ específicos. Quando uma nova consulta é criada, o construtor é chamado com os parâmetros data e horario, que são então atribuídos aos atributos correspondentes da instância da classe.

##### Métodos

- `getId()`:
  - **Descrição:** Retorna o identificador único da consulta
  - **Tipo de Retorno:** ´int´

- `setId(int id)`:
  - **Descrição:**  Define o identicador único da consulta 
  - **Tipo de Retorno:** ´void´
 
- `getMedicoId()`:
  - **Descrição:** Retorna o identificador do médico(CRM) associado a consulta.
  - **Tipo de Retorno:** ´int´ 
 
- `setMedicoId(Medico medico)`:
  - **Descrição:** Define o identificador do médico (CRM) baseado em um objeto da classe ´Medico´.
  - **Tipo de Retorno:** ´void´

- `getPacienteId()`:
  - **Descrição:**  Retorna o identificador do paciente associado à consulta.
  - **Tipo de Retorno:** ´int´

- `setPacienteId(Paciente paciente)`:
  - **Descrição:** Define o identificador do paciente baseado em um objeto da classe ´Paciente´.
  - **Tipo de Retorno:** ´void´
    
- `getPacienteId()`:
  - **Descrição:** Retorna o identificador do paciente associado à consulta.
  - **Tipo de Retorno:** ´int´
 
- `getData()`:
  - **Descrição:** Retorna a data da consulta.
  - **Tipo de Retorno:** LocalDate

- `setData(LocalDate data)`:
  - **Descrição:** Define a data da consulta.
  - **Tipo de Retorno:** ´void´

- `getHorario()`:
  - **Descrição:** Retorna o horário da consulta.
  - **Tipo de Retorno:** LocalTime

- `setHorario(LocalTime horario)`:
  - **Descrição:** Define o horário da consulta.
  - **Tipo de Retorno:** ´void´
<!--End Consulta-->


<!--Start: DadosMedico-->
#### DadosMedico

A classe ´DadosMedico´ gerencia informações detalhadas sobre os hábitos e condições de saúde de um paciente, além de seu histórico médico. Os métodos get e set permitem acessar e modificar esses atributos de forma controlada.

##### Atributos

- `id`
  - **Tipo**: `int`
  - **Descrição:** Identificador único para os dados médicos.

- `fuma`
  - **Tipo**: `boolean`
  - **Descrição:** Indica se o paciente fuma.

- `bebe`
  - **Tipo**: `boolean`
  - **Descrição:** Indica se o paciente consome bebidas alcoólicas.

- `colesterol`
  - **Tipo**: `boolean`
  - **Descrição:** Indica se o paciente tem colesterol
 
- `diabetes`
  - **Tipo**: `boolean`
  - **Descrição:** Indica se o paciente tem diabetes

- `doencaCardiaca`
  - **Tipo**: `boolean`
  - **Descrição:** Indica se o paciente tem doença cardíaca.

- `cirurgias`
  - **Tipo**: `List<String>`
  - **Descrição:** Armazena uma lista de cirurgias que o paciente já realizou.

- `alergias`
  - **Tipo**: `List<String>`
  - **Descrição:** Armazena uma lista de alergias que o paciente possui.

##### Construtores

- `DadosMedico`:
  - **Descrição:**  O construtor da classe ´DadosMedicos´ é responsável por inicializar uma nova instância da classe com as informações de saúde do paciente, como hábitos de fumar e beber, níveis de colesterol, diabetes, doenças cardíacas, cirurgias realizadas e alergias.

##### Métodos
-  Os métodos get e set permitem acessar e modificar esses atributos de forma controlada.

<!--End DadosMedico-->


<!--Start: Medico-->
#### Medico

A classe ´Medico´ gerencia informações de um médico, incluindo dados pessoais, profissionais e a associação a uma secretária (se houver). . Os métodos get e set permitem acessar e modificar esses atributos de forma controlada.

##### Atributos
- ``
  - **Tipo**: ``
  - **Descrição:**

- ``
  - **Tipo**: ``
  - **Descrição:**
    

##### Construtores
- ``:
  - **Descrição:** 

##### Métodos

- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**

- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**
 
- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**

<!--End Medico-->


<!--Start: Paciente-->
#### Paciente

##### Atributos
- ``
  - **Tipo**: ``
  - **Descrição:**

- ``
  - **Tipo**: ``
  - **Descrição:**

##### Construtores
- ``:
  - **Descrição:** 

##### Métodos

- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**

- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**
 
- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**
<!--End Paciente-->


<!--Start: Prontuario-->
#### Prontuario

##### Atributos
- ``
  - **Tipo**: ``
  - **Descrição:**

- ``
  - **Tipo**: ``
  - **Descrição:**
    

##### Construtores
- ``:
  - **Descrição:** 

##### Métodos

- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**

- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**
 
- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**


<!--End Prontuario-->



<!--Start: Secretaria-->
#### Secretaria

##### Atributos
- ``
  - **Tipo**: ``
  - **Descrição:**

- ``
  - **Tipo**: ``
  - **Descrição:**
 
    
##### Construtores
- ``:
  - **Descrição:** 

##### Métodos

- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**

- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**
 
- `()`:
  - **Descrição:** 
  - **Tipo de Retorno:**

<!--End Secretaria-->







