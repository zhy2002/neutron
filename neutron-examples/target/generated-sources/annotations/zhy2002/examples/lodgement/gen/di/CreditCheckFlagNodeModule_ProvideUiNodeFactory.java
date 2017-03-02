package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCheckFlagNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final CreditCheckFlagNodeModule module;

  public CreditCheckFlagNodeModule_ProvideUiNodeFactory(CreditCheckFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CreditCheckFlagNodeModule module) {
    return new CreditCheckFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CreditCheckFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CreditCheckFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}