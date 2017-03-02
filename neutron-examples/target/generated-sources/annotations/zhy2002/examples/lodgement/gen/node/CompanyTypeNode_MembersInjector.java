package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyTypeNode_MembersInjector implements MembersInjector<CompanyTypeNode> {
  private final Provider<CompanyTypeNodeComponent.Builder> builderProvider;

  public CompanyTypeNode_MembersInjector(
      Provider<CompanyTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyTypeNode> create(
      Provider<CompanyTypeNodeComponent.Builder> builderProvider) {
    return new CompanyTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CompanyTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyTypeNode instance, Provider<CompanyTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
