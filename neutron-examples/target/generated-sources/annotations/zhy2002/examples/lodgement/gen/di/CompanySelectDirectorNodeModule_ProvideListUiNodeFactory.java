package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanySelectDirectorNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final CompanySelectDirectorNodeModule module;

  public CompanySelectDirectorNodeModule_ProvideListUiNodeFactory(
      CompanySelectDirectorNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(CompanySelectDirectorNodeModule module) {
    return new CompanySelectDirectorNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link CompanySelectDirectorNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(CompanySelectDirectorNodeModule instance) {
    return instance.provideListUiNode();
  }
}