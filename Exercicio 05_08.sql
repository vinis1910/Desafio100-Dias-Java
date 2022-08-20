
create table vendedor(
	i_codVendedor_vendedor INT UNSIGNED not null  AUTO_INCREMENT,
    s_nome_vendedor VARCHAR(45),
    dec_salarioFixo_vendedor DECIMAL(10,2),
    en_faixaComissao_vendedor ENUM('A', 'B', 'C', 'D'),
    PRIMARY KEY(i_codVendedor_vendedor)
);

create table cliente(
	i_codCliente_cliente INT UNSIGNED AUTO_INCREMENT,
    s_nome_cliente VARCHAR(45),
    s_endereco_cliente VARCHAR(45),
    s_cidade_cliente VARCHAR(45),
    s_cep_cliente VARCHAR(11),
    s_uf_cliente VARCHAR(2),
    PRIMARY KEY(i_codCliente_cliente)
);

create table produto(
	i_codProduto_produto INT UNSIGNED AUTO_INCREMENT,
    s_descricao_produto VARCHAR(45),
    dec_valorUnitario DECIMAL(10,2),
    PRIMARY KEY(i_codProduto_produto)
);

create table itemPedido(
	i_codItemPedido_itemPedido INT UNSIGNED AUTO_INCREMENT,
	i_codPedido_itemPedido INT UNSIGNED,
    i_codProduto_itemPedido INT UNSIGNED,
	i_quantidade_itemPedido INT UNSIGNED,
    PRIMARY KEY(i_codItemPedido_itemPedido),
    FOREIGN KEY(i_codPedido_itemPedido) REFERENCES pedido(i_codPedido_pedido),
    FOREIGN KEY(i_codProduto_itemPedido) REFERENCES produto(i_codProduto_produto)
);

create table pedido(
	i_codPedido_pedido INT UNSIGNED not null AUTO_INCREMENT,
    d_prazoEntrega_pedido DATE,
    d_dataPedido_pedido DATE,
    i_codCliente_pedido INT unsigned,
    i_codVendedor_pedido INT unsigned,
    primary key(i_codPedido_pedido),
    foreign key (i_codVendedor_pedido) references vendedor(i_codVendedor_vendedor),
    FOREIGN KEY (i_codVendedor_pedido) references cliente(i_codCliente_cliente)
);