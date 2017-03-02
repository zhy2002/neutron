package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ApplicationNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationNode_MembersInjector implements MembersInjector<ApplicationNode> {
  private final Provider<ApplicationNodeChildProvider> providerProvider;

  private final Provider<ApplicationNodeComponent.Builder> builderProvider;

  public ApplicationNode_MembersInjector(
      Provider<ApplicationNodeChildProvider> providerProvider,
      Provider<ApplicationNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ApplicationNode> create(
      Provider<ApplicationNodeChildProvider> providerProvider,
      Provider<ApplicationNodeComponent.Builder> builderProvider) {
    return new ApplicationNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ApplicationNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      ApplicationNode instance, Provider<ApplicationNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      ApplicationNode instance, Provider<ApplicationNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
