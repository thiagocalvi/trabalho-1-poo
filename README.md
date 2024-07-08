# Parte 1 do Primeiro Trabalho da Disciplina de Programação Orientada a Objetos

Veja a documentação do código [aqui](./docs)

## Descição
Crie de uma aplicação Java desktop de acordo com a seguinte descrição:

“A clínica médica Saúde & Cia está passando por problemas operacionais. A secretária anota todas as informações dos pacientes em fichários de papéis que normalmente estão fora de ordem alfabética. Os médicos da clínica não têm ideia do fluxo de clientes que atendem e quando precisam procurar informações sobre os últimos atendimentos despendem muito tempo procurando nos prontuários de atendimento.  Nem sempre a secretária consegue se lembrar de confirmar as consultas com os pacientes com um dia de antecedência, sendo que muitos deles esquecem e os médicos ficam com tempo não preenchido em seus consultórios”. 

Dado este contexto crie um sistema de controle de clínica médica baseado na seguinte especificação por perfil de ator:

**Secretária**
* Gerenciar (cadastrar, atualizar e remover) pacientes: dados de identificação, data de nascimento, endereço, informações para contato, tipo de convênio (particular/plano de saúde).

* Gerenciar (cadastrar, atualizar e remover) consultas: data, horário, médico,paciente, tipo (consulta normal: duração de 1 hora, retorno: duração de 30 minutos).

* Gerar relatórios de consulta: consultas relativas ao dia seguinte (filtro por quem
tem ou não e-mail/celular).


**Médicos**
* Gerenciar (cadastrar, atualizar e remover) dados adicionais de pacientes com elementos que afetam sua saúde: fuma, bebe, colesterol, diabete, doença cardíaca, cirurgias (informar quais), alergias (informar quais). Obs.: Este cadastro é complementar ao cadastro de pacientes da secretária com acesso somente pelo médico.

* Gerenciar (cadastrar, atualizar e remover) prontuário do paciente: sintomas, diagnóstico da doença, prescrição do tratamento.

* Gerar relatórios médicos: receita, atestado, declaração de acompanhamento, clientes atendidos no mês.

**Gerenciador de mensagens**
* Enviar mensagens: deverá enviar e-mail/SMS para os clientes avisando sobre o horário de consulta no dia seguinte (simular esta função!).