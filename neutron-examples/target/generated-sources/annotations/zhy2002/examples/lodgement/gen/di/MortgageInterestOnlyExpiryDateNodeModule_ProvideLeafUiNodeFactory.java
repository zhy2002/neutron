package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageInterestOnlyExpiryDateNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final MortgageInterestOnlyExpiryDateNodeModule module;

  public MortgageInterestOnlyExpiryDateNodeModule_ProvideLeafUiNodeFactory(
      MortgageInterestOnlyExpiryDateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(MortgageInterestOnlyExpiryDateNodeModule module) {
    return new MortgageInterestOnlyExpiryDateNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link MortgageInterestOnlyExpiryDateNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      MortgageInterestOnlyExpiryDateNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
