package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyNode_MembersInjector implements MembersInjector<CompanyNode> {
  private final Provider<CompanyNodeChildProvider> providerProvider;

  private final Provider<CompanyNodeComponent.Builder> builderProvider;

  public CompanyNode_MembersInjector(
      Provider<CompanyNodeChildProvider> providerProvider,
      Provider<CompanyNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyNode> create(
      Provider<CompanyNodeChildProvider> providerProvider,
      Provider<CompanyNodeComponent.Builder> builderProvider) {
    return new CompanyNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(CompanyNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      CompanyNode instance, Provider<CompanyNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      CompanyNode instance, Provider<CompanyNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
