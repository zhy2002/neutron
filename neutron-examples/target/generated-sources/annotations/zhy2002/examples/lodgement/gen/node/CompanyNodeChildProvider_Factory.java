package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyNodeChildProvider_Factory implements Factory<CompanyNodeChildProvider> {
  private final MembersInjector<CompanyNodeChildProvider> companyNodeChildProviderMembersInjector;

  public CompanyNodeChildProvider_Factory(
      MembersInjector<CompanyNodeChildProvider> companyNodeChildProviderMembersInjector) {
    assert companyNodeChildProviderMembersInjector != null;
    this.companyNodeChildProviderMembersInjector = companyNodeChildProviderMembersInjector;
  }

  @Override
  public CompanyNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        companyNodeChildProviderMembersInjector, new CompanyNodeChildProvider());
  }

  public static Factory<CompanyNodeChildProvider> create(
      MembersInjector<CompanyNodeChildProvider> companyNodeChildProviderMembersInjector) {
    return new CompanyNodeChildProvider_Factory(companyNodeChildProviderMembersInjector);
  }
}
