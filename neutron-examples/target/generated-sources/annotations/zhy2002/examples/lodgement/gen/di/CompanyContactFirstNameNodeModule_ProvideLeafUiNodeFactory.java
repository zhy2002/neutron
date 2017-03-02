package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactFirstNameNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final CompanyContactFirstNameNodeModule module;

  public CompanyContactFirstNameNodeModule_ProvideLeafUiNodeFactory(
      CompanyContactFirstNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(CompanyContactFirstNameNodeModule module) {
    return new CompanyContactFirstNameNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link CompanyContactFirstNameNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      CompanyContactFirstNameNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
