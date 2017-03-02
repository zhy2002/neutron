package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PersonTrustNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonTrustNode_MembersInjector implements MembersInjector<PersonTrustNode> {
  private final Provider<BaseTrustNodeChildProvider> providerProvider;

  private final Provider<PersonTrustNodeComponent.Builder> builderProvider;

  public PersonTrustNode_MembersInjector(
      Provider<BaseTrustNodeChildProvider> providerProvider,
      Provider<PersonTrustNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PersonTrustNode> create(
      Provider<BaseTrustNodeChildProvider> providerProvider,
      Provider<PersonTrustNodeComponent.Builder> builderProvider) {
    return new PersonTrustNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(PersonTrustNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseTrustNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PersonTrustNode instance, Provider<PersonTrustNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
