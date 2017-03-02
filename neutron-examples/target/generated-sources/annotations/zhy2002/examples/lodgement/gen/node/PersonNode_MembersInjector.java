package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PersonNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonNode_MembersInjector implements MembersInjector<PersonNode> {
  private final Provider<PersonNodeChildProvider> providerProvider;

  private final Provider<PersonNodeComponent.Builder> builderProvider;

  public PersonNode_MembersInjector(
      Provider<PersonNodeChildProvider> providerProvider,
      Provider<PersonNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PersonNode> create(
      Provider<PersonNodeChildProvider> providerProvider,
      Provider<PersonNodeComponent.Builder> builderProvider) {
    return new PersonNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(PersonNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      PersonNode instance, Provider<PersonNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      PersonNode instance, Provider<PersonNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
