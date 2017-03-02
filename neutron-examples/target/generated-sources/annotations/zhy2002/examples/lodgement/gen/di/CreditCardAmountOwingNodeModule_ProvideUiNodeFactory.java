package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardAmountOwingNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final CreditCardAmountOwingNodeModule module;

  public CreditCardAmountOwingNodeModule_ProvideUiNodeFactory(
      CreditCardAmountOwingNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CreditCardAmountOwingNodeModule module) {
    return new CreditCardAmountOwingNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CreditCardAmountOwingNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CreditCardAmountOwingNodeModule instance) {
    return instance.provideUiNode();
  }
}
