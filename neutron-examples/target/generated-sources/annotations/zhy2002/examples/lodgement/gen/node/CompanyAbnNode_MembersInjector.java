package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyAbnNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyAbnNode_MembersInjector implements MembersInjector<CompanyAbnNode> {
  private final Provider<CompanyAbnNodeComponent.Builder> builderProvider;

  public CompanyAbnNode_MembersInjector(Provider<CompanyAbnNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyAbnNode> create(
      Provider<CompanyAbnNodeComponent.Builder> builderProvider) {
    return new CompanyAbnNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CompanyAbnNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyAbnNode instance, Provider<CompanyAbnNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
