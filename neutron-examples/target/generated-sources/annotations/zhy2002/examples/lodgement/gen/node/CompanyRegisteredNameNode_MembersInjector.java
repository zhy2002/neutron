package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyRegisteredNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyRegisteredNameNode_MembersInjector
    implements MembersInjector<CompanyRegisteredNameNode> {
  private final Provider<CompanyRegisteredNameNodeComponent.Builder> builderProvider;

  public CompanyRegisteredNameNode_MembersInjector(
      Provider<CompanyRegisteredNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyRegisteredNameNode> create(
      Provider<CompanyRegisteredNameNodeComponent.Builder> builderProvider) {
    return new CompanyRegisteredNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CompanyRegisteredNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyRegisteredNameNode instance,
      Provider<CompanyRegisteredNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
