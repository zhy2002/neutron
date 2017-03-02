package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.PhoneNumberNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneNumberNodeModule_ProvidePhoneNumberNodeFactory
    implements Factory<PhoneNumberNode> {
  private final PhoneNumberNodeModule module;

  public PhoneNumberNodeModule_ProvidePhoneNumberNodeFactory(PhoneNumberNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PhoneNumberNode get() {
    return Preconditions.checkNotNull(
        module.providePhoneNumberNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PhoneNumberNode> create(PhoneNumberNodeModule module) {
    return new PhoneNumberNodeModule_ProvidePhoneNumberNodeFactory(module);
  }

  /** Proxies {@link PhoneNumberNodeModule#providePhoneNumberNode()}. */
  public static PhoneNumberNode proxyProvidePhoneNumberNode(PhoneNumberNodeModule instance) {
    return instance.providePhoneNumberNode();
  }
}
