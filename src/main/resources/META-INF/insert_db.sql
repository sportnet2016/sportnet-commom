--INSERT INTO TB_MARCA(NOME_MARCA)
--VALUES ('Nike');
--INSERT INTO TB_CATEGORIA(NM_CATEGORIA)
--VALUES ('Tenis');

INSERT INTO TB_CATEGORIA (NM_CATEGORIA) VALUES
('Tenis'),
('Chuteira'),
('Bota'),
('Camisa de Time'),
('Camiseta'),
('Jaqueta'),
('Agasalho'),
('Bermuda'),
('Blusa'),
('Calca'),
('Mochila'),
('Bone'),
('Caneleira');

INSERT INTO TB_PRODUTO (NM_PRODUTO,NM_MARCA, GN_PRODUTO, DS_PRODUTO,TM_PRODUTO,COR_PRODUTO, DT_CADASTRO, VL_PRODUTO, QTD_ATUAL)
VALUES
-- Tênis
('Tenis Nike Basquete', 'Nike','masculino', 'Indicado para jogar basquete','Grande','preto', CURRENT_TIMESTAMP, 100.00, 10),
('Tenis Nike Casual', 'Nike','masculino', 'Indicado para andar','medio','azul', CURRENT_TIMESTAMP, 120.00, 10),
('Tenis Asics Sport', 'Asics','masculino', 'Indicado para balada','Grande','preto', CURRENT_TIMESTAMP, 150.00, 10),
('Nike Shox Deliver', 'Nike','masculino', 'Tênis Nike Shox Deliver','Grande','ouro', CURRENT_TIMESTAMP, 500.00, 10),
('Oxer Agile', 'Oxer','feminino', 'Tênis Oxer Agile','medio','cinza', CURRENT_TIMESTAMP, 69.00, 10),
('Polo US 7007', 'Polo Us','feminino', 'Tênis Polo US 7007','Grande','branco', CURRENT_TIMESTAMP, 125.50, 10),
-- Chuteiras
('Bravata FG', 'Nike','masculino', 'Chuteira de Campo Nike Bravata FG','Grande','preto', CURRENT_TIMESTAMP, 149.90, 10),
('Hypervenom Phelon II FG', 'Nike','masculino', 'Chuteira de Campo Nike Hypervenom Phelon II FG','medio','bronze', CURRENT_TIMESTAMP, 229.90, 10),
('Mercurial Victory V FG', 'Nike','masculino', 'Chuteira de Campo Nike Mercurial Victory CR7 V FG','Grande','azul', CURRENT_TIMESTAMP, 349.90, 10),
('X 15.4 FG', 'Adidas','masculino', 'Chuteira de Campo adidas X 15.4 FG','Grande','branco', CURRENT_TIMESTAMP, 199.90, 10),
('Ace 16.3 Primemesh FG', 'Adidas','masculino', 'Chuteira de Campo adidas Ace 16.3 Primemesh FG','Grande','azul', CURRENT_TIMESTAMP, 340.90, 10),
('X 16.4 FG', 'Adidas','masculino', 'Chuteira de Campo adidas X 16.4 FG','Grande','prata', CURRENT_TIMESTAMP, 229.90, 10),
-- Botas
('Flume Waterproof MID', 'Timberland','masculino', 'Bota Timberland Flume Waterproof MID','Grande','marrom', CURRENT_TIMESTAMP, 449.90, 10),
('Summit Hiker Premium', 'Timberland','masculino', 'Bota Timberland Summit Hiker Premium','medio','marrom', CURRENT_TIMESTAMP, 269.00, 10),
('Yellow Boot 6 Premium', 'Timberland','masculino', 'Bota Timberland Yellow Boot 6 Premium','Grande','marrom claro', CURRENT_TIMESTAMP, 889.90, 10),
('Trail Dust', 'Timberland','feminino', 'Bota Timberland Trail Dust','Grande','marrom', CURRENT_TIMESTAMP, 319.90, 10),
('Belle', 'Braddock','feminino', 'Bota Braddock Belle','Grande','marrom claro', CURRENT_TIMESTAMP, 319.90, 10),
('Alba', 'Braddock ','feminino', 'Bota Braddock Alba','Grande','marrom claro', CURRENT_TIMESTAMP, 229.90, 10),
-- Camisetas de Time
('Camisa São Paulo I 2016', 'Under Armour','masculino', 'Camisa do São Paulo I 2016 Torcedor Under Armour','Grande','branco', CURRENT_TIMESTAMP, 229.90, 10),
('Camisa Grêmio I 2016', 'Umbro','masculino', 'Camisa do Grêmio I 2016 Umbro','medio','branco/azul/preto', CURRENT_TIMESTAMP, 239.00, 10),
('Camisa Cruzeiro I 2016', 'Umbro','masculino', 'Camisa do Cruzeiro I 2016 Umbro','Grande','azul', CURRENT_TIMESTAMP, 239.90, 10),
('Camisa Bayern de Munique I 15/16', 'Adidas','masculino', 'Camisa Bayern de Munique I 15/16 adidas','Grande','vermelho', CURRENT_TIMESTAMP, 199.99, 10),
('Camisa Barcelona I 15/16', 'Nike','masculino', 'Camisa Barcelona I 15/16 Nike','Grande','azul/vinho', CURRENT_TIMESTAMP, 189.90, 10),
('Camisa Borussia Dortmund I 15/16', 'Puma ','masculino', 'Camisa Borussia Dortmund I 15/16 Puma','Grande','amarelo', CURRENT_TIMESTAMP, 189.90, 10),
-- Camisetas
('Nike Racer', 'Nike','feminino', 'Camiseta Nike Racer','Grande','rosa', CURRENT_TIMESTAMP, 69.90, 10),
('Originals Trefoil', 'Adidas','feminino', 'Camiseta adidas Originals Trefoil','medio','branco', CURRENT_TIMESTAMP, 89.99, 10),
('Miler Short', 'Nike','feminino', 'Camiseta Nike Miler Short','Grande','preto', CURRENT_TIMESTAMP, 69.90, 10),
('SB DF Icon Logo', 'Adidas','masculino', 'Camiseta Nike SB DF Icon Logo','Grande','laranja escuro', CURRENT_TIMESTAMP, 49.99, 10),
('Adidas SPO', 'Adidas','masculino', 'Camiseta adidas SPO','Grande','branco', CURRENT_TIMESTAMP, 59.90, 10),
('Puma 512689', 'Puma ','masculino', 'Camiseta Puma 512689','Grande','preto', CURRENT_TIMESTAMP, 49.90, 10),
-- Jaquetas
('Oxer Ross', 'Oxer','masculino', 'Jaqueta com Capuz Oxer Ross','Grande','cinza escuro', CURRENT_TIMESTAMP, 99.90, 10),
('Oxer Barich', 'Oxer','masculino', 'Jaqueta com Capuz Oxer Barich','medio','preto', CURRENT_TIMESTAMP, 99.99, 10),
('Nike Club Fleece Hoody Swoosh', 'Nike','masculino', 'Jaqueta com Capuz Nike Club Fleece Hoody Swoosh','Grande','preto', CURRENT_TIMESTAMP, 199.90, 10),
('Soft Basic', 'Oxer','feminino', 'Jaqueta Oxer Soft Basic','Grande','roxo escuro', CURRENT_TIMESTAMP, 99.99, 10),
('Nord Outdoor Pad', 'Nord Outdoor','feminino', 'Jaqueta Nord Outdoor Pad','Grande','rosa', CURRENT_TIMESTAMP, 129.90, 10),
('Oxer Melange', 'Oxer ','feminino', 'Jaqueta com Capuz Oxer Melange','Grande','cinza escuro', CURRENT_TIMESTAMP, 89.90, 10),
-- Agasalhos
('Agasalho Diadora', 'Diadora','feminino', 'Agasalho Diadora com capuz','Grande','rosa', CURRENT_TIMESTAMP, 99.90, 10),
('Agasalho Nike Club Ft Tracksuit', 'Nike','feminino', 'Agasalho Nike Club Ft Tracksuit com capuz','medio','preto', CURRENT_TIMESTAMP, 329.99, 10),
('Agasalho Nike Poly Tracksuit', 'Nike','feminino', 'Agasalho Nike Poly Tracksuit-Cuffed Aop','Grande','vermelho', CURRENT_TIMESTAMP, 279.90, 10),
('Agasalho Adidas Knit', 'Adidas','masculino', 'Agasalho Adidas Knit','Grande','azul', CURRENT_TIMESTAMP, 249.99, 10),
('Agasalho Adidas WV 1', 'Adidas','masculino', 'Agasalho Adidas WV 1','Grande','preto', CURRENT_TIMESTAMP, 169.90, 10),
('Agasalho Adidas Tiro 15', 'Adidas ','masculino', 'Agasalho Adidas Tiro 15','Grande','vermelho', CURRENT_TIMESTAMP, 249.90, 10),
-- Bermudas
('Nike Assist', 'Nike','masculino', 'Bermuda Nike Assist','Grande','branco', CURRENT_TIMESTAMP, 69.90, 10),
('AW77 FR Terry Alumni', 'Nike','masculino', 'Bermuda Nike AW77 FR Terry Alumni','medio','cinza', CURRENT_TIMESTAMP, 149.99, 10),
('Nike HBR', 'Nike','masculino', 'Bermuda Nike HBR','Grande','preto', CURRENT_TIMESTAMP, 99.90, 10),
('Nike Hypercool', 'Nike','feminino', 'Bermuda Nike Hypercool','Grande','preto', CURRENT_TIMESTAMP, 89.99, 10),
('Pro Cool 11', 'Nike','feminino', 'Bermuda Nike Pro Cool 11','Grande','preto', CURRENT_TIMESTAMP, 109.90, 10),
('Puma Tight', 'Puma ','feminino', 'Bermuda Puma Tight','Grande','preto', CURRENT_TIMESTAMP, 99.90, 10),
-- Blusas
('Fila Flame', 'Fila','feminino', 'Blusa Fila Flame','Grande','rosa', CURRENT_TIMESTAMP, 48.00, 10),
('Diadora Flow', 'Diadora','feminino', 'Blusa Diadora Flow com capuz','medio','preto', CURRENT_TIMESTAMP, 89.99, 10),
('Diadora Cropped', 'Diadora','feminino', 'Blusa Diadora Cropped','Grande','branco', CURRENT_TIMESTAMP, 69.90, 10),
('Fila Sports Star', 'Fila','feminino', 'Blusa Fila Sports Star','Grande','rosa', CURRENT_TIMESTAMP, 55.90, 10),
('Fila Manifesto 2', 'Fila','feminino', 'Blusa Fila Manifesto 2','Grande','vermelho', CURRENT_TIMESTAMP, 39.90, 10),
('Fila Remix', 'Fila','feminino', 'Blusa Fila Remix','Grande','coral', CURRENT_TIMESTAMP, 55.00, 10),
-- Calças
('Poly Tricot Op', 'Puma','masculino', 'Calça Puma Poly Tricot Op','Grande','preto', CURRENT_TIMESTAMP, 99.00, 10),
('Crusader Open Hem 2', 'Nike','masculino', 'Calça Nike Crusader Open Hem 2','medio','preto', CURRENT_TIMESTAMP, 119.99, 10),
('Legging Holy New 11', 'Fila','feminino', 'Calça Legging Fila Holy New 11','Grande','preto', CURRENT_TIMESTAMP, 89.90, 10),
('Legging Crush 15', 'Adidas','feminino', 'Calça Legging adidas Crush 15','Grande','roxo', CURRENT_TIMESTAMP, 69.90, 10),
('Legging Seamless', 'Oxer','feminino', 'Calça Legging Oxer Seamless','Grande','cinza', CURRENT_TIMESTAMP, 49.90, 10),
('Legging Got Fitaw', 'Oxer','feminino', 'Calça Legging Oxer Got Fitaw','Grande','preto', CURRENT_TIMESTAMP, 99.00, 10),
-- Mochilas
('Ya Max Air TTSM', 'Nike','masculino', 'Mochila Nike Ya Max Air TTSM','Grande','preto', CURRENT_TIMESTAMP, 159.99, 10),
('ASBP XS 3S', 'Adidas','masculino', 'Mochila adidas ASBP XS 3S','medio','azul', CURRENT_TIMESTAMP, 89.99, 10),
('Fila Sunset', 'Fila','masculino', 'Calça Legging Fila Holy New 11','Grande','preto', CURRENT_TIMESTAMP, 62.90, 10),
('Cheyenne Backpack', 'Nike','masculino', 'Mochila Nike Cheyenne Backpack','Grande','preto/branco', CURRENT_TIMESTAMP, 119.90, 10),
('Hall of Fame', 'Under Armour','masculino', 'Mochila Under Armour Hall of Fame','Grande','cinza', CURRENT_TIMESTAMP, 149.90, 10),
('Adidas Versatile', 'Adidas','masculino', 'Mochila adidas Versatile','Grande','azul', CURRENT_TIMESTAMP, 89.00, 10),
-- Bonés
('Heritage 86 Futura', 'Nike','masculino', 'Boné Nike Heritage 86 Futura','Grande','azul', CURRENT_TIMESTAMP, 34.99, 10),
('Nike Swoosh', 'Nike','masculino', 'Boné Nike Swoosh','medio','branco', CURRENT_TIMESTAMP, 39.99, 10),
('Swoosh Heritage 86', 'Nike','masculino', 'Boné Nike Swoosh Heritage 86','Grande','preto', CURRENT_TIMESTAMP, 54.90, 10),
('Basic 3S', 'Adidas','masculino', 'Boné adidas Basic 3S','Grande','branco', CURRENT_TIMESTAMP, 39.90, 10),
('Adidas SS16', 'Adidas','masculino', 'Boné Aba Reta adidas SS16','Grande','azul', CURRENT_TIMESTAMP, 54.90, 10),
('Puma Ess', 'Puma','masculino', 'Boné Puma Ess','Grande','preto', CURRENT_TIMESTAMP, 59.00, 10),
-- Caneleiras
('CR7 Mercurial Lite', 'Nike','masculino', 'Caneleira de Futebol Nike CR7 Mercurial Lite','Grande','azul', CURRENT_TIMESTAMP, 129.99, 10),
('Evopower 3.3', 'Puma','masculino', 'Caneleira de Futebol Puma Evopower 3.3','medio','azul', CURRENT_TIMESTAMP, 99.99, 10),
('Adidas 11 Lesto', 'Adidas','masculino', 'Caneleira adidas 11 Lesto','Grande','laranja', CURRENT_TIMESTAMP, 44.90, 10),
('Evospeed 3.3', 'Puma','masculino', 'Caneleira Puma Evospeed 3.3','Grande','azul', CURRENT_TIMESTAMP, 54.90, 10),
('Adizero F50', 'Adidas','masculino', 'Caneleira adidas Adizero F50','Grande','laranja', CURRENT_TIMESTAMP, 114.90, 10),
('J Guard', 'Nike','masculino', 'Caneleira Nike J Guard','Grande','preto', CURRENT_TIMESTAMP, 34.00, 10);


