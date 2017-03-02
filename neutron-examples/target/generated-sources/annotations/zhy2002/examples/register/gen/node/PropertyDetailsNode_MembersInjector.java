package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.PropertyDetailsNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyDetailsNode_MembersInjector
    implements MembersInjector<PropertyDetailsNode> {
  private final Provider<PropertyDetailsNodeChildProvider> providerProvider;

  private final Provider<PropertyDetailsNodeComponent.Builder> builderProvider;

  public PropertyDetailsNode_MembersInjector(
      Provider<PropertyDetailsNodeChildProvider> providerProvider,
      Provider<PropertyDetailsNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PropertyDetailsNode> create(
      Provider<PropertyDetailsNodeChildProvider> providerProvider,
      Provider<PropertyDetailsNodeComponent.Builder> builderProvider) {
    return new PropertyDetailsNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(PropertyDetailsNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      PropertyDetailsNode instance, Provider<PropertyDetailsNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      PropertyDetailsNode instance,
      Provider<PropertyDetailsNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
