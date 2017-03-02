package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessNodeModule_ProvideParentUiNodeFactory implements Factory<ParentUiNode<?>> {
  private final AccessNodeModule module;

  public AccessNodeModule_ProvideParentUiNodeFactory(AccessNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(AccessNodeModule module) {
    return new AccessNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link AccessNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(AccessNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
