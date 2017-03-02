package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.EmployerPhoneNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerPhoneNode_MembersInjector implements MembersInjector<EmployerPhoneNode> {
  private final Provider<EmployerPhoneNodeComponent.Builder> builderProvider;

  public EmployerPhoneNode_MembersInjector(
      Provider<EmployerPhoneNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<EmployerPhoneNode> create(
      Provider<EmployerPhoneNodeComponent.Builder> builderProvider) {
    return new EmployerPhoneNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(EmployerPhoneNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      EmployerPhoneNode instance, Provider<EmployerPhoneNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
