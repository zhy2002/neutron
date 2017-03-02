package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TrustBeneficiaryClassListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryClassListNodeModule_ProvideTrustBeneficiaryClassListNodeFactory
    implements Factory<TrustBeneficiaryClassListNode> {
  private final TrustBeneficiaryClassListNodeModule module;

  public TrustBeneficiaryClassListNodeModule_ProvideTrustBeneficiaryClassListNodeFactory(
      TrustBeneficiaryClassListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TrustBeneficiaryClassListNode get() {
    return Preconditions.checkNotNull(
        module.provideTrustBeneficiaryClassListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TrustBeneficiaryClassListNode> create(
      TrustBeneficiaryClassListNodeModule module) {
    return new TrustBeneficiaryClassListNodeModule_ProvideTrustBeneficiaryClassListNodeFactory(
        module);
  }

  /** Proxies {@link TrustBeneficiaryClassListNodeModule#provideTrustBeneficiaryClassListNode()}. */
  public static TrustBeneficiaryClassListNode proxyProvideTrustBeneficiaryClassListNode(
      TrustBeneficiaryClassListNodeModule instance) {
    return instance.provideTrustBeneficiaryClassListNode();
  }
}
