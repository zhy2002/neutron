package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PersonHomePhoneNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonHomePhoneNode_MembersInjector
    implements MembersInjector<PersonHomePhoneNode> {
  private final Provider<PersonHomePhoneNodeComponent.Builder> builderProvider;

  public PersonHomePhoneNode_MembersInjector(
      Provider<PersonHomePhoneNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PersonHomePhoneNode> create(
      Provider<PersonHomePhoneNodeComponent.Builder> builderProvider) {
    return new PersonHomePhoneNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PersonHomePhoneNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PersonHomePhoneNode instance,
      Provider<PersonHomePhoneNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
