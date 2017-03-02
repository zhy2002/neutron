package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryListNodeModule_ProvideSelectAccountHolderListNodeFactory
    implements Factory<SelectAccountHolderListNode<?>> {
  private final TrustBeneficiaryListNodeModule module;

  public TrustBeneficiaryListNodeModule_ProvideSelectAccountHolderListNodeFactory(
      TrustBeneficiaryListNodeModule module) {
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
      TrustBeneficiaryListNodeModule module) {
    return new TrustBeneficiaryListNodeModule_ProvideSelectAccountHolderListNodeFactory(module);
  }

  /** Proxies {@link TrustBeneficiaryListNodeModule#provideSelectAccountHolderListNode()}. */
  public static SelectAccountHolderListNode<?> proxyProvideSelectAccountHolderListNode(
      TrustBeneficiaryListNodeModule instance) {
    return instance.provideSelectAccountHolderListNode();
  }
}
