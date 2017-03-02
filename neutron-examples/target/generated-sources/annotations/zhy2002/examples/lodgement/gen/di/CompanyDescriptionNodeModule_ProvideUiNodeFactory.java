package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyDescriptionNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final CompanyDescriptionNodeModule module;

  public CompanyDescriptionNodeModule_ProvideUiNodeFactory(CompanyDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CompanyDescriptionNodeModule module) {
    return new CompanyDescriptionNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CompanyDescriptionNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CompanyDescriptionNodeModule instance) {
    return instance.provideUiNode();
  }
}
