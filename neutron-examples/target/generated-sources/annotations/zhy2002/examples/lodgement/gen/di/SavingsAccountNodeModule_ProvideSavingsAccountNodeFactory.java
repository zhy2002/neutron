package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SavingsAccountNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNodeModule_ProvideSavingsAccountNodeFactory
    implements Factory<SavingsAccountNode> {
  private final SavingsAccountNodeModule module;

  public SavingsAccountNodeModule_ProvideSavingsAccountNodeFactory(
      SavingsAccountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SavingsAccountNode get() {
    return Preconditions.checkNotNull(
        module.provideSavingsAccountNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SavingsAccountNode> create(SavingsAccountNodeModule module) {
    return new SavingsAccountNodeModule_ProvideSavingsAccountNodeFactory(module);
  }

  /** Proxies {@link SavingsAccountNodeModule#provideSavingsAccountNode()}. */
  public static SavingsAccountNode proxyProvideSavingsAccountNode(
      SavingsAccountNodeModule instance) {
    return instance.provideSavingsAccountNode();
  }
}
