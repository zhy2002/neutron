package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyAcnNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final CompanyAcnNodeModule module;

  public CompanyAcnNodeModule_ProvideUiNodeFactory(CompanyAcnNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CompanyAcnNodeModule module) {
    return new CompanyAcnNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CompanyAcnNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CompanyAcnNodeModule instance) {
    return instance.provideUiNode();
  }
}
