package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.RealEstateNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RealEstateNode_MembersInjector implements MembersInjector<RealEstateNode> {
  private final Provider<RealEstateNodeChildProvider> providerProvider;

  private final Provider<RealEstateNodeComponent.Builder> builderProvider;

  public RealEstateNode_MembersInjector(
      Provider<RealEstateNodeChildProvider> providerProvider,
      Provider<RealEstateNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<RealEstateNode> create(
      Provider<RealEstateNodeChildProvider> providerProvider,
      Provider<RealEstateNodeComponent.Builder> builderProvider) {
    return new RealEstateNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(RealEstateNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      RealEstateNode instance, Provider<RealEstateNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      RealEstateNode instance, Provider<RealEstateNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
