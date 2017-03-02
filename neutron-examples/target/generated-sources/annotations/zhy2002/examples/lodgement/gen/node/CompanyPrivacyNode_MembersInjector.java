package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyPrivacyNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyPrivacyNode_MembersInjector
    implements MembersInjector<CompanyPrivacyNode> {
  private final Provider<BasePrivacyNodeChildProvider> providerProvider;

  private final Provider<CompanyPrivacyNodeComponent.Builder> builderProvider;

  public CompanyPrivacyNode_MembersInjector(
      Provider<BasePrivacyNodeChildProvider> providerProvider,
      Provider<CompanyPrivacyNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyPrivacyNode> create(
      Provider<BasePrivacyNodeChildProvider> providerProvider,
      Provider<CompanyPrivacyNodeComponent.Builder> builderProvider) {
    return new CompanyPrivacyNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(CompanyPrivacyNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BasePrivacyNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyPrivacyNode instance, Provider<CompanyPrivacyNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
