/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  michael.aroriz
 * Created: 04/12/2017
 */
create new table produto (
    codProduto integer not null,
    nome varchar(100) not null,
    descricao varchar(100) not null,
    marca varchar(100) not null,
    valor float not null,
    quantidade int(100) not null,
    categoria varchar(50) not null,
    constraint primary_key primary key (codProduto)
);


