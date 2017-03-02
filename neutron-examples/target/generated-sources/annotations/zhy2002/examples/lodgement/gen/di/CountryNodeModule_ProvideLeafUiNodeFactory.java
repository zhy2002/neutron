package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CountryNodeModule_ProvideLeafUiNodeFactory implements Factory<LeafUiNode<?, ?>> {
  private final CountryNodeModule module;

  public CountryNodeModule_ProvideLeafUiNodeFactory(CountryNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(CountryNodeModule module) {
    return new CountryNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link CountryNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(CountryNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
