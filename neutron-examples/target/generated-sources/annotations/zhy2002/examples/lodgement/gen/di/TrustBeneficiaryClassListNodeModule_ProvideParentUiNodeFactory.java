package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryClassListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final TrustBeneficiaryClassListNodeModule module;

  public TrustBeneficiaryClassListNodeModule_ProvideParentUiNodeFactory(
      TrustBeneficiaryClassListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(TrustBeneficiaryClassListNodeModule module) {
    return new TrustBeneficiaryClassListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link TrustBeneficiaryClassListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(
      TrustBeneficiaryClassListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}