package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityMonthlyRepaymentNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityMonthlyRepaymentNode_MembersInjector
    implements MembersInjector<OtherLiabilityMonthlyRepaymentNode> {
  private final Provider<OtherLiabilityMonthlyRepaymentNodeComponent.Builder> builderProvider;

  public OtherLiabilityMonthlyRepaymentNode_MembersInjector(
      Provider<OtherLiabilityMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherLiabilityMonthlyRepaymentNode> create(
      Provider<OtherLiabilityMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    return new OtherLiabilityMonthlyRepaymentNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherLiabilityMonthlyRepaymentNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherLiabilityMonthlyRepaymentNode instance,
      Provider<OtherLiabilityMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
