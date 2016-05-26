INSERT INTO TB_CATEGORIA (NM_CATEGORIA) VALUES
('Calçados'),
('Roupas'),
('Esportes');

INSERT INTO TB_PRODUTO (NM_PRODUTO,ID_MARCA, GN_PRODUTO, DS_PRODUTO,TM_PRODUTO,COR_PRODUTO, DT_CADASTRO, VL_PRODUTO, QTD_ATUAL,ID_CATEGORIA)
VALUES
('Tenis Nike Basquete', 1,'masculino', 'Indicado para jogar basquete','Grande','preto', CURRENT_TIMESTAMP, 100.00, 10,1),
('Tenis Nike Casual', 1,'masculino', 'Indicado para andar','medio','azul', CURRENT_TIMESTAMP, 100.00, 10,1),
('Tenis Asics Sport', 1,'masculino', 'Indicado para balada huehue','Grande','preto', CURRENT_TIMESTAMP, 100.00, 10,1);


INSERT INTO TB_IMAGEM (NM_IMAGEM, DS_IMAGEM, ID_PRODUTO) VALUES 
('tenis1.png', 'Tenis Nike 1', 1),
('tenis2.png', 'Tenis Nike 2', 2),
('tenis3.png', 'Tenis Asics 3', 3);

INSERT INTO TB_PRODUTO_CATEGORIA (ID_PRODUTO, ID_CATEGORIA) VALUES 
(1, 1),
(2, 1),
(3, 1);

SELECT * fROM TB_CATEGORIA
SELECT * fROM TB_MARCA
SELECT * fROM TB_PRODUTO


INSERT INTO TB_MARCA(NOME_MARCA)
VALUES ('Nike');
INSERT INTO TB_CATEGORIA(NM_CATEGORIA)
VALUES ('Tenis');

