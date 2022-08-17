create table pedido(
	i_codiddoPedido_pedido INT(4),
    t_prazoEntrega_pedido DATETIME,
    t_dataPedido_pedido DATETIME,
    i_codCliente_pedido INT(4),
    i_codVendedor_pedido INT(4)
);
alter table pedido modify column i_codiddoPedido_pedido INT PRIMARY KEY;
alter table pedido add constraint fk_codVendedor foreign key (i_codVendedor_pedido) references vendedor (i_codVendedor_vendedor);
alter table pedido add constraint fk_codCliente foreign key (i_codCliente_pedido) references cliente (i_codCliente_cliente);

create table vendedor(
	i_codVendedor_vendedor INT,
    s_nome_vendedor VARCHAR(45),
    d_salarioFixo_vendedor DECIMAL(10,2),
    e_faixaComissao_vendedor INT
);

alter table vendedor modify column i_codVendedor_vendedor INT PRIMARY KEY;



create table cliente(
	i_codCliente_cliente int(4),
    s_nome_cliente VARCHAR(45),
    s_endereco_cliente VARCHAR(45),
    s_cidade_cliente VARCHAR(45),
    s_cep_cliente VARCHAR(11),
    s_uf_cliente CHAR(2),
    s_ie_cliente VARCHAR(12)
);

alter table cliente modify column i_codCliente_cliente INT PRIMARY KEY;

create table itemPedido(
	i_codItemPedido_itemPedido INT(4),
    i_codPedido_itemPedido INT(4),
	i_codProduto_itemPedido INT(4),
    i_quantidade_itemPedido INT(5)
);
alter table itemPedido modify column i_codItemPedido_itemPedido INT PRIMARY KEY;
alter table itemPedido add constraint fk_codPedido foreign key (i_codPedido_itemPedido) references pedido (i_codiddoPedido_pedido);
alter table itemPedido add constraint fk_codProduto foreign key (i_codProduto_itemPedido) references produto (i_codProduto_produto);

create table produto(
	i_codProduto_produto INT(4),
    s_descricao_produto VARCHAR(45),
    d_valorUnitario_produto DECIMAL(10,2)
);
alter table produto modify column i_codProduto_produto INT PRIMARY KEY;