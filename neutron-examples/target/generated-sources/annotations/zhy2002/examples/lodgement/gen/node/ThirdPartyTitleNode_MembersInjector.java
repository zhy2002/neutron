package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ThirdPartyTitleNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyTitleNode_MembersInjector
    implements MembersInjector<ThirdPartyTitleNode> {
  private final Provider<ThirdPartyTitleNodeComponent.Builder> builderProvider;

  public ThirdPartyTitleNode_MembersInjector(
      Provider<ThirdPartyTitleNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ThirdPartyTitleNode> create(
      Provider<ThirdPartyTitleNodeComponent.Builder> builderProvider) {
    return new ThirdPartyTitleNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ThirdPartyTitleNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ThirdPartyTitleNode instance,
      Provider<ThirdPartyTitleNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
