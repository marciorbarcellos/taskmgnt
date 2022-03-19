INSERT INTO tb_pessoa(nome, departamento) VALUES ('Camila', '1');
INSERT INTO tb_pessoa(nome, departamento) VALUES ('Pedro', '2');
INSERT INTO tb_pessoa(nome, departamento) VALUES ('Fabiano', '3');
INSERT INTO tb_pessoa(nome, departamento) VALUES ('Raquel', '3');
INSERT INTO tb_pessoa(nome, departamento) VALUES ('Patricia', '3');
INSERT INTO tb_pessoa(nome, departamento) VALUES ('Joaquim', '1');

INSERT INTO tb_tarefa(id_tarefa, titulo, descricao, prazo, departamento, duracao, pessoa_alocada, status) VALUES (1001, 'Validar NF Janeiro', 'Validar Notas recebidas no mês de Janeiro', '15/02/2022', 1, 14, 1, 'true');
INSERT INTO tb_tarefa(id_tarefa, titulo, descricao, prazo, departamento, duracao, pessoa_alocada, status) VALUES (1002, 'Bug 352', 'Corrigir bug 352 na versão 1.25', '10/05/2022', 3, 25, 0, 'false');
INSERT INTO tb_tarefa(id_tarefa, titulo, descricao, prazo, departamento, duracao, pessoa_alocada, status) VALUES (1003, 'Liberação da versão 1.24', 'Disponibilizar pacote para testes', '02/02/2022', 3, 2, 3, 'false');
INSERT INTO tb_tarefa(id_tarefa, titulo, descricao, prazo, departamento, duracao, pessoa_alocada, status) VALUES (1004, 'Reunião A', 'Reunião com cliente A para apresentação do produto', '05/02/2022', 2, 5, 0, 'false');
INSERT INTO tb_tarefa(id_tarefa, titulo, descricao, prazo, departamento, duracao, pessoa_alocada, status) VALUES (1005, 'Reunião final', 'Fechamento contrato', '28/03/2022', 2, 6, 0, 'false');
INSERT INTO tb_tarefa(id_tarefa, titulo, descricao, prazo, departamento, duracao, pessoa_alocada, status) VALUES (1006, 'Pagamento 01/2022', 'Realizar pagamento dos fornecedores', '31/01/2022', 1, 6, 1, 'true');
INSERT INTO tb_tarefa(id_tarefa, titulo, descricao, prazo, departamento, duracao, pessoa_alocada, status) VALUES (1007, 'Bug 401', 'Corrigir bug 401 na versão 1.20', '01/02/2022', 3, 2, 4, 'true');
INSERT INTO tb_tarefa(id_tarefa, titulo, descricao, prazo, departamento, duracao, pessoa_alocada, status) VALUES (1008, 'Bug 399', 'Corrigir bug 399 na versão 1.20', '28/01/2022', 3, 6, 5, 'true');
INSERT INTO tb_tarefa(id_tarefa, titulo, descricao, prazo, departamento, duracao, pessoa_alocada, status) VALUES (1009, 'Reunião B', 'Reunião com cliente B para apresentação do produto', '31/01/2022', 2, 5, 2, 'true');
INSERT INTO tb_tarefa(id_tarefa, titulo, descricao, prazo, departamento, duracao, pessoa_alocada, status) VALUES (1010, 'Validar NF Fevereiro', 'Validar notas recebidas no mês de Fevereiro', '15/03/2022', 1, 14, 6, 'false');

INSERT INTO tb_departamento(id, titulo) VALUES ('1', 'Financeiro');
INSERT INTO tb_departamento(id, titulo) VALUES ('2', 'Comercial');
INSERT INTO tb_departamento(id, titulo) VALUES ('3', 'Desenvolvimento');

INSERT INTO tb_lista_tarefas(id_tarefa, id_pessoa, descricao) VALUES (1001, 1, 'Validar NF Janeiro');
INSERT INTO tb_lista_tarefas(id_tarefa, id_pessoa, descricao) VALUES (1005, 1, 'Reunião final');
INSERT INTO tb_lista_tarefas(id_tarefa, id_pessoa, descricao) VALUES (1006, 1, 'Pagamento 01/2022');
INSERT INTO tb_lista_tarefas(id_tarefa, id_pessoa, descricao) VALUES (1002, 3, 'Bug 352');
INSERT INTO tb_lista_tarefas(id_tarefa, id_pessoa, descricao) VALUES (1003, 5, 'Liberação da versão 1.24');
INSERT INTO tb_lista_tarefas(id_tarefa, id_pessoa, descricao) VALUES (1004, 2, 'Reunião A');
INSERT INTO tb_lista_tarefas(id_tarefa, id_pessoa, descricao) VALUES (1007, 2, 'Bug 401');
