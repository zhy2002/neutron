package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployedNode_MembersInjector implements MembersInjector<EmployedNode> {
  private final Provider<EmployedNodeChildProvider> providerProvider;

  public EmployedNode_MembersInjector(Provider<EmployedNodeChildProvider> providerProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
  }

  public static MembersInjector<EmployedNode> create(
      Provider<EmployedNodeChildProvider> providerProvider) {
    return new EmployedNode_MembersInjector(providerProvider);
  }

  @Override
  public void injectMembers(EmployedNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectReceiveNodeProvider(
      EmployedNode instance, Provider<EmployedNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }
}
