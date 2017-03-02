package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SelectRelatedPersonListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanySelectBeneficialOwnerNodeModule_ProvideSelectRelatedPersonListNodeFactory
    implements Factory<SelectRelatedPersonListNode<?>> {
  private final CompanySelectBeneficialOwnerNodeModule module;

  public CompanySelectBeneficialOwnerNodeModule_ProvideSelectRelatedPersonListNodeFactory(
      CompanySelectBeneficialOwnerNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SelectRelatedPersonListNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideSelectRelatedPersonListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SelectRelatedPersonListNode<?>> create(
      CompanySelectBeneficialOwnerNodeModule module) {
    return new CompanySelectBeneficialOwnerNodeModule_ProvideSelectRelatedPersonListNodeFactory(
        module);
  }

  /**
   * Proxies {@link CompanySelectBeneficialOwnerNodeModule#provideSelectRelatedPersonListNode()}.
   */
  public static SelectRelatedPersonListNode<?> proxyProvideSelectRelatedPersonListNode(
      CompanySelectBeneficialOwnerNodeModule instance) {
    return instance.provideSelectRelatedPersonListNode();
  }
}
