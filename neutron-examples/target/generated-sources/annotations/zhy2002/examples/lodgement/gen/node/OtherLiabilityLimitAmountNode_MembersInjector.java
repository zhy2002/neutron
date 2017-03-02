package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityLimitAmountNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityLimitAmountNode_MembersInjector
    implements MembersInjector<OtherLiabilityLimitAmountNode> {
  private final Provider<OtherLiabilityLimitAmountNodeComponent.Builder> builderProvider;

  public OtherLiabilityLimitAmountNode_MembersInjector(
      Provider<OtherLiabilityLimitAmountNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherLiabilityLimitAmountNode> create(
      Provider<OtherLiabilityLimitAmountNodeComponent.Builder> builderProvider) {
    return new OtherLiabilityLimitAmountNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherLiabilityLimitAmountNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherLiabilityLimitAmountNode instance,
      Provider<OtherLiabilityLimitAmountNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
