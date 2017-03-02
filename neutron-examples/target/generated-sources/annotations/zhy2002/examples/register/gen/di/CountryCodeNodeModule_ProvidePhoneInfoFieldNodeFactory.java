package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.PhoneInfoFieldNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CountryCodeNodeModule_ProvidePhoneInfoFieldNodeFactory
    implements Factory<PhoneInfoFieldNode> {
  private final CountryCodeNodeModule module;

  public CountryCodeNodeModule_ProvidePhoneInfoFieldNodeFactory(CountryCodeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PhoneInfoFieldNode get() {
    return Preconditions.checkNotNull(
        module.providePhoneInfoFieldNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PhoneInfoFieldNode> create(CountryCodeNodeModule module) {
    return new CountryCodeNodeModule_ProvidePhoneInfoFieldNodeFactory(module);
  }

  /** Proxies {@link CountryCodeNodeModule#providePhoneInfoFieldNode()}. */
  public static PhoneInfoFieldNode proxyProvidePhoneInfoFieldNode(CountryCodeNodeModule instance) {
    return instance.providePhoneInfoFieldNode();
  }
}
