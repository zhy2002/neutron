package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TrustRegistrationDateNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustRegistrationDateNodeModule_ProvideTrustRegistrationDateNodeFactory
    implements Factory<TrustRegistrationDateNode> {
  private final TrustRegistrationDateNodeModule module;

  public TrustRegistrationDateNodeModule_ProvideTrustRegistrationDateNodeFactory(
      TrustRegistrationDateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TrustRegistrationDateNode get() {
    return Preconditions.checkNotNull(
        module.provideTrustRegistrationDateNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TrustRegistrationDateNode> create(TrustRegistrationDateNodeModule module) {
    return new TrustRegistrationDateNodeModule_ProvideTrustRegistrationDateNodeFactory(module);
  }

  /** Proxies {@link TrustRegistrationDateNodeModule#provideTrustRegistrationDateNode()}. */
  public static TrustRegistrationDateNode proxyProvideTrustRegistrationDateNode(
      TrustRegistrationDateNodeModule instance) {
    return instance.provideTrustRegistrationDateNode();
  }
}
