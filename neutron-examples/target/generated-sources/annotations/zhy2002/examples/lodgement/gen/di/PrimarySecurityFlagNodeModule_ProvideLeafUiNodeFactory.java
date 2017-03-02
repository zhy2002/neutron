package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PrimarySecurityFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final PrimarySecurityFlagNodeModule module;

  public PrimarySecurityFlagNodeModule_ProvideLeafUiNodeFactory(
      PrimarySecurityFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(PrimarySecurityFlagNodeModule module) {
    return new PrimarySecurityFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link PrimarySecurityFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(PrimarySecurityFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
