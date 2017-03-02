package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyDetailsNodeChildProvider_Factory
    implements Factory<PropertyDetailsNodeChildProvider> {
  private final MembersInjector<PropertyDetailsNodeChildProvider>
      propertyDetailsNodeChildProviderMembersInjector;

  public PropertyDetailsNodeChildProvider_Factory(
      MembersInjector<PropertyDetailsNodeChildProvider>
          propertyDetailsNodeChildProviderMembersInjector) {
    assert propertyDetailsNodeChildProviderMembersInjector != null;
    this.propertyDetailsNodeChildProviderMembersInjector =
        propertyDetailsNodeChildProviderMembersInjector;
  }

  @Override
  public PropertyDetailsNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        propertyDetailsNodeChildProviderMembersInjector, new PropertyDetailsNodeChildProvider());
  }

  public static Factory<PropertyDetailsNodeChildProvider> create(
      MembersInjector<PropertyDetailsNodeChildProvider>
          propertyDetailsNodeChildProviderMembersInjector) {
    return new PropertyDetailsNodeChildProvider_Factory(
        propertyDetailsNodeChildProviderMembersInjector);
  }
}
