package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneInfoNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final PhoneInfoNodeModule module;

  public PhoneInfoNodeModule_ProvideObjectUiNodeFactory(PhoneInfoNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(PhoneInfoNodeModule module) {
    return new PhoneInfoNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link PhoneInfoNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(PhoneInfoNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
