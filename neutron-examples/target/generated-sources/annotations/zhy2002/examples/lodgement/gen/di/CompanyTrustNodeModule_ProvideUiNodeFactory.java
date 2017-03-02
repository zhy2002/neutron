package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyTrustNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final CompanyTrustNodeModule module;

  public CompanyTrustNodeModule_ProvideUiNodeFactory(CompanyTrustNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CompanyTrustNodeModule module) {
    return new CompanyTrustNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CompanyTrustNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CompanyTrustNodeModule instance) {
    return instance.provideUiNode();
  }
}
