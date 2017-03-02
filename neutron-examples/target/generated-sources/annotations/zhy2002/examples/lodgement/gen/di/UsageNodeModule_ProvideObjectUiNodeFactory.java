package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsageNodeModule_ProvideObjectUiNodeFactory implements Factory<ObjectUiNode<?>> {
  private final UsageNodeModule module;

  public UsageNodeModule_ProvideObjectUiNodeFactory(UsageNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(UsageNodeModule module) {
    return new UsageNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link UsageNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(UsageNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
