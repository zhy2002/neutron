package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CountryCodeNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final CountryCodeNodeModule module;

  public CountryCodeNodeModule_ProvideStringUiNodeFactory(CountryCodeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(CountryCodeNodeModule module) {
    return new CountryCodeNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link CountryCodeNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(CountryCodeNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
