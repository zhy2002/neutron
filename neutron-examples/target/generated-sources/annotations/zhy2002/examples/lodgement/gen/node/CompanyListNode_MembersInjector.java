package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyListNode_MembersInjector implements MembersInjector<CompanyListNode> {
  private final Provider<CompanyListNodeItemProvider> providerProvider;

  private final Provider<CompanyListNodeComponent.Builder> builderProvider;

  public CompanyListNode_MembersInjector(
      Provider<CompanyListNodeItemProvider> providerProvider,
      Provider<CompanyListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyListNode> create(
      Provider<CompanyListNodeItemProvider> providerProvider,
      Provider<CompanyListNodeComponent.Builder> builderProvider) {
    return new CompanyListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(CompanyListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      CompanyListNode instance, Provider<CompanyListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      CompanyListNode instance, Provider<CompanyListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
