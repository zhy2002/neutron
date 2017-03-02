package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageInterestOnlyExpiryDateNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final MortgageInterestOnlyExpiryDateNodeModule module;

  public MortgageInterestOnlyExpiryDateNodeModule_ProvideUiNodeFactory(
      MortgageInterestOnlyExpiryDateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(MortgageInterestOnlyExpiryDateNodeModule module) {
    return new MortgageInterestOnlyExpiryDateNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link MortgageInterestOnlyExpiryDateNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(MortgageInterestOnlyExpiryDateNodeModule instance) {
    return instance.provideUiNode();
  }
}
