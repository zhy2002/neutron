package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityClearingFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityClearingFlagNode_MembersInjector
    implements MembersInjector<OtherLiabilityClearingFlagNode> {
  private final Provider<OtherLiabilityClearingFlagNodeComponent.Builder> builderProvider;

  public OtherLiabilityClearingFlagNode_MembersInjector(
      Provider<OtherLiabilityClearingFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherLiabilityClearingFlagNode> create(
      Provider<OtherLiabilityClearingFlagNodeComponent.Builder> builderProvider) {
    return new OtherLiabilityClearingFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherLiabilityClearingFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherLiabilityClearingFlagNode instance,
      Provider<OtherLiabilityClearingFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
