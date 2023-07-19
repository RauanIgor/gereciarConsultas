
CREATE TABLE pessoa(
    nome varchar(100),
    cpf varchar(11) primary key,
    idade integer,
    sexo integer,
    email varchar(100),
    telefone varchar(11),
    usuario varchar(60),
    senha varchar(30),
    CRM varchar(20),
    tipo integer
    ); 
    
CREATE TABLE medicamento(
    consulta_id integer REFERENCES consulta (consulta_id),
    descricao text
    );
    
CREATE TABLE consulta(
    consulta_id integer  PRIMARY KEY,
    cpf varchar(11) REFERENCES pessoa(cpf),
    sintomas text,
    diagnostico text,
    intervencao text
    );

CREATE TABLE exame(
    consulta_id integer REFERENCES consulta(consulta_id),
    tipo text
    );
    
CREATE TABLE agenda(
    consulta_id integer REFERENCES consulta(consulta_id),
    cpf varchar(11) REFERENCES pessoa(cpf),
    qtd_vagas integer,
    data date
    );