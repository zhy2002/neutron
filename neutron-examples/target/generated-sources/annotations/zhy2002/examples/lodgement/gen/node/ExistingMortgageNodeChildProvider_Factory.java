package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExistingMortgageNodeChildProvider_Factory
    implements Factory<ExistingMortgageNodeChildProvider> {
  private final MembersInjector<ExistingMortgageNodeChildProvider>
      existingMortgageNodeChildProviderMembersInjector;

  public ExistingMortgageNodeChildProvider_Factory(
      MembersInjector<ExistingMortgageNodeChildProvider>
          existingMortgageNodeChildProviderMembersInjector) {
    assert existingMortgageNodeChildProviderMembersInjector != null;
    this.existingMortgageNodeChildProviderMembersInjector =
        existingMortgageNodeChildProviderMembersInjector;
  }

  @Override
  public ExistingMortgageNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        existingMortgageNodeChildProviderMembersInjector, new ExistingMortgageNodeChildProvider());
  }

  public static Factory<ExistingMortgageNodeChildProvider> create(
      MembersInjector<ExistingMortgageNodeChildProvider>
          existingMortgageNodeChildProviderMembersInjector) {
    return new ExistingMortgageNodeChildProvider_Factory(
        existingMortgageNodeChildProviderMembersInjector);
  }
}