INSERT INTO TB_IMAGEM (NM_IMAGEM, DS_IMAGEM, ID_PRODUTO) VALUES 
-- Tênis
('tenis1.png', 'Tenis Nike 1', 1),
('tenis2.png', 'Tenis Nike 2', 2),
('tenis3.png', 'Tenis Asics 3', 3),
('nike-shox-deliver.jpg', 'Tenis Nike Shox', 4),
('oxer-agile.jpg', 'Tenis Oxer Agile', 5),
('polo-us-7007.jpg', 'Polo US 7007', 6),
-- Chuteiras
('bravata-fg.jpg', 'Bravata FG', 7),
('hypervenom-phelon-ii-fg.jpg', 'Hypervenom Phelon II FG', 8),
('mercurial-victory-v-fg.jpg', 'Mercurial Victory V FG', 9),
('x-15-4-fg.jpg', 'X 15.4 FG', 10),
('ace-16-3-primemesh-fg.jpg', 'Ace 16.3 Primemesh FG', 11),
('x-16-4-fg.jpg', 'X 16.4 FG', 12),
-- Botas
('flume-waterproof-mid.jpg', 'Flume Waterproof MID', 13),
('summit-hiker-premium.jpg', 'Summit Hiker Premium', 14),
('yellow-boot-6-premium.jpg', 'Yellow Boot 6 Premium', 15),
('trail-dust.jpg', 'Trail Dust', 16),
('belle.jpg', 'Belle', 17),
('alba.jpg', 'Alba', 18),
-- Camisetas de Time
('camisa-sao-paulo-i-2016.jpg', 'Camisa São Paulo I 2016', 19),
('camisa-gremio-i.jpg', 'Camisa Grêmio I 2016', 20),
('camisa-cruzeiro-i-2016.jpg', 'Camisa Cruzeiro I 2016', 21),
('camisa-bayern-de-munique-i.jpg', 'Camisa Bayern de Munique I 15/16', 22),
('camisa-barcelona-i.jpg', 'Camisa Barcelona I 15/16', 23),
('camisa-borussia-dortmund-i.jpg', 'Camisa Borussia Dortmund I 15/16', 24),
-- Camiseta
('camiseta-nike-racer.jpg', 'Nike Racer', 25),
('adidas-originals-trefoil.jpg', 'Originals Trefoil', 26),
('nike-miler-short.jpg', 'Miler Short', 27),
('sb-df-icon-logo.jpg', 'SB DF Icon Logo', 28),
('adidas-spo.jpg', 'Adidas SPO', 29),
('camiseta-puma-512689.jpg', 'Puma 512689', 30),
-- Jaquetas
('jaqueta-oxer-ross.jpg', 'Oxer Ross', 31),
('jaqueta-oxer-barich.jpg', 'Oxer Barich', 32),
('nike-club-fleece-hoody-swoosh.jpg', 'Nike Club Fleece Hoody Swoosh', 33),
('oxer-soft-basic.jpg', 'Soft Basic', 34),
('nord-outdoor-pad.jpg', 'Nord Outdoor Pad', 35),
('oxer-melange.jpg', 'Oxer Melange', 36),
-- Agasalhos
('agasalho-diadora-c-capuz.jpg', 'Agasalho Diadora', 37),
('nike-club-ft-tracksuit.jpg', 'Agasalho Nike Club Ft Tracksuit', 38),
('nike-poly-tracksuit.jpg', 'Agasalho Nike Poly Tracksuit', 39),
('agasalho-adidas-knit.jpg', 'Agasalho Adidas Knit', 40),
('adidas-wv-1.jpg', 'Agasalho Adidas WV 1', 41),
('adidas-tiro-15.jpg', 'Agasalho Adidas Tiro 15', 42),
-- Bermudas
('nike-assist-masculina.jpg', 'Nike Assist', 43),
('aw77-fr-terry-alumni.jpg', 'AW77 FR Terry Alumni', 44),
('nike-hbr.jpg', 'Nike HBR', 45),
('nike-hypercool.jpg', 'Nike Hypercool', 46),
('pro-cool-11.jpg', 'Pro Cool 11', 47),
('puma-tight.jpg', 'Puma Tight', 48),
-- Blusas
('fila-flame.jpg', 'Fila Flame', 49),
('diadora-flow.jpg', 'Diadora Flow', 50),
('diadora-cropped.jpg', 'Diadora Cropped', 51),
('sports-star.jpg', 'Fila Sports Star', 52),
('manifesto-2.jpg', 'Fila Manifesto 2', 53),
('fila-remix.jpg', 'Fila Remix', 54),
-- Calças
('poly-tricot-op.jpg', 'Poly Tricot Op', 55),
('crusader-open-hem-2.jpg', 'Crusader Open Hem 2', 56),
('fila-holy-new-11.jpg', 'Legging Holy New 11', 57),
('adidas-crush-15.jpg', 'Legging Crush 15', 58),
('oxer-seamless.jpg', 'Legging Seamless', 59),
('oxer-got-fitaw.jpg', 'Legging Got Fitaw', 60),
-- Mochilas
('ya-max-air-ttsm.jpg', 'Ya Max Air TTSM', 61),
('asbp-xs-3s.jpg', 'ASBP XS 3S', 62),
('mochila-fila-sunset.jpg', 'Fila Sunset', 63),
('cheyenne-backpack.jpg', 'Cheyenne Backpack', 64),
('hall-of-fame.jpg', 'Hall of Fame', 65),
('versatile.jpg', 'Adidas Versatile', 66),
-- Bonés
('heritage-86-futura.jpg', 'Heritage 86 Futura', 67),
('nike-swoosh.jpg', 'Nike Swoosh', 68),
('swoosh-heritage-86.jpg', 'Swoosh Heritage 86', 69),
('basic-3s.jpg', 'Basic 3S', 70),
('adidas-ss16.jpg', 'Adidas SS16', 71),
('puma-ess.jpg', 'Puma Ess', 72),
-- Caneleiras
('cr7-mercurial-lite.jpg', 'CR7 Mercurial Lite', 73),
('evopower-3-3.jpg', 'Evopower 3.3', 74),
('adidas-11-lesto.jpg', 'Adidas 11 Lesto', 75),
('evospeed-3-3.jpg', 'Evospeed 3.3', 76),
('adizero-f50.jpg', 'Adizero F50', 77),
('j-guard.jpg', 'J Guard', 78);

