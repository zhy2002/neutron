package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TrustBeneficiaryClassNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryClassNodeModule_ProvideTrustBeneficiaryClassNodeFactory
    implements Factory<TrustBeneficiaryClassNode> {
  private final TrustBeneficiaryClassNodeModule module;

  public TrustBeneficiaryClassNodeModule_ProvideTrustBeneficiaryClassNodeFactory(
      TrustBeneficiaryClassNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TrustBeneficiaryClassNode get() {
    return Preconditions.checkNotNull(
        module.provideTrustBeneficiaryClassNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TrustBeneficiaryClassNode> create(TrustBeneficiaryClassNodeModule module) {
    return new TrustBeneficiaryClassNodeModule_ProvideTrustBeneficiaryClassNodeFactory(module);
  }

  /** Proxies {@link TrustBeneficiaryClassNodeModule#provideTrustBeneficiaryClassNode()}. */
  public static TrustBeneficiaryClassNode proxyProvideTrustBeneficiaryClassNode(
      TrustBeneficiaryClassNodeModule instance) {
    return instance.provideTrustBeneficiaryClassNode();
  }
}
