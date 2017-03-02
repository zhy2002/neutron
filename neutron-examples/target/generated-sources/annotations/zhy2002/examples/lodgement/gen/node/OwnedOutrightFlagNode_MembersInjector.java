package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OwnedOutrightFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnedOutrightFlagNode_MembersInjector
    implements MembersInjector<OwnedOutrightFlagNode> {
  private final Provider<OwnedOutrightFlagNodeComponent.Builder> builderProvider;

  public OwnedOutrightFlagNode_MembersInjector(
      Provider<OwnedOutrightFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OwnedOutrightFlagNode> create(
      Provider<OwnedOutrightFlagNodeComponent.Builder> builderProvider) {
    return new OwnedOutrightFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OwnedOutrightFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OwnedOutrightFlagNode instance,
      Provider<OwnedOutrightFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
