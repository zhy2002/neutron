package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedSinceNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final UnemployedSinceNodeModule module;

  public UnemployedSinceNodeModule_ProvideParentUiNodeFactory(UnemployedSinceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(UnemployedSinceNodeModule module) {
    return new UnemployedSinceNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link UnemployedSinceNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(UnemployedSinceNodeModule instance) {
    return instance.provideParentUiNode();
  }
}