package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyRegistrationDateNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyRegistrationDateNode_MembersInjector
    implements MembersInjector<CompanyRegistrationDateNode> {
  private final Provider<CompanyRegistrationDateNodeComponent.Builder> builderProvider;

  public CompanyRegistrationDateNode_MembersInjector(
      Provider<CompanyRegistrationDateNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyRegistrationDateNode> create(
      Provider<CompanyRegistrationDateNodeComponent.Builder> builderProvider) {
    return new CompanyRegistrationDateNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CompanyRegistrationDateNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyRegistrationDateNode instance,
      Provider<CompanyRegistrationDateNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
