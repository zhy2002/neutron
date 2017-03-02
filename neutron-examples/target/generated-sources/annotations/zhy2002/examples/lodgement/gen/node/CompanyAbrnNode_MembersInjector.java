package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyAbrnNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyAbrnNode_MembersInjector implements MembersInjector<CompanyAbrnNode> {
  private final Provider<CompanyAbrnNodeComponent.Builder> builderProvider;

  public CompanyAbrnNode_MembersInjector(
      Provider<CompanyAbrnNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyAbrnNode> create(
      Provider<CompanyAbrnNodeComponent.Builder> builderProvider) {
    return new CompanyAbrnNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CompanyAbrnNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyAbrnNode instance, Provider<CompanyAbrnNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
