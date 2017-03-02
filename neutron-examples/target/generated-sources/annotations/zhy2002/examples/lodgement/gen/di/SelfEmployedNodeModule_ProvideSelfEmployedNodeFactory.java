package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SelfEmployedNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelfEmployedNodeModule_ProvideSelfEmployedNodeFactory
    implements Factory<SelfEmployedNode> {
  private final SelfEmployedNodeModule module;

  public SelfEmployedNodeModule_ProvideSelfEmployedNodeFactory(SelfEmployedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SelfEmployedNode get() {
    return Preconditions.checkNotNull(
        module.provideSelfEmployedNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SelfEmployedNode> create(SelfEmployedNodeModule module) {
    return new SelfEmployedNodeModule_ProvideSelfEmployedNodeFactory(module);
  }

  /** Proxies {@link SelfEmployedNodeModule#provideSelfEmployedNode()}. */
  public static SelfEmployedNode proxyProvideSelfEmployedNode(SelfEmployedNodeModule instance) {
    return instance.provideSelfEmployedNode();
  }
}
