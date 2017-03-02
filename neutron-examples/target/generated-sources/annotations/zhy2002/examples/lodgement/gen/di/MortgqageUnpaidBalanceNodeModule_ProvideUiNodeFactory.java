package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgqageUnpaidBalanceNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final MortgqageUnpaidBalanceNodeModule module;

  public MortgqageUnpaidBalanceNodeModule_ProvideUiNodeFactory(
      MortgqageUnpaidBalanceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(MortgqageUnpaidBalanceNodeModule module) {
    return new MortgqageUnpaidBalanceNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link MortgqageUnpaidBalanceNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(MortgqageUnpaidBalanceNodeModule instance) {
    return instance.provideUiNode();
  }
}
