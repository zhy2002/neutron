package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyTrustNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyTrustNode_MembersInjector implements MembersInjector<CompanyTrustNode> {
  private final Provider<BaseTrustNodeChildProvider> providerProvider;

  private final Provider<CompanyTrustNodeComponent.Builder> builderProvider;

  public CompanyTrustNode_MembersInjector(
      Provider<BaseTrustNodeChildProvider> providerProvider,
      Provider<CompanyTrustNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyTrustNode> create(
      Provider<BaseTrustNodeChildProvider> providerProvider,
      Provider<CompanyTrustNodeComponent.Builder> builderProvider) {
    return new CompanyTrustNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(CompanyTrustNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseTrustNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyTrustNode instance, Provider<CompanyTrustNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
