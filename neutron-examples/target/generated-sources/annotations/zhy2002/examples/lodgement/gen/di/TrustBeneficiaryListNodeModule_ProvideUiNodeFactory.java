package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryListNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final TrustBeneficiaryListNodeModule module;

  public TrustBeneficiaryListNodeModule_ProvideUiNodeFactory(
      TrustBeneficiaryListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(TrustBeneficiaryListNodeModule module) {
    return new TrustBeneficiaryListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link TrustBeneficiaryListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(TrustBeneficiaryListNodeModule instance) {
    return instance.provideUiNode();
  }
}
