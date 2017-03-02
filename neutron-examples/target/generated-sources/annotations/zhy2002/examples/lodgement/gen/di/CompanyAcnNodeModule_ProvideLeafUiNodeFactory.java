package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyAcnNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final CompanyAcnNodeModule module;

  public CompanyAcnNodeModule_ProvideLeafUiNodeFactory(CompanyAcnNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(CompanyAcnNodeModule module) {
    return new CompanyAcnNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link CompanyAcnNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(CompanyAcnNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
