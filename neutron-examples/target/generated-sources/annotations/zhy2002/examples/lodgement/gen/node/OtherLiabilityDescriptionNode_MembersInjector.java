package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityDescriptionNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityDescriptionNode_MembersInjector
    implements MembersInjector<OtherLiabilityDescriptionNode> {
  private final Provider<OtherLiabilityDescriptionNodeComponent.Builder> builderProvider;

  public OtherLiabilityDescriptionNode_MembersInjector(
      Provider<OtherLiabilityDescriptionNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherLiabilityDescriptionNode> create(
      Provider<OtherLiabilityDescriptionNodeComponent.Builder> builderProvider) {
    return new OtherLiabilityDescriptionNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherLiabilityDescriptionNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherLiabilityDescriptionNode instance,
      Provider<OtherLiabilityDescriptionNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
