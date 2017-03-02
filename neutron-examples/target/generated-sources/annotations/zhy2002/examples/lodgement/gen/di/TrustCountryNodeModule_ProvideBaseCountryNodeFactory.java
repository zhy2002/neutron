package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCountryNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustCountryNodeModule_ProvideBaseCountryNodeFactory
    implements Factory<BaseCountryNode<?>> {
  private final TrustCountryNodeModule module;

  public TrustCountryNodeModule_ProvideBaseCountryNodeFactory(TrustCountryNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCountryNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCountryNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCountryNode<?>> create(TrustCountryNodeModule module) {
    return new TrustCountryNodeModule_ProvideBaseCountryNodeFactory(module);
  }

  /** Proxies {@link TrustCountryNodeModule#provideBaseCountryNode()}. */
  public static BaseCountryNode<?> proxyProvideBaseCountryNode(TrustCountryNodeModule instance) {
    return instance.provideBaseCountryNode();
  }
}
