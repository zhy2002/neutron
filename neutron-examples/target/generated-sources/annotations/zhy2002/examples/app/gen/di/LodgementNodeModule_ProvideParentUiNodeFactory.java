package zhy2002.examples.app.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LodgementNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final LodgementNodeModule module;

  public LodgementNodeModule_ProvideParentUiNodeFactory(LodgementNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(LodgementNodeModule module) {
    return new LodgementNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link LodgementNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(LodgementNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
