package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyAcnNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyAcnNode_MembersInjector implements MembersInjector<CompanyAcnNode> {
  private final Provider<CompanyAcnNodeComponent.Builder> builderProvider;

  public CompanyAcnNode_MembersInjector(Provider<CompanyAcnNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyAcnNode> create(
      Provider<CompanyAcnNodeComponent.Builder> builderProvider) {
    return new CompanyAcnNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CompanyAcnNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyAcnNode instance, Provider<CompanyAcnNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
