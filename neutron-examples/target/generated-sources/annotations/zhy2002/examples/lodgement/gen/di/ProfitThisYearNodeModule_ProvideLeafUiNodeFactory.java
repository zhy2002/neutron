package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProfitThisYearNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ProfitThisYearNodeModule module;

  public ProfitThisYearNodeModule_ProvideLeafUiNodeFactory(ProfitThisYearNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ProfitThisYearNodeModule module) {
    return new ProfitThisYearNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ProfitThisYearNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ProfitThisYearNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}