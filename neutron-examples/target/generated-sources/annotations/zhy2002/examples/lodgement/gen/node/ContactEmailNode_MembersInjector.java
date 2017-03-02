package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ContactEmailNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactEmailNode_MembersInjector implements MembersInjector<ContactEmailNode> {
  private final Provider<ContactEmailNodeComponent.Builder> builderProvider;

  public ContactEmailNode_MembersInjector(
      Provider<ContactEmailNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ContactEmailNode> create(
      Provider<ContactEmailNodeComponent.Builder> builderProvider) {
    return new ContactEmailNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ContactEmailNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ContactEmailNode instance, Provider<ContactEmailNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
