package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyDescriptionNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyDescriptionNode_MembersInjector
    implements MembersInjector<CompanyDescriptionNode> {
  private final Provider<CompanyDescriptionNodeComponent.Builder> builderProvider;

  public CompanyDescriptionNode_MembersInjector(
      Provider<CompanyDescriptionNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyDescriptionNode> create(
      Provider<CompanyDescriptionNodeComponent.Builder> builderProvider) {
    return new CompanyDescriptionNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CompanyDescriptionNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyDescriptionNode instance,
      Provider<CompanyDescriptionNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
