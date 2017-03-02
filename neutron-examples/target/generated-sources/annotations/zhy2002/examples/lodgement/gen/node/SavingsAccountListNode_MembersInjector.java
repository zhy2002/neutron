package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SavingsAccountListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountListNode_MembersInjector
    implements MembersInjector<SavingsAccountListNode> {
  private final Provider<SavingsAccountListNodeItemProvider> providerProvider;

  private final Provider<SavingsAccountListNodeComponent.Builder> builderProvider;

  public SavingsAccountListNode_MembersInjector(
      Provider<SavingsAccountListNodeItemProvider> providerProvider,
      Provider<SavingsAccountListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SavingsAccountListNode> create(
      Provider<SavingsAccountListNodeItemProvider> providerProvider,
      Provider<SavingsAccountListNodeComponent.Builder> builderProvider) {
    return new SavingsAccountListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(SavingsAccountListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      SavingsAccountListNode instance,
      Provider<SavingsAccountListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      SavingsAccountListNode instance,
      Provider<SavingsAccountListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
