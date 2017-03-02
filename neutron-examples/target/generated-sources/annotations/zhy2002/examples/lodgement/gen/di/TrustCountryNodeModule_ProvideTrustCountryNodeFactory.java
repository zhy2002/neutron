package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TrustCountryNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustCountryNodeModule_ProvideTrustCountryNodeFactory
    implements Factory<TrustCountryNode> {
  private final TrustCountryNodeModule module;

  public TrustCountryNodeModule_ProvideTrustCountryNodeFactory(TrustCountryNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TrustCountryNode get() {
    return Preconditions.checkNotNull(
        module.provideTrustCountryNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TrustCountryNode> create(TrustCountryNodeModule module) {
    return new TrustCountryNodeModule_ProvideTrustCountryNodeFactory(module);
  }

  /** Proxies {@link TrustCountryNodeModule#provideTrustCountryNode()}. */
  public static TrustCountryNode proxyProvideTrustCountryNode(TrustCountryNodeModule instance) {
    return instance.provideTrustCountryNode();
  }
}
