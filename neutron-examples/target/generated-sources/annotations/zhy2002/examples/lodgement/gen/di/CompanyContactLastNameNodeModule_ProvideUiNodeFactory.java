package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactLastNameNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final CompanyContactLastNameNodeModule module;

  public CompanyContactLastNameNodeModule_ProvideUiNodeFactory(
      CompanyContactLastNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CompanyContactLastNameNodeModule module) {
    return new CompanyContactLastNameNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CompanyContactLastNameNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CompanyContactLastNameNodeModule instance) {
    return instance.provideUiNode();
  }
}
