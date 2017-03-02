package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityTypeNode_MembersInjector
    implements MembersInjector<OtherLiabilityTypeNode> {
  private final Provider<OtherLiabilityTypeNodeComponent.Builder> builderProvider;

  public OtherLiabilityTypeNode_MembersInjector(
      Provider<OtherLiabilityTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherLiabilityTypeNode> create(
      Provider<OtherLiabilityTypeNodeComponent.Builder> builderProvider) {
    return new OtherLiabilityTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherLiabilityTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherLiabilityTypeNode instance,
      Provider<OtherLiabilityTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
