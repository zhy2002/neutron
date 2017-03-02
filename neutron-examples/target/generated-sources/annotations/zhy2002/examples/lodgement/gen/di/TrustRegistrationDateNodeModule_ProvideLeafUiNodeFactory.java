package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustRegistrationDateNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final TrustRegistrationDateNodeModule module;

  public TrustRegistrationDateNodeModule_ProvideLeafUiNodeFactory(
      TrustRegistrationDateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(TrustRegistrationDateNodeModule module) {
    return new TrustRegistrationDateNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link TrustRegistrationDateNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(TrustRegistrationDateNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
