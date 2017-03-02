package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationNodeClassRegistry_Factory
    implements Factory<ApplicationNodeClassRegistry> {
  private final MembersInjector<ApplicationNodeClassRegistry>
      applicationNodeClassRegistryMembersInjector;

  public ApplicationNodeClassRegistry_Factory(
      MembersInjector<ApplicationNodeClassRegistry> applicationNodeClassRegistryMembersInjector) {
    assert applicationNodeClassRegistryMembersInjector != null;
    this.applicationNodeClassRegistryMembersInjector = applicationNodeClassRegistryMembersInjector;
  }

  @Override
  public ApplicationNodeClassRegistry get() {
    return MembersInjectors.injectMembers(
        applicationNodeClassRegistryMembersInjector, new ApplicationNodeClassRegistry());
  }

  public static Factory<ApplicationNodeClassRegistry> create(
      MembersInjector<ApplicationNodeClassRegistry> applicationNodeClassRegistryMembersInjector) {
    return new ApplicationNodeClassRegistry_Factory(applicationNodeClassRegistryMembersInjector);
  }
}
