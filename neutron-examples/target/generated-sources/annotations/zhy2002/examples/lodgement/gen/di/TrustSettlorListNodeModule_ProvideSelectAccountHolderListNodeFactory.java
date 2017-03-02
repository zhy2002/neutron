package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustSettlorListNodeModule_ProvideSelectAccountHolderListNodeFactory
    implements Factory<SelectAccountHolderListNode<?>> {
  private final TrustSettlorListNodeModule module;

  public TrustSettlorListNodeModule_ProvideSelectAccountHolderListNodeFactory(
      TrustSettlorListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SelectAccountHolderListNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideSelectAccountHolderListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SelectAccountHolderListNode<?>> create(TrustSettlorListNodeModule module) {
    return new TrustSettlorListNodeModule_ProvideSelectAccountHolderListNodeFactory(module);
  }

  /** Proxies {@link TrustSettlorListNodeModule#provideSelectAccountHolderListNode()}. */
  public static SelectAccountHolderListNode<?> proxyProvideSelectAccountHolderListNode(
      TrustSettlorListNodeModule instance) {
    return instance.provideSelectAccountHolderListNode();
  }
}
