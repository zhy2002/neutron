package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.PhoneNumberNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneNumberNode_MembersInjector implements MembersInjector<PhoneNumberNode> {
  private final Provider<PhoneNumberNodeComponent.Builder> builderProvider;

  public PhoneNumberNode_MembersInjector(
      Provider<PhoneNumberNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PhoneNumberNode> create(
      Provider<PhoneNumberNodeComponent.Builder> builderProvider) {
    return new PhoneNumberNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PhoneNumberNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PhoneNumberNode instance, Provider<PhoneNumberNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
