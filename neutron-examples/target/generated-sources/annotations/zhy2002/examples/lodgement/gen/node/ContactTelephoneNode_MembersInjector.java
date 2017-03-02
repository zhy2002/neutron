package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ContactTelephoneNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactTelephoneNode_MembersInjector
    implements MembersInjector<ContactTelephoneNode> {
  private final Provider<ContactTelephoneNodeComponent.Builder> builderProvider;

  public ContactTelephoneNode_MembersInjector(
      Provider<ContactTelephoneNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ContactTelephoneNode> create(
      Provider<ContactTelephoneNodeComponent.Builder> builderProvider) {
    return new ContactTelephoneNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ContactTelephoneNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ContactTelephoneNode instance,
      Provider<ContactTelephoneNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
