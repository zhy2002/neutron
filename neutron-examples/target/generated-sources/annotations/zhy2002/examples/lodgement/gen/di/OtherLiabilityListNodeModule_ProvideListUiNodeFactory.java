package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final OtherLiabilityListNodeModule module;

  public OtherLiabilityListNodeModule_ProvideListUiNodeFactory(
      OtherLiabilityListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(OtherLiabilityListNodeModule module) {
    return new OtherLiabilityListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(OtherLiabilityListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
