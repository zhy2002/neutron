package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EstimatedMarketValueNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final EstimatedMarketValueNodeModule module;

  public EstimatedMarketValueNodeModule_ProvideUiNodeFactory(
      EstimatedMarketValueNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(EstimatedMarketValueNodeModule module) {
    return new EstimatedMarketValueNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link EstimatedMarketValueNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(EstimatedMarketValueNodeModule instance) {
    return instance.provideUiNode();
  }
}
