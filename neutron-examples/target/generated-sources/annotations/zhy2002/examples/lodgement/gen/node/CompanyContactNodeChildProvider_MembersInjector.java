package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactNodeChildProvider_MembersInjector
    implements MembersInjector<CompanyContactNodeChildProvider> {
  private final MembersInjector<CompanyContactFirstNameNode>
      companyContactFirstNameNodeInjectorMembersInjector;

  private final MembersInjector<CompanyContactLastNameNode>
      companyContactLastNameNodeInjectorMembersInjector;

  public CompanyContactNodeChildProvider_MembersInjector(
      MembersInjector<CompanyContactFirstNameNode>
          companyContactFirstNameNodeInjectorMembersInjector,
      MembersInjector<CompanyContactLastNameNode>
          companyContactLastNameNodeInjectorMembersInjector) {
    assert companyContactFirstNameNodeInjectorMembersInjector != null;
    this.companyContactFirstNameNodeInjectorMembersInjector =
        companyContactFirstNameNodeInjectorMembersInjector;
    assert companyContactLastNameNodeInjectorMembersInjector != null;
    this.companyContactLastNameNodeInjectorMembersInjector =
        companyContactLastNameNodeInjectorMembersInjector;
  }

  public static MembersInjector<CompanyContactNodeChildProvider> create(
      MembersInjector<CompanyContactFirstNameNode>
          companyContactFirstNameNodeInjectorMembersInjector,
      MembersInjector<CompanyContactLastNameNode>
          companyContactLastNameNodeInjectorMembersInjector) {
    return new CompanyContactNodeChildProvider_MembersInjector(
        companyContactFirstNameNodeInjectorMembersInjector,
        companyContactLastNameNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(CompanyContactNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.companyContactFirstNameNodeInjector =
        companyContactFirstNameNodeInjectorMembersInjector;
    instance.companyContactLastNameNodeInjector = companyContactLastNameNodeInjectorMembersInjector;
  }

  public static void injectCompanyContactFirstNameNodeInjector(
      CompanyContactNodeChildProvider instance,
      MembersInjector<CompanyContactFirstNameNode> companyContactFirstNameNodeInjector) {
    instance.companyContactFirstNameNodeInjector = companyContactFirstNameNodeInjector;
  }

  public static void injectCompanyContactLastNameNodeInjector(
      CompanyContactNodeChildProvider instance,
      MembersInjector<CompanyContactLastNameNode> companyContactLastNameNodeInjector) {
    instance.companyContactLastNameNodeInjector = companyContactLastNameNodeInjector;
  }
}
