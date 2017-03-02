package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyContactNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactNode_MembersInjector
    implements MembersInjector<CompanyContactNode> {
  private final Provider<BaseContactNodeChildProvider> providerProvider;

  private final Provider<CompanyContactNodeChildProvider> providerProvider2;

  private final Provider<CompanyContactNodeComponent.Builder> builderProvider;

  public CompanyContactNode_MembersInjector(
      Provider<BaseContactNodeChildProvider> providerProvider,
      Provider<CompanyContactNodeChildProvider> providerProvider2,
      Provider<CompanyContactNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert providerProvider2 != null;
    this.providerProvider2 = providerProvider2;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyContactNode> create(
      Provider<BaseContactNodeChildProvider> providerProvider,
      Provider<CompanyContactNodeChildProvider> providerProvider2,
      Provider<CompanyContactNodeComponent.Builder> builderProvider) {
    return new CompanyContactNode_MembersInjector(
        providerProvider, providerProvider2, builderProvider);
  }

  @Override
  public void injectMembers(CompanyContactNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseContactNode) instance).receiveNodeProvider(providerProvider.get());
    instance.receiveNodeProvider(providerProvider2.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      CompanyContactNode instance, Provider<CompanyContactNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      CompanyContactNode instance, Provider<CompanyContactNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
