INSERT INTO TB_CATEGORIA (NM_CATEGORIA) VALUES
('Calçados'),
('Roupas'),
('Esportes');

INSERT INTO TB_PRODUTO (NM_PRODUTO, DS_PRODUTO, DT_CADASTRO, VL_PRODUTO) VALUES
('Tenis Nike Basquete', 'Indicado para jogar basquete', CURRENT_TIMESTAMP, 100.00),
('Tenis Nike Casual', 'Indicado para dia a dia', CURRENT_TIMESTAMP, 120.00),
('Tenis Asics Sport', 'Indicado para correr', CURRENT_TIMESTAMP, 90.00);

INSERT INTO TB_IMAGEM (NM_IMAGEM, DS_IMAGEM, ID_PRODUTO) VALUES 
('tenis1.png', 'Tenis Nike 1', 1),
('tenis2.png', 'Tenis Nike 2', 1),
('tenis3.png', 'Tenis Asics 3', 1);

INSERT INTO TB_PRODUTO_CATEGORIA (ID_PRODUTO, ID_CATEGORIA) VALUES 
(1, 1),
(2, 1),
(3, 1);
