package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityNode_MembersInjector
    implements MembersInjector<OtherLiabilityNode> {
  private final Provider<OtherLiabilityNodeChildProvider> providerProvider;

  private final Provider<OtherLiabilityNodeComponent.Builder> builderProvider;

  public OtherLiabilityNode_MembersInjector(
      Provider<OtherLiabilityNodeChildProvider> providerProvider,
      Provider<OtherLiabilityNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherLiabilityNode> create(
      Provider<OtherLiabilityNodeChildProvider> providerProvider,
      Provider<OtherLiabilityNodeComponent.Builder> builderProvider) {
    return new OtherLiabilityNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(OtherLiabilityNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      OtherLiabilityNode instance, Provider<OtherLiabilityNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      OtherLiabilityNode instance, Provider<OtherLiabilityNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
