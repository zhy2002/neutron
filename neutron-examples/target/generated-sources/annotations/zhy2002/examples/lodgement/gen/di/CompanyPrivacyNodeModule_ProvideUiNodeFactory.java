package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyPrivacyNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final CompanyPrivacyNodeModule module;

  public CompanyPrivacyNodeModule_ProvideUiNodeFactory(CompanyPrivacyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CompanyPrivacyNodeModule module) {
    return new CompanyPrivacyNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CompanyPrivacyNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CompanyPrivacyNodeModule instance) {
    return instance.provideUiNode();
  }
}
