package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ThirdPartyEmailNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyEmailNode_MembersInjector
    implements MembersInjector<ThirdPartyEmailNode> {
  private final Provider<ThirdPartyEmailNodeComponent.Builder> builderProvider;

  public ThirdPartyEmailNode_MembersInjector(
      Provider<ThirdPartyEmailNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ThirdPartyEmailNode> create(
      Provider<ThirdPartyEmailNodeComponent.Builder> builderProvider) {
    return new ThirdPartyEmailNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ThirdPartyEmailNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ThirdPartyEmailNode instance,
      Provider<ThirdPartyEmailNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
