package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SavingsBalanceNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsBalanceNode_MembersInjector
    implements MembersInjector<SavingsBalanceNode> {
  private final Provider<SavingsBalanceNodeComponent.Builder> builderProvider;

  public SavingsBalanceNode_MembersInjector(
      Provider<SavingsBalanceNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SavingsBalanceNode> create(
      Provider<SavingsBalanceNodeComponent.Builder> builderProvider) {
    return new SavingsBalanceNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(SavingsBalanceNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      SavingsBalanceNode instance, Provider<SavingsBalanceNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
