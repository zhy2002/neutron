package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MonthYearNode_MembersInjector<P extends ParentUiNode<?>>
    implements MembersInjector<MonthYearNode<P>> {
  private final Provider<MonthYearNodeChildProvider> providerProvider;

  public MonthYearNode_MembersInjector(Provider<MonthYearNodeChildProvider> providerProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
  }

  public static <P extends ParentUiNode<?>> MembersInjector<MonthYearNode<P>> create(
      Provider<MonthYearNodeChildProvider> providerProvider) {
    return new MonthYearNode_MembersInjector<P>(providerProvider);
  }

  @Override
  public void injectMembers(MonthYearNode<P> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static <P extends ParentUiNode<?>> void injectReceiveNodeProvider(
      MonthYearNode<P> instance, Provider<MonthYearNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }
}
