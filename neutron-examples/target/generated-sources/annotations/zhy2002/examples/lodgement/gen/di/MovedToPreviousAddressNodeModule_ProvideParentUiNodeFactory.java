package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedToPreviousAddressNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final MovedToPreviousAddressNodeModule module;

  public MovedToPreviousAddressNodeModule_ProvideParentUiNodeFactory(
      MovedToPreviousAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(MovedToPreviousAddressNodeModule module) {
    return new MovedToPreviousAddressNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link MovedToPreviousAddressNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(
      MovedToPreviousAddressNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
