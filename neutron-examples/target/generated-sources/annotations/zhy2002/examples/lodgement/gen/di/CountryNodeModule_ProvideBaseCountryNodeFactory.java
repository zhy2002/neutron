package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCountryNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CountryNodeModule_ProvideBaseCountryNodeFactory
    implements Factory<BaseCountryNode<?>> {
  private final CountryNodeModule module;

  public CountryNodeModule_ProvideBaseCountryNodeFactory(CountryNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCountryNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCountryNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCountryNode<?>> create(CountryNodeModule module) {
    return new CountryNodeModule_ProvideBaseCountryNodeFactory(module);
  }

  /** Proxies {@link CountryNodeModule#provideBaseCountryNode()}. */
  public static BaseCountryNode<?> proxyProvideBaseCountryNode(CountryNodeModule instance) {
    return instance.provideBaseCountryNode();
  }
}
