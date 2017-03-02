package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LiabilitiesNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final LiabilitiesNodeModule module;

  public LiabilitiesNodeModule_ProvideObjectUiNodeFactory(LiabilitiesNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(LiabilitiesNodeModule module) {
    return new LiabilitiesNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link LiabilitiesNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(LiabilitiesNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
