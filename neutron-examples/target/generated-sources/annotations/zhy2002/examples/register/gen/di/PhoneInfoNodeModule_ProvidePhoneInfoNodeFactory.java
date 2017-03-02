package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.PhoneInfoNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneInfoNodeModule_ProvidePhoneInfoNodeFactory
    implements Factory<PhoneInfoNode> {
  private final PhoneInfoNodeModule module;

  public PhoneInfoNodeModule_ProvidePhoneInfoNodeFactory(PhoneInfoNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PhoneInfoNode get() {
    return Preconditions.checkNotNull(
        module.providePhoneInfoNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PhoneInfoNode> create(PhoneInfoNodeModule module) {
    return new PhoneInfoNodeModule_ProvidePhoneInfoNodeFactory(module);
  }

  /** Proxies {@link PhoneInfoNodeModule#providePhoneInfoNode()}. */
  public static PhoneInfoNode proxyProvidePhoneInfoNode(PhoneInfoNodeModule instance) {
    return instance.providePhoneInfoNode();
  }
}
