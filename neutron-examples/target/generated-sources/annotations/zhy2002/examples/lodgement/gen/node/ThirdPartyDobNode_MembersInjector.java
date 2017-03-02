package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ThirdPartyDobNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyDobNode_MembersInjector implements MembersInjector<ThirdPartyDobNode> {
  private final Provider<ThirdPartyDobNodeComponent.Builder> builderProvider;

  public ThirdPartyDobNode_MembersInjector(
      Provider<ThirdPartyDobNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ThirdPartyDobNode> create(
      Provider<ThirdPartyDobNodeComponent.Builder> builderProvider) {
    return new ThirdPartyDobNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ThirdPartyDobNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ThirdPartyDobNode instance, Provider<ThirdPartyDobNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
