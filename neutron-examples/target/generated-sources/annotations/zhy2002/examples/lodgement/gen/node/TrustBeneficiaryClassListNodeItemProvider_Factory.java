package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryClassListNodeItemProvider_Factory
    implements Factory<TrustBeneficiaryClassListNodeItemProvider> {
  private final MembersInjector<TrustBeneficiaryClassListNodeItemProvider>
      trustBeneficiaryClassListNodeItemProviderMembersInjector;

  public TrustBeneficiaryClassListNodeItemProvider_Factory(
      MembersInjector<TrustBeneficiaryClassListNodeItemProvider>
          trustBeneficiaryClassListNodeItemProviderMembersInjector) {
    assert trustBeneficiaryClassListNodeItemProviderMembersInjector != null;
    this.trustBeneficiaryClassListNodeItemProviderMembersInjector =
        trustBeneficiaryClassListNodeItemProviderMembersInjector;
  }

  @Override
  public TrustBeneficiaryClassListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        trustBeneficiaryClassListNodeItemProviderMembersInjector,
        new TrustBeneficiaryClassListNodeItemProvider());
  }

  public static Factory<TrustBeneficiaryClassListNodeItemProvider> create(
      MembersInjector<TrustBeneficiaryClassListNodeItemProvider>
          trustBeneficiaryClassListNodeItemProviderMembersInjector) {
    return new TrustBeneficiaryClassListNodeItemProvider_Factory(
        trustBeneficiaryClassListNodeItemProviderMembersInjector);
  }
}
