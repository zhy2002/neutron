package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyTrustNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final CompanyTrustNodeModule module;

  public CompanyTrustNodeModule_ProvideParentUiNodeFactory(CompanyTrustNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(CompanyTrustNodeModule module) {
    return new CompanyTrustNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link CompanyTrustNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(CompanyTrustNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
