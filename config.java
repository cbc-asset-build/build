public class Config {
    // ❌ Vulnerable: secrets should not be hardcoded in source code
    private static final String DB_PASSWORD = "SuperSecret12345!";
}
