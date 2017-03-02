package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerAddressNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final EmployerAddressNodeModule module;

  public EmployerAddressNodeModule_ProvideParentUiNodeFactory(EmployerAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(EmployerAddressNodeModule module) {
    return new EmployerAddressNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link EmployerAddressNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(EmployerAddressNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
