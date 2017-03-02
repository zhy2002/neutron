package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsBsbNoNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final SavingsBsbNoNodeModule module;

  public SavingsBsbNoNodeModule_ProvideLeafUiNodeFactory(SavingsBsbNoNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(SavingsBsbNoNodeModule module) {
    return new SavingsBsbNoNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link SavingsBsbNoNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(SavingsBsbNoNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
