package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SavingsAccountNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNode_MembersInjector
    implements MembersInjector<SavingsAccountNode> {
  private final Provider<SavingsAccountNodeChildProvider> providerProvider;

  private final Provider<SavingsAccountNodeComponent.Builder> builderProvider;

  public SavingsAccountNode_MembersInjector(
      Provider<SavingsAccountNodeChildProvider> providerProvider,
      Provider<SavingsAccountNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SavingsAccountNode> create(
      Provider<SavingsAccountNodeChildProvider> providerProvider,
      Provider<SavingsAccountNodeComponent.Builder> builderProvider) {
    return new SavingsAccountNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(SavingsAccountNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      SavingsAccountNode instance, Provider<SavingsAccountNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      SavingsAccountNode instance, Provider<SavingsAccountNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
