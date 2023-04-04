CREATE TABLE autor(
  id uuid NOT NULL,
  nome varchar(255) NOT NULL,
  descricao varchar(255),
  PRIMARY KEY (id)
);

create table editora(
    id uuid NOT NULL,
    nome varchar(255) NOT NULL,
    primary key (id)
);

create table livro(
    id uuid NOT NULL,
    isbn varchar(255) NOT NULL,
    paginas integer NOT NULL,
    titulo varchar(255) NOT NULL,
    autor_id uuid NOT NULL REFERENCES autor(id),
    editora_id uuid NOT NULL REFERENCES editora(id),
    primary key (id)
);

create table cliente(
    id uuid NOT NULL,
    cpf varchar(255) NOT NULL,
    data_nascimento date NOT NULL,
    nome varchar(255) NOT NULL,
    sobrenome varchar(255) NOT NULL,
    primary key (id)
);

create table emprestimo(
    id uuid NOT NULL,
    data timestamp NOT NULL,
    cliente_id uuid NOT NULL REFERENCES cliente(id),
    livro_id uuid NOT NULL REFERENCES livro(id),
    primary key (id)
);