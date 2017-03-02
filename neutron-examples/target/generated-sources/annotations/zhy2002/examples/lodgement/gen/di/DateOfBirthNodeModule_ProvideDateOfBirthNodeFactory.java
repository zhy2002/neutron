package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.DateOfBirthNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DateOfBirthNodeModule_ProvideDateOfBirthNodeFactory
    implements Factory<DateOfBirthNode> {
  private final DateOfBirthNodeModule module;

  public DateOfBirthNodeModule_ProvideDateOfBirthNodeFactory(DateOfBirthNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public DateOfBirthNode get() {
    return Preconditions.checkNotNull(
        module.provideDateOfBirthNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DateOfBirthNode> create(DateOfBirthNodeModule module) {
    return new DateOfBirthNodeModule_ProvideDateOfBirthNodeFactory(module);
  }

  /** Proxies {@link DateOfBirthNodeModule#provideDateOfBirthNode()}. */
  public static DateOfBirthNode proxyProvideDateOfBirthNode(DateOfBirthNodeModule instance) {
    return instance.provideDateOfBirthNode();
  }
}
