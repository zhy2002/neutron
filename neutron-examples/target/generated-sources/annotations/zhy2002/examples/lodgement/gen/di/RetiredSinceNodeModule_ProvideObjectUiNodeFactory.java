package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredSinceNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final RetiredSinceNodeModule module;

  public RetiredSinceNodeModule_ProvideObjectUiNodeFactory(RetiredSinceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(RetiredSinceNodeModule module) {
    return new RetiredSinceNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link RetiredSinceNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(RetiredSinceNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
