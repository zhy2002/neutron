package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.LoanBreakCostNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanBreakCostNode_MembersInjector implements MembersInjector<LoanBreakCostNode> {
  private final Provider<LoanBreakCostNodeComponent.Builder> builderProvider;

  public LoanBreakCostNode_MembersInjector(
      Provider<LoanBreakCostNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<LoanBreakCostNode> create(
      Provider<LoanBreakCostNodeComponent.Builder> builderProvider) {
    return new LoanBreakCostNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(LoanBreakCostNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      LoanBreakCostNode instance, Provider<LoanBreakCostNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
