package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyResponsibleLendNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyResponsibleLendNode_MembersInjector
    implements MembersInjector<CompanyResponsibleLendNode> {
  private final Provider<BaseResponsibleLendNodeChildProvider> providerProvider;

  private final Provider<CompanyResponsibleLendNodeComponent.Builder> builderProvider;

  public CompanyResponsibleLendNode_MembersInjector(
      Provider<BaseResponsibleLendNodeChildProvider> providerProvider,
      Provider<CompanyResponsibleLendNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyResponsibleLendNode> create(
      Provider<BaseResponsibleLendNodeChildProvider> providerProvider,
      Provider<CompanyResponsibleLendNodeComponent.Builder> builderProvider) {
    return new CompanyResponsibleLendNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(CompanyResponsibleLendNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseResponsibleLendNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyResponsibleLendNode instance,
      Provider<CompanyResponsibleLendNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
