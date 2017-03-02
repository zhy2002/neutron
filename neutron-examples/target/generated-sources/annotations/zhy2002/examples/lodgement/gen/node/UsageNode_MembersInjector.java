package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.UsageNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsageNode_MembersInjector implements MembersInjector<UsageNode> {
  private final Provider<UsageNodeChildProvider> providerProvider;

  private final Provider<UsageNodeComponent.Builder> builderProvider;

  public UsageNode_MembersInjector(
      Provider<UsageNodeChildProvider> providerProvider,
      Provider<UsageNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<UsageNode> create(
      Provider<UsageNodeChildProvider> providerProvider,
      Provider<UsageNodeComponent.Builder> builderProvider) {
    return new UsageNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(UsageNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      UsageNode instance, Provider<UsageNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      UsageNode instance, Provider<UsageNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
