package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AddressLineNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressLineNodeModule_ProvideAddressLineNodeFactory
    implements Factory<AddressLineNode> {
  private final AddressLineNodeModule module;

  public AddressLineNodeModule_ProvideAddressLineNodeFactory(AddressLineNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AddressLineNode get() {
    return Preconditions.checkNotNull(
        module.provideAddressLineNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AddressLineNode> create(AddressLineNodeModule module) {
    return new AddressLineNodeModule_ProvideAddressLineNodeFactory(module);
  }

  /** Proxies {@link AddressLineNodeModule#provideAddressLineNode()}. */
  public static AddressLineNode proxyProvideAddressLineNode(AddressLineNodeModule instance) {
    return instance.provideAddressLineNode();
  }
}
