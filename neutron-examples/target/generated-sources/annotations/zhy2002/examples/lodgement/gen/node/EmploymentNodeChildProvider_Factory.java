package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentNodeChildProvider_Factory
    implements Factory<EmploymentNodeChildProvider> {
  private final MembersInjector<EmploymentNodeChildProvider>
      employmentNodeChildProviderMembersInjector;

  public EmploymentNodeChildProvider_Factory(
      MembersInjector<EmploymentNodeChildProvider> employmentNodeChildProviderMembersInjector) {
    assert employmentNodeChildProviderMembersInjector != null;
    this.employmentNodeChildProviderMembersInjector = employmentNodeChildProviderMembersInjector;
  }

  @Override
  public EmploymentNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        employmentNodeChildProviderMembersInjector, new EmploymentNodeChildProvider());
  }

  public static Factory<EmploymentNodeChildProvider> create(
      MembersInjector<EmploymentNodeChildProvider> employmentNodeChildProviderMembersInjector) {
    return new EmploymentNodeChildProvider_Factory(employmentNodeChildProviderMembersInjector);
  }
}
