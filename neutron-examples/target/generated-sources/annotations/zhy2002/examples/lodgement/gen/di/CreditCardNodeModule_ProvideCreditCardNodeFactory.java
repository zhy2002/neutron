package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CreditCardNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardNodeModule_ProvideCreditCardNodeFactory
    implements Factory<CreditCardNode> {
  private final CreditCardNodeModule module;

  public CreditCardNodeModule_ProvideCreditCardNodeFactory(CreditCardNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CreditCardNode get() {
    return Preconditions.checkNotNull(
        module.provideCreditCardNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CreditCardNode> create(CreditCardNodeModule module) {
    return new CreditCardNodeModule_ProvideCreditCardNodeFactory(module);
  }

  /** Proxies {@link CreditCardNodeModule#provideCreditCardNode()}. */
  public static CreditCardNode proxyProvideCreditCardNode(CreditCardNodeModule instance) {
    return instance.provideCreditCardNode();
  }
}
