package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelfEmployedNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final SelfEmployedNodeModule module;

  public SelfEmployedNodeModule_ProvideParentUiNodeFactory(SelfEmployedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(SelfEmployedNodeModule module) {
    return new SelfEmployedNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link SelfEmployedNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(SelfEmployedNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
