package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityListNode_MembersInjector
    implements MembersInjector<OtherLiabilityListNode> {
  private final Provider<OtherLiabilityListNodeItemProvider> providerProvider;

  private final Provider<OtherLiabilityListNodeComponent.Builder> builderProvider;

  public OtherLiabilityListNode_MembersInjector(
      Provider<OtherLiabilityListNodeItemProvider> providerProvider,
      Provider<OtherLiabilityListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherLiabilityListNode> create(
      Provider<OtherLiabilityListNodeItemProvider> providerProvider,
      Provider<OtherLiabilityListNodeComponent.Builder> builderProvider) {
    return new OtherLiabilityListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(OtherLiabilityListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      OtherLiabilityListNode instance,
      Provider<OtherLiabilityListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      OtherLiabilityListNode instance,
      Provider<OtherLiabilityListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
