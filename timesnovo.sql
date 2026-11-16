-- 1 criando primeira tabela
create table times (
id int auto_increment primary KEY,
nome varchar (100) not null,
cidade varchar (100),
estado char (2),
ano_fundacao int
);
 insert into times ( nome, cidade, estado, ano_fundacao) values
( 'flamengo', 'rio_de_janeiro', 'rj', 1895),
( 'palmeiras', 'sao_paulo', 'sp', 1914),
( 'santos', 'santos', 'sp', 1912),
( 'botafogo', 'rio_de_janeiro', 'rj', 1894),
( 'gremio', 'porto_alegre', 'rs', 1903),
( 'mirassol', 'interior_sao_paulo', 'sp', 1925),
( 'cruzeiro', 'belo_horizonte', 'mg', 1921),
( 'internacional', 'porto_alegre', 'rs', 1909),
( 'remo', 'belem', 'pa', 1905),
( 'fluminense', 'rio_de_janeiro', 'rj', 1902),
( 'atletico_paranaense', 'curitiba', 'pr', 1924),
( 'bahia', 'salvador', 'ba', 1931),
('atletico_mineiro', 'belo_horizonte', 'mg', 1908),
('bragantino', 'rio_de_janeiro', 'sp', 1920),
('vasco_da_gama', 'rio_de_janeiro', 'rj', 1898),
('sao_paulo', 'sao_paulo', 'sp', 1930),
('coritiba', 'curitiba', 'pr', 1909),
('vitoria', 'salvador', 'ba', 1899),
('corinthians', 'sao_paulo', 'sp', 1910),
('chapecoense', 'chapeco', 'sc', 1973);
