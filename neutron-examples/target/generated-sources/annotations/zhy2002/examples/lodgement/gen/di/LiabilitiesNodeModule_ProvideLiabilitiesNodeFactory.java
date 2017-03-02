package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.LiabilitiesNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LiabilitiesNodeModule_ProvideLiabilitiesNodeFactory
    implements Factory<LiabilitiesNode> {
  private final LiabilitiesNodeModule module;

  public LiabilitiesNodeModule_ProvideLiabilitiesNodeFactory(LiabilitiesNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LiabilitiesNode get() {
    return Preconditions.checkNotNull(
        module.provideLiabilitiesNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LiabilitiesNode> create(LiabilitiesNodeModule module) {
    return new LiabilitiesNodeModule_ProvideLiabilitiesNodeFactory(module);
  }

  /** Proxies {@link LiabilitiesNodeModule#provideLiabilitiesNode()}. */
  public static LiabilitiesNode proxyProvideLiabilitiesNode(LiabilitiesNodeModule instance) {
    return instance.provideLiabilitiesNode();
  }
}
