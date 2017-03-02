package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CreditCardListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardListNodeModule_ProvideCreditCardListNodeFactory
    implements Factory<CreditCardListNode> {
  private final CreditCardListNodeModule module;

  public CreditCardListNodeModule_ProvideCreditCardListNodeFactory(
      CreditCardListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CreditCardListNode get() {
    return Preconditions.checkNotNull(
        module.provideCreditCardListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CreditCardListNode> create(CreditCardListNodeModule module) {
    return new CreditCardListNodeModule_ProvideCreditCardListNodeFactory(module);
  }

  /** Proxies {@link CreditCardListNodeModule#provideCreditCardListNode()}. */
  public static CreditCardListNode proxyProvideCreditCardListNode(
      CreditCardListNodeModule instance) {
    return instance.provideCreditCardListNode();
  }
}
