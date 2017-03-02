package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.PropertyAddressNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyAddressNode_MembersInjector
    implements MembersInjector<PropertyAddressNode> {
  private final Provider<PropertyAddressNodeComponent.Builder> builderProvider;

  public PropertyAddressNode_MembersInjector(
      Provider<PropertyAddressNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PropertyAddressNode> create(
      Provider<PropertyAddressNodeComponent.Builder> builderProvider) {
    return new PropertyAddressNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PropertyAddressNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PropertyAddressNode instance,
      Provider<PropertyAddressNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
