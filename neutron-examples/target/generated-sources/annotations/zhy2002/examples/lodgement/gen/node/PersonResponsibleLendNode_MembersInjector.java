package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PersonResponsibleLendNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonResponsibleLendNode_MembersInjector
    implements MembersInjector<PersonResponsibleLendNode> {
  private final Provider<BaseResponsibleLendNodeChildProvider> providerProvider;

  private final Provider<PersonResponsibleLendNodeComponent.Builder> builderProvider;

  public PersonResponsibleLendNode_MembersInjector(
      Provider<BaseResponsibleLendNodeChildProvider> providerProvider,
      Provider<PersonResponsibleLendNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PersonResponsibleLendNode> create(
      Provider<BaseResponsibleLendNodeChildProvider> providerProvider,
      Provider<PersonResponsibleLendNodeComponent.Builder> builderProvider) {
    return new PersonResponsibleLendNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(PersonResponsibleLendNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseResponsibleLendNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PersonResponsibleLendNode instance,
      Provider<PersonResponsibleLendNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
