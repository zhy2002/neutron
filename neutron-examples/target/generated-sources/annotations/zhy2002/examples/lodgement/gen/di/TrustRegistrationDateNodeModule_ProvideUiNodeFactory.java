package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustRegistrationDateNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final TrustRegistrationDateNodeModule module;

  public TrustRegistrationDateNodeModule_ProvideUiNodeFactory(
      TrustRegistrationDateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(TrustRegistrationDateNodeModule module) {
    return new TrustRegistrationDateNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link TrustRegistrationDateNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(TrustRegistrationDateNodeModule instance) {
    return instance.provideUiNode();
  }
}
