package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyDescriptionNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final CompanyDescriptionNodeModule module;

  public CompanyDescriptionNodeModule_ProvideLeafUiNodeFactory(
      CompanyDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(CompanyDescriptionNodeModule module) {
    return new CompanyDescriptionNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link CompanyDescriptionNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(CompanyDescriptionNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
