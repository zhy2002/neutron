package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final CreditCardNodeModule module;

  public CreditCardNodeModule_ProvideObjectUiNodeFactory(CreditCardNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(CreditCardNodeModule module) {
    return new CreditCardNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link CreditCardNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(CreditCardNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
