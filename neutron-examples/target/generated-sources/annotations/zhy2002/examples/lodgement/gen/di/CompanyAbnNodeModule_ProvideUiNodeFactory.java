package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyAbnNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final CompanyAbnNodeModule module;

  public CompanyAbnNodeModule_ProvideUiNodeFactory(CompanyAbnNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CompanyAbnNodeModule module) {
    return new CompanyAbnNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CompanyAbnNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CompanyAbnNodeModule instance) {
    return instance.provideUiNode();
  }
}
