package zhy2002.examples.app.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.app.gen.di.LodgementNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LodgementNode_MembersInjector implements MembersInjector<LodgementNode> {
  private final Provider<LodgementNodeChildProvider> providerProvider;

  private final Provider<LodgementNodeComponent.Builder> builderProvider;

  public LodgementNode_MembersInjector(
      Provider<LodgementNodeChildProvider> providerProvider,
      Provider<LodgementNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<LodgementNode> create(
      Provider<LodgementNodeChildProvider> providerProvider,
      Provider<LodgementNodeComponent.Builder> builderProvider) {
    return new LodgementNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(LodgementNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      LodgementNode instance, Provider<LodgementNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      LodgementNode instance, Provider<LodgementNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
