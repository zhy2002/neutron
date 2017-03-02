package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ThirdPartyFirstNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyFirstNameNode_MembersInjector
    implements MembersInjector<ThirdPartyFirstNameNode> {
  private final Provider<ThirdPartyFirstNameNodeComponent.Builder> builderProvider;

  public ThirdPartyFirstNameNode_MembersInjector(
      Provider<ThirdPartyFirstNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ThirdPartyFirstNameNode> create(
      Provider<ThirdPartyFirstNameNodeComponent.Builder> builderProvider) {
    return new ThirdPartyFirstNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ThirdPartyFirstNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ThirdPartyFirstNameNode instance,
      Provider<ThirdPartyFirstNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
