package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PropertyNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyNode_MembersInjector implements MembersInjector<PropertyNode> {
  private final Provider<PropertyNodeChildProvider> providerProvider;

  private final Provider<PropertyNodeComponent.Builder> builderProvider;

  public PropertyNode_MembersInjector(
      Provider<PropertyNodeChildProvider> providerProvider,
      Provider<PropertyNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PropertyNode> create(
      Provider<PropertyNodeChildProvider> providerProvider,
      Provider<PropertyNodeComponent.Builder> builderProvider) {
    return new PropertyNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(PropertyNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      PropertyNode instance, Provider<PropertyNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      PropertyNode instance, Provider<PropertyNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
