package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.LiabilitiesNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LiabilitiesNode_MembersInjector implements MembersInjector<LiabilitiesNode> {
  private final Provider<LiabilitiesNodeChildProvider> providerProvider;

  private final Provider<LiabilitiesNodeComponent.Builder> builderProvider;

  public LiabilitiesNode_MembersInjector(
      Provider<LiabilitiesNodeChildProvider> providerProvider,
      Provider<LiabilitiesNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<LiabilitiesNode> create(
      Provider<LiabilitiesNodeChildProvider> providerProvider,
      Provider<LiabilitiesNodeComponent.Builder> builderProvider) {
    return new LiabilitiesNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(LiabilitiesNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      LiabilitiesNode instance, Provider<LiabilitiesNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      LiabilitiesNode instance, Provider<LiabilitiesNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
