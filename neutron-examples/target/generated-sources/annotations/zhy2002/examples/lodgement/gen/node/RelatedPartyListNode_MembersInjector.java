package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.RelatedPartyListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPartyListNode_MembersInjector
    implements MembersInjector<RelatedPartyListNode> {
  private final Provider<RelatedPartyListNodeItemProvider> providerProvider;

  private final Provider<RelatedPartyListNodeComponent.Builder> builderProvider;

  public RelatedPartyListNode_MembersInjector(
      Provider<RelatedPartyListNodeItemProvider> providerProvider,
      Provider<RelatedPartyListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<RelatedPartyListNode> create(
      Provider<RelatedPartyListNodeItemProvider> providerProvider,
      Provider<RelatedPartyListNodeComponent.Builder> builderProvider) {
    return new RelatedPartyListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(RelatedPartyListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      RelatedPartyListNode instance, Provider<RelatedPartyListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      RelatedPartyListNode instance,
      Provider<RelatedPartyListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
