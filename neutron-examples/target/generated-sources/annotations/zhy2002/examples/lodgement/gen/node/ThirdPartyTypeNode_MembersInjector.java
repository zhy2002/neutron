package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ThirdPartyTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyTypeNode_MembersInjector
    implements MembersInjector<ThirdPartyTypeNode> {
  private final Provider<ThirdPartyTypeNodeComponent.Builder> builderProvider;

  public ThirdPartyTypeNode_MembersInjector(
      Provider<ThirdPartyTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ThirdPartyTypeNode> create(
      Provider<ThirdPartyTypeNodeComponent.Builder> builderProvider) {
    return new ThirdPartyTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ThirdPartyTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ThirdPartyTypeNode instance, Provider<ThirdPartyTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
