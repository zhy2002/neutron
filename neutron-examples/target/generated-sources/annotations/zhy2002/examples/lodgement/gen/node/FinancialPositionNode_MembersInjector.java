package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.FinancialPositionNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FinancialPositionNode_MembersInjector
    implements MembersInjector<FinancialPositionNode> {
  private final Provider<FinancialPositionNodeChildProvider> providerProvider;

  private final Provider<FinancialPositionNodeComponent.Builder> builderProvider;

  public FinancialPositionNode_MembersInjector(
      Provider<FinancialPositionNodeChildProvider> providerProvider,
      Provider<FinancialPositionNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<FinancialPositionNode> create(
      Provider<FinancialPositionNodeChildProvider> providerProvider,
      Provider<FinancialPositionNodeComponent.Builder> builderProvider) {
    return new FinancialPositionNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(FinancialPositionNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      FinancialPositionNode instance,
      Provider<FinancialPositionNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      FinancialPositionNode instance,
      Provider<FinancialPositionNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
