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
	i_quantidade_itemPedido INT,
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

insert into cliente (s_nome_cliente, s_endereco_cliente, s_cidade_cliente, s_cep_cliente, s_uf_cliente) 
values 
	('Sebastião Oliver Samuel Alves', 'Quadra 502 Norte Rua NS B', 'Palmas', '77006552', 'TO'),
	('Sérgio Danilo Fogaça', 'Rua Barão de Lucena', 'Cacoal', '76961692', 'RO'),
	('Sarah Isabella Isabelle Moraes', 'Rua Isabel Ferreira de Freitas', 'Mossoró', '59615352', 'RN'),
	('Mariah Heloise Analu Farias', 'Travessa Vitória', 'Natal', '59073102', 'RN'),
	('Gabriela Giovanna Cardoso', 'Rua Francisco Gabardo', 'Almirante Tamandaré', '83514080', 'PR'),
	('Theo Vinicius Ruan Almad', 'Rua Coronel Luís', 'Gravataí', '94130210', 'RS'),
	('Oliver Francisco Ricardo Barros', 'Travessa Terceira', 'Macapá', '68906827', 'AP'),
	('Benjamin Felipe Anthony da Cruz', 'Rua São Joaquim', 'Timon', '65631794', 'MA'),
	('Priscila Mariah Giovanna Santos', 'Rua Hermenegildo de Almeida', 'João Pessoa', '58050290', 'PB'),
	('Brenda Sarah Daiane Lima', 'Rua 32-A', 'Gurupi', '77415040', 'TO'),
	('Luzia Lúcia Stefany Ribeiro', 'Rua Hugo Costa Duarte', 'Santana do Livramento', '97578636', 'RS'),
	('André Tomás Yuri Pereira', 'Quadra T3', 'Parnaíba', '64216852', 'PI'),
	('Guilherme Gustavo Pietro Duarte', 'Rua Bebeto Alves', 'Rio Branco', '69901558', 'AC'),
	('Anthony Rodrigo Teixeira', 'Rua dos Tijolos', 'Recife', '51150590', 'PE'),
	('Carolina Alana Drumond', 'Rua A', 'Aracaju', '49087093', 'SE'); 

insert into vendedor (s_nome_vendedor, dec_salarioFixo_vendedor, en_faixaComissao_vendedor) values
	('Flebaher', 4325.65, 'A'),
	('Alfoe', 3245.66, 'A'),
	('Mecuo', 19403.54, 'A'),
	('Wokie', 54326.45, 'B'),
	('Beiwo', 4324.56, 'B'),
	('Blini', 9856.77, 'B'),
	('Woemo', 4325.67, 'B'),
	('Boen', 8769.98, 'C'),
	('Rabyo', 6547.67, 'C'),
	('Irrye', 1004.45, 'C'),
	('Gyoxu', 6567.56, 'D'),
	('Poeol', 10234.54, 'D'),
	('Onor', 4354.7, 'D'),
	('Kawor', 8767.99, 'A');
use dia31;
insert into pedido(d_prazoEntrega_pedido, d_dataPedido_pedido, i_codCliente_pedido, i_codVendedor_pedido) values 
	( '2022-07-01', '2022-06-23', '01', '14'),
	( '2022-07-23', '2022-06-12', '02', '14'),
	( '2022-07-02', '2022-06-02', '03', '14'),
	( '2022-07-22', '2022-06-06', '04', '14'),
	( '2022-07-12', '2022-06-21', '05', '14'),
	( '2022-07-11', '2022-06-26', '06', '14'),
	( '2022-07-14', '2022-06-01', '07', '13'),
	( '2022-07-16', '2022-06-01', '08', '13'),
	( '2022-07-13', '2022-06-21', '09', '13'),
	( '2022-07-13', '2022-06-03', '10', '12'),
	( '2022-07-27', '2022-06-12', '11', '12'),
	( '2022-07-31', '2022-06-15', '12', '12'),
	( '2022-07-30', '2022-06-19', '13', '11'),
	( '2022-07-04', '2022-06-18', '14', '11'),
	( '2022-07-14', '2022-06-10', '15', '11'),
    ( '2022-07-01', '2022-06-23', '01', '10'),
	( '2022-07-23', '2022-06-12', '02', '10'),
	( '2022-07-02', '2022-06-02', '03', '10'),
	( '2022-07-22', '2022-06-06', '04', '09'),
	( '2022-07-12', '2022-06-21', '05', '09'),
	( '2022-07-11', '2022-06-26', '06', '09'),
	( '2022-07-14', '2022-06-11', '07', '08'),
	( '2022-07-16', '2022-06-11', '08', '08'),
	( '2022-07-13', '2022-06-21', '09', '08'),
	( '2022-07-13', '2022-06-30', '10', '07'),
	( '2022-07-27', '2022-06-22', '11', '07'),
	( '2022-07-31', '2022-06-15', '12', '07'),
	( '2022-07-30', '2022-06-19', '13', '06'),
	( '2022-07-04', '2022-06-18', '14', '06'),
	( '2022-07-14', '2022-06-10', '15', '06'),
    ( '2022-07-01', '2022-06-23', '01', '05'),
	( '2022-07-23', '2022-06-12', '02', '05'),
	( '2022-07-02', '2022-06-02', '03', '05'),
	( '2022-07-22', '2022-06-06', '04', '04'),
	( '2022-07-12', '2022-06-21', '05', '04'),
	( '2022-07-11', '2022-06-26', '06', '04'),
	( '2022-07-14', '2022-06-30', '07', '03'),
	( '2022-07-16', '2022-06-11', '08', '03'),
	( '2022-07-13', '2022-06-21', '09', '03'),
	( '2022-07-13', '2022-06-30', '10', '02'),
	( '2022-07-27', '2022-06-12', '11', '02'),
	( '2022-07-31', '2022-06-15', '12', '02'),
	( '2022-07-30', '2022-06-19', '13', '01'),
	( '2022-07-04', '2022-06-18', '14', '01'),
    ( '2022-07-04', '2022-06-18', '14', '01');

insert into produto(s_descricao_produto, dec_valorUnitario) values 
	('Desciçao item 1000',29.99),
	('Desciçao item 1100',44.56),
	('Desciçao item 2200',23.54),
	('Desciçao item 3330',87.67),
	('Desciçao item 4440',99.99),
	('Desciçao item 5500',65.99),
	('Desciçao item 6600',45.66),
	('Desciçao item 7700',00.45),
	('Desciçao item 8800',65.76),
	('Desciçao item 9900',87.23),
	('Desciçao item 1110',33.54),
	('Desciçao item 2220',11.3),
	('Desciçao item 3330',33.54),
	('Desciçao item 4440',87.67),
	('Desciçao item 5550',1402.32);
select * from pedido;
insert into itempedido(i_codPedido_itemPedido, i_codProduto_itemPedido, i_quantidade_itemPedido) values 
    ( 247, 01, 120),
	( 254, 02, 43),
    ( 253, 03, 87),
    ( 255, 04, 450),
    ( 256, 05, 3345),
    ( 257, 06, 332),
    ( 259, 07, 1130),
    ( 258, 08, 4335),
    ( 260, 09, 20),
    ( 261, 10, 10),
    ( 262, 11, 540),
    ( 263, 12, 675),
    ( 264, 13, 45),
    ( 265, 14, 354),
    ( 266, 14, 654);

select * from vendedor;
