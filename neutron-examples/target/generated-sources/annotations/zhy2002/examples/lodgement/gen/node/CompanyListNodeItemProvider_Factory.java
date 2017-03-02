package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyListNodeItemProvider_Factory
    implements Factory<CompanyListNodeItemProvider> {
  private final MembersInjector<CompanyListNodeItemProvider>
      companyListNodeItemProviderMembersInjector;

  public CompanyListNodeItemProvider_Factory(
      MembersInjector<CompanyListNodeItemProvider> companyListNodeItemProviderMembersInjector) {
    assert companyListNodeItemProviderMembersInjector != null;
    this.companyListNodeItemProviderMembersInjector = companyListNodeItemProviderMembersInjector;
  }

  @Override
  public CompanyListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        companyListNodeItemProviderMembersInjector, new CompanyListNodeItemProvider());
  }

  public static Factory<CompanyListNodeItemProvider> create(
      MembersInjector<CompanyListNodeItemProvider> companyListNodeItemProviderMembersInjector) {
    return new CompanyListNodeItemProvider_Factory(companyListNodeItemProviderMembersInjector);
  }
}