INSERT INTO TB_PRODUTO_CATEGORIA (ID_PRODUTO, ID_CATEGORIA) VALUES 
-- Tênis
(1, 1),
(2, 1),
(3, 1),
(4, 1),
(5, 1),
(6, 1),
-- Chuteiras
(7, 2),
(8, 2),
(9, 2),
(10, 2),
(11, 2),
(12, 2),
-- Botas
(13, 3),
(14, 3),
(15, 3),
(16, 3),
(17, 3),
(18, 3),
-- Camisetas de Time
(19, 4),
(20, 4),
(21, 4),
(22, 4),
(23, 4),
(24, 4),
-- Camisetas
(25, 5),
(26, 5),
(27, 5),
(28, 5),
(29, 5),
(30, 5),
-- Jaquetas
(31, 6),
(32, 6),
(33, 6),
(34, 6),
(35, 6),
(36, 6),
-- Agasalhos
(37, 7),
(38, 7),
(39, 7),
(40, 7),
(41, 7),
(42, 7),
-- Bermudas
(43, 8),
(44, 8),
(45, 8),
(46, 8),
(47, 8),
(48, 8),
-- Blusas
(49, 9),
(50, 9),
(51, 9),
(52, 9),
(53, 9),
(54, 9),
-- Calças
(55, 10),
(56, 10),
(57, 10),
(58, 10),
(59, 10),
(60, 10),
-- Mochilas
(61, 11),
(62, 11),
(63, 11),
(64, 11),
(65, 11),
(66, 11),
-- Bonés
(67, 12),
(68, 12),
(69, 12),
(70, 12),
(71, 12),
(72, 12),
-- Caneleiras
(73, 13),
(74, 13),
(75, 13),
(76, 13),
(77, 13),
(78, 13);
-- 
-- SELECT * fROM TB_CATEGORIA
-- SELECT * fROM TB_MARCA
-- SELECT * fROM TB_PRODUTO
-- SELECT * fROM TB_Venda
-- SELECT * fROM USUARIO

