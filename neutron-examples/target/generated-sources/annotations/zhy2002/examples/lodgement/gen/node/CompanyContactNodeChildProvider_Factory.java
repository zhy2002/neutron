package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactNodeChildProvider_Factory
    implements Factory<CompanyContactNodeChildProvider> {
  private final MembersInjector<CompanyContactNodeChildProvider>
      companyContactNodeChildProviderMembersInjector;

  public CompanyContactNodeChildProvider_Factory(
      MembersInjector<CompanyContactNodeChildProvider>
          companyContactNodeChildProviderMembersInjector) {
    assert companyContactNodeChildProviderMembersInjector != null;
    this.companyContactNodeChildProviderMembersInjector =
        companyContactNodeChildProviderMembersInjector;
  }

  @Override
  public CompanyContactNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        companyContactNodeChildProviderMembersInjector, new CompanyContactNodeChildProvider());
  }

  public static Factory<CompanyContactNodeChildProvider> create(
      MembersInjector<CompanyContactNodeChildProvider>
          companyContactNodeChildProviderMembersInjector) {
    return new CompanyContactNodeChildProvider_Factory(
        companyContactNodeChildProviderMembersInjector);
  }
}
