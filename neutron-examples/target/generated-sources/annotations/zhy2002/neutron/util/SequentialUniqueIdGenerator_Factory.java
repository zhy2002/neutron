package zhy2002.neutron.util;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SequentialUniqueIdGenerator_Factory
    implements Factory<SequentialUniqueIdGenerator> {
  private static final SequentialUniqueIdGenerator_Factory INSTANCE =
      new SequentialUniqueIdGenerator_Factory();

  @Override
  public SequentialUniqueIdGenerator get() {
    return new SequentialUniqueIdGenerator();
  }

  public static Factory<SequentialUniqueIdGenerator> create() {
    return INSTANCE;
  }
}
