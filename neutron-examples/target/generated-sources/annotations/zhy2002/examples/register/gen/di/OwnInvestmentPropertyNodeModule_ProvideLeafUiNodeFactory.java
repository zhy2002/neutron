package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnInvestmentPropertyNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final OwnInvestmentPropertyNodeModule module;

  public OwnInvestmentPropertyNodeModule_ProvideLeafUiNodeFactory(
      OwnInvestmentPropertyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(OwnInvestmentPropertyNodeModule module) {
    return new OwnInvestmentPropertyNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link OwnInvestmentPropertyNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(OwnInvestmentPropertyNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
