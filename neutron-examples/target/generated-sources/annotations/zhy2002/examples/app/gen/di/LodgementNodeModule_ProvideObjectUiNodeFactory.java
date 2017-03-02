package zhy2002.examples.app.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LodgementNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final LodgementNodeModule module;

  public LodgementNodeModule_ProvideObjectUiNodeFactory(LodgementNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(LodgementNodeModule module) {
    return new LodgementNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link LodgementNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(LodgementNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
