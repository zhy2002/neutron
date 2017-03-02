package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.LoanNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanNode_MembersInjector implements MembersInjector<LoanNode> {
  private final Provider<LoanNodeChildProvider> providerProvider;

  private final Provider<LoanNodeComponent.Builder> builderProvider;

  public LoanNode_MembersInjector(
      Provider<LoanNodeChildProvider> providerProvider,
      Provider<LoanNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<LoanNode> create(
      Provider<LoanNodeChildProvider> providerProvider,
      Provider<LoanNodeComponent.Builder> builderProvider) {
    return new LoanNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(LoanNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      LoanNode instance, Provider<LoanNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      LoanNode instance, Provider<LoanNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
