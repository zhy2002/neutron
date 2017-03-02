package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ThirdPartyDisclosureFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyDisclosureFlagNode_MembersInjector
    implements MembersInjector<ThirdPartyDisclosureFlagNode> {
  private final Provider<ThirdPartyDisclosureFlagNodeComponent.Builder> builderProvider;

  public ThirdPartyDisclosureFlagNode_MembersInjector(
      Provider<ThirdPartyDisclosureFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ThirdPartyDisclosureFlagNode> create(
      Provider<ThirdPartyDisclosureFlagNodeComponent.Builder> builderProvider) {
    return new ThirdPartyDisclosureFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ThirdPartyDisclosureFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ThirdPartyDisclosureFlagNode instance,
      Provider<ThirdPartyDisclosureFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
