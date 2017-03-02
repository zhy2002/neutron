package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerAddressNodeModule_ProvideAddressNodeFactory
    implements Factory<AddressNode<?>> {
  private final EmployerAddressNodeModule module;

  public EmployerAddressNodeModule_ProvideAddressNodeFactory(EmployerAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AddressNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideAddressNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AddressNode<?>> create(EmployerAddressNodeModule module) {
    return new EmployerAddressNodeModule_ProvideAddressNodeFactory(module);
  }

  /** Proxies {@link EmployerAddressNodeModule#provideAddressNode()}. */
  public static AddressNode<?> proxyProvideAddressNode(EmployerAddressNodeModule instance) {
    return instance.provideAddressNode();
  }
}