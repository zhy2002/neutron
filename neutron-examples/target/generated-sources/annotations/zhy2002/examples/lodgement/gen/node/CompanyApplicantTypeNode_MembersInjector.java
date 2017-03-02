package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyApplicantTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyApplicantTypeNode_MembersInjector
    implements MembersInjector<CompanyApplicantTypeNode> {
  private final Provider<CompanyApplicantTypeNodeComponent.Builder> builderProvider;

  public CompanyApplicantTypeNode_MembersInjector(
      Provider<CompanyApplicantTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyApplicantTypeNode> create(
      Provider<CompanyApplicantTypeNodeComponent.Builder> builderProvider) {
    return new CompanyApplicantTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CompanyApplicantTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyApplicantTypeNode instance,
      Provider<CompanyApplicantTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
