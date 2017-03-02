package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsedAsSecurityFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final UsedAsSecurityFlagNodeModule module;

  public UsedAsSecurityFlagNodeModule_ProvideLeafUiNodeFactory(
      UsedAsSecurityFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(UsedAsSecurityFlagNodeModule module) {
    return new UsedAsSecurityFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link UsedAsSecurityFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(UsedAsSecurityFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
