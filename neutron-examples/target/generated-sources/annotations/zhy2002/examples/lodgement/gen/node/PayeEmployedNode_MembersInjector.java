package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PayeEmployedNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PayeEmployedNode_MembersInjector implements MembersInjector<PayeEmployedNode> {
  private final Provider<EmployedNodeChildProvider> providerProvider;

  private final Provider<PayeEmployedNodeChildProvider> providerProvider2;

  private final Provider<PayeEmployedNodeComponent.Builder> builderProvider;

  public PayeEmployedNode_MembersInjector(
      Provider<EmployedNodeChildProvider> providerProvider,
      Provider<PayeEmployedNodeChildProvider> providerProvider2,
      Provider<PayeEmployedNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert providerProvider2 != null;
    this.providerProvider2 = providerProvider2;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PayeEmployedNode> create(
      Provider<EmployedNodeChildProvider> providerProvider,
      Provider<PayeEmployedNodeChildProvider> providerProvider2,
      Provider<PayeEmployedNodeComponent.Builder> builderProvider) {
    return new PayeEmployedNode_MembersInjector(
        providerProvider, providerProvider2, builderProvider);
  }

  @Override
  public void injectMembers(PayeEmployedNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((EmployedNode) instance).receiveNodeProvider(providerProvider.get());
    instance.receiveNodeProvider(providerProvider2.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      PayeEmployedNode instance, Provider<PayeEmployedNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      PayeEmployedNode instance, Provider<PayeEmployedNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
