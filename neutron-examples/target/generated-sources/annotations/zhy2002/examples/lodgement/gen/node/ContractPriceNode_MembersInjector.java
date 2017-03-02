package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ContractPriceNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContractPriceNode_MembersInjector implements MembersInjector<ContractPriceNode> {
  private final Provider<ContractPriceNodeComponent.Builder> builderProvider;

  public ContractPriceNode_MembersInjector(
      Provider<ContractPriceNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ContractPriceNode> create(
      Provider<ContractPriceNodeComponent.Builder> builderProvider) {
    return new ContractPriceNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ContractPriceNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ContractPriceNode instance, Provider<ContractPriceNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
