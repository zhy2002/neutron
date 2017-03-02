package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TrustCountryNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustCountryNode_MembersInjector implements MembersInjector<TrustCountryNode> {
  private final Provider<TrustCountryNodeComponent.Builder> builderProvider;

  public TrustCountryNode_MembersInjector(
      Provider<TrustCountryNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TrustCountryNode> create(
      Provider<TrustCountryNodeComponent.Builder> builderProvider) {
    return new TrustCountryNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(TrustCountryNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      TrustCountryNode instance, Provider<TrustCountryNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
