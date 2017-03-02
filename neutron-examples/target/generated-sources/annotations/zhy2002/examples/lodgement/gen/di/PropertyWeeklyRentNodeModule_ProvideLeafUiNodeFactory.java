package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyWeeklyRentNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final PropertyWeeklyRentNodeModule module;

  public PropertyWeeklyRentNodeModule_ProvideLeafUiNodeFactory(
      PropertyWeeklyRentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(PropertyWeeklyRentNodeModule module) {
    return new PropertyWeeklyRentNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link PropertyWeeklyRentNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(PropertyWeeklyRentNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
