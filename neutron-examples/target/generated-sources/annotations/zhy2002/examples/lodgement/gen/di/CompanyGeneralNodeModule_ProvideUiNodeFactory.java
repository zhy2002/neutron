package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyGeneralNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final CompanyGeneralNodeModule module;

  public CompanyGeneralNodeModule_ProvideUiNodeFactory(CompanyGeneralNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CompanyGeneralNodeModule module) {
    return new CompanyGeneralNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CompanyGeneralNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CompanyGeneralNodeModule instance) {
    return instance.provideUiNode();
  }
}
