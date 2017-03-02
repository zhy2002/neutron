package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.CountryCodeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CountryCodeNodeModule_ProvideCountryCodeNodeFactory
    implements Factory<CountryCodeNode> {
  private final CountryCodeNodeModule module;

  public CountryCodeNodeModule_ProvideCountryCodeNodeFactory(CountryCodeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CountryCodeNode get() {
    return Preconditions.checkNotNull(
        module.provideCountryCodeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CountryCodeNode> create(CountryCodeNodeModule module) {
    return new CountryCodeNodeModule_ProvideCountryCodeNodeFactory(module);
  }

  /** Proxies {@link CountryCodeNodeModule#provideCountryCodeNode()}. */
  public static CountryCodeNode proxyProvideCountryCodeNode(CountryCodeNodeModule instance) {
    return instance.provideCountryCodeNode();
  }
}
