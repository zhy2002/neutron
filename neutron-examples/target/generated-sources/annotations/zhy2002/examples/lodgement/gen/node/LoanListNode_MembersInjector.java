package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.LoanListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanListNode_MembersInjector implements MembersInjector<LoanListNode> {
  private final Provider<LoanListNodeItemProvider> providerProvider;

  private final Provider<LoanListNodeComponent.Builder> builderProvider;

  public LoanListNode_MembersInjector(
      Provider<LoanListNodeItemProvider> providerProvider,
      Provider<LoanListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<LoanListNode> create(
      Provider<LoanListNodeItemProvider> providerProvider,
      Provider<LoanListNodeComponent.Builder> builderProvider) {
    return new LoanListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(LoanListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      LoanListNode instance, Provider<LoanListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      LoanListNode instance, Provider<LoanListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
