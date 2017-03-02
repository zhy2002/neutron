package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryClassNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final TrustBeneficiaryClassNodeModule module;

  public TrustBeneficiaryClassNodeModule_ProvideUiNodeFactory(
      TrustBeneficiaryClassNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(TrustBeneficiaryClassNodeModule module) {
    return new TrustBeneficiaryClassNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link TrustBeneficiaryClassNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(TrustBeneficiaryClassNodeModule instance) {
    return instance.provideUiNode();
  }
}
