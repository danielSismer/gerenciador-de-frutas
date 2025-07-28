package com.appFrutaria.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://root:fyAjvGXqYTnUvmTeOtYkvNiAhHKRauHB@tramway.proxy.rlwy.net:11981/railway?useSSL=false&serverTimezone=UTC";

            Connection connection = DriverManager.getConnection(url);
            System.out.println("✅ Conexão estabelecida com sucesso!");

            return connection;

        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver MySQL não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("❌ Erro ao conectar: " + e.getMessage());
            throw e;
        }
    }


    public static void main(String[] args) {
        System.out.println("🚀 Testando conexão com o banco de dados...");

        try {
            Connection conn = getConnection();
            System.out.println("✅ Conexão funcionando!");
            conn.close();
        } catch (SQLException e) {
            System.err.println("❌ Erro na conexão: " + e.getMessage());
        }
    }
}