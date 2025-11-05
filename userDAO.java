public User getUserById(String userId) throws SQLException {
    Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    Statement stmt = conn.createStatement();

    // ❌ Vulnerable: direct string concatenation with user input
    String query = "SELECT * FROM users WHERE id = '" + userId + "'";
    ResultSet rs = stmt.executeQuery(query);

    if (rs.next()) {
        return new User(rs.getString("name"), rs.getString("email"));
    }
    return null;
}
