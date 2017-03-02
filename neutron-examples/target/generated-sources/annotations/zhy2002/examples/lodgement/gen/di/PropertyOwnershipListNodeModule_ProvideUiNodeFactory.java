package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyOwnershipListNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final PropertyOwnershipListNodeModule module;

  public PropertyOwnershipListNodeModule_ProvideUiNodeFactory(
      PropertyOwnershipListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PropertyOwnershipListNodeModule module) {
    return new PropertyOwnershipListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PropertyOwnershipListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PropertyOwnershipListNodeModule instance) {
    return instance.provideUiNode();
  }
}
