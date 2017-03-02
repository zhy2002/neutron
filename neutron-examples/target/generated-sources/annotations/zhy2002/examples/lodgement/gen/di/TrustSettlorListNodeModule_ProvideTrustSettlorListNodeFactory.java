package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TrustSettlorListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustSettlorListNodeModule_ProvideTrustSettlorListNodeFactory
    implements Factory<TrustSettlorListNode> {
  private final TrustSettlorListNodeModule module;

  public TrustSettlorListNodeModule_ProvideTrustSettlorListNodeFactory(
      TrustSettlorListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TrustSettlorListNode get() {
    return Preconditions.checkNotNull(
        module.provideTrustSettlorListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TrustSettlorListNode> create(TrustSettlorListNodeModule module) {
    return new TrustSettlorListNodeModule_ProvideTrustSettlorListNodeFactory(module);
  }

  /** Proxies {@link TrustSettlorListNodeModule#provideTrustSettlorListNode()}. */
  public static TrustSettlorListNode proxyProvideTrustSettlorListNode(
      TrustSettlorListNodeModule instance) {
    return instance.provideTrustSettlorListNode();
  }
}
