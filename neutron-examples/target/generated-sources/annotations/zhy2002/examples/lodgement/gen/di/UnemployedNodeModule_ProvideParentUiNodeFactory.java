package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final UnemployedNodeModule module;

  public UnemployedNodeModule_ProvideParentUiNodeFactory(UnemployedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(UnemployedNodeModule module) {
    return new UnemployedNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link UnemployedNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(UnemployedNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
