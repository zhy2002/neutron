package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ThirdPartyLastNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyLastNameNode_MembersInjector
    implements MembersInjector<ThirdPartyLastNameNode> {
  private final Provider<ThirdPartyLastNameNodeComponent.Builder> builderProvider;

  public ThirdPartyLastNameNode_MembersInjector(
      Provider<ThirdPartyLastNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ThirdPartyLastNameNode> create(
      Provider<ThirdPartyLastNameNodeComponent.Builder> builderProvider) {
    return new ThirdPartyLastNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ThirdPartyLastNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ThirdPartyLastNameNode instance,
      Provider<ThirdPartyLastNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
