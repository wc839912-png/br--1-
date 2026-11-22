package brasileirao._6.br.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBanco {
    
    private static final String URL = "jdbc:mysql://localhost:3306/brasileirao26?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        
        String[] comandosSql = {
            
            "CREATE TABLE IF NOT EXISTS times (" +
            "id INT AUTO_INCREMENT PRIMARY KEY, " +
            "nome VARCHAR(100) NOT NULL, " +
            "cidade VARCHAR(100), " +
            "estado CHAR(2), " +
            "ano_fundacao INT" +
            ")",

            
            "INSERT INTO times (nome, cidade, estado, ano_fundacao) VALUES " +
            "('flamengo', 'rio_de_janeiro', 'rj', 1895), " +
            "('palmeiras', 'sao_paulo', 'sp', 1914), " +
            "('santos', 'santos', 'sp', 1912), " +
            "('botafogo', 'rio_de_janeiro', 'rj', 1894), " +
            "('gremio', 'porto_alegre', 'rs', 1903), " +
            "('mirassol', 'interior_sao_paulo', 'sp', 1925), " +
            "('cruzeiro', 'belo_horizonte', 'mg', 1921), " +
            "('internacional', 'porto_alegre', 'rs', 1909), " +
            "('remo', 'belem', 'pa', 1905), " +
            "('fluminense', 'rio_de_janeiro', 'rj', 1902), " +
            "('atletico_paranaense', 'curitiba', 'pr', 1924), " +
            "('bahia', 'salvador', 'ba', 1931), " +
            "('atletico_mineiro', 'belo_horizonte', 'mg', 1908), " +
            "('bragantino', 'rio_de_janeiro', 'sp', 1920), " +
            "('vasco_da_gama', 'rio_de_janeiro', 'rj', 1898), " +
            "('sao_paulo', 'sao_paulo', 'sp', 1930), " +
            "('coritiba', 'curitiba', 'pr', 1909), " +
            "('vitoria', 'salvador', 'ba', 1899), " +
            "('corinthians', 'sao_paulo', 'sp', 1910), " +
            "('chapecoense', 'chapeco', 'sc', 1973)",

            
            "ALTER TABLE times " +
            "ADD COLUMN IF NOT EXISTS pontos INT DEFAULT 0, " +
            "ADD COLUMN IF NOT EXISTS vitorias INT DEFAULT 0, " +
            "ADD COLUMN IF NOT EXISTS empates INT DEFAULT 0, " +
            "ADD COLUMN IF NOT EXISTS derrotas INT DEFAULT 0, " +
            "ADD COLUMN IF NOT EXISTS gols_feitos INT DEFAULT 0, " +
            "ADD COLUMN IF NOT EXISTS gols_sofridos INT DEFAULT 0",

            
            "UPDATE times " +
            "SET pontos = 10, vitorias = 3, empates = 1, derrotas = 0"
        };

        try (Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conexao.createStatement()) {

            System.out.println("Conexão realizada com sucesso!");

            
            for (int i = 0; i < comandosSql.length; i++) {
                stmt.executeUpdate(comandosSql[i]);
                System.out.println("Comando " + (i + 1) + " executado com sucesso.");
            }

            System.out.println("Todos os comandos SQL foram processados!");

        } catch (SQLException e) {
            System.err.println("Erro ao executar o SQL: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

