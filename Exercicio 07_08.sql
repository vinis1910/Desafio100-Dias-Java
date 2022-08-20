select * from cliente;
select * from vendedor;
select * from pedido where i_codVendedor_pedido = '01';
select max(dec_salarioFixo_vendedor) from vendedor;
SELECT dec_valorUnitario from produto order by dec_valorUnitario desc limit 3;