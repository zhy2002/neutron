package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirstHomeBuyerFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final FirstHomeBuyerFlagNodeModule module;

  public FirstHomeBuyerFlagNodeModule_ProvideLeafUiNodeFactory(
      FirstHomeBuyerFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(FirstHomeBuyerFlagNodeModule module) {
    return new FirstHomeBuyerFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link FirstHomeBuyerFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(FirstHomeBuyerFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
