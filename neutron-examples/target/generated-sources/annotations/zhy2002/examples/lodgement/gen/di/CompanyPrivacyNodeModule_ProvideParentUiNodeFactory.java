package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyPrivacyNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final CompanyPrivacyNodeModule module;

  public CompanyPrivacyNodeModule_ProvideParentUiNodeFactory(CompanyPrivacyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(CompanyPrivacyNodeModule module) {
    return new CompanyPrivacyNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link CompanyPrivacyNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(CompanyPrivacyNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
