package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final TrustBeneficiaryListNodeModule module;

  public TrustBeneficiaryListNodeModule_ProvideParentUiNodeFactory(
      TrustBeneficiaryListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(TrustBeneficiaryListNodeModule module) {
    return new TrustBeneficiaryListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link TrustBeneficiaryListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(TrustBeneficiaryListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}