package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SavingsAccountNoNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNoNodeModule_ProvideSavingsAccountNoNodeFactory
    implements Factory<SavingsAccountNoNode> {
  private final SavingsAccountNoNodeModule module;

  public SavingsAccountNoNodeModule_ProvideSavingsAccountNoNodeFactory(
      SavingsAccountNoNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SavingsAccountNoNode get() {
    return Preconditions.checkNotNull(
        module.provideSavingsAccountNoNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SavingsAccountNoNode> create(SavingsAccountNoNodeModule module) {
    return new SavingsAccountNoNodeModule_ProvideSavingsAccountNoNodeFactory(module);
  }

  /** Proxies {@link SavingsAccountNoNodeModule#provideSavingsAccountNoNode()}. */
  public static SavingsAccountNoNode proxyProvideSavingsAccountNoNode(
      SavingsAccountNoNodeModule instance) {
    return instance.provideSavingsAccountNoNode();
  }
}
