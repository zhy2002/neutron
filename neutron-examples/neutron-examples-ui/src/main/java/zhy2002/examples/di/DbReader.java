package zhy2002.examples.di;

import javax.inject.Inject;

public class DbReader {

    private final DbConnection connection;

    @Inject
    public DbReader(DbConnection connection) {
        this.connection = connection;
    }

    public DbConnection getConnection() {
        return connection;
    }
}
