package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNameNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final SavingsAccountNameNodeModule module;

  public SavingsAccountNameNodeModule_ProvideLeafUiNodeFactory(
      SavingsAccountNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(SavingsAccountNameNodeModule module) {
    return new SavingsAccountNameNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link SavingsAccountNameNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(SavingsAccountNameNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
