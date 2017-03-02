package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PersonGeneralNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonGeneralNode_MembersInjector implements MembersInjector<PersonGeneralNode> {
  private final Provider<PersonGeneralNodeChildProvider> providerProvider;

  private final Provider<PersonGeneralNodeComponent.Builder> builderProvider;

  public PersonGeneralNode_MembersInjector(
      Provider<PersonGeneralNodeChildProvider> providerProvider,
      Provider<PersonGeneralNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PersonGeneralNode> create(
      Provider<PersonGeneralNodeChildProvider> providerProvider,
      Provider<PersonGeneralNodeComponent.Builder> builderProvider) {
    return new PersonGeneralNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(PersonGeneralNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      PersonGeneralNode instance, Provider<PersonGeneralNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      PersonGeneralNode instance, Provider<PersonGeneralNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
