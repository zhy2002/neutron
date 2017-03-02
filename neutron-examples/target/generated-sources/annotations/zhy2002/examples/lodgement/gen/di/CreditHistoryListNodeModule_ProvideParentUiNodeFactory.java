package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditHistoryListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final CreditHistoryListNodeModule module;

  public CreditHistoryListNodeModule_ProvideParentUiNodeFactory(
      CreditHistoryListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(CreditHistoryListNodeModule module) {
    return new CreditHistoryListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link CreditHistoryListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(CreditHistoryListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
