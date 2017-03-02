package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyApplicationTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyApplicationTypeNode_MembersInjector
    implements MembersInjector<CompanyApplicationTypeNode> {
  private final Provider<CompanyApplicationTypeNodeComponent.Builder> builderProvider;

  public CompanyApplicationTypeNode_MembersInjector(
      Provider<CompanyApplicationTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyApplicationTypeNode> create(
      Provider<CompanyApplicationTypeNodeComponent.Builder> builderProvider) {
    return new CompanyApplicationTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CompanyApplicationTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyApplicationTypeNode instance,
      Provider<CompanyApplicationTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
