package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ThirdPartyCompanyNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyCompanyNameNode_MembersInjector
    implements MembersInjector<ThirdPartyCompanyNameNode> {
  private final Provider<ThirdPartyCompanyNameNodeComponent.Builder> builderProvider;

  public ThirdPartyCompanyNameNode_MembersInjector(
      Provider<ThirdPartyCompanyNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ThirdPartyCompanyNameNode> create(
      Provider<ThirdPartyCompanyNameNodeComponent.Builder> builderProvider) {
    return new ThirdPartyCompanyNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ThirdPartyCompanyNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ThirdPartyCompanyNameNode instance,
      Provider<ThirdPartyCompanyNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
