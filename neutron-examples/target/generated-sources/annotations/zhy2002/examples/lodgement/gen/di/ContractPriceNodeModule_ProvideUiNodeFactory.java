package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContractPriceNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ContractPriceNodeModule module;

  public ContractPriceNodeModule_ProvideUiNodeFactory(ContractPriceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ContractPriceNodeModule module) {
    return new ContractPriceNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ContractPriceNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ContractPriceNodeModule instance) {
    return instance.provideUiNode();
  }
}
