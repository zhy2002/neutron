package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.RelatedPartyNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPartyNode_MembersInjector implements MembersInjector<RelatedPartyNode> {
  private final Provider<RelatedPartyNodeChildProvider> providerProvider;

  private final Provider<RelatedPartyNodeComponent.Builder> builderProvider;

  public RelatedPartyNode_MembersInjector(
      Provider<RelatedPartyNodeChildProvider> providerProvider,
      Provider<RelatedPartyNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<RelatedPartyNode> create(
      Provider<RelatedPartyNodeChildProvider> providerProvider,
      Provider<RelatedPartyNodeComponent.Builder> builderProvider) {
    return new RelatedPartyNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(RelatedPartyNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      RelatedPartyNode instance, Provider<RelatedPartyNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      RelatedPartyNode instance, Provider<RelatedPartyNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
