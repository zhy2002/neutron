package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MortgageBorrowerRateNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageBorrowerRateNode_MembersInjector
    implements MembersInjector<MortgageBorrowerRateNode> {
  private final Provider<MortgageBorrowerRateNodeComponent.Builder> builderProvider;

  public MortgageBorrowerRateNode_MembersInjector(
      Provider<MortgageBorrowerRateNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MortgageBorrowerRateNode> create(
      Provider<MortgageBorrowerRateNodeComponent.Builder> builderProvider) {
    return new MortgageBorrowerRateNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MortgageBorrowerRateNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MortgageBorrowerRateNode instance,
      Provider<MortgageBorrowerRateNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
