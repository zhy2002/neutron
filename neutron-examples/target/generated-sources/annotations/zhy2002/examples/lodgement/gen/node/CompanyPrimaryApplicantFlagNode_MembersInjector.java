package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyPrimaryApplicantFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyPrimaryApplicantFlagNode_MembersInjector
    implements MembersInjector<CompanyPrimaryApplicantFlagNode> {
  private final Provider<CompanyPrimaryApplicantFlagNodeComponent.Builder> builderProvider;

  public CompanyPrimaryApplicantFlagNode_MembersInjector(
      Provider<CompanyPrimaryApplicantFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyPrimaryApplicantFlagNode> create(
      Provider<CompanyPrimaryApplicantFlagNodeComponent.Builder> builderProvider) {
    return new CompanyPrimaryApplicantFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CompanyPrimaryApplicantFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyPrimaryApplicantFlagNode instance,
      Provider<CompanyPrimaryApplicantFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
