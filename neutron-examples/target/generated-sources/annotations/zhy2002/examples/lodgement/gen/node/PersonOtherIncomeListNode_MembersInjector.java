package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PersonOtherIncomeListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonOtherIncomeListNode_MembersInjector
    implements MembersInjector<PersonOtherIncomeListNode> {
  private final Provider<BaseOtherIncomeListNodeItemProvider> providerProvider;

  private final Provider<PersonOtherIncomeListNodeComponent.Builder> builderProvider;

  public PersonOtherIncomeListNode_MembersInjector(
      Provider<BaseOtherIncomeListNodeItemProvider> providerProvider,
      Provider<PersonOtherIncomeListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PersonOtherIncomeListNode> create(
      Provider<BaseOtherIncomeListNodeItemProvider> providerProvider,
      Provider<PersonOtherIncomeListNodeComponent.Builder> builderProvider) {
    return new PersonOtherIncomeListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(PersonOtherIncomeListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseOtherIncomeListNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PersonOtherIncomeListNode instance,
      Provider<PersonOtherIncomeListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
