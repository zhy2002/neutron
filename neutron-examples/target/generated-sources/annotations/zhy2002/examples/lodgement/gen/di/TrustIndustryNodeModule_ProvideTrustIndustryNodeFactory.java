package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TrustIndustryNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustIndustryNodeModule_ProvideTrustIndustryNodeFactory
    implements Factory<TrustIndustryNode> {
  private final TrustIndustryNodeModule module;

  public TrustIndustryNodeModule_ProvideTrustIndustryNodeFactory(TrustIndustryNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TrustIndustryNode get() {
    return Preconditions.checkNotNull(
        module.provideTrustIndustryNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TrustIndustryNode> create(TrustIndustryNodeModule module) {
    return new TrustIndustryNodeModule_ProvideTrustIndustryNodeFactory(module);
  }

  /** Proxies {@link TrustIndustryNodeModule#provideTrustIndustryNode()}. */
  public static TrustIndustryNode proxyProvideTrustIndustryNode(TrustIndustryNodeModule instance) {
    return instance.provideTrustIndustryNode();
  }
}
