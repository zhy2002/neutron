package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PersonContactNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonContactNode_MembersInjector implements MembersInjector<PersonContactNode> {
  private final Provider<BaseContactNodeChildProvider> providerProvider;

  private final Provider<PersonContactNodeChildProvider> providerProvider2;

  private final Provider<PersonContactNodeComponent.Builder> builderProvider;

  public PersonContactNode_MembersInjector(
      Provider<BaseContactNodeChildProvider> providerProvider,
      Provider<PersonContactNodeChildProvider> providerProvider2,
      Provider<PersonContactNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert providerProvider2 != null;
    this.providerProvider2 = providerProvider2;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PersonContactNode> create(
      Provider<BaseContactNodeChildProvider> providerProvider,
      Provider<PersonContactNodeChildProvider> providerProvider2,
      Provider<PersonContactNodeComponent.Builder> builderProvider) {
    return new PersonContactNode_MembersInjector(
        providerProvider, providerProvider2, builderProvider);
  }

  @Override
  public void injectMembers(PersonContactNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseContactNode) instance).receiveNodeProvider(providerProvider.get());
    instance.receiveNodeProvider(providerProvider2.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      PersonContactNode instance, Provider<PersonContactNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      PersonContactNode instance, Provider<PersonContactNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
