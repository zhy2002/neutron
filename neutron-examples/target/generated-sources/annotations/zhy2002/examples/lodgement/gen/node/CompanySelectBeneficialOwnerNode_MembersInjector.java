package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanySelectBeneficialOwnerNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanySelectBeneficialOwnerNode_MembersInjector
    implements MembersInjector<CompanySelectBeneficialOwnerNode> {
  private final Provider<SelectRelatedPersonListNodeItemProvider> providerProvider;

  private final Provider<CompanySelectBeneficialOwnerNodeComponent.Builder> builderProvider;

  public CompanySelectBeneficialOwnerNode_MembersInjector(
      Provider<SelectRelatedPersonListNodeItemProvider> providerProvider,
      Provider<CompanySelectBeneficialOwnerNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanySelectBeneficialOwnerNode> create(
      Provider<SelectRelatedPersonListNodeItemProvider> providerProvider,
      Provider<CompanySelectBeneficialOwnerNodeComponent.Builder> builderProvider) {
    return new CompanySelectBeneficialOwnerNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(CompanySelectBeneficialOwnerNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((SelectRelatedPersonListNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanySelectBeneficialOwnerNode instance,
      Provider<CompanySelectBeneficialOwnerNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
