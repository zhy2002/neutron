package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactTitleNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final AccessContactTitleNodeModule module;

  public AccessContactTitleNodeModule_ProvideLeafUiNodeFactory(
      AccessContactTitleNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(AccessContactTitleNodeModule module) {
    return new AccessContactTitleNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link AccessContactTitleNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(AccessContactTitleNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
