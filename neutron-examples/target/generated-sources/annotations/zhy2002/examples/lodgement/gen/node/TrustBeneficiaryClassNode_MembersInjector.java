package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TrustBeneficiaryClassNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryClassNode_MembersInjector
    implements MembersInjector<TrustBeneficiaryClassNode> {
  private final Provider<TrustBeneficiaryClassNodeComponent.Builder> builderProvider;

  public TrustBeneficiaryClassNode_MembersInjector(
      Provider<TrustBeneficiaryClassNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TrustBeneficiaryClassNode> create(
      Provider<TrustBeneficiaryClassNodeComponent.Builder> builderProvider) {
    return new TrustBeneficiaryClassNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(TrustBeneficiaryClassNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      TrustBeneficiaryClassNode instance,
      Provider<TrustBeneficiaryClassNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
