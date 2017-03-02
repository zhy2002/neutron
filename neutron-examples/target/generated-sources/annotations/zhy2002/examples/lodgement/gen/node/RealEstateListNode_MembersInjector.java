package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.RealEstateListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RealEstateListNode_MembersInjector
    implements MembersInjector<RealEstateListNode> {
  private final Provider<RealEstateListNodeItemProvider> providerProvider;

  private final Provider<RealEstateListNodeComponent.Builder> builderProvider;

  public RealEstateListNode_MembersInjector(
      Provider<RealEstateListNodeItemProvider> providerProvider,
      Provider<RealEstateListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<RealEstateListNode> create(
      Provider<RealEstateListNodeItemProvider> providerProvider,
      Provider<RealEstateListNodeComponent.Builder> builderProvider) {
    return new RealEstateListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(RealEstateListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      RealEstateListNode instance, Provider<RealEstateListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      RealEstateListNode instance, Provider<RealEstateListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
