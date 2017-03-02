package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MortgqageUnpaidBalanceNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgqageUnpaidBalanceNode_MembersInjector
    implements MembersInjector<MortgqageUnpaidBalanceNode> {
  private final Provider<MortgqageUnpaidBalanceNodeComponent.Builder> builderProvider;

  public MortgqageUnpaidBalanceNode_MembersInjector(
      Provider<MortgqageUnpaidBalanceNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MortgqageUnpaidBalanceNode> create(
      Provider<MortgqageUnpaidBalanceNodeComponent.Builder> builderProvider) {
    return new MortgqageUnpaidBalanceNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MortgqageUnpaidBalanceNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MortgqageUnpaidBalanceNode instance,
      Provider<MortgqageUnpaidBalanceNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
