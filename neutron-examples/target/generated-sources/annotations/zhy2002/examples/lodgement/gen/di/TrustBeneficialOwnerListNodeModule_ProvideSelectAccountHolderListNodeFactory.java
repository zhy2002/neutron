package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficialOwnerListNodeModule_ProvideSelectAccountHolderListNodeFactory
    implements Factory<SelectAccountHolderListNode<?>> {
  private final TrustBeneficialOwnerListNodeModule module;

  public TrustBeneficialOwnerListNodeModule_ProvideSelectAccountHolderListNodeFactory(
      TrustBeneficialOwnerListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SelectAccountHolderListNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideSelectAccountHolderListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SelectAccountHolderListNode<?>> create(
      TrustBeneficialOwnerListNodeModule module) {
    return new TrustBeneficialOwnerListNodeModule_ProvideSelectAccountHolderListNodeFactory(module);
  }

  /** Proxies {@link TrustBeneficialOwnerListNodeModule#provideSelectAccountHolderListNode()}. */
  public static SelectAccountHolderListNode<?> proxyProvideSelectAccountHolderListNode(
      TrustBeneficialOwnerListNodeModule instance) {
    return instance.provideSelectAccountHolderListNode();
  }
}
