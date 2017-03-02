package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityBreakCostNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityBreakCostNode_MembersInjector
    implements MembersInjector<OtherLiabilityBreakCostNode> {
  private final Provider<OtherLiabilityBreakCostNodeComponent.Builder> builderProvider;

  public OtherLiabilityBreakCostNode_MembersInjector(
      Provider<OtherLiabilityBreakCostNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherLiabilityBreakCostNode> create(
      Provider<OtherLiabilityBreakCostNodeComponent.Builder> builderProvider) {
    return new OtherLiabilityBreakCostNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherLiabilityBreakCostNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherLiabilityBreakCostNode instance,
      Provider<OtherLiabilityBreakCostNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
