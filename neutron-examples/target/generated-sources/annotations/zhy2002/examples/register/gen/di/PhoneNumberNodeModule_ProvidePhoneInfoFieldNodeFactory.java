package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.PhoneInfoFieldNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneNumberNodeModule_ProvidePhoneInfoFieldNodeFactory
    implements Factory<PhoneInfoFieldNode> {
  private final PhoneNumberNodeModule module;

  public PhoneNumberNodeModule_ProvidePhoneInfoFieldNodeFactory(PhoneNumberNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PhoneInfoFieldNode get() {
    return Preconditions.checkNotNull(
        module.providePhoneInfoFieldNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PhoneInfoFieldNode> create(PhoneNumberNodeModule module) {
    return new PhoneNumberNodeModule_ProvidePhoneInfoFieldNodeFactory(module);
  }

  /** Proxies {@link PhoneNumberNodeModule#providePhoneInfoFieldNode()}. */
  public static PhoneInfoFieldNode proxyProvidePhoneInfoFieldNode(PhoneNumberNodeModule instance) {
    return instance.providePhoneInfoFieldNode();
  }
}
