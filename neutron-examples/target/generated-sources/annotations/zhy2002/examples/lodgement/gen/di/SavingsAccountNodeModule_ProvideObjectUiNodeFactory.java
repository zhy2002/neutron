package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final SavingsAccountNodeModule module;

  public SavingsAccountNodeModule_ProvideObjectUiNodeFactory(SavingsAccountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(SavingsAccountNodeModule module) {
    return new SavingsAccountNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link SavingsAccountNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(SavingsAccountNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}