package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MortgageBreakFeeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageBreakFeeNode_MembersInjector
    implements MembersInjector<MortgageBreakFeeNode> {
  private final Provider<MortgageBreakFeeNodeComponent.Builder> builderProvider;

  public MortgageBreakFeeNode_MembersInjector(
      Provider<MortgageBreakFeeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MortgageBreakFeeNode> create(
      Provider<MortgageBreakFeeNodeComponent.Builder> builderProvider) {
    return new MortgageBreakFeeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MortgageBreakFeeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MortgageBreakFeeNode instance,
      Provider<MortgageBreakFeeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
