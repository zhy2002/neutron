package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BasePrivacyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyPrivacyNodeModule_ProvideBasePrivacyNodeFactory
    implements Factory<BasePrivacyNode<?>> {
  private final CompanyPrivacyNodeModule module;

  public CompanyPrivacyNodeModule_ProvideBasePrivacyNodeFactory(CompanyPrivacyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BasePrivacyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBasePrivacyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BasePrivacyNode<?>> create(CompanyPrivacyNodeModule module) {
    return new CompanyPrivacyNodeModule_ProvideBasePrivacyNodeFactory(module);
  }

  /** Proxies {@link CompanyPrivacyNodeModule#provideBasePrivacyNode()}. */
  public static BasePrivacyNode<?> proxyProvideBasePrivacyNode(CompanyPrivacyNodeModule instance) {
    return instance.provideBasePrivacyNode();
  }
}
