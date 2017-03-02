package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PersonPrivacyNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonPrivacyNode_MembersInjector implements MembersInjector<PersonPrivacyNode> {
  private final Provider<BasePrivacyNodeChildProvider> providerProvider;

  private final Provider<PersonPrivacyNodeComponent.Builder> builderProvider;

  public PersonPrivacyNode_MembersInjector(
      Provider<BasePrivacyNodeChildProvider> providerProvider,
      Provider<PersonPrivacyNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PersonPrivacyNode> create(
      Provider<BasePrivacyNodeChildProvider> providerProvider,
      Provider<PersonPrivacyNodeComponent.Builder> builderProvider) {
    return new PersonPrivacyNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(PersonPrivacyNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BasePrivacyNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PersonPrivacyNode instance, Provider<PersonPrivacyNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
