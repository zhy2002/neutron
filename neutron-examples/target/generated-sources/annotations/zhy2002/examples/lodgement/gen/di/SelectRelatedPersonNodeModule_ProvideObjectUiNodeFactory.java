package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final SelectRelatedPersonNodeModule module;

  public SelectRelatedPersonNodeModule_ProvideObjectUiNodeFactory(
      SelectRelatedPersonNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(SelectRelatedPersonNodeModule module) {
    return new SelectRelatedPersonNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link SelectRelatedPersonNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(SelectRelatedPersonNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
