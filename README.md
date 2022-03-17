![myImage](https://github.com/marciorbarcellos/taskmgnt/blob/main/imagens/logotipo.jpg)

# Taskmgnt

Projeto de criação de uma API de gerenciamento de tarefas para disponibilizar para a equipe de frontend.


### Requisitos

- A API deve ser REST
- Cada pessoa terá um id, nome, departamento e lista de tarefas
- Cada tarefa terá id, título, descrição, prazo, departamento, duração, pessoa alocada e se já foi finalizado

### Funcionalidades desejadas
- Adicionar uma pessoa (post/pessoas)
- Alterar uma pessoa (put/pessoas/{id})
- Remover pessoa (delete/pessoas/{id})
- Adicionar uma tarefa (post/tarefas)
- Alocar uma pessoa na tarefa que tenha o mesmo departamento (put/tarefas/alocar/{id})
- Finalizar a tarefa (put/tarefas/finalizar/{id})
- Listar pessoas trazendo nome, departamento, total horas gastas nas tarefas (get/pessoas)
- Buscar pessoas por nome e período, retorna média de horas gastas por tarefa.
(get/pessoas/gastos)
- Listar 3 tarefas que estejam sem pessoa alocada com os prazos mais antigos.
(get/tarefas/pendentes)
- Listar departamento e quantidade de pessoas e tarefas (get/departamentos)


> OBS: A linguagem para realização do desafio deve ser em Java.
Framework SprintBoot ou Quarkus.
Bancos de dados: MongoDB, PostgreSQL.

Por último criar alguns select de consolidação de dados

- Montar select que retorne nome do departamento, quantidade de tarefas finalizadas e
quantidade de tarefas não finalizadas

- Retornar a pessoa que mais gastou horas em janeiro de 2022


### Registro de Pessoas
![pessoas](https://github.com/marciorbarcellos/taskmgnt/blob/main/imagens/registro-de-pessoas.jpg)

### Registro de Tarefas
![tarefas](https://github.com/marciorbarcellos/taskmgnt/blob/main/imagens/Registro-de-tarefa.jpg)

### Registro de Departamentos
![departamentos](https://github.com/marciorbarcellos/taskmgnt/blob/main/imagens/registro-de-departamento.jpg)

### License
[MIT](https://choosealicense.com/licenses/mit/)

[Autor](https://github.com/marciorbarcellos)
