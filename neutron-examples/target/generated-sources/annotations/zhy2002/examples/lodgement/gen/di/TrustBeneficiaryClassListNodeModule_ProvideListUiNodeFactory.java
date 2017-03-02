package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryClassListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final TrustBeneficiaryClassListNodeModule module;

  public TrustBeneficiaryClassListNodeModule_ProvideListUiNodeFactory(
      TrustBeneficiaryClassListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(TrustBeneficiaryClassListNodeModule module) {
    return new TrustBeneficiaryClassListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link TrustBeneficiaryClassListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(
      TrustBeneficiaryClassListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
