package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TrustBeneficialOwnerListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficialOwnerListNodeModule_ProvideTrustBeneficialOwnerListNodeFactory
    implements Factory<TrustBeneficialOwnerListNode> {
  private final TrustBeneficialOwnerListNodeModule module;

  public TrustBeneficialOwnerListNodeModule_ProvideTrustBeneficialOwnerListNodeFactory(
      TrustBeneficialOwnerListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TrustBeneficialOwnerListNode get() {
    return Preconditions.checkNotNull(
        module.provideTrustBeneficialOwnerListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TrustBeneficialOwnerListNode> create(
      TrustBeneficialOwnerListNodeModule module) {
    return new TrustBeneficialOwnerListNodeModule_ProvideTrustBeneficialOwnerListNodeFactory(
        module);
  }

  /** Proxies {@link TrustBeneficialOwnerListNodeModule#provideTrustBeneficialOwnerListNode()}. */
  public static TrustBeneficialOwnerListNode proxyProvideTrustBeneficialOwnerListNode(
      TrustBeneficialOwnerListNodeModule instance) {
    return instance.provideTrustBeneficialOwnerListNode();
  }
}
