package zhy2002.examples.di;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DbReader_Factory implements Factory<DbReader> {
  private final Provider<DbConnection> connectionProvider;

  public DbReader_Factory(Provider<DbConnection> connectionProvider) {
    assert connectionProvider != null;
    this.connectionProvider = connectionProvider;
  }

  @Override
  public DbReader get() {
    return new DbReader(connectionProvider.get());
  }

  public static Factory<DbReader> create(Provider<DbConnection> connectionProvider) {
    return new DbReader_Factory(connectionProvider);
  }
}
