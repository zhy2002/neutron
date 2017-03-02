package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TrustBeneficiaryListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryListNodeModule_ProvideTrustBeneficiaryListNodeFactory
    implements Factory<TrustBeneficiaryListNode> {
  private final TrustBeneficiaryListNodeModule module;

  public TrustBeneficiaryListNodeModule_ProvideTrustBeneficiaryListNodeFactory(
      TrustBeneficiaryListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TrustBeneficiaryListNode get() {
    return Preconditions.checkNotNull(
        module.provideTrustBeneficiaryListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TrustBeneficiaryListNode> create(TrustBeneficiaryListNodeModule module) {
    return new TrustBeneficiaryListNodeModule_ProvideTrustBeneficiaryListNodeFactory(module);
  }

  /** Proxies {@link TrustBeneficiaryListNodeModule#provideTrustBeneficiaryListNode()}. */
  public static TrustBeneficiaryListNode proxyProvideTrustBeneficiaryListNode(
      TrustBeneficiaryListNodeModule instance) {
    return instance.provideTrustBeneficiaryListNode();
  }
}
