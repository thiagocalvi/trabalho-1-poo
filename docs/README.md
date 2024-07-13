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
* GerenciadorConsulta
* GerenciadorMedico
* GerenciadorMensagem
* GerenciadorPaciente
* GerenciadorProntuario
* GerenciadorRelatoriosMedico
* GerenciadorRelatoriosSecretaria
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



















### Package Medelo

#### Consulta

#### Medico

#### Paciente

#### Pessoa

#### Pronturario

#### Secretario


