package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PersonListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonListNode_MembersInjector implements MembersInjector<PersonListNode> {
  private final Provider<PersonListNodeItemProvider> providerProvider;

  private final Provider<PersonListNodeComponent.Builder> builderProvider;

  public PersonListNode_MembersInjector(
      Provider<PersonListNodeItemProvider> providerProvider,
      Provider<PersonListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PersonListNode> create(
      Provider<PersonListNodeItemProvider> providerProvider,
      Provider<PersonListNodeComponent.Builder> builderProvider) {
    return new PersonListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(PersonListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      PersonListNode instance, Provider<PersonListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      PersonListNode instance, Provider<PersonListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
