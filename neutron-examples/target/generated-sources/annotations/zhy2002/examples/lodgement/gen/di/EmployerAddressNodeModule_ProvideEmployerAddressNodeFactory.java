package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.EmployerAddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerAddressNodeModule_ProvideEmployerAddressNodeFactory
    implements Factory<EmployerAddressNode> {
  private final EmployerAddressNodeModule module;

  public EmployerAddressNodeModule_ProvideEmployerAddressNodeFactory(
      EmployerAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public EmployerAddressNode get() {
    return Preconditions.checkNotNull(
        module.provideEmployerAddressNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EmployerAddressNode> create(EmployerAddressNodeModule module) {
    return new EmployerAddressNodeModule_ProvideEmployerAddressNodeFactory(module);
  }

  /** Proxies {@link EmployerAddressNodeModule#provideEmployerAddressNode()}. */
  public static EmployerAddressNode proxyProvideEmployerAddressNode(
      EmployerAddressNodeModule instance) {
    return instance.provideEmployerAddressNode();
  }
}
