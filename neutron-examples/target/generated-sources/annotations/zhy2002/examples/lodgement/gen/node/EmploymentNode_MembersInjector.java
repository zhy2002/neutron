package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentNode_MembersInjector<P extends ParentUiNode<?>>
    implements MembersInjector<EmploymentNode<P>> {
  private final Provider<EmploymentNodeChildProvider> providerProvider;

  public EmploymentNode_MembersInjector(Provider<EmploymentNodeChildProvider> providerProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
  }

  public static <P extends ParentUiNode<?>> MembersInjector<EmploymentNode<P>> create(
      Provider<EmploymentNodeChildProvider> providerProvider) {
    return new EmploymentNode_MembersInjector<P>(providerProvider);
  }

  @Override
  public void injectMembers(EmploymentNode<P> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static <P extends ParentUiNode<?>> void injectReceiveNodeProvider(
      EmploymentNode<P> instance, Provider<EmploymentNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }
}
