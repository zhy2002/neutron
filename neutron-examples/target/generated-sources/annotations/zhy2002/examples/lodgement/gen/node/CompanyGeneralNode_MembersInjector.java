package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyGeneralNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyGeneralNode_MembersInjector
    implements MembersInjector<CompanyGeneralNode> {
  private final Provider<CompanyGeneralNodeChildProvider> providerProvider;

  private final Provider<CompanyGeneralNodeComponent.Builder> builderProvider;

  public CompanyGeneralNode_MembersInjector(
      Provider<CompanyGeneralNodeChildProvider> providerProvider,
      Provider<CompanyGeneralNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyGeneralNode> create(
      Provider<CompanyGeneralNodeChildProvider> providerProvider,
      Provider<CompanyGeneralNodeComponent.Builder> builderProvider) {
    return new CompanyGeneralNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(CompanyGeneralNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      CompanyGeneralNode instance, Provider<CompanyGeneralNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      CompanyGeneralNode instance, Provider<CompanyGeneralNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
