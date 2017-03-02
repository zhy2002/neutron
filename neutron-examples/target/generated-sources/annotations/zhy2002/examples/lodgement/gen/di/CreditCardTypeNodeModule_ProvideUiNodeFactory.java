package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardTypeNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final CreditCardTypeNodeModule module;

  public CreditCardTypeNodeModule_ProvideUiNodeFactory(CreditCardTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CreditCardTypeNodeModule module) {
    return new CreditCardTypeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CreditCardTypeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CreditCardTypeNodeModule instance) {
    return instance.provideUiNode();
  }
}
