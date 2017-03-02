package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RealEstateNodeChildProvider_MembersInjector
    implements MembersInjector<RealEstateNodeChildProvider> {
  private final MembersInjector<PropertyNode> propertyNodeInjectorMembersInjector;

  private final MembersInjector<UsageNode> usageNodeInjectorMembersInjector;

  private final MembersInjector<AccessNode> accessNodeInjectorMembersInjector;

  public RealEstateNodeChildProvider_MembersInjector(
      MembersInjector<PropertyNode> propertyNodeInjectorMembersInjector,
      MembersInjector<UsageNode> usageNodeInjectorMembersInjector,
      MembersInjector<AccessNode> accessNodeInjectorMembersInjector) {
    assert propertyNodeInjectorMembersInjector != null;
    this.propertyNodeInjectorMembersInjector = propertyNodeInjectorMembersInjector;
    assert usageNodeInjectorMembersInjector != null;
    this.usageNodeInjectorMembersInjector = usageNodeInjectorMembersInjector;
    assert accessNodeInjectorMembersInjector != null;
    this.accessNodeInjectorMembersInjector = accessNodeInjectorMembersInjector;
  }

  public static MembersInjector<RealEstateNodeChildProvider> create(
      MembersInjector<PropertyNode> propertyNodeInjectorMembersInjector,
      MembersInjector<UsageNode> usageNodeInjectorMembersInjector,
      MembersInjector<AccessNode> accessNodeInjectorMembersInjector) {
    return new RealEstateNodeChildProvider_MembersInjector(
        propertyNodeInjectorMembersInjector,
        usageNodeInjectorMembersInjector,
        accessNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(RealEstateNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.propertyNodeInjector = propertyNodeInjectorMembersInjector;
    instance.usageNodeInjector = usageNodeInjectorMembersInjector;
    instance.accessNodeInjector = accessNodeInjectorMembersInjector;
  }

  public static void injectPropertyNodeInjector(
      RealEstateNodeChildProvider instance, MembersInjector<PropertyNode> propertyNodeInjector) {
    instance.propertyNodeInjector = propertyNodeInjector;
  }

  public static void injectUsageNodeInjector(
      RealEstateNodeChildProvider instance, MembersInjector<UsageNode> usageNodeInjector) {
    instance.usageNodeInjector = usageNodeInjector;
  }

  public static void injectAccessNodeInjector(
      RealEstateNodeChildProvider instance, MembersInjector<AccessNode> accessNodeInjector) {
    instance.accessNodeInjector = accessNodeInjector;
  }
}
