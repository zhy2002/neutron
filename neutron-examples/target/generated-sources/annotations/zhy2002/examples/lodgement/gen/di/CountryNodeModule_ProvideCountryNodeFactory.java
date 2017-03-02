package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CountryNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CountryNodeModule_ProvideCountryNodeFactory implements Factory<CountryNode> {
  private final CountryNodeModule module;

  public CountryNodeModule_ProvideCountryNodeFactory(CountryNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CountryNode get() {
    return Preconditions.checkNotNull(
        module.provideCountryNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CountryNode> create(CountryNodeModule module) {
    return new CountryNodeModule_ProvideCountryNodeFactory(module);
  }

  /** Proxies {@link CountryNodeModule#provideCountryNode()}. */
  public static CountryNode proxyProvideCountryNode(CountryNodeModule instance) {
    return instance.provideCountryNode();
  }
}
