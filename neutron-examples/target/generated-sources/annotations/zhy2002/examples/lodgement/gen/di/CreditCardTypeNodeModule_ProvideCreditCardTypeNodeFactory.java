package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CreditCardTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardTypeNodeModule_ProvideCreditCardTypeNodeFactory
    implements Factory<CreditCardTypeNode> {
  private final CreditCardTypeNodeModule module;

  public CreditCardTypeNodeModule_ProvideCreditCardTypeNodeFactory(
      CreditCardTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CreditCardTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideCreditCardTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CreditCardTypeNode> create(CreditCardTypeNodeModule module) {
    return new CreditCardTypeNodeModule_ProvideCreditCardTypeNodeFactory(module);
  }

  /** Proxies {@link CreditCardTypeNodeModule#provideCreditCardTypeNode()}. */
  public static CreditCardTypeNode proxyProvideCreditCardTypeNode(
      CreditCardTypeNodeModule instance) {
    return instance.provideCreditCardTypeNode();
  }
}
