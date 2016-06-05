--INSERT INTO TB_MARCA(NOME_MARCA)
--VALUES ('Nike');
--INSERT INTO TB_CATEGORIA(NM_CATEGORIA)
--VALUES ('Tenis');

INSERT INTO TB_CATEGORIA (NM_CATEGORIA) VALUES
('Calçados'),
('Roupas'),
('Esportes');

INSERT INTO TB_PRODUTO (NM_PRODUTO,NM_MARCA, GN_PRODUTO, DS_PRODUTO,TM_PRODUTO,COR_PRODUTO, DT_CADASTRO, VL_PRODUTO, QTD_ATUAL)
VALUES
('Tenis Nike Basquete', 'Nike','masculino', 'Indicado para jogar basquete','Grande','preto', CURRENT_TIMESTAMP, 100.00, 10),
('Tenis Nike Casual', 'Nike','masculino', 'Indicado para andar','medio','azul', CURRENT_TIMESTAMP, 100.00, 10),
('Tenis Asics Sport', 'Asics','masculino', 'Indicado para balada huehue','Grande','preto', CURRENT_TIMESTAMP, 100.00, 10);


INSERT INTO TB_IMAGEM (NM_IMAGEM, DS_IMAGEM, ID_PRODUTO) VALUES 
('tenis1.png', 'Tenis Nike 1', 1),
('tenis2.png', 'Tenis Nike 2', 2),
('tenis3.png', 'Tenis Asics 3', 3);

INSERT INTO TB_PRODUTO_CATEGORIA (ID_PRODUTO, ID_CATEGORIA) VALUES 
(1, 1),
(2, 1),
(3, 1);
-- 
-- SELECT * fROM TB_CATEGORIA
-- SELECT * fROM TB_MARCA
-- SELECT * fROM TB_PRODUTO

-- cliente
INSERT INTO USUARIO_CLIENTE (NOME, CPF, SEXO, EMAIL, LOGIN, SENHA, ENDERECO, DT_NASCIMENTO) VALUES 
('UsuarioCliente', '12345678123', 'fem', 'email@email.com', 'login', 'senha', 'endereco', '24/04/1980');

-- admin
INSERT INTO USUARIO_ADMIN (NOME, EMAIL, LOGIN, SENHA) VALUES 
('UsuarioAdmin', 'email@email.com', 'login', 'senha');

