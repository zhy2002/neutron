package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyGeneralNodeChildProvider_Factory
    implements Factory<CompanyGeneralNodeChildProvider> {
  private final MembersInjector<CompanyGeneralNodeChildProvider>
      companyGeneralNodeChildProviderMembersInjector;

  public CompanyGeneralNodeChildProvider_Factory(
      MembersInjector<CompanyGeneralNodeChildProvider>
          companyGeneralNodeChildProviderMembersInjector) {
    assert companyGeneralNodeChildProviderMembersInjector != null;
    this.companyGeneralNodeChildProviderMembersInjector =
        companyGeneralNodeChildProviderMembersInjector;
  }

  @Override
  public CompanyGeneralNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        companyGeneralNodeChildProviderMembersInjector, new CompanyGeneralNodeChildProvider());
  }

  public static Factory<CompanyGeneralNodeChildProvider> create(
      MembersInjector<CompanyGeneralNodeChildProvider>
          companyGeneralNodeChildProviderMembersInjector) {
    return new CompanyGeneralNodeChildProvider_Factory(
        companyGeneralNodeChildProviderMembersInjector);
  }
}
