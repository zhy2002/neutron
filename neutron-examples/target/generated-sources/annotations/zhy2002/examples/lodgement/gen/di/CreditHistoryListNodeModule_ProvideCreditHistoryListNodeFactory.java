package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CreditHistoryListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditHistoryListNodeModule_ProvideCreditHistoryListNodeFactory
    implements Factory<CreditHistoryListNode> {
  private final CreditHistoryListNodeModule module;

  public CreditHistoryListNodeModule_ProvideCreditHistoryListNodeFactory(
      CreditHistoryListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CreditHistoryListNode get() {
    return Preconditions.checkNotNull(
        module.provideCreditHistoryListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CreditHistoryListNode> create(CreditHistoryListNodeModule module) {
    return new CreditHistoryListNodeModule_ProvideCreditHistoryListNodeFactory(module);
  }

  /** Proxies {@link CreditHistoryListNodeModule#provideCreditHistoryListNode()}. */
  public static CreditHistoryListNode proxyProvideCreditHistoryListNode(
      CreditHistoryListNodeModule instance) {
    return instance.provideCreditHistoryListNode();
  }
}
