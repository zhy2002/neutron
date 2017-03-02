package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyRegistrationStateNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final CompanyRegistrationStateNodeModule module;

  public CompanyRegistrationStateNodeModule_ProvideUiNodeFactory(
      CompanyRegistrationStateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CompanyRegistrationStateNodeModule module) {
    return new CompanyRegistrationStateNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CompanyRegistrationStateNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CompanyRegistrationStateNodeModule instance) {
    return instance.provideUiNode();
  }
}
