package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustSettlorListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final TrustSettlorListNodeModule module;

  public TrustSettlorListNodeModule_ProvideListUiNodeFactory(TrustSettlorListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(TrustSettlorListNodeModule module) {
    return new TrustSettlorListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link TrustSettlorListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(TrustSettlorListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
