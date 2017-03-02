package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TrustNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustNameNodeModule_ProvideTrustNameNodeFactory
    implements Factory<TrustNameNode> {
  private final TrustNameNodeModule module;

  public TrustNameNodeModule_ProvideTrustNameNodeFactory(TrustNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TrustNameNode get() {
    return Preconditions.checkNotNull(
        module.provideTrustNameNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TrustNameNode> create(TrustNameNodeModule module) {
    return new TrustNameNodeModule_ProvideTrustNameNodeFactory(module);
  }

  /** Proxies {@link TrustNameNodeModule#provideTrustNameNode()}. */
  public static TrustNameNode proxyProvideTrustNameNode(TrustNameNodeModule instance) {
    return instance.provideTrustNameNode();
  }
}
