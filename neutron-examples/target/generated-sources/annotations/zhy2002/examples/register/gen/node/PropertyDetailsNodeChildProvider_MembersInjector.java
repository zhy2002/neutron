package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyDetailsNodeChildProvider_MembersInjector
    implements MembersInjector<PropertyDetailsNodeChildProvider> {
  private final MembersInjector<PropertyAddressNode> propertyAddressNodeInjectorMembersInjector;

  private final MembersInjector<PropertyStateNode> propertyStateNodeInjectorMembersInjector;

  public PropertyDetailsNodeChildProvider_MembersInjector(
      MembersInjector<PropertyAddressNode> propertyAddressNodeInjectorMembersInjector,
      MembersInjector<PropertyStateNode> propertyStateNodeInjectorMembersInjector) {
    assert propertyAddressNodeInjectorMembersInjector != null;
    this.propertyAddressNodeInjectorMembersInjector = propertyAddressNodeInjectorMembersInjector;
    assert propertyStateNodeInjectorMembersInjector != null;
    this.propertyStateNodeInjectorMembersInjector = propertyStateNodeInjectorMembersInjector;
  }

  public static MembersInjector<PropertyDetailsNodeChildProvider> create(
      MembersInjector<PropertyAddressNode> propertyAddressNodeInjectorMembersInjector,
      MembersInjector<PropertyStateNode> propertyStateNodeInjectorMembersInjector) {
    return new PropertyDetailsNodeChildProvider_MembersInjector(
        propertyAddressNodeInjectorMembersInjector, propertyStateNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(PropertyDetailsNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.propertyAddressNodeInjector = propertyAddressNodeInjectorMembersInjector;
    instance.propertyStateNodeInjector = propertyStateNodeInjectorMembersInjector;
  }

  public static void injectPropertyAddressNodeInjector(
      PropertyDetailsNodeChildProvider instance,
      MembersInjector<PropertyAddressNode> propertyAddressNodeInjector) {
    instance.propertyAddressNodeInjector = propertyAddressNodeInjector;
  }

  public static void injectPropertyStateNodeInjector(
      PropertyDetailsNodeChildProvider instance,
      MembersInjector<PropertyStateNode> propertyStateNodeInjector) {
    instance.propertyStateNodeInjector = propertyStateNodeInjector;
  }
}
