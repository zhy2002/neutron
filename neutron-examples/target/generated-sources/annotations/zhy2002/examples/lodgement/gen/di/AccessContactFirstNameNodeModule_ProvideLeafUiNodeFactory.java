package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactFirstNameNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final AccessContactFirstNameNodeModule module;

  public AccessContactFirstNameNodeModule_ProvideLeafUiNodeFactory(
      AccessContactFirstNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(AccessContactFirstNameNodeModule module) {
    return new AccessContactFirstNameNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link AccessContactFirstNameNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(AccessContactFirstNameNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
