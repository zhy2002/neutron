package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ThirdPartyDescriptionNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyDescriptionNode_MembersInjector
    implements MembersInjector<ThirdPartyDescriptionNode> {
  private final Provider<ThirdPartyDescriptionNodeComponent.Builder> builderProvider;

  public ThirdPartyDescriptionNode_MembersInjector(
      Provider<ThirdPartyDescriptionNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ThirdPartyDescriptionNode> create(
      Provider<ThirdPartyDescriptionNodeComponent.Builder> builderProvider) {
    return new ThirdPartyDescriptionNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ThirdPartyDescriptionNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ThirdPartyDescriptionNode instance,
      Provider<ThirdPartyDescriptionNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
