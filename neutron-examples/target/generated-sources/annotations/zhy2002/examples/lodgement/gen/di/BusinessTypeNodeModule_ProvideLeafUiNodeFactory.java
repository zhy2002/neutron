package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BusinessTypeNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final BusinessTypeNodeModule module;

  public BusinessTypeNodeModule_ProvideLeafUiNodeFactory(BusinessTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(BusinessTypeNodeModule module) {
    return new BusinessTypeNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link BusinessTypeNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(BusinessTypeNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
