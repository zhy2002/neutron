package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CreditCheckFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCheckFlagNodeModule_ProvideCreditCheckFlagNodeFactory
    implements Factory<CreditCheckFlagNode> {
  private final CreditCheckFlagNodeModule module;

  public CreditCheckFlagNodeModule_ProvideCreditCheckFlagNodeFactory(
      CreditCheckFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CreditCheckFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideCreditCheckFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CreditCheckFlagNode> create(CreditCheckFlagNodeModule module) {
    return new CreditCheckFlagNodeModule_ProvideCreditCheckFlagNodeFactory(module);
  }

  /** Proxies {@link CreditCheckFlagNodeModule#provideCreditCheckFlagNode()}. */
  public static CreditCheckFlagNode proxyProvideCreditCheckFlagNode(
      CreditCheckFlagNodeModule instance) {
    return instance.provideCreditCheckFlagNode();
  }
}
