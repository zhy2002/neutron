package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final CompanyContactNodeModule module;

  public CompanyContactNodeModule_ProvideUiNodeFactory(CompanyContactNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CompanyContactNodeModule module) {
    return new CompanyContactNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CompanyContactNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CompanyContactNodeModule instance) {
    return instance.provideUiNode();
  }
}
