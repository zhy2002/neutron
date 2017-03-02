package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactLastNameNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final AccessContactLastNameNodeModule module;

  public AccessContactLastNameNodeModule_ProvideLeafUiNodeFactory(
      AccessContactLastNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(AccessContactLastNameNodeModule module) {
    return new AccessContactLastNameNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link AccessContactLastNameNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(AccessContactLastNameNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
