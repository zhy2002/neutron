package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final CompanyNodeModule module;

  public CompanyNodeModule_ProvideParentUiNodeFactory(CompanyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(CompanyNodeModule module) {
    return new CompanyNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link CompanyNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(CompanyNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
