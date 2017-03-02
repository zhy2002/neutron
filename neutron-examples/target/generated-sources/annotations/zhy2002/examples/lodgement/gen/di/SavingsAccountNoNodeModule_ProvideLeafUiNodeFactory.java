package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNoNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final SavingsAccountNoNodeModule module;

  public SavingsAccountNoNodeModule_ProvideLeafUiNodeFactory(SavingsAccountNoNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(SavingsAccountNoNodeModule module) {
    return new SavingsAccountNoNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link SavingsAccountNoNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(SavingsAccountNoNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
