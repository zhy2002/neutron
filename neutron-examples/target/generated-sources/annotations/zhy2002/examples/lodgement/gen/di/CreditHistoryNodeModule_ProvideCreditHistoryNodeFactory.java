package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CreditHistoryNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditHistoryNodeModule_ProvideCreditHistoryNodeFactory
    implements Factory<CreditHistoryNode> {
  private final CreditHistoryNodeModule module;

  public CreditHistoryNodeModule_ProvideCreditHistoryNodeFactory(CreditHistoryNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CreditHistoryNode get() {
    return Preconditions.checkNotNull(
        module.provideCreditHistoryNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CreditHistoryNode> create(CreditHistoryNodeModule module) {
    return new CreditHistoryNodeModule_ProvideCreditHistoryNodeFactory(module);
  }

  /** Proxies {@link CreditHistoryNodeModule#provideCreditHistoryNode()}. */
  public static CreditHistoryNode proxyProvideCreditHistoryNode(CreditHistoryNodeModule instance) {
    return instance.provideCreditHistoryNode();
  }
}
