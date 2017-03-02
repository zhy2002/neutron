package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployedNodeChildProvider_Factory implements Factory<EmployedNodeChildProvider> {
  private final MembersInjector<EmployedNodeChildProvider> employedNodeChildProviderMembersInjector;

  public EmployedNodeChildProvider_Factory(
      MembersInjector<EmployedNodeChildProvider> employedNodeChildProviderMembersInjector) {
    assert employedNodeChildProviderMembersInjector != null;
    this.employedNodeChildProviderMembersInjector = employedNodeChildProviderMembersInjector;
  }

  @Override
  public EmployedNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        employedNodeChildProviderMembersInjector, new EmployedNodeChildProvider());
  }

  public static Factory<EmployedNodeChildProvider> create(
      MembersInjector<EmployedNodeChildProvider> employedNodeChildProviderMembersInjector) {
    return new EmployedNodeChildProvider_Factory(employedNodeChildProviderMembersInjector);
  }
}
