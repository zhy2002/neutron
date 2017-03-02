package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TrustTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustTypeNodeModule_ProvideTrustTypeNodeFactory
    implements Factory<TrustTypeNode> {
  private final TrustTypeNodeModule module;

  public TrustTypeNodeModule_ProvideTrustTypeNodeFactory(TrustTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TrustTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideTrustTypeNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TrustTypeNode> create(TrustTypeNodeModule module) {
    return new TrustTypeNodeModule_ProvideTrustTypeNodeFactory(module);
  }

  /** Proxies {@link TrustTypeNodeModule#provideTrustTypeNode()}. */
  public static TrustTypeNode proxyProvideTrustTypeNode(TrustTypeNodeModule instance) {
    return instance.provideTrustTypeNode();
  }
}
