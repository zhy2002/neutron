package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ThirdPartyWorkPhoneNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyWorkPhoneNode_MembersInjector
    implements MembersInjector<ThirdPartyWorkPhoneNode> {
  private final Provider<ThirdPartyWorkPhoneNodeComponent.Builder> builderProvider;

  public ThirdPartyWorkPhoneNode_MembersInjector(
      Provider<ThirdPartyWorkPhoneNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ThirdPartyWorkPhoneNode> create(
      Provider<ThirdPartyWorkPhoneNodeComponent.Builder> builderProvider) {
    return new ThirdPartyWorkPhoneNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ThirdPartyWorkPhoneNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ThirdPartyWorkPhoneNode instance,
      Provider<ThirdPartyWorkPhoneNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
