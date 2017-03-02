package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PropertyOwnershipListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyOwnershipListNode_MembersInjector
    implements MembersInjector<PropertyOwnershipListNode> {
  private final Provider<OwnershipListNodeItemProvider> providerProvider;

  private final Provider<PropertyOwnershipListNodeComponent.Builder> builderProvider;

  public PropertyOwnershipListNode_MembersInjector(
      Provider<OwnershipListNodeItemProvider> providerProvider,
      Provider<PropertyOwnershipListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PropertyOwnershipListNode> create(
      Provider<OwnershipListNodeItemProvider> providerProvider,
      Provider<PropertyOwnershipListNodeComponent.Builder> builderProvider) {
    return new PropertyOwnershipListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(PropertyOwnershipListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((OwnershipListNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PropertyOwnershipListNode instance,
      Provider<PropertyOwnershipListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
