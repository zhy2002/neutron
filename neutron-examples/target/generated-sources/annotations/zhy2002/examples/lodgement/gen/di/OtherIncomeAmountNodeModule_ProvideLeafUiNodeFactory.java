package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeAmountNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final OtherIncomeAmountNodeModule module;

  public OtherIncomeAmountNodeModule_ProvideLeafUiNodeFactory(OtherIncomeAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(OtherIncomeAmountNodeModule module) {
    return new OtherIncomeAmountNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link OtherIncomeAmountNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(OtherIncomeAmountNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}