-- cliente
INSERT INTO USUARIO (NOME, CPF,PAPEL, SEXO, EMAIL, LOGIN, SENHA, DT_NASCIMENTO, END_RUA, END_NUM, END_COMPLEMENTO, END_BAIRRO, END_CEP, END_CIDADE, END_ESTADO) VALUES 
('UsuarioCliente', '12345678123','cliente', 'fem', 'email@email.com', 'login', 'senha', '24/04/1980','Av Rio Branco', 122, 'Apto 44', 'Centro', '04515-030', 'Sao Paulo', 'SP');
INSERT INTO USUARIO (NOME, CPF,PAPEL, SEXO, EMAIL, LOGIN, SENHA, DT_NASCIMENTO, END_RUA, END_NUM, END_COMPLEMENTO, END_BAIRRO, END_CEP, END_CIDADE, END_ESTADO) VALUES 
('UsuarioCliente', '12345678123','Admin', 'masc', 'email@email.com', 'eder', 'senha', '24/04/1980','Av Rio Branco', 122, 'Apto 44', 'Centro', '04515-030', 'Sao Paulo', 'SP');

-- admin
--INSERT INTO USUARIO_ADMIN (NOME, EMAIL, LOGIN, SENHA) VALUES 
--('UsuarioAdmin', 'email@email.com', 'login', 'senha');


-- INSERT INTO TB_VENDA(ID_CLIENTE,DT_VENDA,VL_TOTAL) VALUES(1,CURRENT_TIMESTAMP,500);
--INSERT INTO ITENS_VENDA(ID_VENDA,ID_PRODUTO)VALUES(1,1);
--INSERT INTO ITENS_VENDA(ID_VENDA,ID_PRODUTO)VALUES(1,2);
--INSERT INTO ITENS_VENDA(ID_VENDA,ID_PRODUTO)VALUES(1,3);
--INSERT INTO ITENS_VENDA(ID_VENDA,ID_PRODUTO)VALUES(1,4);
--INSERT INTO ITENS_VENDA(ID_VENDA,ID_PRODUTO)VALUES(1,5);

--SELECT TB_VENDA.ID_CLIENTE, TB_PRODUTO.NM_PRODUTO, TB_PRODUTO.VL_PRODUTO, TB_VENDA.DT_VENDA FROM ITENS_VENDA
--INNER JOIN TB_PRODUTO ON TB_PRODUTO.ID_PRODUTO = ITENS_VENDA.ID_PRODUTO
--INNER JOIN TB_VENDA ON TB_VENDA.ID_VENDA = ITENS_VENDA.ID_VENDA


