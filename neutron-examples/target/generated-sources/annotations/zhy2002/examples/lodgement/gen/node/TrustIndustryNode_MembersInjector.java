package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TrustIndustryNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustIndustryNode_MembersInjector implements MembersInjector<TrustIndustryNode> {
  private final Provider<TrustIndustryNodeComponent.Builder> builderProvider;

  public TrustIndustryNode_MembersInjector(
      Provider<TrustIndustryNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TrustIndustryNode> create(
      Provider<TrustIndustryNodeComponent.Builder> builderProvider) {
    return new TrustIndustryNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(TrustIndustryNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      TrustIndustryNode instance, Provider<TrustIndustryNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
