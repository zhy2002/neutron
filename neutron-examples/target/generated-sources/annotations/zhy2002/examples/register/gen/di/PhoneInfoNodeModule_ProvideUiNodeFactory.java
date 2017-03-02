package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneInfoNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final PhoneInfoNodeModule module;

  public PhoneInfoNodeModule_ProvideUiNodeFactory(PhoneInfoNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PhoneInfoNodeModule module) {
    return new PhoneInfoNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PhoneInfoNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PhoneInfoNodeModule instance) {
    return instance.provideUiNode();
  }
}
