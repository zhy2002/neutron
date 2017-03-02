package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyIndustryNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyIndustryNode_MembersInjector
    implements MembersInjector<CompanyIndustryNode> {
  private final Provider<CompanyIndustryNodeComponent.Builder> builderProvider;

  public CompanyIndustryNode_MembersInjector(
      Provider<CompanyIndustryNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyIndustryNode> create(
      Provider<CompanyIndustryNodeComponent.Builder> builderProvider) {
    return new CompanyIndustryNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CompanyIndustryNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyIndustryNode instance,
      Provider<CompanyIndustryNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
