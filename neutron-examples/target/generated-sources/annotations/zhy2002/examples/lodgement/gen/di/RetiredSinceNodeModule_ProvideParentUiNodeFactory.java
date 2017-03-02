package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredSinceNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final RetiredSinceNodeModule module;

  public RetiredSinceNodeModule_ProvideParentUiNodeFactory(RetiredSinceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(RetiredSinceNodeModule module) {
    return new RetiredSinceNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link RetiredSinceNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(RetiredSinceNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
