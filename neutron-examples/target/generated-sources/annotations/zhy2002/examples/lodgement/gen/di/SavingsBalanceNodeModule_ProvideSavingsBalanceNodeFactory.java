package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SavingsBalanceNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsBalanceNodeModule_ProvideSavingsBalanceNodeFactory
    implements Factory<SavingsBalanceNode> {
  private final SavingsBalanceNodeModule module;

  public SavingsBalanceNodeModule_ProvideSavingsBalanceNodeFactory(
      SavingsBalanceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SavingsBalanceNode get() {
    return Preconditions.checkNotNull(
        module.provideSavingsBalanceNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SavingsBalanceNode> create(SavingsBalanceNodeModule module) {
    return new SavingsBalanceNodeModule_ProvideSavingsBalanceNodeFactory(module);
  }

  /** Proxies {@link SavingsBalanceNodeModule#provideSavingsBalanceNode()}. */
  public static SavingsBalanceNode proxyProvideSavingsBalanceNode(
      SavingsBalanceNodeModule instance) {
    return instance.provideSavingsBalanceNode();
  }
}
