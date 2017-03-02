package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AdditionalNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AdditionalNode_MembersInjector implements MembersInjector<AdditionalNode> {
  private final Provider<AdditionalNodeChildProvider> providerProvider;

  private final Provider<AdditionalNodeComponent.Builder> builderProvider;

  public AdditionalNode_MembersInjector(
      Provider<AdditionalNodeChildProvider> providerProvider,
      Provider<AdditionalNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AdditionalNode> create(
      Provider<AdditionalNodeChildProvider> providerProvider,
      Provider<AdditionalNodeComponent.Builder> builderProvider) {
    return new AdditionalNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(AdditionalNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      AdditionalNode instance, Provider<AdditionalNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      AdditionalNode instance, Provider<AdditionalNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
