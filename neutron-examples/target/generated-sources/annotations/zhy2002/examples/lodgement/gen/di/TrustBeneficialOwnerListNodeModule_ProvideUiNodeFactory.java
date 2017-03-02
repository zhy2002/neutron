package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficialOwnerListNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final TrustBeneficialOwnerListNodeModule module;

  public TrustBeneficialOwnerListNodeModule_ProvideUiNodeFactory(
      TrustBeneficialOwnerListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(TrustBeneficialOwnerListNodeModule module) {
    return new TrustBeneficialOwnerListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link TrustBeneficialOwnerListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(TrustBeneficialOwnerListNodeModule instance) {
    return instance.provideUiNode();
  }
}
