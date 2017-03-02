package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactLastNameNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final CompanyContactLastNameNodeModule module;

  public CompanyContactLastNameNodeModule_ProvideLeafUiNodeFactory(
      CompanyContactLastNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(CompanyContactLastNameNodeModule module) {
    return new CompanyContactLastNameNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link CompanyContactLastNameNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(CompanyContactLastNameNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
