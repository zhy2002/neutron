package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final SelectAccountHolderNodeModule module;

  public SelectAccountHolderNodeModule_ProvideObjectUiNodeFactory(
      SelectAccountHolderNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(SelectAccountHolderNodeModule module) {
    return new SelectAccountHolderNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link SelectAccountHolderNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(SelectAccountHolderNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
