package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyNodeChildProvider_Factory implements Factory<PropertyNodeChildProvider> {
  private final MembersInjector<PropertyNodeChildProvider> propertyNodeChildProviderMembersInjector;

  public PropertyNodeChildProvider_Factory(
      MembersInjector<PropertyNodeChildProvider> propertyNodeChildProviderMembersInjector) {
    assert propertyNodeChildProviderMembersInjector != null;
    this.propertyNodeChildProviderMembersInjector = propertyNodeChildProviderMembersInjector;
  }

  @Override
  public PropertyNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        propertyNodeChildProviderMembersInjector, new PropertyNodeChildProvider());
  }

  public static Factory<PropertyNodeChildProvider> create(
      MembersInjector<PropertyNodeChildProvider> propertyNodeChildProviderMembersInjector) {
    return new PropertyNodeChildProvider_Factory(propertyNodeChildProviderMembersInjector);
  }
}
