use biblioteca;
-- select @@system_time_zone;

-- select * from sessoes;

-- set global time_zone = '-3:00';

select * from cidade;

select * from sessoes;

select * from cliente;

select * from locacao;

select * from locacao where locacao_id like 1 and locacao_situacao = 2 order by locacao_id;

select * from c order by nome_cli;

select sessoes_id, sessoes_num, sessoes_descricao from sessoes where sessoes_id = 1;

-- create database biblioteca;
-- use biblioteca;




create table sessoes(

	sessoes_id int primary key,
	sessoes_num varchar(20),
	sessoes_descricao varchar(255)
	
);
create table livros (

 	livros_id int primary key,
	livros_titulo varchar(255),
	livros_numpag int,
	livros_editora varchar(255),
	livros_autor varchar(255),
	livros_descricao varchar(255),
	livros_quantidade int,
	livros_sessao int, foreign key(livros_sessao) references sessoes(sessoes_id)
);
create table cidade (

	cidade_id int primary key,
	cidade_nome varchar(255),
	cidade_uf varchar(2)

);
create table cliente (

	cliente_id int primary key,
	cliente_nome varchar (255),
	cliente_senha varchar(20),
	cliente_telefone varchar(20),
	cliente_cpf varchar(14),
	cliente_rg varchar(30),
	cliente_cidade int, foreign key (cliente_cidade) references cidade(cidade_id),
	cliente_descricao varchar(255)

);
-- drop table cliente;
-- drop table locacao;

create table situacao (

	situacao_id int primary key,
    situacao_nome varchar(255)
    
);

insert into situacao (situacao_id, situacao_nome) values (1, "Disponivel");
insert into situacao (situacao_id, situacao_nome) values (2, "Emprestado");


create table locacao(

	locacao_id int primary key,
	locacao_dataretirada varchar(20),
	locacao_dataentrega varchar(20),
	locacao_livro int, foreign key (locacao_livro) references livros(livros_id),
	locacao_cliente int, foreign key (locacao_cliente) references cliente(cliente_id),
    locacao_situacao int, foreign key (locacao_situacao) references situacao(situacao_id)
    
);
insert into locacao (locacao_id, locacao_dataretirada, locacao_dataentrega, locacao_livro, locacao_cliente, locacao_nome)values (3, "24/08/2009", "24/08/2010", 1, 1, "Cleitinho");
drop table locacao;

select * from locacao;



create table usuario (
	usuario_id int primary key,
	usuario_nome varchar(20),
	usuario_senha varchar(20)

);


create table mapa (

	mapa_id int primary key,
    mapa_nome varchar(255),
    mapa_descricao varchar(255),
    mapa_sessao int, foreign key(mapa_sessao) references sessoes(sessoes_id)
);


-- Sessoes
insert into sessoes(sessoes_id, sessoes_num, sessoes_descricao) values(1, "10A","Dramaturgia");
insert into sessoes(sessoes_id, sessoes_num, sessoes_descricao) values(2, "20A","Ação");
insert into sessoes(sessoes_id, sessoes_num, sessoes_descricao) values(3, "30A","Didaticos");


-- Livros
insert into livros(livros_id, livros_titulo,livros_numpag, livros_editora, livros_autor, livros_descricao, livros_quantidade, livros_sessao)
values(1, "Drama 1", 200, "Editora1", "Autor1", "Primeiro livro de Drama", 5, 1);
insert into livros(livros_id, livros_titulo,livros_numpag, livros_editora, livros_autor, livros_descricao, livros_quantidade, livros_sessao)
values(2, "Ação", 300, "Editora2", "Autor2", "Primeiro livro de Ação.", 10, 2);
insert into livros(livros_id, livros_titulo,livros_numpag, livros_editora, livros_autor, livros_descricao, livros_quantidade, livros_sessao)
values(3, "Didatico", 400, "Editora3", "Autor3", "Primeiro Livro Didatico", 20, 3);

-- Cidade
insert into cidade(cidade_id, cidade_nome, cidade_uf) values (1, "Tenente Portela", "RS");
insert into cidade(cidade_id, cidade_nome, cidade_uf) values (2, "Frederico Westphalen", "RS");
insert into cidade(cidade_id, cidade_nome, cidade_uf) values (3, "Palmitos", "SC");

-- Clientes
insert into cliente(cliente_id, cliente_nome, cliente_senha, cliente_telefone, cliente_cpf, cliente_rg, cliente_cidade, cliente_descricao) values (1, "Fulano", "teste123", "5599684280", "006.545.781-88", "1892012", 1,  "Aluno de Tenente Portela");
insert into cliente(cliente_id, cliente_nome, cliente_senha, cliente_telefone, cliente_cpf, cliente_rg, cliente_cidade, cliente_descricao) values (2, "Ciclano", "teste456", "55997543621", "054.584.000-55", "120343123", 2, "Aluno de Seberi");
insert into cliente(cliente_id, cliente_nome, cliente_senha, cliente_telefone, cliente_cpf, cliente_rg, cliente_cidade, cliente_descricao) values (3, "Beltrano", "teste789", "4998785472", "111.884.321-00", "920124420", 3,  "Aluno de Palmitos");


-- select * from cidade;

 -- drop table cidade;

-- drop table cliente;

-- drop table locacao;


select * from livros;
select * from cidade;

select livros_id, livros_titulo, livros_numpag, livros_editora, livros_autor, livros_descricao, livros_quantidade, livros_sessao from livros where livros_id = 1;

select * from livros where livros_titulo like 2 order by livros_titulo;

select cliente_id, cliente_nome, cliente_senha, cliente_telefone, cliente_cpf, cliente_rg, cliente_cidade, cliente_descricao 
from cliente where cliente_id = 12;

select * from sessoes order by sessoes_num;

select * from sessoes where sessoes_num like 3 order by sessoes_num;



select 
cliente.cliente_id, 
cliente.cliente_nome, 
cliente.cliente_senha, 
cliente.cliente_telefone, 
cliente.cliente_cpf,  
cliente.cliente_rg, 
cliente.cliente_descricao,  
cliente.cliente_cidade,
cidade.cidade_id,
cidade.cidade_nome
from cliente inner join cidade 
on cliente.cliente_cidade = cidade.cidade_id ;

-- select * from cliente

update cliente set
                      cliente_nome = ?,
                      cliente_senha = ?,
                      cliente_telefone = ?,
                      cliente_cpf = ?,
                      cliente_rg = ?,
                      cliente_cidade = ?,
                      cliente_descricao = ?
                      where cliente_id = 1;



insert into locacao(
                        locacao_id, 
                        locacao_dataretirada, 
                        locacao_dataentrega, 
                      locaca_livro, 
                       locacao_cliente) 
                   values (1, "24/01/2020", "24/01/2020", 1, 1);
                   
                   
             select
                  locacao_id,
                     locacao_dataretirada,
                      locacao_dataentrega,
                   locacao_livro,
                     locacao_cliente,
                     locacao_nome 
                    from locacao where locacao_id =1;     
                   
                   drop table locacao;
                   
                   
                   
                   
                   
                   
