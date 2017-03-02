package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyRegistrationStateNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyRegistrationStateNode_MembersInjector
    implements MembersInjector<CompanyRegistrationStateNode> {
  private final Provider<CompanyRegistrationStateNodeComponent.Builder> builderProvider;

  public CompanyRegistrationStateNode_MembersInjector(
      Provider<CompanyRegistrationStateNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyRegistrationStateNode> create(
      Provider<CompanyRegistrationStateNodeComponent.Builder> builderProvider) {
    return new CompanyRegistrationStateNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CompanyRegistrationStateNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyRegistrationStateNode instance,
      Provider<CompanyRegistrationStateNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
