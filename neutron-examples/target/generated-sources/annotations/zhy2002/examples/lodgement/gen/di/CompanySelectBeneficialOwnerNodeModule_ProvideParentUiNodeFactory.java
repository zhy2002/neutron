package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanySelectBeneficialOwnerNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final CompanySelectBeneficialOwnerNodeModule module;

  public CompanySelectBeneficialOwnerNodeModule_ProvideParentUiNodeFactory(
      CompanySelectBeneficialOwnerNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(CompanySelectBeneficialOwnerNodeModule module) {
    return new CompanySelectBeneficialOwnerNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link CompanySelectBeneficialOwnerNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(
      CompanySelectBeneficialOwnerNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
