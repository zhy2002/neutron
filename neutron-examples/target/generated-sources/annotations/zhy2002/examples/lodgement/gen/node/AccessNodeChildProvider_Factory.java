package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessNodeChildProvider_Factory implements Factory<AccessNodeChildProvider> {
  private final MembersInjector<AccessNodeChildProvider> accessNodeChildProviderMembersInjector;

  public AccessNodeChildProvider_Factory(
      MembersInjector<AccessNodeChildProvider> accessNodeChildProviderMembersInjector) {
    assert accessNodeChildProviderMembersInjector != null;
    this.accessNodeChildProviderMembersInjector = accessNodeChildProviderMembersInjector;
  }

  @Override
  public AccessNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        accessNodeChildProviderMembersInjector, new AccessNodeChildProvider());
  }

  public static Factory<AccessNodeChildProvider> create(
      MembersInjector<AccessNodeChildProvider> accessNodeChildProviderMembersInjector) {
    return new AccessNodeChildProvider_Factory(accessNodeChildProviderMembersInjector);
  }
}
