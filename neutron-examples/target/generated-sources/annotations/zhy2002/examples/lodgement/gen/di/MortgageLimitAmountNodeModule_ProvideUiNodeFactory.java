package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLimitAmountNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final MortgageLimitAmountNodeModule module;

  public MortgageLimitAmountNodeModule_ProvideUiNodeFactory(MortgageLimitAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(MortgageLimitAmountNodeModule module) {
    return new MortgageLimitAmountNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link MortgageLimitAmountNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(MortgageLimitAmountNodeModule instance) {
    return instance.provideUiNode();
  }
}
