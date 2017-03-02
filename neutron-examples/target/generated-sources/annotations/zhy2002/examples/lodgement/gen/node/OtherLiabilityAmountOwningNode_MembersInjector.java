package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityAmountOwningNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityAmountOwningNode_MembersInjector
    implements MembersInjector<OtherLiabilityAmountOwningNode> {
  private final Provider<OtherLiabilityAmountOwningNodeComponent.Builder> builderProvider;

  public OtherLiabilityAmountOwningNode_MembersInjector(
      Provider<OtherLiabilityAmountOwningNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherLiabilityAmountOwningNode> create(
      Provider<OtherLiabilityAmountOwningNodeComponent.Builder> builderProvider) {
    return new OtherLiabilityAmountOwningNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherLiabilityAmountOwningNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherLiabilityAmountOwningNode instance,
      Provider<OtherLiabilityAmountOwningNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
