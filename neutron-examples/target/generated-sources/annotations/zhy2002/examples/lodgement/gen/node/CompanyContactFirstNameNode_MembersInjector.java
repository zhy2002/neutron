package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyContactFirstNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactFirstNameNode_MembersInjector
    implements MembersInjector<CompanyContactFirstNameNode> {
  private final Provider<CompanyContactFirstNameNodeComponent.Builder> builderProvider;

  public CompanyContactFirstNameNode_MembersInjector(
      Provider<CompanyContactFirstNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyContactFirstNameNode> create(
      Provider<CompanyContactFirstNameNodeComponent.Builder> builderProvider) {
    return new CompanyContactFirstNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CompanyContactFirstNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyContactFirstNameNode instance,
      Provider<CompanyContactFirstNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
