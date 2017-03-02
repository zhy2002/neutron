package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final TrustBeneficiaryListNodeModule module;

  public TrustBeneficiaryListNodeModule_ProvideListUiNodeFactory(
      TrustBeneficiaryListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(TrustBeneficiaryListNodeModule module) {
    return new TrustBeneficiaryListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link TrustBeneficiaryListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(TrustBeneficiaryListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
