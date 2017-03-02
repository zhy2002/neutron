package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneNumberNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final PhoneNumberNodeModule module;

  public PhoneNumberNodeModule_ProvideUiNodeFactory(PhoneNumberNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PhoneNumberNodeModule module) {
    return new PhoneNumberNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PhoneNumberNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PhoneNumberNodeModule instance) {
    return instance.provideUiNode();
  }
}
