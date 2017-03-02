package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyListNodeItemProvider_MembersInjector
    implements MembersInjector<CompanyListNodeItemProvider> {
  private final MembersInjector<CompanyNode> companyNodeInjectorMembersInjector;

  public CompanyListNodeItemProvider_MembersInjector(
      MembersInjector<CompanyNode> companyNodeInjectorMembersInjector) {
    assert companyNodeInjectorMembersInjector != null;
    this.companyNodeInjectorMembersInjector = companyNodeInjectorMembersInjector;
  }

  public static MembersInjector<CompanyListNodeItemProvider> create(
      MembersInjector<CompanyNode> companyNodeInjectorMembersInjector) {
    return new CompanyListNodeItemProvider_MembersInjector(companyNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(CompanyListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.companyNodeInjector = companyNodeInjectorMembersInjector;
  }

  public static void injectCompanyNodeInjector(
      CompanyListNodeItemProvider instance, MembersInjector<CompanyNode> companyNodeInjector) {
    instance.companyNodeInjector = companyNodeInjector;
  }
}
