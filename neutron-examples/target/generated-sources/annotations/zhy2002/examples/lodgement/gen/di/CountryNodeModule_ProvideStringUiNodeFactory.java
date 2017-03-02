package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CountryNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final CountryNodeModule module;

  public CountryNodeModule_ProvideStringUiNodeFactory(CountryNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(CountryNodeModule module) {
    return new CountryNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link CountryNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(CountryNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
