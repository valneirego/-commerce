-- Inserindo mais categorias
INSERT INTO tb_category(name) VALUES ('Jogos');
INSERT INTO tb_category(name) VALUES ('Móveis');
INSERT INTO tb_category(name) VALUES ('Roupas');
INSERT INTO tb_category(name) VALUES ('Beleza e Cuidados Pessoais');
INSERT INTO tb_category(name) VALUES ('Fitness');

-- Inserindo mais produtos
INSERT INTO tb_product (name, price, description, img_url) VALUES ('God of War Ragnarok', 350.0, 'Aventura épica com gráficos incríveis.', 'https://example.com/godofwar.jpg');
INSERT INTO tb_product (name, price, description, img_url) VALUES ('Cadeira Gamer', 750.0, 'Conforto e ergonomia para suas longas jogatinas.', 'https://example.com/cadeira_gamer.jpg');
INSERT INTO tb_product (name, price, description, img_url) VALUES ('Tênis de Corrida', 299.99, 'Desempenho e conforto para suas corridas.', 'https://example.com/tenis_corrida.jpg');
INSERT INTO tb_product (name, price, description, img_url) VALUES ('Notebook Gamer', 4500.0, 'Potência para jogos e multitarefas.', 'https://example.com/notebook_gamer.jpg');
INSERT INTO tb_product (name, price, description, img_url) VALUES ('Kit Maquiagem Profissional', 199.90, 'Tudo o que você precisa para arrasar no visual.', 'https://example.com/kit_maquiagem.jpg');
INSERT INTO tb_product (name, price, description, img_url) VALUES ('Halteres Ajustáveis', 350.0, 'Versatilidade para seu treino em casa.', 'https://example.com/halteres.jpg');
INSERT INTO tb_product (name, price, description, img_url) VALUES ('Cama Box King Size', 1500.0, 'Conforto e elegância para seu quarto.', 'https://example.com/cama_box.jpg');

-- Relacionando produtos com categorias
INSERT INTO tb_product_category (product_id, category_id) VALUES (26, 1); -- God of War em Jogos
INSERT INTO tb_product_category (product_id, category_id) VALUES (27, 2); -- Cadeira Gamer em Móveis
INSERT INTO tb_product_category (product_id, category_id) VALUES (28, 5); -- Tênis de Corrida em Fitness
INSERT INTO tb_product_category (product_id, category_id) VALUES (29, 3); -- Notebook Gamer em Computadores
INSERT INTO tb_product_category (product_id, category_id) VALUES (30, 4); -- Kit Maquiagem em Beleza
INSERT INTO tb_product_category (product_id, category_id) VALUES (31, 5); -- Halteres em Fitness
INSERT INTO tb_product_category (product_id, category_id) VALUES (32, 2); -- Cama Box em Móveis

-- Inserindo mais usuários
INSERT INTO tb_user (name, email, phone, password, birth_date) VALUES ('John Doe', 'john@gmail.com', '966666666', '123456', '1995-03-15');
INSERT INTO tb_user (name, email, phone, password, birth_date) VALUES ('Jane Smith', 'jane@gmail.com', '955555555', '123456', '1990-08-22');

-- Inserindo mais pedidos
INSERT INTO tb_order (moment, status, client_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-08-10T10:30:00Z', 1, 3); -- Pedido de John Doe
INSERT INTO tb_order (moment, status, client_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-08-12T16:45:00Z', 0, 4); -- Pedido de Jane Smith

-- Inserindo itens nos pedidos
INSERT INTO tb_order_item (order_id, product_id, quantity, price) VALUES (4, 26, 1, 350.0); -- God of War no pedido de John
INSERT INTO tb_order_item (order_id, product_id, quantity, price) VALUES (4, 27, 1, 750.0); -- Cadeira Gamer no pedido de John
INSERT INTO tb_order_item (order_id, product_id, quantity, price) VALUES (5, 30, 1, 199.90); -- Kit Maquiagem no pedido de Jane
INSERT INTO tb_order_item (order_id, product_id, quantity, price) VALUES (5, 28, 2, 299.99); -- Tênis de Corrida no pedido de Jane

-- Inserindo pagamentos
INSERT INTO tb_payment (order_id, moment) VALUES (4, TIMESTAMP WITH TIME ZONE '2022-08-10T12:00:00Z'); -- Pagamento do pedido de John
INSERT INTO tb_payment (order_id, moment) VALUES (5, TIMESTAMP WITH TIME ZONE '2022-08-12T18:00:00Z'); -- Pagamento do pedido de Jane
