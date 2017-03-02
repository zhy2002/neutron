package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyContactLastNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactLastNameNode_MembersInjector
    implements MembersInjector<CompanyContactLastNameNode> {
  private final Provider<CompanyContactLastNameNodeComponent.Builder> builderProvider;

  public CompanyContactLastNameNode_MembersInjector(
      Provider<CompanyContactLastNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyContactLastNameNode> create(
      Provider<CompanyContactLastNameNodeComponent.Builder> builderProvider) {
    return new CompanyContactLastNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CompanyContactLastNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyContactLastNameNode instance,
      Provider<CompanyContactLastNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
