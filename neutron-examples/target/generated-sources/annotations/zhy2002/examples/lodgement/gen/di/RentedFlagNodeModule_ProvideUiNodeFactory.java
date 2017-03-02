package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RentedFlagNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final RentedFlagNodeModule module;

  public RentedFlagNodeModule_ProvideUiNodeFactory(RentedFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(RentedFlagNodeModule module) {
    return new RentedFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link RentedFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(RentedFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}