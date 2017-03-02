package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficialOwnerListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final TrustBeneficialOwnerListNodeModule module;

  public TrustBeneficialOwnerListNodeModule_ProvideListUiNodeFactory(
      TrustBeneficialOwnerListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(TrustBeneficialOwnerListNodeModule module) {
    return new TrustBeneficialOwnerListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link TrustBeneficialOwnerListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(
      TrustBeneficialOwnerListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
