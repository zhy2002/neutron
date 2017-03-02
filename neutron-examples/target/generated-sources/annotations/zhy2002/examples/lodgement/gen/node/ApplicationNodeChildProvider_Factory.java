package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationNodeChildProvider_Factory
    implements Factory<ApplicationNodeChildProvider> {
  private final MembersInjector<ApplicationNodeChildProvider>
      applicationNodeChildProviderMembersInjector;

  public ApplicationNodeChildProvider_Factory(
      MembersInjector<ApplicationNodeChildProvider> applicationNodeChildProviderMembersInjector) {
    assert applicationNodeChildProviderMembersInjector != null;
    this.applicationNodeChildProviderMembersInjector = applicationNodeChildProviderMembersInjector;
  }

  @Override
  public ApplicationNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        applicationNodeChildProviderMembersInjector, new ApplicationNodeChildProvider());
  }

  public static Factory<ApplicationNodeChildProvider> create(
      MembersInjector<ApplicationNodeChildProvider> applicationNodeChildProviderMembersInjector) {
    return new ApplicationNodeChildProvider_Factory(applicationNodeChildProviderMembersInjector);
  }
}
