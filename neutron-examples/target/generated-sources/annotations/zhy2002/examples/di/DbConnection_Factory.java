package zhy2002.examples.di;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DbConnection_Factory implements Factory<DbConnection> {
  private static final DbConnection_Factory INSTANCE = new DbConnection_Factory();

  @Override
  public DbConnection get() {
    return new DbConnection();
  }

  public static Factory<DbConnection> create() {
    return INSTANCE;
  }
}
