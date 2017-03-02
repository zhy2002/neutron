package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryClassListNodeItemProvider_MembersInjector
    implements MembersInjector<TrustBeneficiaryClassListNodeItemProvider> {
  private final MembersInjector<TrustBeneficiaryClassNode>
      trustBeneficiaryClassNodeInjectorMembersInjector;

  public TrustBeneficiaryClassListNodeItemProvider_MembersInjector(
      MembersInjector<TrustBeneficiaryClassNode> trustBeneficiaryClassNodeInjectorMembersInjector) {
    assert trustBeneficiaryClassNodeInjectorMembersInjector != null;
    this.trustBeneficiaryClassNodeInjectorMembersInjector =
        trustBeneficiaryClassNodeInjectorMembersInjector;
  }

  public static MembersInjector<TrustBeneficiaryClassListNodeItemProvider> create(
      MembersInjector<TrustBeneficiaryClassNode> trustBeneficiaryClassNodeInjectorMembersInjector) {
    return new TrustBeneficiaryClassListNodeItemProvider_MembersInjector(
        trustBeneficiaryClassNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(TrustBeneficiaryClassListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.trustBeneficiaryClassNodeInjector = trustBeneficiaryClassNodeInjectorMembersInjector;
  }

  public static void injectTrustBeneficiaryClassNodeInjector(
      TrustBeneficiaryClassListNodeItemProvider instance,
      MembersInjector<TrustBeneficiaryClassNode> trustBeneficiaryClassNodeInjector) {
    instance.trustBeneficiaryClassNodeInjector = trustBeneficiaryClassNodeInjector;
  }
}
