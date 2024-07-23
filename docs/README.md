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

Sendo elas usadas para armazenar em memória os objetos que são criador durante a execução do programa (emulando um banco de dados)

O package Gerenciador armazena as classes:
* GerenciadorAdm
* GerenciadorMedicos
* GerenciadorMensagem
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

A classe `GerenciadorAdm` é responsével por gerenciar as operações de CRUD(Create, Read, Uptdate, Delete) dos objetos da classe `Medico` e `Secretaria`, permitindo ao administrador do sistema cadastrar, atualizar, remover e listar registros desses profissonais de forma eficiente e organizada.

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

- ``
  - **Tipo**: ``
  - **Descrição:**

- ``
  - **Tipo**: ``
  - **Descrição:**

##### Construtores

- `GerenciadorMedicos()`:
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

<!--End GerenciadorMedicos-->


<!--Start: GerenciadorMensagens-->
#### GerenciadorMensagens


##### Atributos


##### Construtores

- `GerenciadorMensagens()`:
  - **Descrição:** 


##### Métodos

<!--End GerenciadorMensagens-->


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

- `GerenciadorMedicos()`:
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




### Package Modelo

#### Consulta

#### Medico

#### Paciente

#### Pessoa

#### Pronturario

#### Secretario

