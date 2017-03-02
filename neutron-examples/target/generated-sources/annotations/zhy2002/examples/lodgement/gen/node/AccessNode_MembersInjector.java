package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AccessNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessNode_MembersInjector implements MembersInjector<AccessNode> {
  private final Provider<AccessNodeChildProvider> providerProvider;

  private final Provider<AccessNodeComponent.Builder> builderProvider;

  public AccessNode_MembersInjector(
      Provider<AccessNodeChildProvider> providerProvider,
      Provider<AccessNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AccessNode> create(
      Provider<AccessNodeChildProvider> providerProvider,
      Provider<AccessNodeComponent.Builder> builderProvider) {
    return new AccessNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(AccessNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      AccessNode instance, Provider<AccessNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      AccessNode instance, Provider<AccessNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
