package zhy2002.mortgage.di;


public class MyOtherServiceProvider {

    private final DbReader reader;

    public MyOtherServiceProvider(DbReader reader) {

        this.reader = reader;
    }

    public DbReader getReader() {
        return reader;
    }
}
