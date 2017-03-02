package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CreditCardLenderNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardLenderNameNodeModule_ProvideCreditCardLenderNameNodeFactory
    implements Factory<CreditCardLenderNameNode> {
  private final CreditCardLenderNameNodeModule module;

  public CreditCardLenderNameNodeModule_ProvideCreditCardLenderNameNodeFactory(
      CreditCardLenderNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CreditCardLenderNameNode get() {
    return Preconditions.checkNotNull(
        module.provideCreditCardLenderNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CreditCardLenderNameNode> create(CreditCardLenderNameNodeModule module) {
    return new CreditCardLenderNameNodeModule_ProvideCreditCardLenderNameNodeFactory(module);
  }

  /** Proxies {@link CreditCardLenderNameNodeModule#provideCreditCardLenderNameNode()}. */
  public static CreditCardLenderNameNode proxyProvideCreditCardLenderNameNode(
      CreditCardLenderNameNodeModule instance) {
    return instance.provideCreditCardLenderNameNode();
  }
}
