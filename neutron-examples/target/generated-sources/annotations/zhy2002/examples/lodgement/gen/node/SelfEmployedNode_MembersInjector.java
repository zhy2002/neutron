package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SelfEmployedNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelfEmployedNode_MembersInjector implements MembersInjector<SelfEmployedNode> {
  private final Provider<EmployedNodeChildProvider> providerProvider;

  private final Provider<SelfEmployedNodeChildProvider> providerProvider2;

  private final Provider<SelfEmployedNodeComponent.Builder> builderProvider;

  public SelfEmployedNode_MembersInjector(
      Provider<EmployedNodeChildProvider> providerProvider,
      Provider<SelfEmployedNodeChildProvider> providerProvider2,
      Provider<SelfEmployedNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert providerProvider2 != null;
    this.providerProvider2 = providerProvider2;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SelfEmployedNode> create(
      Provider<EmployedNodeChildProvider> providerProvider,
      Provider<SelfEmployedNodeChildProvider> providerProvider2,
      Provider<SelfEmployedNodeComponent.Builder> builderProvider) {
    return new SelfEmployedNode_MembersInjector(
        providerProvider, providerProvider2, builderProvider);
  }

  @Override
  public void injectMembers(SelfEmployedNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((EmployedNode) instance).receiveNodeProvider(providerProvider.get());
    instance.receiveNodeProvider(providerProvider2.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      SelfEmployedNode instance, Provider<SelfEmployedNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      SelfEmployedNode instance, Provider<SelfEmployedNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
