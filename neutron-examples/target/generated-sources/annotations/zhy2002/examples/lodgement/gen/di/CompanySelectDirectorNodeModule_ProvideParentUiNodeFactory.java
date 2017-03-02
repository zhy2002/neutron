package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanySelectDirectorNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final CompanySelectDirectorNodeModule module;

  public CompanySelectDirectorNodeModule_ProvideParentUiNodeFactory(
      CompanySelectDirectorNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(CompanySelectDirectorNodeModule module) {
    return new CompanySelectDirectorNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link CompanySelectDirectorNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(CompanySelectDirectorNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
