package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyApplicantTypeNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final CompanyApplicantTypeNodeModule module;

  public CompanyApplicantTypeNodeModule_ProvideUiNodeFactory(
      CompanyApplicantTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CompanyApplicantTypeNodeModule module) {
    return new CompanyApplicantTypeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CompanyApplicantTypeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CompanyApplicantTypeNodeModule instance) {
    return instance.provideUiNode();
  }
}
