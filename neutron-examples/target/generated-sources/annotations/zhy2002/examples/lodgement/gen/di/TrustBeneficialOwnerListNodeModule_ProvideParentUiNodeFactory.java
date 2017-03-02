package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficialOwnerListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final TrustBeneficialOwnerListNodeModule module;

  public TrustBeneficialOwnerListNodeModule_ProvideParentUiNodeFactory(
      TrustBeneficialOwnerListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(TrustBeneficialOwnerListNodeModule module) {
    return new TrustBeneficialOwnerListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link TrustBeneficialOwnerListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(
      TrustBeneficialOwnerListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
